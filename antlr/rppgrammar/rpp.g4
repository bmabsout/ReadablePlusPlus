grammar rpp;

Pointers     : '*' | '^' | '&';
Type         : ID Pointers*;
Digit        : [0-9] ;
Nondigit     : [a-zA-Z_];
ID           : Nondigit (Digit|Nondigit)*;
Anything     : .;
newLine      : '\r\n' | '\r' | '\n';
LeftParen    : '(';
RightParen   : ')';
Spaces       : ' '+;
Tab          : '\t';
Tabs         : Tab+;

program : newLine* (globals | classGlobals)? EOF ;

globals
:	global (newLine+ global)
;

classGlobals
:	'class' ' ' ID newLine+ Tabs global (newLine+ Tabs global)
;

global : function; //|	member ;

constructor : ID '(' Spaces args? Spaces ')' body;

function
:	(functionStuff ' ')? Type ' ' ID '(' Spaces args? Spaces ')' body;

args: Type ' ' ID+ (',' ' '? Type ' ' ID+ )*;

functionStuff : ID (' ' ID)*;

body: newLine+ Tabs line (newLine+ Tabs line|';' line)*;

line: 'node'+;