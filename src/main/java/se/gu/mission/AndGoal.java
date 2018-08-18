package se.gu.mission;

import java.util.HashSet;
import java.util.Set;

import se.gu.patterns.Pattern;

public class AndGoal extends Goal{

	private final Goal g1;
	private final Goal g2;
	
	public AndGoal(Goal g1, Goal g2) {
		this.g1=g1;
		this.g2=g2;
	}

	/**
	 * @return the g1
	 */
	public Goal getG1() {
		return g1;
	}

	/**
	 * @return the g2
	 */
	public Goal getG2() {
		return g2;
	}

	@Override
	public Set<Pattern> getPatterns() {
		Set<Pattern> patterns=new HashSet<>();
		patterns.addAll(g1.getPatterns());
		patterns.addAll(g2.getPatterns());
		return patterns;
	}
	
}
