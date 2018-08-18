package se.gu;

import java.util.Arrays;
import java.util.function.BinaryOperator;

import se.gu.ltl.LTLConjunction;
import se.gu.ltl.LTLEventually;
import se.gu.ltl.LTLFormula;
import se.gu.ltl.LTLGlobally;
import se.gu.ltl.LTLImplies;
import se.gu.ltl.LTLNeg;
import se.gu.ltl.LTLUntil;
import se.gu.ltl.LTLNext;
import se.gu.ltl.atoms.LTLPropositionalAtom;
import se.gu.ltl.atoms.PCAtom;
import se.gu.ltl.atoms.PLAtom;
import se.gu.patterns.Pattern;
import se.gu.patterns.avoidance.conditional.FutureAvoidance;
import se.gu.patterns.avoidance.conditional.GlobalAvoidance;
import se.gu.patterns.avoidance.conditional.PastAvoidance;
import se.gu.patterns.avoidance.restricted.ExactRestrictedAvoidance;
import se.gu.patterns.avoidance.restricted.LowerRestrictedAvoidance;
import se.gu.patterns.avoidance.restricted.UpperRestrictedAvoidance;

public enum Avoidance {

	PAST_AVOIDANCE {
		@Override
		public String toString() {
			return "Past_Avoidance";
		}

		public Pattern getMission(String condition, String robotName, String location) throws Exception {

			return new PastAvoidance(new PCAtom(condition), new PLAtom(robotName, location));
		}

		@Override
		public String getDescription() {
			return "Applied only if a condition has been fulfilled in the past, such as the robot should avoid cleaning a room that has been already cleaned.";
		}

		@Override
		public String getVariations() {
			return "If a relational notion of space is used, propositions have the form \"r in l\" where in indicates that the robot r is inside location l, and l identifies the desired location. If an absolute notion of space is used, propositions have the form \"r at (x,y,z)\", where at indicates that the robot r is in a specific point and (x,y,z) indicates a precise position in space.";
		}

		@Override
		public String getExamples() {
			return "Consider the areas l1, l2, l3, and l4; a past conditional avoidance may state that if the robot enters area l1, then it should had not visited area l2 before.";
		}

		@Override
		public String getRelationships() {
			return "The LTL formula used to encode Past avoidance corresponds to the formula used to encode the Absence pattern of Dwyer et al.";
		}

		@Override
		public String getOccurrences() {
			return "	An example of use of the future avoidance pattern has been used by Yoo et al. to specify that a danger area is not entered before entering a location.";
		}
	},

	GLOBAL_AVOIDANCE {
		@Override
		public String toString() {
			return "Global_Avoidance";
		}

		public Pattern getMission(String robotName, String locationName) {
			return new GlobalAvoidance(new PLAtom(robotName, locationName));
		}

		@Override
		public String getDescription() {
			return "Specifies that an avoidance condition globally holds.";
		}

		@Override
		public String getVariations() {
			return "If a relational notion of space is used, propositions have the form \"r in l\", where in indicates that the robot r is inside location l, and l identifies the desired location. If an absolute notion of space is used, propositions have the form \"r at (x,y,z)\", where at indicates that the robot r is in a specific point and (x,y,z) indicates a precise position in space.";
		}

		@Override
		public String getExamples() {
			return "Consider the areas l1, l2, l3, and l4; global avoidance specifies that the robot should avoid entering l1.";
		}

		@Override
		public String getRelationships() {
			return "Global avoidance is a specific instance of the Avoidance patterns requiring a point or location to be always avoided.";
		}

		@Override
		public String getOccurrences() {
			return "LTL formulation of avoidance has been proposed in many papers, such as Wang et al..;";
		}
	},

