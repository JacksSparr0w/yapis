grammar Test;

options {
    language = Java;
    }

@header {
    import main.handle.GrammaHandler;
    import main.handle.MyParser;
    import main.model.*;
    }

@members {
    private GrammaHandler handler = new GrammaHandler();
    private MyParser parser = new MyParser();
    }



program
    :   'program' {parser.prepareFiles();} WS*

        'start' WS*

            (variable | expression | statement | function | procedure | function_call | print)* WS*


        'finish' {parser.closeFiles();}{handler.test();}
    ;

variable
    : WS* type WS+ name     {handler.addVar(new Variable($name.text, $type.text, handler.scope));}
    ' = '? (value       {handler.getVarByName($name.text).setValue($value.val);}
          | expression  {handler.getVarByName($name.text).setValue($expression.val);}
          | function_call {handler.getVarByName($name.text).setValue($function_call.val);}
    )?
    (', ' name          {handler.addVar(new Variable($name.text, $type.text, handler.scope));}
    ' = '? (value       {handler.getVarByName($name.text).setValue($value.val);}
          | expression  {handler.getVarByName($name.text).setValue($expression.val);}
          | function_call {handler.getVarByName($name.text).setValue($function_call.val);}
    )?
    )* WS* ';' WS* {parser.writeVariables(handler.scope);}
    ;

type
    :   ('int' | 'String' )
    ;

name
    :   STRING
    ;

value returns[String val, String typeOfVal]
    :   ('"'WS* STRING WS*'"'   {$val = "\"" + $STRING.text + "\""; $typeOfVal = "String";}
    |   INT                     {$val = $INT.text; $typeOfVal = "Int";}
    |   STRING                  {$val = $STRING.text; $typeOfVal = "Var";}
    )
    ;


//-------------------

expression returns[String val]
    :  WS* s1=value WS* {$val = $s1.text;}
    ( MATH_SYMB WS* (s2=value)* WS* {if ($s2.text!=null) {
                                         if ($s1.typeOfVal.equals("String")){
                                            $val = $val + parser.getMathSign("String", $MATH_SYMB.text, $val, $s2.text);
                                            } else {
                                            $val = $val + " " + parser.getMathSign("Int", $MATH_SYMB.text, $val, $s2.text);
                                            }

                                         } else {$val = $val + " " + $MATH_SYMB.text;
                                         }}
    )*
    ;

relation returns[String strValF, String strValS, String typeOfValue, String sign]
	:	WS* v1=value WS*
	(('==' {$sign="==";}
	| '!=' {$sign="!=";}
	| '<' {$sign="<";}
	| '<=' {$sign="<=";}
	| '>=' {$sign=">=";}
	| '>' {$sign=">";}) WS*
	 v2=value WS* {$strValF = $v1.val; $strValS = $v2.val;}
	)*
	;

//-------------------------------

statement
    :   ifstatement
    |   whilestatement
    |   forstatement
    |   switchstatement
    |   block
    ;

ifstatement
    :   'if' WS* '(' WS* relation {parser.makeRelationHeader($relation.strValF, $relation.strValS, "if", handler.scope);}
     WS* ')' WS*
        (variable
        | expression WS*
        | function_call
        | statement
        | print
         ';' {parser.makeRelationBody($expression.val, handler.scope);} )* WS*
        ('else' WS*
         variable
                 | expression WS*
                 | function_call
                 | statement
                 | print
         WS* ';' {parser.makeRelationBody(" } else {" + $expression.val + " }", handler.scope);})* WS*
        'endif' WS*
    ;


whilestatement
    :   'while' WS* '(' WS* relation WS* {parser.makeRelationHeader($relation.strValF, $relation.strValS, "while", handler.scope);}')' WS*
        (WS*
         variable
                 | expression WS*
                 | function_call
                 | statement
                 | print
         WS* ';' {parser.makeRelationBody($expression.val, handler.scope);})* WS*
        'endwhile' WS* {parser.closeRelation(handler.scope);}
    ;

