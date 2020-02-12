grammar stringland;
statement : set | show | make | concat | var;
concat: STRING 'concat' STRING;
make: 'make' statement;
set : STRING 'set' STRING;
show : 'show' STRING;
var : 'var' STRING;
STRING : [a-z0-9]+ ;
WS : [ \n\t]+ -> skip;