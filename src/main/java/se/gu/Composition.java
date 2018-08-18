package se.gu;

import java.util.function.BinaryOperator;

import se.gu.ltl.LTLFormula;
import se.gu.patterns.Pattern;
import se.gu.patterns.composition.AndComposition;
import se.gu.patterns.composition.OrComposition;

public enum Composition {

	AND {
		@Override
		public Pattern getMission(Pattern f1, Pattern f2) throws Exception {
			return new AndComposition(f1, f2);
		}

		@Override
		public String getDescription() {
			return "AND combines two missions";
		}

	},
	OR {
		@Override
		public Pattern getMission(Pattern f1, Pattern f2) throws Exception {
			return new OrComposition(f1, f2);
		}

		@Override
		public String getDescription() {
			return "Creates the OR combination of two missions";
		}

	};

	public abstract Pattern getMission(Pattern f1, Pattern f2) throws Exception;

	public abstract String getDescription();

	public static final BinaryOperator<LTLFormula> conjunctionOperator = (left, right) -> {

		if (left.equals(LTLFormula.TRUE)) {
			return right;
		}

		if (right.equals(LTLFormula.TRUE)) {
			return left;
		}
		return LTLFormula.getAnd(left, right);
	};
}
