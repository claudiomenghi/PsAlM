package se.got.mission;

import java.util.Set;

import se.got.patterns.Pattern;
import se.got.patterns.visitor.LTLPLAtomVisitor;

public class Mission {

	private final Set<String> actionAtoms;
	private final Set<String> conditionsAtoms;
	private final Set<String> locationsAtoms;

	private final Goal goal;

	public Mission(Goal goal, Set<String> robots, Set<String> actionAtoms, Set<String> conditionsAtoms,
			Set<String> locationsAtoms) {
		this.actionAtoms = actionAtoms;

		this.conditionsAtoms = conditionsAtoms;

		this.locationsAtoms = locationsAtoms;

		this.goal = goal;

		for (Pattern p : goal.getPatterns()) {
			if (!this.locationsAtoms.containsAll(p.accept(new LTLPLAtomVisitor()))) {
				Set<String> s = p.accept(new LTLPLAtomVisitor());
				throw new IllegalArgumentException("Locations: " + s + " not defined");
			}
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Mission [actionAtoms=" + actionAtoms + ", conditionsAtoms=" + conditionsAtoms + ", locationsAtoms="
				+ locationsAtoms + ", goal=" + goal + "]";
	}

	/**
	 * @return the actionAtoms
	 */
	public Set<String> getActionAtoms() {
		return actionAtoms;
	}

	/**
	 * @return the conditionsAtoms
	 */
	public Set<String> getConditionsAtoms() {
		return conditionsAtoms;
	}

	/**
	 * @return the locationsAtoms
	 */
	public Set<String> getLocationsAtoms() {
		return locationsAtoms;
	}

	/**
	 * @return the patterns
	 */
	public Set<Pattern> getPatterns() {
		return goal.getPatterns();
	}
}
