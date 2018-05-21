/**
 * Define a grammar called TA
 */
 grammar Visit;

 @members {  boolean matchedEOF=false;
 	

 }

 @header {
 	package se.got.patterns.parser;
 	
import se.got.ltl.atoms.*;
import se.got.ltl.*;

}

visit returns [LTLFormula visitFormula]:  (FINALLY (LOCATION AND visit)) {
		$visitFormula=new LTLEventually(LTLFormula.and(new LTLIPropositionalAtom($LOCATION.text), $visit.visitFormula));
	} 
	| 
		LOCATION{
		$visitFormula=new LTLEventually(new LTLIPropositionalAtom($LOCATION.text));
};

LOCATION
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

AND: 
	'&&'
;

FINALLY:
	'F'
;

 COMMENT
 :
 	'/*' .*? '*/' -> skip
 ;

 LINE_COMMENT
 :
 	'//' ~[\r\n]* -> skip
 ;

 