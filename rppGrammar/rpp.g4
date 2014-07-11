grammar rpp;

tokens { INDENT, DEDENT }

@lexer::members
{

	// A queue where extra tokens are pushed on (see the NEWLINE lexer rule).
	private java.util.Queue<Token> tokens = new java.util.LinkedList<>();

	// The stack that keeps track of the indentation level.
	private java.util.Stack<Integer> indents = new java.util.Stack<>();

	@Override
	public void emit(Token t)
	{
		super.setToken(t);
		tokens.offer(t);
	}

	@Override
	public Token nextToken()
	{

		// Check if the end-of-file is ahead and there are still some DEDENTS expected.
		if (_input.LA(1) == EOF && !this.indents.isEmpty())
		{
			// First emit an extra line break that serves as the end of the statement.
			this.emit(new CommonToken(rppParser.NewLine, "\n"));

			// Now emit as much DEDENT tokens as needed.
			while (!indents.isEmpty())
			{
				this.emit(new CommonToken(rppParser.DEDENT, "DEDENT"));
				indents.pop();
			}
		}

		Token next = super.nextToken();

		return tokens.isEmpty() ? next : tokens.poll();
	}

	static int getIndentationCount(String tabs)
	{
		int count = 0;

		for (char ch : tabs.toCharArray())
			if(ch == '\t')
				count++;

		return count;
	}

}

compilationUnit : NewLine* (globals | classGlobals)? NewLine* EOF ;

globals: global (NewLine+ global)* ;
global : function | member;
//----------------class related-------------------------------------
classGlobals
:	'class' ' '+ name NewLine+ classScope
;

classScope
:	INDENT ((global|constructor|destructor) NewLine+)+ DEDENT
;

constructor : name functionDefinition;
destructor : '~' name functionDefinition;

//----------------class related-------------------------------------
memberScope: INDENT (member NewLine)+ DEDENT;

member
:	memberSpecifiers NewLine memberScope
|	(memberSpecifiers ' '+)? type
		' '* '|'
		(
			' '* declarator (NewLine decleratorScope)?
		|	NewLine decleratorScope
		)
|	staticMemberSpecifiers NewLine typeScope
|	staticMemberSpecifiers ' '+ assign
;

staticMemberSpecifiers: (memberSpecifier ' '+)* 'static' (' '+ memberSpecifier)*;
memberSpecifiers: memberSpecifier (' '+ memberSpecifier)*;
memberSpecifier
:	'typedef'
|	'extern'
|	'_Thread_local'
|	'auto'
|	'register'
|	TypeQualifier
;


//----------------function declaration rules------------------------
function
:	functionSpecifiers? type ' ' name functionDefinition
;

argLine
:	(declarationSpecifiers ' '+)? type
	(
		(
			' '+ assignLine
		|	' '* closedItem (' '+ linemix)?
		)
		(NewLine assignScope)?
	|	NewLine assignScope
	)
|	declarationSpecifiers NewLine argScope
;

argFlatLine
:	(declarationSpecifiers ' '+)? type (' '+ linemix| closedItem (' '+ linemix)?)
		(' '* '|' ' '* (declarationSpecifiers ' '+)? type ' '+ linemix)*
;

argScope
:	INDENT ((argLine|argFlatLine) NewLine+)+ DEDENT
;

functionDefinition
:	(' '+ argFlatLine)?
	(
		(
			NewLine scope
		|	' '* '=' ' '* flat (NewLine scope)?
		)
	|	NewLine argScope NewLine+ '='
		(
			' '* flat (NewLine scope)?
		|	equals? NewLine? scope
		|	scope
		)
	)
;
//----------------function declaration rules------------------------

equals: '='+;

body
:	flat (NewLine+ flat)*
;

flat
:	line (';' line)*
;

scope
:	INDENT body NewLine+ DEDENT
;

line: statement | assign | functionCall;
//-------------------line-------------


typeScope: INDENT (assign NewLine+)+ DEDENT;

functionCall: name (' ' closedExpr)*;
functionArgs: name (' ' closedExpr)+;
functionNoArgs: name;

assignScope: INDENT ((assignLine|linemix) NewLine+)+ DEDENT;
assignLine: lineAssign | declarator (' '+ linemix)?;

