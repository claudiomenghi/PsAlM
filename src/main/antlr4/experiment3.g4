/**
 * Define a grammar called TA
 */
 grammar experiment3;

 @members {  boolean matchedEOF=false;
 	
 	
 }
 @header {
 	
 	package se.gu.parser;
 	import se.gu.ltl.atoms.LTLAtom;
 	
 	import se.gu.ltl.atoms.LTLPAAtom;
 	import se.gu.ltl.atoms.LTLPEAtom;
 	import se.gu.ltl.atoms.LTLPLAtom;
 	import java.util.HashSet;
 	import se.gu.patterns.Pattern;
 	import java.util.Set;
 	import se.gu.patterns.coremovement.coverage.*;
 	import se.gu.patterns.coremovement.surveillance.*;
 	import se.gu.patterns.avoidance.conditional.*;
 	import se.gu.patterns.avoidance.restricted.*;
 	import se.gu.patterns.triggers.*;
 	import se.gu.mission.*;
}

instantaneousReactionPattern: 'G' reactionimpl;


assignement:
ID OPERATOR ID;

numAss: 
ID OPERATOR NAT;


posassignement: 
	ID POSITIVEOPERATOR ID;

posnumAss: ID POSITIVEOPERATOR NAT;
 
 
 expression:
 	assignement	|
 	numAss	|
 	ID	|
 	'!' ID;
 
LOP: '&' | '|';

exp:
	'(' exp ')'|
	exp (LOP exp) |
	expression
	;
	
reactionimpl:
	exp '->' exp;




 WS
 :
 	[ \n\t\r]+ -> skip
 ;

 ID
 :
 	(
 		'a' .. 'z'
 		| 'A' .. 'Z'
 	)
 	(
 		'a' .. 'z'
 		| 'A' .. 'Z'
 		| '0' .. '9'
 		| '_'
 	)*
 ;

 NAT
 :
 	(
 		'0' .. '9'
 	)
 	(
 		'0' .. '9'
 	)*
 ;
 
 OPERATOR:
 ( 		'=' 
 		| '<='
 		| '>='
 		| '=='
 		| '!='
 );
 
 POSITIVEOPERATOR:
 ( 		'=' 
 		| '<='
 		| '>='
 		| '=='
 );

 TRUE
 :
 	'true'
 ;

 FALSE
 :
 	'false'
 ;

 NEWLINE
 :
 	'\r'? '\n'
 ;

 COMMA
 :
 	','
 ;

 COMMENT
 :
 	'/*' .*? '*/' -> skip
 ;

 LINE_COMMENT
 :
 	'//' ~[\r\n]* -> skip
 ;
 