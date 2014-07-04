grammar Constants;

Class: 'class' ' ' Name;

ID: Nondigit (Digit|Nondigit)*;
Name: ID;
Type: ID Pointers*;

Spaces       : ' '+;
Tab          : '\t';
Tabs         : Tab+;
LeftParen    : '(';
RightParen   : ')';
LeftBracket  : '[';
Parens       : '(' | ')';
RightBracket : ']';
LeftBrace    : '{';
RightBrace   : '}';
NewLine      : '\r\n' | '\r' | '\n';

Assign : '=';

Assigns
:	'*=' | '/=' | '%=' | '+=' | '-='
|	'<<=' | '>>=' | '&=' | '^=' | '|='
;

Pointers: '*' | '^' | '&';

PostFix: '++' | '--' | Pointers;

PreFix:	'++' | '--' | '!' | '-' | '+';

Unary: PostFix | PreFix;

Logic
:	'||' | '&&' | '!=' | '==' | '<'
|	'>' | '<=' | '>='
;

Arrow : '->';
Dot : '.';

BitWise : '^' | '&' | '~' | '|' | '<<' | '>>';

Binary
:	'->' | '.' | Logic | BitWise
;

Operators
:	Assigns | Binary | Unary
;

fragment
Nondigit
:   [a-zA-Z_]
;

Anything: . ;

Digit
:   [0-9]
;

StorageClass
:   'typedef'
|   'extern'
|   'static'
|   '_Thread_local'
|   'auto'
|   'register'
;

TypeQualifier
:   'const'
|   'restrict'
|   'volatile'
;

Inline: 'inline';