assign
:	declarationSpecifiers NewLine typeScope
|	(declarationSpecifiers ' '+)? type
	(
		' '* '|'
		(
			' '* assignLine (NewLine assignScope)?
		|	NewLine assignScope
		)
	|	' '* closedItem (' '+ linemix)? (NewLine assignScope)?
	)
;

declarator: name (' ' name)*;
decleratorScope: INDENT (declarator NewLine+)+ DEDENT;

closedItem: '{' ' '* declarator ' '+
	(
		closedExpr
	|	'=' ' '+ expr
	) ' '* '}'
;

lineAssign: declarator (' '* '=' ' '* (expr|functionArgs|'('functionNoArgs')'));

linemix: (closedItem|declarator) (' '+ (closedItem|declarator))*;

closedExpr   : Number | name | '('functionCall')';
expr         : Number | name | functionCall;


statement: ifStatement | whileStatement | switchStatement;

ifStatement//maybe allow () for intuitiveness
:	'if' statementHelper
		( (NewLine|' '+) 'elif' statementHelper )*
		( (NewLine|' '+) 'else' (' '+ flat (NewLine scope)?|NewLine scope) )?
;

whileStatement
:	'while' statementHelper
|	'do' (' '+ flat (NewLine scope)?|NewLine scope) (NewLine+|' '+) 'while' ' ' logicExpression
;

switchStatement
:	'switch' ' '+ expr NewLine+ switchScope
;

caseScope
:	'case' ' '+ cases (NewLine scope|' '* ':' ' '* line (NewLine scope)?)
;

switchScope
:	INDENT (caseScope NewLine+)+ DEDENT;

cases: closedExpr ( ' '+ closedExpr)*;

statementHelper
:	' '+ logicExpression NewLine scope
|	' '* '(' Spaces logicExpression Spaces ')' ' '* body
;

logicExpression : Logic|'=';


Logic
:	'||' | '&&' | '!=' | '<'
|	'>' | '<=' | '>='
;

declarationSpecifiers: declarationSpecifier (' ' declarationSpecifier)*;

declarationSpecifier
:	StorageClassSpecifier
|	TypeQualifier
;

StorageClassSpecifier
:	'typedef'
|	'extern'
|	'static'
|	'_Thread_local'
|	'auto'
|	'register'
;

TypeQualifier
:	'const'
|	'restrict'
|	'volatile'
|	'_Atomic'
;

functionSpecifiers: ((functionSpecifier|declarationSpecifier) ' ')+;

functionSpecifier
:	('inline'
|	'_Noreturn'
|	'__inline__' // GCC extension
|	'__stdcall')
|	'__declspec' '(' ID ')'
;

Number       : Digit (Digit|NonDigit)*;

Equal        : '=';
Spaces       : ' '+;
Pointers     : '*' | '^' | '&';
type         : ID Pointers*;
name         : ID;
ID           : NonDigit (Digit|NonDigit)*;
Digit        : [0-9];
NonDigit     : [a-zA-Z_];
LeftParen    : '(';
RightParen   : ')';
LeftBrace    : '{';
RightBrace   : '}';
Thing        : '|';

TABS
:	'\t'+
	{
		int next = _input.LA(1);
		int indent = getIndentationCount(getText());
		int previous = indents.isEmpty() ? 0 : indents.peek();
		if(indent>previous)
		{
				indents.push(indent);
				emit(new CommonToken(rppParser.INDENT, "INDENT"));
		}
	}
;

NewLine
:	('\n' | '\r' | '\r\n') TABS?
	{
		int next = _input.LA(1);

		emit(new CommonToken(NewLine, "\n"));
		if (next != '\r' && next != '\n')
		{
			int indent = getIndentationCount(getText());
			int previous = indents.isEmpty() ? 0 : indents.peek();

			if (indent == previous)
			{
				skip();
			}
			else if (indent > previous)
			{
				indents.push(indent);
				emit(new CommonToken(rppParser.INDENT, "INDENT"));
			}
			else
			{
				// Possibly emit more than 1 DEDENT token.
				while(!indents.isEmpty() && indents.peek() > indent)
				{
					emit(new CommonToken(rppParser.DEDENT, "DEDENT"));
					emit(new CommonToken(NewLine, "\n"));
					indents.pop();
				}
			}

		}
	}
;