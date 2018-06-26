package se.got.patterns.triggers;

import se.got.ltl.atoms.LTLPEAtom;
import se.got.ltl.atoms.LTLPLAtom;
import se.got.patterns.Pattern;
import se.got.patterns.visitor.PatternVisitor;

public class DelayedReaction extends Pattern {

	private final  LTLPEAtom condition;
	private final LTLPLAtom location;
	private final Pattern pattern;
	
	public DelayedReaction(LTLPEAtom condition, LTLPLAtom location, Pattern pattern) {
		
		this.condition=condition;
		this.location=location;
		this.pattern=pattern;
		
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
	 * @return the location
	 */
	public LTLPLAtom getLocation() {
		return location;
	}

	/**
	 * @return the pattern
	 */
	public Pattern getPattern() {
		return pattern;
	}
	
}
