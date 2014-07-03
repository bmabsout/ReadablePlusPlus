grammar rpp;
import unchanged;

compilationUnit
    :   externalDeclaration* EOF
    ;

externalDeclaration
    :   functionDefinition
    |   declaration
    |   EOStatment
    ;

functionDefinition
    :   declarationSpecifiers? declarator declarationList? compoundStatement
    ;



