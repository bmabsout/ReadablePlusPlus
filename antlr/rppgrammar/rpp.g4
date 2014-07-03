grammar rpp;
import Constants;

program
:	Class NewLines functions EOF
|	Class EOF
|	NewLines? functions EOF
;

functions: (function (NewLines function)* )?;

function
:	Tabs Type Name '(' args ')'
		('{' body '}' | NewLine Tabs body)
;

statement
:	line
;

line
:	Operators | Name | Digit | Spaces | Parens | StorageClass | TypeQualifier;


args: Type Name+ (',' Type Name+);

body: statement ((';'| NewLine Tabs) statement)+;