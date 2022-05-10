grammar Main;
program : importclass* (classDef)? ;
importclass : 'import' CLASSNAME ;
classDef : 'class' CLASSNAME ('(' CLASSNAME (',' CLASSNAME)* ')')? '{' class_body* '}';
class_body : varDec | methodDec | constructor | arrayDec ;
varDec : (TYPE | CLASSNAME) ID ;
arrayDec : (TYPE | CLASSNAME) '['INTEGER']' ID ;
methodDec : 'def' ((TYPE | CLASSNAME)|'void') ID '(' parameter* ')''{' ( statement)* '}';
constructor : 'def' (TYPE | CLASSNAME) '(' parameter* ')''{' ( statement)* '}' ;
parameter : varDec (',' varDec)* ;
statement : varDec | assignment | print_statment | method_call | return_statment
|if_statment | while_statment | if_else_statment | for_statment;
return_statment : 'return' exp ;
condition_list : condition (('or'|'and') condition)* ;
condition : BOOL | prefixexp | (exp) relational_operators (exp);
if_statment : 'if' '(' condition_list ')' '{' statement* '}';
while_statment : 'while' '(' condition_list ')' '{' statement* '}' ;
if_else_statment :'if' '(' condition_list ')' '{' statement* '}' ('elif' '(' condition_list ')' '{' statement* '}')* 'else' '{' statement* '}' ;
print_statment : 'print' '(' (prefixexp | (TYPE | CLASSNAME) args | INTEGER |STRING | BOOL) ')' ;
for_statment : 'for' ID 'in' ID '{' statement* '}'
| 'for' ID 'in' 'range''('INTEGER (',' INTEGER)? (',' INTEGER)? ')' '{' statement* '}' ;
method_call : ID ('.')? args ;
assignment : prefixexp assignment_operators exp
| varDec assignment_operators exp
| arrayDec '=' (TYPE | CLASSNAME) args ('['INTEGER']') ;
exp :'none' | BOOL | INTEGER | STRING | FLOAT | prefixexp | exp arithmetic_operator exp
| (TYPE | CLASSNAME) args | '('exp')' | ID args ;
prefixexp : ID | prefixexp '[' INTEGER ']' | prefixexp '.' ID | prefixexp '.' ID args ;
args : '(' (explist)? ')' ;
explist : exp (',' exp)*;
arithmetic_operator: '+' | '-' | '*' | '/' | '%' ;
relational_operators : '<' | '>' | '<=' | '>=' | '==' | '!=' ;
assignment_operators : '=' | '+=' | '-=' | '*=' | '/=' ;

TYPE: INT | FLOATING_POINT | STRING | BOOL;
INT: 'int';
FLOATING_POINT: 'float';
STRING: 'string';
BOOL: 'bool';
CLASSNAME: [A-Z] (LETTER|DIGIT)*;
ID: [a-z]([A-Za-z_])*;
LETTER: [A-Za-z];
INTEGER: DIGIT+;
FLOAT: (DIGIT)+ '.' (DIGIT)+;
DIGIT: [0-9];



OPEN_COMMENT : '#*' ;
CLOSE_COMMENT : '*#' ;
COMMENT : OPEN_COMMENT (COMMENT | .)*? CLOSE_COMMENT -> skip ;
ONE_LINE_COMMENT : '#' (~ '\n')* '\n'? -> skip ;

WHITESPACE : [ \t\r\n\f]+ -> skip ;