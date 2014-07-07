grammar line;

lineTabs     : NewLine+ tabs;
tabs         : '\t'+;
Spaces       : ' '+;
Pointers     : '*' | '^' | '&';
type         : ID Pointers*;
name         : ID;
ID           : Nondigit (Digit|Nondigit)*;
Digit        : [0-9];
Nondigit     : [a-zA-Z_];
NewLine      : '\r\n' | '\r' | '\n';
LeftParen    : '(';
RightParen   : ')';
LeftBrace    : '{';
RightBrace   : '}';
Thing        : '|';

program: NewLine* assign (NewLine+ assign)* NewLine* EOF;

assign
:	type
	('|' (' '+|lineTabs)? (lineAssign | lineDeclare (' '+ linemix)?)
	|	' '* closedItem ' '+ linemix)
	(lineTabs (linemix|lineAssign))*
;
multipleDeclare: name (' ' name)+;

closedItem: '{'(' '* multipleDeclare ' '* '=' ' '* |' '* name ' '+ ID)'}';

lineDeclare: name|multipleDeclare;

lineAssign: lineDeclare (' '* '=' ' '* (ID|functionCall));

linemix: (closedItem|lineDeclare) (' '+ (closedItem|lineDeclare))*;

stuffList    : (ID|'('functionCall')') (' ' (ID|'('functionCall')') )*;
functionCall : name ' ' stuffList | '(' name ')';
