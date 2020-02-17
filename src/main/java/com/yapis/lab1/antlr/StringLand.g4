grammar StringLand;

program : statement+;
statement : set | show | expression ;
expression : STRING | concat ;
concat : '(' expression 'CONCAT' expression ')';
set : var 'SET' expression;
show : 'SHOW' expression;
var : 'VAR' STRING;
STRING : [a-z0-9]+ ;
WS : [ \n\t]+ -> skip;