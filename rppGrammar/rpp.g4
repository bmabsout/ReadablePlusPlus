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
member
:	' '* '|' ' '* initialize
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

functionDefinition
:	(' '+ lineScope)?
	(
		(
			NewLine scope
		|	' '* '=' ' '* flat (NewLine scope)?
		)
	|	NewLine initializeScope NewLine+ '='
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

line: statement | ' '* '|' ' '* initialize | assignment | expr;
//-------------------line-------------

openFunction: name (' ' closedExpr)+ | LeftBracket name RightBracket;
closedFunction: LeftBracket name (' ' closedExpr)* RightBracket;

//_______________declarationUnits______________
lineScope
:	declarationSpecifiers
	(
		' '+ LeftParen lineScope RightParen
	|	' '* '|' ' '* lineScope
	)+
|	typeSpecifiers
	(
		' '+ LeftParen lineTypeScope RightParen
	|	' '+ lineAssign
	|	' '+ linemix
	|	' '* '|' ' '* lineScope
	)+
;

lineTypeScope
:	declarationSpecifiers
	(
		' '+ LeftParen lineTypeScope RightParen
	|	' '+ lineAssign
	|	' '+ linemix
	|	' '* '|' ' '* lineTypeScope
	)+
;

initializeScope
:	INDENT (initialize NewLine+)+ DEDENT
;

typeScope
:	INDENT (typeInitialize NewLine+)+ DEDENT
;

initialize
:	declarationSpecifiers
	(
		NewLine initializeScope
	|
		(
			' '+ LeftParen lineScope RightParen
		|	' '* '|' ' '* lineScope
		)+ (NewLine initializeScope)?
	)
|	typeSpecifiers
	(
		NewLine typeScope
	|
		(
			' '+ LeftParen lineTypeScope RightParen
		|	' '+ lineAssign
		|	' '+ linemix
		|	' '* '|' ' '* lineScope
		)+ (NewLine typeScope)?
	)
;

typeInitialize
:	declarationSpecifiers
	(
		NewLine typeScope
	|
		(
			' '+ LeftParen lineTypeScope RightParen
		|	' '+ lineAssign
		|	' '+ linemix
		|	' '* '|' ' '* lineScope
		)+ (NewLine typeScope)?
	)
|	lineAssign | linemix
;

typeSpecifiers
:	declarationSpecifier (' '+ declarationSpecifier)* ' '+ type
|	type (' '+ declarationSpecifier)*
;

declarators: name (' ' name)*;
decleratorScope: INDENT (declarators NewLine+)+ DEDENT;

closedItem: LeftBrace declarators ' '+
	(
		closedExpr
	|	'=' ' '+ expr
	) RightBrace
;

lineAssign: declarators ( ' '* '=' ' '* expr );

linemix: (closedItem|declarators) (' '+ (closedItem|declarators))*;
//_______________declarationUnits______________
//-------------------------------expression related-------------------------
closedExpr : number | name | closedFunction| unaryExpr;
expr       : number | name | openFunction | unaryExpr;
assignment : declarators ' '* assignmentOperator ' '* expr;

unaryExprs: unaryExpr (' '+ unaryExpr)*;

unaryExpr
:	prefixOperator name
|	name postfixOperator
;

postfixOperator: '++' | '--' | ('@' closedExpr)+;
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
:	'for' ' '+
	(
		range
	|	(typeSpecifiers ' '+)? name ' '+ range
	) (Colon flat (NewLine scope)?|NewLine scope)
;

switchStatement
:	'switch' ' '+ expr NewLine+ switchScope
;

caseScope
:	'case' ' '+ cases (NewLine scope|Colon line (NewLine scope)?)
;

switchScope
:	INDENT (caseScope NewLine+)+ DEDENT;

cases: (range|closedExpr) ( ' '+ (closedExpr|range))*;

statementHelper
:	' '+ logicExpr NewLine scope
|	' '* LeftParen logicExpr Spaces RightParen ' '* body
;
//------------------------------statements--------------------------

logicExpr : logic ;

arithmetic
:	arithmetic (Star|Over) arithmetic
|	arithmetic (Plus|Minus) arithmetic
|	LeftParen arithmetic RightParen
|	name
;
Star  : ' '* '*' ' '*;
Over  : ' '* '/' ' '*;
Plus  : ' '* '+' ' '*;
Minus : ' '* '-' ' '*;

logic
:	logic (' '+ logic)* ' '* Seperator ' '* logic (' '+ logic)*
|	logic (' '+ logic)* And logic (' '+ logic)*
|	logic (' '+ logic)* Comparison logic (' '+ logic)*
|	LeftParen logic RightParen
|	arithmetic
;
And: ' '* '&' ' '*;
Comparison
:	' '*
	(
		'~?' | '<'  | '?' | '>'
	|	'<?'| '?<' | '>?' | '?>'
	|	'?|'| '|?'
	)
	' '*
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
|	'registe'
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
|	'__declspec' LeftParen ID RightParen
;

number       : Number;
Number       : Digit (Digit|NonDigit)*;

Equal        : '=';
Spaces       : ' '+;
Pointer      : '`' | '^' | '@';
type         : ID Pointer*;
name         : ID;
range        : closedExpr '..' closedExpr;
ID           : NonDigit (Digit|NonDigit)*;
Digit        : [0-9];
NonDigit     : [a-zA-Z_];
LeftParen    : '(' ' '*;
RightParen   : ' '* ')';
LeftBrace    : '{' ' '*;
RightBrace   : ' '* '}';
LeftBracket  : '[' ' '*;
RightBracket : ' '* ']';
Seperator    : '|';
Colon        : ' '* ':' ' '*;

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
