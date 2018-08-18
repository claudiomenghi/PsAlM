package se.gu.nusmv;

import se.gu.ltl.atoms.PLAtom;
import se.gu.ltl.visitors.LTL2NuSMV;

public class LTL2NuSMVSingleRobot extends LTL2NuSMV{
	
	@Override
	public String visit(PLAtom ltlplAtom) {
		return "( state = "+ ltlplAtom.getLocationName() + ")";
	}


}
