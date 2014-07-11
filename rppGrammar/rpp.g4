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

classGlobals
:	'class ' name classScope
;

classScope
:	INDENT (global NewLine+)+ DEDENT
;

global : function | member;

constructor : name '(' Spaces? args? Spaces? ')' body;

function//enforce me
:	(functionStuff ' ')? type ' ' name '(' Spaces? args? Spaces? ')'
		(' ' line (NewLine scope)?|NewLine scope)
;

args: type ' ' name (',' ' '? type ' ' name )*;

functionStuff : ID (' ' ID)*;

body
:	line (NewLine line|';' line)*
;

scope
:	INDENT body NewLine+ DEDENT
;

line: 'node' | statement | assign | functionCall;
//-------------------line-------------

member
:	type '|' NewLine decleratorScope
|	type '|' ' '* declarator (NewLine decleratorScope)?
|	staticMember
;

staticMember
:	'static' ' '+ assign (NewLine typeScope)?
|	'static' NewLine typeScope
;

typeScope: INDENT (assign NewLine+)+ DEDENT;

functionCall: name (' ' closedExpr)*;
functionArgs: name (' ' closedExpr)+;
functionNoArgs: name;

assignScope: INDENT (assignLine NewLine)+ DEDENT;
assignLine: lineAssign | declarator (' '+ linemix)?;

assign
:	type '|' ' '* assignLine (NewLine assignScope)?
|	type '|' NewLine assignScope
|	type ' '* closedItem (' '+ linemix)? (NewLine assignScope)?
;

declarator: name (' ' name)*;
decleratorScope: INDENT (declarator NewLine+) DEDENT;

closedItem: '{' ' '* declarator ' '+
	(	closedExpr
	|	'=' ' '+ expr
	) ' '* '}'
;

lineAssign: declarator (' '* '=' ' '* (expr|functionArgs|'('functionNoArgs')'));

linemix: (closedItem|declarator) (' '+ (closedItem|declarator))*;

closedExpr   : Number|name|'('functionCall')';
expr         : Number|name|functionCall;

//-----------------------------------

statement: ifStatement | whileStatement | switchStatement;

ifStatement//maybe allow () for intuitiveness
:	'if' statementHelper
		( (NewLine|' '+) 'elif' statementHelper )*
		( (NewLine|' '+) 'else' (' '|NewLine) body )?
;

whileStatement
:	'while' statementHelper
|	'do' (' '+ body|NewLine scope) (NewLine+|' '+) 'while' ' ' logicExpression
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

logicExpression : Logic;
Logic
:	'||' | '&&' | '!=' | '==' | '<'
|	'>' | '<=' | '>='
;


Number       : Digit (Digit|NonDigit)*;
TABS         : '\t'+;
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