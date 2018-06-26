/**
 * Define a grammar called TA
 */
 grammar MISSION;

 @members {  boolean matchedEOF=false;
 	
 	
 }
 @header {
 	
 	package se.got.parser;
 	import se.got.ltl.atoms.LTLAtom;
 	
 	import se.got.ltl.atoms.LTLPAAtom;
 	import se.got.ltl.atoms.LTLPEAtom;
 	import se.got.ltl.atoms.LTLPLAtom;
 	import java.util.HashSet;
 	import se.got.patterns.Pattern;
 	import java.util.Set;
 	import se.got.patterns.coremovement.coverage.*;
 	import se.got.patterns.coremovement.surveillance.*;
 	import se.got.patterns.avoidance.conditional.*;
 	import se.got.patterns.avoidance.restricted.*;
 	import se.got.patterns.triggers.*;
 	import se.got.mission.*;
}

mission returns [Mission robotsmission]
 :
 	(
	 
 		robotsDecl 
  		actionDecl
		locationDecl 
		conditionsDecl
		'mission: ' goal
		{
			$robotsmission=new Mission($goal.value, $robotsDecl.value, $actionDecl.value, $conditionsDecl.value, $locationDecl.value);
		}
	)
 ;



robotsDecl returns [Set<String> value] @init {
	$value=new HashSet<>();
	}: 'robots: {' robot{
		$value.add($robot.value);
	} ( ',' robot{
		$value.add($robot.value);
	} )* '};';
	
actionDecl returns [Set<String> value] @init {
	$value=new HashSet<>();
	}: 'actions: {' action{
		$value.add($action.value);
	} ( ',' action{
		$value.add($action.value);
	} )* '};';
	
locationDecl returns [Set<String> value] @init {
	$value=new HashSet<>();
	}: 'locations:  {' location{
		$value.add($location.value);
	} ( ',' location{
		$value.add($location.value);
	} )* '};'; 
	
conditionsDecl returns [Set<String> value] @init {
	$value=new HashSet<>();
	}: 'conditions:  {' condition{
		$value.add($condition.value);
	} ( ',' condition{
		$value.add($condition.value);
	} )* '};'; 

pl returns [LTLPLAtom atom] : robot 'in' location{
	$atom=new LTLPLAtom($robot.value, $location.value);
	
};

pa returns [LTLPAAtom atom]: robot 'exec' action{
	$atom=new LTLPAAtom($robot.value, $action.value);
};


pe returns [LTLPEAtom atom]: condition{
	$atom=new LTLPEAtom($condition.value);
};




goal returns [Goal value]: 
	pattern {
		$value=new BasicGoal($pattern.value);
	} |
	'('  g1=goal  ') AND (' g2=goal ')' {
		$value=new AndGoal($g1.value, $g2.value);
	} |
	'(' g1=goal ') OR (' g2=goal ')'{
		$value=new OrGoal($g1.value, $g2.value);
	};
	
pattern returns [Pattern value]: core_movement_pattern{
	$value=$core_movement_pattern.value;
} | avoidance{
	$value=$avoidance.value;
} |   'if (' pe ') then '  (pl | pattern){
	$value=new InstantaneousReaction($pe.atom, $pl.atom, $pattern.value);
} |  'if (' pe ') then finally (' (pl | pattern) ')'{
	$value=new DelayedReaction($pe.atom, $pl.atom, $pattern.value);
} | 'wait' pl 'until ' pe {
	$value=new Wait($pe.atom, $pl.atom);
};



avoidance returns [Pattern value]: conditional{
	$value=$conditional.value;
} | restricted{
	$value=$restricted.value;
};

conditional returns [Pattern value]: future_avoidance{
	$value=$future_avoidance.value	;
} | global_avoidance{
	$value=$global_avoidance.value	;
} | past_avoidance {
	$value=$past_avoidance.value	;
};

restricted returns [Pattern value]: lower_restricted_avoidance{
	$value=$lower_restricted_avoidance.value;
} | exact_restricted_avoidance{
	$value=$exact_restricted_avoidance.value;
} | upper_restricted_avoidance{
	$value=$upper_restricted_avoidance.value	;
};

future_avoidance returns [Pattern value]: 'after condition ' pe ' holds, robot 'robot ' must avoid location ' location {
	$value=new FutureAvoidance($pe.atom,  new LTLPLAtom($robot.value, $location.value));
};
global_avoidance returns [Pattern value]: 'robot ' robot ' must avoid location ' location {
	$value=new GlobalAvoidance(new LTLPLAtom($robot.value, $location.value));
};
past_avoidance returns [Pattern value]:  'robot ' robot ' must avoid location ' location ' until condition ' pe ' holds'{
	$value=new PastAvoidance($pe.atom,  new LTLPLAtom($robot.value, $location.value));
};

lower_restricted_avoidance returns [Pattern value]: 'robot ' robot ' must not visit location ' location ' less than ' NAT ' times'{
	$value=new LowerRestrictedAvoidance(new LTLPLAtom($robot.value, $location.value), Integer.parseInt($NAT.text));
};
exact_restricted_avoidance returns [Pattern value]:  'robot ' robot ' must  visit location ' location ' exactly   ' NAT ' times'{
	$value=new ExactRestrictedAvoidance(new LTLPLAtom($robot.value, $location.value), Integer.parseInt($NAT.text));
};
upper_restricted_avoidance returns [Pattern value]:  'robot ' robot ' must not visit location ' location ' more than ' NAT ' times'{
	$value=new UpperRestrictedAvoidance(new LTLPLAtom($robot.value, $location.value), Integer.parseInt($NAT.text));
};


