package se.gu.evaluation.rq;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import se.gu.ltl.atoms.PAAtom;
import se.gu.ltl.atoms.PCAtom;
import se.gu.ltl.atoms.PLAtom;
import se.gu.patterns.Pattern;
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
import se.gu.patterns.triggers.Wait;
import se.gu.patterns.triggers.bind.BindedDelay;
import se.gu.patterns.triggers.bind.BindedReaction;
import se.gu.patterns.triggers.reaction.DelayedReaction;
import se.gu.patterns.triggers.reaction.FastReaction;
import se.gu.patterns.triggers.reaction.InstantaneousReaction;
import se.gu.patterns.visitor.Pattern2StringVisitor;

public class ConfigurationLoader {

	private List<Configuration> configurations;

	private int configurationIndex = 0;

	public ConfigurationLoader(String path) throws FileNotFoundException, IOException {

		this.configurations = new ArrayList<>();
		
		
		System.out.println(path);
		File f = new File(path);

		try (BufferedReader br = new BufferedReader(new FileReader(f))) {
			String line;
			while ((line = br.readLine()) != null) {

				line.replace(" ", "");
				String[] patterns = line.split(";");

				Pattern coreMovementPattern = this.getCoreMovementPattern(patterns[0]);

				Pattern avoidancePattern=null;
				if(!patterns[1].replaceAll(" ", "").replaceAll("\t", "").startsWith("NO")) {
					avoidancePattern= this.getAvoidancePattern(patterns[1]);
				}
				 
				
				Pattern triggerPattern = null;
				if(!patterns[2].replaceAll(" ", "").replaceAll("\t", "").startsWith("NO")) {
					triggerPattern=this.getTriggerPattern(patterns[2]);
				}
				this.configurations.add(new Configuration(coreMovementPattern, triggerPattern, avoidancePattern));

			}
		}
	}
	
	public int getConfNumber() {
		return configurations.size();
	}

	public boolean hasNext() {
		return configurationIndex < configurations.size();
	}

	public Configuration getNextConfiguration() {

		Configuration conf = configurations.get(configurationIndex);
		configurationIndex++;

		return conf;
	}

	public Pattern getCoreMovementPattern(String stringPattern) {

		String params = stringPattern.substring(stringPattern.indexOf("[") + 1, stringPattern.indexOf("]"));

		List<PLAtom> atoms = new ArrayList<>();
		for (String s : params.split(",")) {
			String ops = s.replace(" ", "");
			String[] par = ops.split("in");
			atoms.add(new PLAtom(par[0], par[1]));
		}

		if (stringPattern.startsWith("OrderedPatrolling")) {
			return new OrderedPatrolling(atoms);
		}

		if (stringPattern.startsWith("FairVisit")) {
			return new FairVisit(atoms);
		}
		if (stringPattern.startsWith("StrictOrderedVisit")) {
			return new StrictOrderedVisit(atoms);
		}
		if (stringPattern.startsWith("SequencedVisit")) {
			return new SequencedVisit(atoms);
		}
		if (stringPattern.startsWith("OrderedVisit")) {
			return new OrderedVisit(atoms);
		}
		if (stringPattern.startsWith("Visit")) {
			return new Visit(atoms);
		}
		if (stringPattern.startsWith("StrictOrderedPatrolling")) {
			return new StrictOrderedPatrolling(atoms);
		}
		if (stringPattern.startsWith("Patrolling")) {
			return new Patrolling(atoms);
		}
		if (stringPattern.startsWith("FairPatrolling")) {
			return new FairPatrolling(atoms);
		}
		if (stringPattern.startsWith("SequencedPatrolling")) {
			return new SequencedPatrolling(atoms);
		}

		return null;
	}

	public Pattern getAvoidancePattern(String stringPattern) {

		stringPattern = stringPattern.replace(" ", "");
		stringPattern = stringPattern.replace("\t", "");
		if (stringPattern.startsWith("UpperRestrictedAvoidance") || stringPattern.startsWith("ExactRestrictedAvoidance")
				|| stringPattern.startsWith("LowerRestrictedAvoidance")) {
			String params = stringPattern.substring(stringPattern.indexOf("(") + 1, stringPattern.indexOf(")"));
			String[] pararray = params.split(",");
			String ops = pararray[0].replace(" ", "");
			String[] par = ops.split("in");

			if (stringPattern.startsWith("UpperRestrictedAvoidance")) {
				return new UpperRestrictedAvoidance(new PLAtom(par[0], par[1]), Integer.parseInt(pararray[1]));
			}
			if (stringPattern.startsWith("ExactRestrictedAvoidance")) {
				return new ExactRestrictedAvoidance(new PLAtom(par[0], par[1]), Integer.parseInt(pararray[1]));
			}
			if (stringPattern.startsWith("LowerRestrictedAvoidance")) {
				return new LowerRestrictedAvoidance(new PLAtom(par[0], par[1]), Integer.parseInt(pararray[1]));
			}

		}

		if (stringPattern.startsWith("PastAvoidance") || stringPattern.startsWith("FutureAvoidance")) {

			String params = stringPattern.substring(stringPattern.indexOf("(") + 1, stringPattern.indexOf(")"));
			String[] pararray = params.split(",");
			String ops = pararray[1].replace(" ", "");
			String[] par = ops.split("in");
			if (stringPattern.startsWith("PastAvoidance")) {
				return new PastAvoidance(new PCAtom(pararray[0]), new PLAtom(par[0], par[1]));
			}
			if (stringPattern.startsWith("FutureAvoidance")) {
				return new FutureAvoidance(new PCAtom(pararray[0]), new PLAtom(par[0], par[1]));
			}

		}
		if (stringPattern.startsWith("GlobalAvoidance")) {
			String params = stringPattern.substring(stringPattern.indexOf("(") + 1, stringPattern.indexOf(")"));
			String ops = params.replace(" ", "");
			String[] par = ops.split("in");
			return new GlobalAvoidance(new PLAtom(par[0], par[1]));
		}

		return null;
	}

	public Pattern getTriggerPattern(String stringPattern) {
		stringPattern = stringPattern.replace(" ", "");
		stringPattern = stringPattern.replace("\t", "");

		if (stringPattern.startsWith("Wait")) {

			String params = stringPattern.substring(stringPattern.indexOf("(") + 1, stringPattern.indexOf(")"));
			String[] pararray = params.split(",");
			String ops = pararray[1].replace(" ", "");
			String[] par = ops.split("in");
			
			PLAtom atom = new PLAtom(par[0], par[1]);
			PCAtom cond = new PCAtom(pararray[0]);

			return new Wait(cond, atom);
		} else {

			
			String params = stringPattern.substring(stringPattern.indexOf("(") + 1, stringPattern.indexOf(")"));
			String[] pararray = params.split(",");
			String ops = pararray[1].replace(" ", "");
			String[] par = ops.split("exec");

			PAAtom atom = new PAAtom(par[0], par[1]);
			PCAtom cond = new PCAtom(pararray[0]);

			
			if (stringPattern.startsWith("DelayedReaction")) {
				return new DelayedReaction(cond, atom, null);
			}
			if (stringPattern.startsWith("InstantaneousReaction")) {
				return new InstantaneousReaction(cond, atom, null);
			}
			if (stringPattern.startsWith("BindedDelay")) {
				return new BindedDelay(cond, atom, null);
			}
			if (stringPattern.startsWith("BindedReaction")) {
				return new BindedReaction(cond, atom, null);
			}
			if (stringPattern.startsWith("FastReaction")) {
				return new FastReaction(cond, atom, null);
			}
			return null;
		}
	}
}
