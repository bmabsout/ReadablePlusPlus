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
|	staticMemberSpecifiers ' '+ initialize
;

staticMemberSpecifiers: (memberSpecifier ' '+)* 'static' (' '+ memberSpecifier)*;
memberSpecifiers: memberSpecifier (' '+ memberSpecifier)*;
memberSpecifier
:	'typedef'
|	'extern'
|	'_Thread_local'
|	'auto'
|	'register'
|	typeQualifier
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
		(NewLine initializeScope)?
	|	NewLine initializeScope
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

line: statement | initialize | assignment | functionCall | expr;
//-------------------line-------------


typeScope: INDENT (initialize NewLine+)+ DEDENT;

functionCall: name (' ' closedExpr)*;
functionArgs: name (' ' closedExpr)+;
functionNoArgs: name;

initializeScope: INDENT ((assignLine|linemix) NewLine+)+ DEDENT;
assignLine: lineAssign | declarator (' '+ linemix)?;

initialize
:	declarationSpecifiers NewLine typeScope
|	(declarationSpecifiers ' '+)? type
	(
		' '* '|'
		(
			' '* assignLine (NewLine initializeScope)?
		|	NewLine initializeScope
		)
	|	' '* closedItem (' '+ linemix)? (NewLine initializeScope)?
	)
;
//_______________testing______________


lineScope
:	declarationSpecifiers
	(
    	' '+ '(' ' '* lineScope ' '* ')'
    |	' '+ linemix
    |	' '* '|' ' '* lineScope
    )+
|	typeSpecifiers
	(
    	' '+ '(' ' '* lineTypeScope ' '* ')'
    |	' '+ linemix
    |	' '* '|' ' '* lineScope
    )+
;

lineTypeScope
:	declarationSpecifiers
	(
		' '+ '(' ' '* lineTypeScope ' '* ')'
	|	' '+ linemix
	|	' '* '|' ' '* lineTypeScope
	)+
;

initializeScope2
:	INDENT (initialize2 NewLine+)+ DEDENT
;

typeScope2
:	INDENT (typeInitialize NewLine+)+ DEDENT
;

initialize2
:	declarationSpecifiers
	(
		NewLine initializeScope2
	|
		(
			' '+ '(' ' '* lineScope ' '* ')'
		|	' '* '|' ' '* lineScope
		)+ (NewLine initializeScope2)?
	)
|	typeSpecifiers
	(
	 	NewLine typeScope2
	|
		(
	   		' '+ '(' ' '* lineTypeScope ' '* ')'
	   	|	' '+ linemix
	   	|	' '* '|' ' '* lineScope
	   	)+ (NewLine typeScope2)?
	)
;

typeInitialize
:	declarationSpecifiers
	(
	 	NewLine typeScope2
	|
		(
	   		' '+ '(' ' '* lineTypeScope ' '* ')'
	   	|	' '+ linemix
	   	|	' '* '|' ' '* lineScope
	   	)+ (NewLine typeScope2)?
	)
;

typeSpecifiers
:	declarationSpecifier (' '+ declarationSpecifier)* ' '+ type
|	type (' '+ declarationSpecifier)*
;

//_______________testing______________

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
//-------------------------------expression related-------------------------
closedExpr : Number | name | '('functionCall')'| unaryExpr;
expr       : Number | name | functionCall | unaryExpr;
assignment : unaryExprs ' '* assignmentOperator ' '* expr;

unaryExprs: unaryExpr (' '+ unaryExpr)*;

unaryExpr
:	prefixOperator name
|	name postfixOperator
;

postfixOperator: '++' | '--' | '[' expr ']';
prefixOperator: '++' | '--' | Pointer;

assignmentOperator//no XOR
:	'=' | '*=' | '/=' | '%=' | '+=' | '-=' | '<<=' | '>>=' | '&=' | '|='
;
//_______________________________expression related_________________________

//------------------------------statements--------------------------
statement: ifStatement | whileStatement | switchStatement | forStatement;

ifStatement//maybe allow () for intuitiveness
:	'if' statementHelper
		( (NewLine|' '+) 'elif' statementHelper )*
		( (NewLine|' '+) 'else' (' '+ flat (NewLine scope)?|NewLine scope) )?
;

whileStatement
:	'while' statementHelper
|	'do' (' '+ flat (NewLine scope)?|NewLine scope) (NewLine+|' '+) 'while' ' ' logicExpr
;

forStatement
:	'for' ' '+ initialize
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
:	' '+ logicExpr NewLine scope
|	' '* '(' Spaces logicExpr Spaces ')' ' '* body
;
//------------------------------statements--------------------------

logicExpr : Logic| Seperator ;


Logic
:	'&' | '~?' | '|?' | '<'  | '?'
|	'>' | '<?' | '?<' | '>?' | '?>'
|	'?|'
;

declarationSpecifiers: declarationSpecifier (' ' declarationSpecifier)*;

declarationSpecifier
:	storageClassSpecifier
|	typeQualifier
;

storageClassSpecifier
:	'typedef'
|	'extern'
|	'static'
|	'_Thread_local'
|	'auto'
|	'register'
;

typeQualifier
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
Pointer      : '`' | '^' | '@';
type         : ID Pointer*;
name         : ID;
ID           : NonDigit (Digit|NonDigit)*;
Digit        : [0-9];
NonDigit     : [a-zA-Z_];
LeftParen    : '(';
RightParen   : ')';
LeftBrace    : '{';
RightBrace   : '}';
Seperator    : '|';

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