forstatement
    :   'for' WS* '(' {parser.makeLoopHeader(handler.scope);} WS* variable WS* ';' WS* relation WS* ';' WS* expression WS* ')' WS*
        {parser.makeLoopHeaderParams($relation.strValF, $relation.sign, $relation.strValS, $expression.val, handler.scope);}
        (WS*
         variable
                 | expression {parser.makeRelationBody($expression.val, handler.scope);} WS*
                 | function_call
                 | statement
                 | print
         WS* ';' )* WS*
        'endfor' WS* {parser.closeRelation(handler.scope);}
    ;

switchstatement
    :      'switch' WS* expression WS* {parser.makeRelationHeader($expression.val, $expression.val, "switch", handler.scope);}
            ':' WS*
                ( WS* 'case' WS* value WS*  {parser.makeRelationHeader($value.val, $value.val, "case", handler.scope);}':' WS*
                 (WS*
                          variable
                                  | expression WS*
                                  | function_call
                                  | statement
                                  | print
                          WS* ';')* WS*
                  'endcase' {parser.makeRelationHeader($value.val, $value.val, "endcase", handler.scope);})+ WS*
                (WS* 'default' WS* {parser.makeRelationHeader($value.val, $value.val, "default", handler.scope);}':' WS*
                                 (WS*
                                          variable
                                                  | expression WS*
                                                  | function_call
                                                  | statement
                                                  | print
                                          WS* ';')* WS*
                                   'endcase' {parser.makeRelationHeader($value.val, $value.val, "endcase", handler.scope);})? WS*
             'endswitch' WS* {parser.closeRelation(handler.scope);}
    ;

block
    :   '[' WS* {parser.makeRelationHeader("", "", "block", handler.scope);}
        (WS*
         variable
                 | expression {parser.makeRelationBody($expression.val, handler.scope);} WS*
                 | function_call
                 | statement
                 | print
         WS* ';' )* WS*
        ']' WS* {parser.closeRelation(handler.scope);}
    ;
//-------------
    procedure
    	:	'procedure' WS+ name {handler.scope = $name.text;}
    	    WS* '(' WS* parameters?  WS*')' {parser.makeProcedureHeader($name.text, $parameters.val);} WS*
    		(variable
                     | expression WS*
                     | function_call
                     | statement
                     | print)* WS*
    		'end' {parser.closeProcedure();} {handler.scope = "global";}WS*
    	;


    function returns[String val]
    	:	'function' WS+ type WS+ name {handler.scope = $name.text;}
    	WS* '(' WS* parameters? WS* ')' {parser.makeFuncHeader($type.text + " " + $name.text, $parameters.val);} WS*
    		(variable
                     | expression WS*
                     | function_call
                     | statement
                     | print)* WS*
    		'return' WS+ expression WS* ';' {parser.closeFunc($expression.val);} {handler.scope = "global";} WS*
       	;

    function_call returns[String val]
        : WS* name WS* '(' WS* parameters? WS* ')' WS* ';' {parser.makeFuncCall($name.text, $parameters.val);
                                             $val=$name.text + " (" +  $parameters.val + ")";}
        ;

    parameters returns[String val]
    	:	p1=parameter {$val = $p1.val;} WS*
    	(',' WS* p2=parameter {$val = $val + ","+ $p2.val;} WS*)
    	;

    parameter returns[String val]
    	:	(type WS* {$val = $type.text + " ";})* name { if($val ==null) {
    	                                                                  $val = $name.text;
    	                                                                  } else $val = $val + $name.text;}
    	;

    print
        : 'print' WS* '(' WS* expression WS* ')' {parser.print(handler.scope, $expression.val);}
        ;




    MATH_SYMB :('+' | '-' | '/' | '*' | '=' | '+=' | '-=' | '++' | '--');
    STRING : ([a-z] | [A-Z])+;
    INT : [0-9]+;
    WORD : 'a'..'z'+;
    WS : (' ' | '\t' | '\n' | '\r' | '\t')*;
    SYMB : ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*;