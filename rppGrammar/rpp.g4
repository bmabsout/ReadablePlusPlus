grammar rpp;

compilationUnit : NewLine* (globals | classGlobals)? NewLine* EOF ;

globals: global (NewLine+ global)* ;

classGlobals
:	'class ' name lineTabs global (lineTabs global)*
;

global : function | member ;

constructor : name '(' Spaces? args? Spaces? ')' body;

function
:	(functionStuff ' ')? type ' ' name '(' Spaces? args? Spaces? ')'
		(lineTabs|' ')body
;

args: type ' ' name (',' ' '? type ' ' name )*;

functionStuff : ID (' ' ID)*;

body
:	line (lineTabs line|';' line)*
;

line: 'node' | statement | assigns | functionCall;
//-------------------line-------------

member
:	type '|' (' '+|lineTabs)? declarator ((' '+|lineTabs) declarator)*
|	staticMember
;

staticMember: 'static' ((' '+|lineTabs) assign)+;

functionCall: name (' ' closedExpr)*;
functionArgs: name (' ' closedExpr)+;
functionNoArgs: name;

assigns: assign (' '+ assign)*;

assign
:	type
	(
		'|' (' '+|lineTabs)? (lineAssign | declarator (' '+ linemix)?)
	|	' '* closedItem (' '+ linemix)?
	)
	(lineTabs (linemix|lineAssign))*
;

declarator: name (' ' name)*;

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
:	'if' statementLogic body
		( (lineTabs|' '+) 'elif' statementLogic body )*
		( (lineTabs|' '+) 'else' (' '|lineTabs) body )?
;

whileStatement
:	'while' statementLogic body
|	'do' (' '+|lineTabs) body (lineTabs|' '+) 'while' ' ' logicExpression
;

switchStatement
:	'switch' ' '+ expr (lineTabs 'case' ' '+ cases (lineTabs|' '* ':' ' '*) body )+
;

cases: closedExpr ( ' '+ closedExpr)*;

statementLogic
:	' '+ logicExpression lineTabs
|	' '* '(' Spaces logicExpression Spaces ')' ' '*
;

logicExpression : Logic;
Logic
:	'||' | '&&' | '!=' | '==' | '<'
|	'>' | '<=' | '>='
;


Number       : Digit (Digit|NonDigit)*;
lineTabs     : NewLine+ tabs;
tabs         : '\t'+;
Spaces       : ' '+;
Pointers     : '*' | '^' | '&';
type         : ID Pointers*;
name         : ID;
ID           : NonDigit (Digit|NonDigit)*;
Digit        : [0-9];
NonDigit     : [a-zA-Z_];
NewLine      : '\r\n' | '\r' | '\n';
LeftParen    : '(';
RightParen   : ')';
LeftBrace    : '{';
RightBrace   : '}';
Thing        : '|';