package se.got.ltl.atoms;

import java.util.HashSet;
import java.util.Set;

import com.google.common.base.Preconditions;

import se.got.ltl.LTLFormula;
import se.got.ltl.visitors.LTLVisitor;

public class LTLPEAtom extends LTLAtom {

	
	

	private String condition;
	
	public LTLPEAtom(String condition) {
		Preconditions.checkNotNull(condition, "The condition cannot be null");
		this.setCondition(condition);
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
	 * @return the condition
	 */
	public String getCondition() {
		return condition;
	}

	/**
	 * @param condition the condition to set
	 */
	public void setCondition(String condition) {
		this.condition = condition;
	}

	
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return condition;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((condition == null) ? 0 : condition.hashCode());
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
		LTLPEAtom other = (LTLPEAtom) obj;
		if (condition == null) {
			if (other.condition != null)
				return false;
		} else if (!condition.equals(other.condition))
			return false;
		return true;
	}
}
