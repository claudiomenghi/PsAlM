package se.got.patterns.visitor;

import se.got.patterns.avoidance.conditional.FutureAvoidance;
import se.got.patterns.avoidance.conditional.GlobalAvoidance;
import se.got.patterns.avoidance.conditional.PastAvoidance;
import se.got.patterns.avoidance.restricted.ExactRestrictedAvoidance;
import se.got.patterns.avoidance.restricted.LowerRestrictedAvoidance;
import se.got.patterns.avoidance.restricted.UpperRestrictedAvoidance;
import se.got.patterns.coremovement.coverage.FairVisit;
import se.got.patterns.coremovement.coverage.OrderedVisit;
import se.got.patterns.coremovement.coverage.SequencedVisit;
import se.got.patterns.coremovement.coverage.StrictOrderedVisit;
import se.got.patterns.coremovement.coverage.Visit;
import se.got.patterns.coremovement.surveillance.FairPatrolling;
import se.got.patterns.coremovement.surveillance.OrderedPatrolling;
import se.got.patterns.coremovement.surveillance.Patrolling;
import se.got.patterns.coremovement.surveillance.SequencedPatrolling;
import se.got.patterns.coremovement.surveillance.StrictOrderedPatrolling;
import se.got.patterns.triggers.DelayedReaction;
import se.got.patterns.triggers.InstantaneousReaction;
import se.got.patterns.triggers.Wait;

public interface PatternVisitor<T> {

	
	public T visit(Visit ltlpaAtom);

	public T visit(SequencedVisit sequencedVisit);

	public T visit(OrderedVisit orderedVisit);

	public T visit(StrictOrderedVisit strictOrderedVisit);

	public T visit(FairVisit fairVisit);

	public T visit(Patrolling patrolling);

	public T visit(OrderedPatrolling orderedPatrolling);

	public T visit(FairPatrolling fairPatrolling);

	public T visit(SequencedPatrolling sequencedPatrolling);

	public T visit(StrictOrderedPatrolling strictOrderedPatrolling);

	public T visit(FutureAvoidance futureAvoidance);

	public T visit(PastAvoidance pastAvoidance);

	public T visit(GlobalAvoidance globalAvoidance);

	public T visit(UpperRestrictedAvoidance upperRestrictedAvoidance);

	public T visit(LowerRestrictedAvoidance lowerRestrictedAvoidance);

	public T visit(ExactRestrictedAvoidance exactRestrictedAvoidance);

	public T visit(DelayedReaction delayedReaction);

	public T visit(InstantaneousReaction instantaneousReaction);

	public T visit(Wait wait);


}
