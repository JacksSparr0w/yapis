grammar stringland;
statement : set | show | make | concat;
concat: (VAR) 'concat' (VAR);
make: 'make' statement;
set : VAR 'set' VAR;
show : 'show' (VAR) ;
VAR : [a-z0-9]+ ;
WS : [ \n\t]+ -> skip;