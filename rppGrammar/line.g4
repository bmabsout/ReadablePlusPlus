grammar line;


program: NewLine* (line (NewLine+ line)*)? NewLine* EOF;

line: functionCall|assigns;

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