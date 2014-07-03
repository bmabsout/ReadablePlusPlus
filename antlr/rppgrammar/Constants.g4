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
NewLine
:   (   '\r' '\n'?
    |   '\n'
    )
    -> skip
;
NewLines     : NewLine+;

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

Equal : '==';
NotEqual : '!=';

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

fragment
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