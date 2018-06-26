package se.got.ltl.atoms;

import java.util.HashSet;
import java.util.Set;

import com.google.common.base.Preconditions;

import se.got.ltl.LTLFormula;
import se.got.ltl.visitors.LTLVisitor;

public class LTLPAAtom extends LTLAtom {

	private final String robotName;
	private final String actionName;

	public LTLPAAtom(String robotName, String actionName) {
		Preconditions.checkNotNull(robotName, "The name of the robot cannot be null");
		Preconditions.checkNotNull(actionName, "The name of the location cannot be null");

		this.robotName = robotName;
		this.actionName = actionName;
	}

	@Override
	public Set<LTLFormula> getChildren() {

		Set<LTLFormula> formulae = new HashSet<>();
		formulae.add(this);
		return formulae;
	}

	@Override
	public <T> T accept(LTLVisitor<T> visitor) {
		return visitor.visit(this);
	}

	/**
	 * @return the robotName
	 */
	public String getRobotName() {
		return robotName;
	}

	/**
	 * @return the locationName
	 */
	public String getActionName() {
		return actionName;
	}

	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return robotName + " exec " + actionName;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((actionName == null) ? 0 : actionName.hashCode());
		result = prime * result + ((robotName == null) ? 0 : robotName.hashCode());
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LTLPAAtom other = (LTLPAAtom) obj;
		if (actionName == null) {
			if (other.actionName != null)
				return false;
		} else if (!actionName.equals(other.actionName))
			return false;
		if (robotName == null) {
			if (other.robotName != null)
				return false;
		} else if (!robotName.equals(other.robotName))
			return false;
		return true;
	}
	
	

}
