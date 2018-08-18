package se.gu.evaluation.rq;

import se.gu.patterns.Pattern;
import se.gu.patterns.visitor.Pattern2LTL;
import se.gu.patterns.visitor.Pattern2StringVisitor;

public class Configuration {

	private final Pattern coreMovementPattern;
	private final Pattern triggerPattern;
	private final Pattern avoidancePattern;

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {

		String ret = coreMovementPattern.accept(new Pattern2StringVisitor()) + ",\t"
				+ 
		(		(avoidancePattern!=null) ?
				avoidancePattern.accept(new Pattern2StringVisitor()) + ",\t" : "NO,\t" )
				+
		(		(triggerPattern!=null) ?		
				triggerPattern.accept(new Pattern2StringVisitor()) + "\n" : "NO,\t" );
		
		/*ret += coreMovementPattern.accept(new Pattern2StringVisitor()) + "\t"
				+ coreMovementPattern.accept(new Pattern2LTL()) + "\n";
		ret += 
				(		(avoidancePattern!=null) ?
				avoidancePattern.accept(new Pattern2StringVisitor()) + "\t" + avoidancePattern.accept(new Pattern2LTL()) :  "NO,\t" )
				+ "\n";
		ret += 
				(		(triggerPattern!=null) ?
				triggerPattern.accept(new Pattern2StringVisitor()) + "\t" + triggerPattern.accept(new Pattern2LTL())  :  "NO,\t" )
				+ "\n";
				*/
		return ret;
	}

	public Configuration(Pattern coreMovementPattern, Pattern triggerPattern, Pattern avoidancePattern) {
		this.coreMovementPattern = coreMovementPattern;
		this.triggerPattern = triggerPattern;
		this.avoidancePattern = avoidancePattern;
	}

	/**
	 * @return the coreMovementPattern
	 */
	public Pattern getCoreMovementPattern() {
		return coreMovementPattern;
	}

	/**
	 * @return the triggerPattern
	 */
	public Pattern getTriggerPattern() {
		return triggerPattern;
	}

	/**
	 * @return the avoidancePattern
	 */
	public Pattern getAvoidancePattern() {
		return avoidancePattern;
	}
}