	FUTURE_AVOIDANCE {
		@Override
		public String toString() {
			return "Future_Avoidance";
		}

		public Pattern getMission(String condition, String robotName, String locationName) throws Exception {
			return new FutureAvoidance(new PCAtom(condition), new PLAtom(robotName, locationName));
		}

		@Override
		public String getDescription() {
			return "It is applied if a condition will be fulfilled in the future.";
		}

		@Override
		public String getVariations() {
			return "If a relational notion of space is used, propositions have the form \"r in l\", where in indicates that the robot r is inside location l. and l identifies the desired location. If an absolute notion of space is used, propositions have the form \"r at (x,y,z)\", where at indicates that the robot r is in a specific point and (x,y,z) indicates a precise position in space.";
		}

		@Override
		public String getExamples() {
			return "Consider the areas l1, l2, l3, and l4; a future conditional avoidance may state that if the robot enters area l1, then it should avoid entering l2 in the future.";
		}

		@Override
		public String getRelationships() {
			return "The LTL formula used to encode Future avoidance corresponds to the formula used to encode the Response pattern of Dwyer et al.";
		}

		@Override
		public String getOccurrences() {
			return "An example of use of the future avoidance pattern has been used by Wong et al.to specify that if ``Alice is on the bridge then next bob cannot be on the square\" and by Smith et al. to specify that a task cannot be followed by another. An example of usage of the future avoidance pattern has been discussed also by Chen et al. that states that during each cycle a task cannot follow another.";
		}
	},
	LOWER_RESTRICTED_AVOIDANCE {
		@Override
		public String toString() {
			return "Lower_Restricted_Avoidance";
		}

		
		public Pattern getMission(String robotName, String locationName, int num) {
			return new LowerRestrictedAvoidance(new PLAtom(robotName, locationName), num);
		}

		@Override
		public String getDescription() {
			return "It is applied when a restriction on the minimum number of occurrences is desired.";
		}

		@Override
		public String getVariations() {
			return "If a relational notion of space is used, propositions have the form \"r in l\", where in indicates that the robot r is inside location l, and l identifies the desired location. If an absolute notion of space is used, propositions have the form \"r at (x,y,z)\", where at indicates that the robot r is in a specific point and (x,y,z) indicates a precise position in space.";
		}

		@Override
		public String getExamples() {
			return "For example, consider the areas l1, l2, l3, and l4; a mission specified by the restricted lower avoidance pattern may require a robot to visit location l1 at least 3 times. If the robot visits the areas l4, l3, l2, l2, and l4, then the mission is not satisfied. Vice versa, if the robot visits the areas l1, l4, l3, l1, l4, and l1 the mission is satisfied.";
		}

		@Override
		public String getRelationships() {
			return "The LTL formula used to encode Lower Restricted Avoidance constrains the LTL visit pattern by forcing a location to be visited at least X times.";
		}

		@Override
		public String getOccurrences() {
			return "Chen et al. proposed an LTL formula that forces a service to occur at least a number of time, this can be considered as an example of usage of the lower restricted avoidance pattern.";
		}
	},
	UPPER_RESTRICTED_AVOIDANCE {
		@Override
		public String toString() {
			return "Upper_Restricted_Avoidance";
		}

		public Pattern getMission(String robotName, String locationName, int num) {
			return new UpperRestrictedAvoidance(new PLAtom(robotName, locationName), num);
		}


		@Override
		public String getDescription() {
			return "It is applied when a restriction on the maximum number of occurrences is desired.";
		}

		@Override
		public String getVariations() {
			return "If a relational notion of space is used, propositions have the form \"r in l\", where in indicates that the robot r is inside location l, and l identidies the desired location. If an absolute notion of space is used, propositions have the form r at (x,y,z) where at indicates that the robot r is in a specific point and (x,y,z) indicates a precise position in space.";
		}

		@Override
		public String getExamples() {
			return "Consider the areas l1, l2, l3, and l4; a mission specified by the restricted upper avoidance pattern may require a robot to visit location l1 at most 3 times. If the robot visits the areas l1, l4, l3, l1, l4, and l1, it does not satisfy this pattern. Vice versa, if the robot visits the areas l4, l3, l2, l2, and l4, the property is satisfied.";
		}

		@Override
		public String getRelationships() {
			return "The LTL formula used to encode Upper Restricted Avoidance constrains the LTL visit pattern by forcing a location to be visited at least a certain number of times.";
		}

		@Override
		public String getOccurrences() {
			return "Chen et al. proposed an LTL formula that forces a service to occur at maximum a specified number of times, this can be considered as an example of usage of the upper restricted avoidance pattern.";
		}
	},
	EXACT_RESTRICTED_AVOIDANCE {
		@Override
		public String toString() {
			return "Exact_Restricted_Avoidance";
		}

		public Pattern getMission(String robotName, String locationName, int num) {
			return new ExactRestrictedAvoidance(new PLAtom(robotName, locationName), num);
		}


		@Override
		public String getDescription() {
			return "It is applied when the number of occurrences desired is an exact number.";
		}

		@Override
		public String getVariations() {
			return "If a relational notion of space is used, propositions have the form \"r in l\", where in indicates that the robot r is inside location l, and l identifies the desired location. If an absolute notion of space is used, propositions have the form \"r at (x,y,z)\" where at indicates that the robot r is in a specific point and (x,y,z) indicates a precise position in space.";
		}

		@Override
		public String getExamples() {
			return "For example, consider the areas l1, l2, l3, and l4; a mission specified by the restricted exact avoidance pattern may require a robot to visit location l1 exactly 3 times. If the robot visits the areas l4, l3, l2, l2, and l4 the mission is not satisfied. Vice versa, if the robot visits the areas l1, l4, l3, l1, l4, and l1, the mission is satis ed.";
		}

		@Override
		public String getRelationships() {
			return "The LTL formula used to encode Exact Restricted Avoidance is updained by combining the Lower and the Upper Restricted Avoidance patterns.";
		}

		@Override
		public String getOccurrences() {
			return "	Considering the work of Chen et al., exact restricted avoidance is a natural concept that can be obtained by combining the formulae that specify that a service occurs at least and at maximum a number of times.";
		}
	};

	public abstract String getDescription();

	public abstract String getVariations();

	public abstract String getExamples();

	public abstract String getRelationships();

	public abstract String getOccurrences();

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
