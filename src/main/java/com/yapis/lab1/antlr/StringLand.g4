grammar StringLand;

program : statement+;
statement : set | show | expression;
expression : concat | times | STRING;

times: STRING 'times' INT;
concat: STRING 'concat' STRING;
set : var 'set' expression;
show : 'show' (STRING | expression);
var : 'var' STRING;
STRING : [a-z0-9]+ ;
INT : [0-9]+ ;
WS : [ \n\t]+ -> skip;