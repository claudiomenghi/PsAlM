package se.got.patterns;

import java.util.Arrays;

import se.got.ltl.LTLEventually;
import se.got.ltl.LTLFormula;
import se.got.ltl.atoms.LTLIPropositionalAtom;

public class Visit extends Pattern {

	@Override
	public LTLFormula getMission(String[] inputs) {
		return Arrays.asList(inputs).stream()
				.map(location -> (LTLFormula) new LTLEventually(new LTLIPropositionalAtom(location)))
				.reduce(LTLFormula.TRUE, conjunctionOperator);
	}

}