core_movement_pattern returns [Pattern value]: coverage{
	$value=$coverage.value;
}
 | surveillance{
	$value=$surveillance.value;
} ;


coverage returns [Pattern value]: visit{
	$value=$visit.p;
} | sequenced_visit{
	$value=$sequenced_visit.p	;
}
 | ordered_visit{
	$value=$ordered_visit.p;
}
 | strict_ordered_visit{
	$value=$strict_ordered_visit.p;
}
 | fair_visit{
	$value=$fair_visit.p;
};

surveillance returns [Pattern value]: patrolling{
	$value=$patrolling.p;
} | sequenced_patrolling{
	$value=$sequenced_patrolling.p;
} | ordered_patrolling{
	$value=$ordered_patrolling.p;
} | strict_ordered_patrolling{
	$value=$strict_ordered_patrolling.p;
} | fair_patrolling{
	$value=$fair_patrolling.p;
};




visit returns [Pattern p] locals[
	Set<LTLPLAtom> atoms=new HashSet<>();
] @init {
	$atoms=new HashSet<>();
	}: 'visit(' pl {
	$atoms.add($pl.atom);
}

 ( ',' pl{
 	$atoms.add($pl.atom);
 } )* ')' {$p=new Visit($atoms); };


sequenced_visit returns [Pattern p] locals[
	Set<LTLPLAtom> atoms=new HashSet<>();
] @init {
	$atoms=new HashSet<>();
	}: 'sequenced_visit(' pl {
	$atoms.add($pl.atom);
}

 ( ',' pl{
 	$atoms.add($pl.atom);
 } )* ')' {$p=new SequencedVisit($atoms); };

ordered_visit returns [Pattern p] locals[
	Set<LTLPLAtom> atoms=new HashSet<>();
] @init {
	$atoms=new HashSet<>();
	}: 'ordered_visit(' pl {
	$atoms.add($pl.atom);
}

 ( ',' pl{
 	$atoms.add($pl.atom);
 } )* ')' {$p=new OrderedVisit($atoms); };
 
 
 
strict_ordered_visit returns [Pattern p] locals[
	Set<LTLPLAtom> atoms=new HashSet<>();
] @init {
	$atoms=new HashSet<>();
	}: 'strict_ordered_visit(' pl {
	$atoms.add($pl.atom);
}

 ( ',' pl{
 	$atoms.add($pl.atom);
 } )* ')' {$p=new StrictOrderedVisit($atoms); };
 
 



fair_visit returns [Pattern p] locals[
	Set<LTLPLAtom> atoms=new HashSet<>();
] @init {
	$atoms=new HashSet<>();
	}: 'fair_visit(' pl {
	
	$atoms.add($pl.atom);
}

 ( ',' pl{
 	$atoms.add($pl.atom);
 } )* ')' {$p=new FairVisit($atoms); };
 
 

patrolling returns [Pattern p] locals[
	Set<LTLPLAtom> atoms=new HashSet<>();
] @init {
	$atoms=new HashSet<>();
	}: 'patrolling(' pl{
 	$atoms.add($pl.atom);
 } ( ',' pl{
 	$atoms.add($pl.atom);
 } )* ')' {$p=new Patrolling($atoms); };

sequenced_patrolling returns [Pattern p] locals[
	Set<LTLPLAtom> atoms=new HashSet<>();
] @init {
	$atoms=new HashSet<>();
	}: 'sequenced_patrolling(' pl{
 	$atoms.add($pl.atom);
 } ( ',' pl{
 	$atoms.add($pl.atom);
 } )* ')' {$p=new SequencedPatrolling($atoms); };

ordered_patrolling returns [Pattern p] locals[
	Set<LTLPLAtom> atoms=new HashSet<>();
] @init {
	$atoms=new HashSet<>();
	}: 'ordered_patrolling(' pl{
 	$atoms.add($pl.atom);
 } ( ',' pl{
 	$atoms.add($pl.atom);
 } )* ')' {$p=new OrderedPatrolling($atoms); };

strict_ordered_patrolling returns [Pattern p] locals[
	Set<LTLPLAtom> atoms=new HashSet<>();
] @init {
	$atoms=new HashSet<>();
	}: 'strict_ordered_patrolling(' pl{
 	$atoms.add($pl.atom);
 } ( ',' pl{
 	$atoms.add($pl.atom);
 } )* ')' {$p=new StrictOrderedPatrolling($atoms); };

fair_patrolling returns [Pattern p] locals[
	Set<LTLPLAtom> atoms=new HashSet<>();
] @init {
	$atoms=new HashSet<>();
	}: 'fair_patrolling(' pl{
 	$atoms.add($pl.atom);
 } ( ',' pl{
 	$atoms.add($pl.atom);
 } )* ')' {$p=new FairPatrolling($atoms); };

robot returns[String value]: ID {
	$value=$ID.text;
};

action returns[String value]: ID {
	$value=$ID.text;
};

location returns[String value]: ID {
	$value=$ID.text;
};

condition returns[String value]: ID {
	$value=$ID.text;
};

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
 