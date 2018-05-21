/**
 * Define a grammar called TA
 */
 grammar Patterns;

 @members {  boolean matchedEOF=false;
 	

 }

 @header {
import se.got.ltl.atoms.*;
import se.got.ltl.*;

}

 patterns returns [String pattern]: 	visit  {
 	$pattern="true";
 };

visit returns [LTLFormula visitFormula]:  (FINALLY (LOCATION AND visit)) {
		$visitFormula=new LTLEventually(new LTLConjunction(new LTLAtom(LOCATION.text), visit.visitFormula));
	} 
	| 
		LOCATION{
		$visitFormula=new LTLEventually(new LTLAtom(LOCATION.text));
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
 
  ACTION
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



 //********************************************************************************
 // TYPE DECLARATION
 //********************************************************************************


 prefix
 :
 	(
 		(
 			'urgent'
 		)?
 		(
 			'broadcast'
 		)?
 		|
 		(
 			'const'
 		)?
 	)
 ;

 range
 :
 	LBRA NAT ',' NAT RBRA
 ;

 commit
 :
 	'commit' stateList SEMICOLUMN
 ;

 urgent
 :
 	'urgent' stateList SEMICOLUMN
 ;

 stateList
 :
 	ID
 	(
 		',' ID
 	)*
 ;

 //********************************************************************************
 // METHOD DECLARATION
 //********************************************************************************

 block
 :
 	'{'
 	(
 		variableDecl
 		| typeDecl
 	)* statement* '}'
 ;

 statement
 :
 	block
 	| ';'
 	| expression ';'
 	| 'for' '(' exprList ';' exprList ';' exprList ')' statement
 	| 'while' '(' exprList ')' statement
 	| 'do' statement 'while' '(' exprList ')' ';'
 	| 'if' '(' exprList ')' statement
 	(
 		'else' statement
 	)?
 	| 'break' ';'
 	| 'switch' '(' exprList ')' '{' caseocc+ '}'
 	| 'return' ';'
 	| 'return' expression ';'
 ;

 caseocc
 :
 	'case' expression ':' statement*
 	| 'default' ':' statement*
 ;

 //********************************************************************************
 // TIMED AUTOMATON DEFINITION
 //********************************************************************************

 states returns [Set<State> stateset] @init {
	$stateset=new HashSet<>();
}
 :
 	'state' s1 = stateDecl
 	{
	$stateset.add($s1.state);
}

 	(
 		',' s2 = stateDecl
 		{
	$stateset.add($s2.state);
}

 	)* ';'
 ;

 stateDecl returns [State state]
 :
 	ID
 	{
		$state=new State($ID.text);
	}

 	| ID
 	(
 		'{' inv = invariant '}'
 	)
 	{
 		if($inv.inv!=null){
			$state=new State($ID.text, $inv.inv);
		}
		else{
			$state=new State($ID.text, new EmptyInvariant());
		}	
	}

 ;

 invariant returns [Invariant inv]
 :
 	ID op =
 	(
 		LE
 		| LEQ
 		| GE
 		| GEQ
 	) expression
 	{
 		$inv=new ExpInvariant(new Identifier($ID.text), $op.text, $expression.exp);
 	}

 ;

 init returns [String initString]
 :
 	'init' ID ';'
 	{
	$initString=$ID.text;
	}

 ;

 transitions returns [Set<Transition> transitionsret]
 @init {$transitionsret=new HashSet<>();}
 :
 	'trans' transitionset
 	{
		$transitionsret.addAll($transitionset.transitionsret);
	}

 	(
 		transitionset
 		{
		$transitionsret.addAll($transitionset.transitionsret);		
	}

 	)* ';'
 ;

 transitionset returns [Set<Transition> transitionsret]
 @init {$transitionsret=new HashSet<>();}
 :
 	s1 = ID '->' s2 = ID transitionBody
 	{
		$transitionsret.add(new Transition(new State($s1.getText()), new State($s2.getText()), $transitionBody.guardexp, $transitionBody.syncexp,  $transitionBody.assignexp));
	}

 	(
 		',' '->' s3 = ID b2 = transitionBody
 		{
		$transitionsret.add(new Transition(new State($s1.getText()), new State($s3.getText()), $b2.guardexp, $b2.syncexp,  $b2.assignexp));
		
	}

 	)*
 	(
 		',' s1 = ID '->' s2 = ID transitionBody
 		{
		$transitionsret.add(new Transition(new State($s1.getText()), new State($s2.getText()), $transitionBody.guardexp, $transitionBody.syncexp,  $transitionBody.assignexp));
	}

 		(
 			',' '->' s3 = ID b2 = transitionBody
 			{
		$transitionsret.add(new Transition(new State($s1.getText()), new State($s3.getText()), $b2.guardexp, $b2.syncexp,  $b2.assignexp));
		
	}

 		)*
 	)*
 ;

 transitionBody returns
 [Guard guardexp, SyncExpression syncexp, Assign assignexp]
 :
 	'{'
 	(
 		guard
 		{
 			 $guardexp=$guard.guardexp;
 		}

 	)?
 	{
		if($guardexp==null) {$guardexp=new Guard(new HashSet<VariableConstraintAtom>(), new HashSet<ClockConstraintAtom>());}
		}

 	(
 		sync
 		{
		$syncexp=$sync.syncexp;
		}

 	)
 	(
 		assign
 		{
 			$assignexp=$assign.assignexp;
 		}

 	)? '}'
 	{
		if($assignexp==null){ $assignexp=new Assign(new HashSet<ClockAssignement>(), new HashSet<VariableAssignement>());}
		}

 ;

 guard returns [Guard guardexp]
 :
 	'guard' exp1 = guardconditionList SEMICOLUMN
 	{
	$guardexp=new Guard($guardconditionList.variableconst==null? new HashSet<VariableConstraintAtom>() :$guardconditionList.variableconst, $guardconditionList.clockconst==null? new HashSet<ClockConstraintAtom>():$guardconditionList.clockconst);
}

 ;

 guardconditionList returns
 [Set<VariableConstraintAtom> variableconst, Set<ClockConstraintAtom> clockconst] @init {
		$variableconst=new HashSet<>();
		$clockconst=new HashSet<>();
	}
 :
 	clockconstraint
 	{
				if($clockconstraint.clockconst!=null) $clockconst.add($clockconstraint.clockconst) ;
				if($clockconstraint.variableconst!=null) $variableconst.add($clockconstraint.variableconst);
			}

 	(
 		(COMMA || AND) clockconstraint
 		{
				if($clockconstraint.clockconst!=null) $clockconst.add($clockconstraint.clockconst);
				if($clockconstraint.variableconst!=null)$variableconst.add($clockconstraint.variableconst) ;
			}

 	)*
 ;

 clockconstraint returns
 [ClockConstraintAtom clockconst, VariableConstraintAtom variableconst]
 :
 	constraintAtom {
				$clockconst=$constraintAtom.atom;	
				$variableconst=$constraintAtom.variableAtom;
			}

 ;


 constraintAtom returns
 [ClockConstraintAtom atom, VariableConstraintAtom variableAtom]
 :
 	id = ID op =
 	(
 		EQCOMP
 		| GE
 		| GEQ
 		| LE
 		| LEQ
 	) value = NAT
 	{
		
		if(declarations==null){
			throw new InternalError("The set of the declarations cannot be null");	
		}
		String identifier=$id.text;
		if(!declarations.containsKey($id.text) && 
		!boundedVariablesValues.containsKey($id.text) &&
		(currentTaDeclarations==null || !currentTaDeclarations.containsKey($id.text))){
			throw new IllegalStateException ("Line: "+_localctx.start.getLine()+"\t Variable: "+$id.text+" not defined");
		}
		
		
		if((declarations.containsKey(identifier))&&(declarations.get(identifier).equals("clock")) || (currentTaDeclarations!=null && currentTaDeclarations.containsKey(identifier))&&(currentTaDeclarations.get(identifier).equals("clock"))){
			$atom=new ClockConstraintAtom(new Clock($id.text), ClockConstraintAtomOperator.parse($op.text), Integer.parseInt($value.text));
		}
		if((declarations.containsKey(identifier))&&(declarations.get(identifier).equals("int")) || (currentTaDeclarations!=null && currentTaDeclarations.containsKey(identifier))&&(currentTaDeclarations.get(identifier).equals("int"))){

			$variableAtom=new VariableConstraintAtom(new Variable($id.text), VariableConstraintAtomOperator.parse($op.text), Integer.parseInt($value.text));
		}
	}

 ;

 sync returns [SyncExpression syncexp]
 :
 	(('sync' exp2 = ID op =
 	(
 		'!'
 		| '?'
 		
 	) ';'){
 		if($op.text.equals("!") || $op.text.equals("?")){
 				$syncexp=new SyncExpression($exp2.text, $op.text);		
 		}
 		else{
 			$syncexp=new SyncExpression("tau"+TAU_COUNTER, "TAU");
 			TAU_COUNTER++;
 		}
	}
 	|
	('sync' exp2 = ID  ';'){
 			$syncexp=new SyncExpression("tau"+TAU_COUNTER, "TAU");
 			TAU_COUNTER++;
 	}
	| {
 			$syncexp=new SyncExpression("tau"+TAU_COUNTER, "TAU");
 			TAU_COUNTER++;
 	})
 	

 ;

 assign returns [Assign assignexp]
 :
 	'assign' expl = assignmentList ';'
 	{
	$assignexp=new Assign($assignmentList.clockassignement, $assignmentList.variableassignement);
}

 ;

 assignmentList returns
 [Set<ClockAssignement> clockassignement, Set<VariableAssignement> variableassignement]
 @init {
	$clockassignement=new HashSet<>();
	$variableassignement=new HashSet<>();
}
 :
 	(
 		assignment
 		{
	 		if($assignment.clockassignementsret!=null){
	 			$clockassignement.add($assignment.clockassignementsret);
	 		}
	 		if($assignment.variableAssignementret!=null){
	 			$variableassignement.add($assignment.variableAssignementret);
	 		}
	 	}

 	)
 	(
 		(
 			COMMA assignment
 			{
				if($assignment.clockassignementsret!=null){
	 			$clockassignement.add($assignment.clockassignementsret);
	 		}
	 		if($assignment.variableAssignementret!=null){
	 			$variableassignement.add($assignment.variableAssignementret);
	 		}
		}

 		)
 	)*
 ;

 assignment returns
 [ClockAssignement clockassignementsret, VariableAssignement variableAssignementret]
 :
 	(
 		id = ID op =
 		(
 			EQASSIGN
 			| EQ
 		) nat = NAT
 	)
 	{
 			if(declarations==null){
			throw new InternalError("The set of the declarations cannot be null");	
		}
		String identifier=$id.text;
		if(!declarations.containsKey($id.text) && (currentTaDeclarations==null || !currentTaDeclarations.containsKey($id.text))){
			throw new IllegalStateException ("Line: "+_localctx.start.getLine()+"\t Variable:"+$id.text+" not defined");
		}
		if((declarations.containsKey(identifier))&&(declarations.get(identifier).equals("clock")) || (currentTaDeclarations!=null && currentTaDeclarations.containsKey(identifier))&&(currentTaDeclarations.get(identifier).equals("clock"))){
			$clockassignementsret=new ClockAssignement(new Clock($id.text), new Value($nat.text));
		}
		if((declarations.containsKey(identifier))&&(declarations.get(identifier).equals("int")) || (currentTaDeclarations!=null && currentTaDeclarations.containsKey(identifier))&&(currentTaDeclarations.get(identifier).equals("int"))){
			$variableAssignementret=new VariableAssignement(new Variable($id.text), new Value($nat.text));
		}
 	}

 	|
 	(
 		id = ID op =
 		(
 			EQASSIGN
 			| EQ
 		) exprStatement
 	)
 	{
 		if(declarations==null){
			throw new InternalError("The set of the declarations cannot be null");	
		}
		String identifier=$id.text;
		if(!declarations.containsKey($id.text) && (currentTaDeclarations==null || !currentTaDeclarations.containsKey($id.text))){
			throw new IllegalStateException ("Line: "+_localctx.start.getLine()+"\t Variable:"+$id.text+" not defined");
		}
		if((declarations.containsKey(identifier))&&(declarations.get(identifier).equals("clock")) || (currentTaDeclarations!=null && currentTaDeclarations.containsKey(identifier))&&(currentTaDeclarations.get(identifier).equals("clock"))){
			throw new IllegalStateException ("Line: "+_localctx.start.getLine()+"\t Clock:"+$id.text+" cannot be assigned to an expression but only to an integer value");
		}
		if((declarations.containsKey(identifier))&&(declarations.get(identifier).equals("int")) || (currentTaDeclarations!=null && currentTaDeclarations.containsKey(identifier))&&(currentTaDeclarations.get(identifier).equals("int"))){
			$variableAssignementret=new VariableAssignement(new Variable($id.text),  $exprStatement.exp);
		}
 		
 		}

 ;

 simpleassigment returns [ClockAssignement assignementsret]
 :
 	(
 		id = ID op = EQ nat = NAT
 	)
 	{$assignementsret=new ClockAssignement(
 						new Clock($id.text),
 						new Value($nat.text)
 					);}

 ;

 //********************************************************************************
 // EXPRESSIONS
 //********************************************************************************

 exprList returns [List<Expression> exprListret]
 @init {$exprListret=new ArrayList<>();}
 :
 	exp1 = expression
 	{
	$exprListret.add($exp1.exp);
}

 	(
 		',' exp2 = expression
 		{
	$exprListret.add($exp2.exp);
	}

 	)*
 ;

 exprStatement returns [Expression exp]
 :
 	(
 		expression
 		{
	$exp=$expression.exp;
}

 	)
 ;

 expression returns [Expression exp]
 :
 	ID
 	{
		$exp=new Identifier($ID.text);
	}

 	| NAT
 	{
		$exp=new Value($NAT.text);
	}

 	| exp1 = expression op =
 	(
 		PLUSPLUS
 		| MINUSMINUS
 	)
 	{
      $exp=new RightUnaryOperator($exp1.exp, $op.text);
    }

 	| op =
 	(
 		PLUS
 		| MINUS
 		| PLUSPLUS
 		| MINUSMINUS
 	) exp1 = expression
 	{
    	$exp=new LeftUnaryOperator($op.text, $exp1.exp);
    }

 	| op =
 	(
 		'~'
 		| '!'
 	) exp1 = expression
 	{
    	$exp=new LeftUnaryOperator($op.text, $exp1.exp);
    }

 	| exp1 = expression op =
 	(
 		MULT
 		| FRACT
 		| MOD
 	) exp2 = expression
 	{
    	BinaryArithmeticExpression exp=new BinaryArithmeticExpression($exp1.exp, $op.text ,$exp2.exp);
    	$exp=exp;
    }

 	| exp1 = expression op =
 	(
 		PLUS
 		| MINUS
 	) exp2 = expression
 	{
    		BinaryArithmeticExpression exp=new BinaryArithmeticExpression($exp1.exp, $op.text ,$exp2.exp);
    		$exp=exp;
    	}

 	| exp1 = expression op =
 	(
 		LEQ
 		| GEQ
 		| GE
 		| LE
 	) exp2 = expression
 	{
    	BinaryArithmeticExpression exp=new BinaryArithmeticExpression($exp1.exp, $op.text ,$exp2.exp);
    	$exp=exp;
    }

 	| exp1 = expression op =
 	(
 		EQCOMP
 		| NEQ
 	) exp2 = expression
 	{
    	BinaryArithmeticExpression exp=new BinaryArithmeticExpression($exp1.exp, $op.text ,$exp2.exp);
    	$exp=exp;
    }

 	| exp1 = expression op = BITAND exp2 = expression
 	{
    	BinaryArithmeticExpression exp=new BinaryArithmeticExpression($exp1.exp, $op.text ,$exp2.exp);
    	$exp=exp;
    }

 	| exp1 = expression op = POW exp2 = expression
 	{
    	BinaryArithmeticExpression exp=new BinaryArithmeticExpression($exp1.exp, $op.text ,$exp2.exp);
    	$exp=exp;
    }

 	| exp1 = expression op = BITOR exp2 = expression
 	{
    	BinaryArithmeticExpression exp=new BinaryArithmeticExpression($exp1.exp, $op.text ,$exp2.exp);
    	$exp=exp;
    }

 	| exp1 = expression op = AND exp2 = expression
 	{
    	BinaryArithmeticExpression exp=new BinaryArithmeticExpression($exp1.exp, $op.text ,$exp2.exp);
    	$exp=exp;
    }

 	| exp1 = expression op = OR exp2 = expression
 	{
    	BinaryArithmeticExpression exp=new BinaryArithmeticExpression($exp1.exp, $op.text ,$exp2.exp);
    	$exp=exp;
    }

 	| exp1 = expression '?' exp2 = expression ':' exp3 = expression
 	{
    	$exp=new TernaryExpression($exp1.exp, $exp2.exp, $exp3.exp);
    }

 	| exp1 = expression op =
 	(
 		COLUMEQ
 		| EQ
 		| PLUSEQ
 		| MINUSEQ
 		| MULTEQ
 		| FRACTEQ
 		| BITANDEQ
 		| BITOREQ
 		| POWEQ
 		| '>>='
 		| '>>>='
 		| '<<='
 		| MODEQ
 	) exp2 = expression
 	{
    	$exp=new BinaryArithmeticExpression($exp1.exp, $op.text, $exp2.exp);
    }

 ;

 declarationid returns [Expression exp]
 :
 	(
 		ID op = EQ expr = expression
 	)
 	{$exp=new AssignementExpression(
 						new Identifier($ID.text),
 						$op.text, 
 						$expr.exp
 					);}

 	|
 	(
 		ID op = COLUMEQ expr = expression
 	)
 	{$exp=new AssignementExpression(
 						 new Identifier($ID.text),
 						$op.text,
 						$expr.exp
 					);}

 ;

 argList returns [List<Expression> args] @init {
				     $args = new ArrayList<Expression>();
			}
 :
 	(
 		expression
 		(
 			',' argList
 		)*
 	)
 	{
				$args.add($expression.exp);
				$args.addAll($argList.args);
			}

 	|
 ;

 LE
 :
 	'<'
 ;

 LEQ
 :
 	'<='
 ;

 GEQ
 :
 	'>='
 ;

 GE
 :
 	'>'
 ;

 EQCOMP
 :
 	'=='
 ;

 NEQ
 :
 	'!='
 ;

 EQASSIGN
 :
 	':='
 ;


 // LOGIC OPERATORS

 BIN_PROPOSITIONAL_LOGIC_OPERATOR
 :
 	AND
 	| OR
 ;

 NOT
 :
 	(
 		'!'
 	)
 ;


FINALLY
 :
 	'F'
 ;

 AND
 :
 	'&&'
 ;

 OR
 :
 	'||'
 ;

 BITAND
 :
 	'&'
 ;

 BITANDEQ
 :
 	'&='
 ;

 BITOREQ
 :
 	'|='
 ;

 BITOR
 :
 	'|'
 ;

 /* PARENTHESIS */
 LPAR
 :
 	'('
 ;

 RPAR
 :
 	')'
 ;

 LBRA
 :
 	'['
 ;

 RBRA
 :
 	']'
 ;

 SEMICOLUMN
 :
 	';'
 ;
 // IDENTIFIERS

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

 