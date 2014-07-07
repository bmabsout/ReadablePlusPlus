grammar rpp;

program : NewLine* (globals | classGlobals)? NewLine* EOF ;

globals: global (NewLine+ global)* ;

classGlobals
:	'class ' name lineTabs global (lineTabs global)*
;

global : function; //|	member ;

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

line: 'node' | statement;

statement: ifStatement | whileStatement;

ifStatement//maybe allow () for intuitiveness
:	'if' statementHelper body
		((lineTabs|';') 'elif' statementHelper body )*
		((lineTabs|';') 'else' (' '|lineTabs) body)?
;

whileStatement
:	'while' statementHelper body
|	'do' (' '|lineTabs) body (lineTabs|';') 'while' ' ' logicExpression
;

statementHelper
:	' ' logicExpression lineTabs
|	' '? '(' Spaces logicExpression Spaces ')' ' '
;

logicExpression : Logic;
Logic
:	'||' | '&&' | '!=' | '==' | '<'
|	'>' | '<=' | '>='
;

Pointers     : '*' | '^' | '&';
type         : ID Pointers*;
Digit        : [0-9];
Nondigit     : [a-zA-Z_];
name         : ID;
ID           : Nondigit (Digit|Nondigit)*;
NewLine      : '\r\n' | '\r' | '\n';
lineTabs     : NewLine+ tabs;
LeftParen    : '(';
RightParen   : ')';
Spaces       : ' '+;
tabs         : '\t'+;

