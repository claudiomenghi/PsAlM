package se.got.patterns.avoidance.conditional;

import com.google.inject.internal.util.Preconditions;

import se.got.ltl.atoms.LTLPEAtom;
import se.got.ltl.atoms.LTLPLAtom;
import se.got.patterns.Pattern;
import se.got.patterns.visitor.PatternVisitor;

public class PastAvoidance extends Pattern {

	private final  LTLPEAtom condition;
	private final LTLPLAtom locationCondition;
	
	public PastAvoidance(LTLPEAtom condition, LTLPLAtom locationCondition) {
		Preconditions.checkNotNull(condition, "The environment condition cannot be null");
		Preconditions.checkNotNull(locationCondition, "The location condition cannot be null");
		this.condition=condition;
		this.locationCondition=locationCondition;
		
	}
	
	@Override
	public <T> T accept(PatternVisitor<T> visitor) {
		return visitor.visit(this);
	}

	/**
	 * @return the condition
	 */
	public LTLPEAtom getCondition() {
		return condition;
	}

	/**
	 * @return the locationCondition
	 */
	public LTLPLAtom getLocationCondition() {
		return locationCondition;
	}

}
