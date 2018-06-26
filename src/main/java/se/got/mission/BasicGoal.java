package se.got.mission;

import java.util.HashSet;
import java.util.Set;

import se.got.patterns.Pattern;

public class BasicGoal extends Goal {

	private final Pattern pattern;

	public BasicGoal(Pattern pattern) {
		this.pattern = pattern;
	}

	/**
	 * @return the pattern
	 */
	public Pattern getPattern() {
		return pattern;
	}
	
	@Override
	public Set<Pattern> getPatterns() {
		Set<Pattern> patterns=new HashSet<>();
		patterns.add(pattern);
		return patterns;
	}
}
