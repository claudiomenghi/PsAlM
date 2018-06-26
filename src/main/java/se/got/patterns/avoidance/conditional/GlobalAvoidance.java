package se.got.patterns.avoidance.conditional;

import com.google.inject.internal.util.Preconditions;

import se.got.ltl.atoms.LTLPLAtom;
import se.got.patterns.Pattern;
import se.got.patterns.visitor.PatternVisitor;

public class GlobalAvoidance extends Pattern {

	private final LTLPLAtom locationCondition;

	public GlobalAvoidance(LTLPLAtom locationCondition) {
		Preconditions.checkNotNull(locationCondition, "The location condition cannot be null");
		this.locationCondition = locationCondition;

	}

	@Override
	public <T> T accept(PatternVisitor<T> visitor) {
		return visitor.visit(this);
		
	}

	/**
	 * @return the locationCondition
	 */
	public LTLPLAtom getLocationCondition() {
		return locationCondition;
	}

}
