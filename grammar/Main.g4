grammar Main;

program : importclass* (classDef)? ;

importclass : 'import' CLASSNAME ;
classDef : 'class' CLASSNAME ('(' CLASSNAME ')')? '{' class_body* '}';
class_body : varDec | methodDec | constructor | arrayDec ;
varDec : TYPE ID;
arrayDec : TYPE '['INTEGER']' ID ;
methodDec : 'def' (TYPE|'void') ID '(' parameter* ')''{' ( statement)* '}';
constructor : 'def' TYPE '(' parameter* ')''{' ( statement)* '}' ;
parameter : varDec (',' varDec)* ;
statement : varDec | assignment | print_statment | method_call | return_statment
 |if_statment | while_statment | if_else_statment | for_statment;
return_statment : 'return' exp ;
condition_list : condition (('or'|'and') condition)* ;
condition : BOOL | prefixexp | (exp) relational_operators (exp);
if_statment : 'if' '(' condition_list ')' '{' statement* '}';
while_statment : 'while' '(' condition_list ')' '{' statement* '}' ;
if_else_statment :'if' '(' condition_list ')' '{' statement* '}' ('elif' '(' condition_list ')' '{' statement*
'}')* 'else' '{' statement* '}' ;
print_statment : 'print' '(' (prefixexp | TYPE args | INTEGER |STRING | BOOL) ')' ;
for_statment : 'for' ID 'in' ID '{' statement* '}'
 | 'for' ID 'in' 'range''('INTEGER (',' INTEGER)? (',' INTEGER)? ')' '{' statement* '}' ;
method_call : ID '.'args ;
assignment : prefixexp assignment_operators exp
 | varDec assignment_operators exp
 | arrayDec '=' TYPE args ('['INTEGER']') ;
exp :'none' | BOOL | INTEGER | STRING | FLOAT | prefixexp | exp arithmetic_operator exp
 | TYPE args | '('exp')' | ID args ;
prefixexp : ID | prefixexp '[' INTEGER ']' | prefixexp '.' ID | prefixexp '.' ID args ;
args : '(' (explist)? ')' ;
explist : exp (',' exp)*;
arithmetic_operator: '+' | '-' | '*' | '/' | '%' ;
relational_operators : '<' | '>' | '<=' | '>=' | '==' | '!=' ;
assignment_operators : '=' | '+=' | '-=' | '*=' | '/=' ;

WS : [ \r\t\u000C\n]+ -> skip ;

CLASSNAME: [A-Z][a-zA-Z0-9]*;
BOOL: 'bool';
INTEGER: 'int';
STRING: 'string';
FLOAT: 'float';
TYPE: INTEGER | BOOL | STRING | FLOAT | CLASSNAME;
ID: [a-z][a-zA-Z0-9_]*;