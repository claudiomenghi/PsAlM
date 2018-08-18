package se.gu.evaluation.rq;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import se.gu.ltl.atoms.PAAtom;
import se.gu.ltl.atoms.PCAtom;
import se.gu.ltl.atoms.PLAtom;
import se.gu.patterns.Pattern;
import se.gu.patterns.avoidance.AvoidanceFactory;
import se.gu.patterns.avoidance.conditional.FutureAvoidance;
import se.gu.patterns.avoidance.conditional.GlobalAvoidance;
import se.gu.patterns.avoidance.conditional.PastAvoidance;
import se.gu.patterns.avoidance.restricted.ExactRestrictedAvoidance;
import se.gu.patterns.avoidance.restricted.LowerRestrictedAvoidance;
import se.gu.patterns.avoidance.restricted.UpperRestrictedAvoidance;
import se.gu.patterns.coremovement.coverage.FairVisit;
import se.gu.patterns.coremovement.coverage.OrderedVisit;
import se.gu.patterns.coremovement.coverage.SequencedVisit;
import se.gu.patterns.coremovement.coverage.StrictOrderedVisit;
import se.gu.patterns.coremovement.coverage.Visit;
import se.gu.patterns.coremovement.surveillance.FairPatrolling;
import se.gu.patterns.coremovement.surveillance.OrderedPatrolling;
import se.gu.patterns.coremovement.surveillance.Patrolling;
import se.gu.patterns.coremovement.surveillance.SequencedPatrolling;
import se.gu.patterns.coremovement.surveillance.StrictOrderedPatrolling;
import se.gu.patterns.triggers.TriggerFactory;
import se.gu.patterns.triggers.Wait;
import se.gu.patterns.triggers.bind.BindedDelay;
import se.gu.patterns.triggers.bind.BindedReaction;
import se.gu.patterns.triggers.reaction.DelayedReaction;
import se.gu.patterns.triggers.reaction.InstantaneousReaction;
import se.gu.patterns.visitor.Pattern2StringVisitor;

public class RQ2RandomPropertyGenerator {

	public static List<Class> getCoreMovementPatterns() {
		List<Class> coreMovementPatterns = new ArrayList<>();

		coreMovementPatterns.add(Visit.class);
		coreMovementPatterns.add(SequencedVisit.class);
		coreMovementPatterns.add(OrderedVisit.class);
		coreMovementPatterns.add(StrictOrderedVisit.class);
		coreMovementPatterns.add(FairVisit.class);
		
		coreMovementPatterns.add(Patrolling.class);
		coreMovementPatterns.add(SequencedPatrolling.class);
		coreMovementPatterns.add(OrderedPatrolling.class);
		coreMovementPatterns.add(StrictOrderedPatrolling.class);
		coreMovementPatterns.add(FairPatrolling.class);

		return coreMovementPatterns;

	}

	public static List<Class> avoidancePatterns() {
		List<Class> avoidancePatterns = new ArrayList<>();

		avoidancePatterns.add(GlobalAvoidance.class);
		avoidancePatterns.add(FutureAvoidance.class);
		avoidancePatterns.add(PastAvoidance.class);
		avoidancePatterns.add(UpperRestrictedAvoidance.class);
		avoidancePatterns.add(LowerRestrictedAvoidance.class);
		avoidancePatterns.add(ExactRestrictedAvoidance.class);

		return avoidancePatterns;
	}

	public static List<Class> triggerPatterns() {
		List<Class> triggerPatterns = new ArrayList<>();

		triggerPatterns.add(DelayedReaction.class);
		triggerPatterns.add(InstantaneousReaction.class);
		triggerPatterns.add(Wait.class);
		
		triggerPatterns.add(BindedDelay.class);
		triggerPatterns.add(BindedReaction.class);
		return triggerPatterns;
	}

	public static void main(String[] args)
			throws InterruptedException, IOException, InstantiationException, IllegalAccessException,
			IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {

		List<Class> coreMovementPatterns = getCoreMovementPatterns();

		List<Class> avoidancePatterns = avoidancePatterns();

		List<Class> triggerPatterns= triggerPatterns();
		
		Collections.shuffle(coreMovementPatterns);
		Collections.shuffle(avoidancePatterns);
		Collections.shuffle(triggerPatterns);
		

		List<PLAtom> atoms = new ArrayList<>();

		atoms.add(new PLAtom("r", "l1"));
		atoms.add(new PLAtom("r", "l2"));
		
		PCAtom cond=new PCAtom("cond");
		
		PLAtom atom=new PLAtom("r", "l3");
		
		PLAtom atom4=new PLAtom("r", "l4");
		
		PAAtom action=new PAAtom("r", "act");
		
		PrintStream writer = new PrintStream(new File("randomConfigurations.txt"));

		
		int size=coreMovementPatterns.size();
		for (int i=0; i< size; i++) {
			
			Class coreMovementPatternClass = coreMovementPatterns.get(0);
			Class avoidancePatternClass = avoidancePatterns.get(0);

			Class triggerPatternClass=triggerPatterns.get(0);
			
			coreMovementPatterns.remove(0);
			avoidancePatterns.remove(0);
			triggerPatterns.remove(0);

			Pattern avoidancePattern = AvoidanceFactory.getPattern(avoidancePatternClass, cond,
					atom, 2);
			Pattern pattern = (Pattern) coreMovementPatternClass.getDeclaredConstructor(List.class)
					.newInstance(atoms);

			Pattern trigger=(Pattern) TriggerFactory.getPattern(triggerPatternClass, cond,
					atom4, action);
			
			
			System.out.println(pattern.accept(new Pattern2StringVisitor())+";\t"+avoidancePattern.accept(new Pattern2StringVisitor())+";\t"+ trigger.accept(new Pattern2StringVisitor()));

			 writer.println(pattern.accept(new Pattern2StringVisitor())+";\t"+avoidancePattern.accept(new Pattern2StringVisitor())+";\t"+ trigger.accept(new Pattern2StringVisitor()));
			 
			 
			if(avoidancePatterns.isEmpty()) {
				avoidancePatterns = avoidancePatterns();
				Collections.shuffle(avoidancePatterns);
				
			}
			if(triggerPatterns.isEmpty()) {
				triggerPatterns= triggerPatterns();
				Collections.shuffle(triggerPatterns);
			}
			
		}
		
		writer.close();


	}

}
