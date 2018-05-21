package se.got.patterns;

import java.util.function.BinaryOperator;

import se.got.ltl.LTLFormula;

public abstract class Pattern {

	public abstract LTLFormula getMission(String[] inputs);
	
	public static final BinaryOperator<LTLFormula> conjunctionOperator = (left, right) -> {

		if (left.equals(LTLFormula.TRUE)) {
			return right;
		}

		if (right.equals(LTLFormula.TRUE)) {
			return left;
		}
		return LTLFormula.and(left, right);
	};

}
