package se.gu.evaluation.rq;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.HashSet;
import java.util.Set;

import org.apache.commons.io.FileUtils;

import com.google.common.base.Stopwatch;

import se.gu.ctl.CTLFormula;
import se.gu.ctl.CTLStateFormula;
import se.gu.ctl.visitors.CTL2NuSMV;
import se.gu.evaluation.rq.environment.Environment;
import se.gu.evaluation.rq.environment.RobotAvatar;
import se.gu.evaluation.rq.environment.Room;
import se.gu.ltl.LTLFormula;
import se.gu.ltl.visitors.LTL2NuSMV;
import se.gu.nusmv.LTL2NuSMVSingleRobot;
import se.gu.patterns.Pattern;
import se.gu.patterns.visitor.Pattern2CTL;
import se.gu.patterns.visitor.Pattern2LTL;

public class CorrectnessCTLCheck {

	public static void main(String[] args) throws Exception {

		if (args.length < 4) {
			System.out.println("The first parameter must contain the file with the missions to be considered");
			System.out.println("The second parameter must contain the number of environments to be analyzed");
			System.out.println(
					"The third parameter should contain the path of folder that contains the environments to be considered named using the format environmentNUM.txt");
			System.out.println(
					"The fourth patameter indicate whether directions should be considered [true] or not [false] ");

		}
		if (args[0] == null) {
			System.out.println("The first parameter must contain the file with the missions to be considered");
		}
		if (args[1] == null) {
			System.out.println("The second parameter must contain the number of environments to be analyzed");
		}
		if (args[2] == null) {
			System.out.println(
					"The third parameter should contain the path of folder that contains the environments to be considered named using the format environmentNUM.txt");
		}
		if (args[3] == null) {
			System.out.println(
					"The fourth patameter indicate whether directions should be considered [true] or not [false] ");
		}
		System.out.println("************************************************************************************");
		System.out.println("************************************************************************************");
		System.out.println("************************************************************************************");
		System.out.println("************************************************************************************");
		System.out.println("************************************************************************************");
		System.out.println("************************************************************************************");
		System.out.println("************************************************************************************");
		System.out.println("************************************************************************************");
		runLTLCTLExperiment(args[0], Integer.parseInt(args[1]), args[2], Boolean.parseBoolean(args[3]));
	}

	/*
	 * private static void runCTLExperiment(String patternFIle, String resultsFile,
	 * int numberOfBuildings) throws FileNotFoundException, IOException, Exception {
	 * 
	 * int envNum = 0;
	 * 
	 * PrintStream writer = new PrintStream(new File(resultsFile));
	 * 
	 * int confNumber = new ConfigurationLoader(patternFIle).getConfNumber(); int[]
	 * planFound = new int[confNumber]; int[] noPlanFound = new int[confNumber];
	 * 
	 * for (envNum = 0; envNum <= 1; envNum++) { for (int buildingConfig = 0;
	 * buildingConfig < numberOfBuildings; buildingConfig++) {
	 * 
	 * int matrixSize = 4;
	 * 
	 * System.out.println(
	 * "------------------------------------------------------------");
	 * System.out.println("Building: " + buildingConfig); System.out.println(
	 * "------------------------------------------------------------");
	 * 
	 * writer.println("------------------------------------------------------------"
	 * ); writer.println("Building: " + buildingConfig);
	 * writer.println("------------------------------------------------------------"
	 * );
	 * 
	 * EnvironmentDescription e = new EnvironmentDescription();
	 * 
	 * Environment env = null; if (envNum == 0) { env =
	 * Environment.loadEnvironmentNoDirections(CorrectnessCTLCheck.class
	 * .getResource("/environments/environment" + buildingConfig +
	 * ".txt").getPath()); } else { env =
	 * Environment.loadEnvironmentDirections(CorrectnessCTLCheck.class
	 * .getResource("/environments/environmentCTL" + buildingConfig +
	 * ".txt").getPath()); }
	 * 
	 * env.printMatrix(writer);
	 * 
	 * int index = 0;
	 * 
	 * ConfigurationLoader loader = new ConfigurationLoader(patternFIle); while
	 * (loader.hasNext()) {
	 * 
	 * // e = new EnvironmentDescription();
	 * 
	 * Configuration c = loader.getNextConfiguration();
	 * 
	 * Pattern avoidancePattern = c.getAvoidancePattern(); Pattern
	 * coreMovementPattern = c.getCoreMovementPattern(); Pattern triggerPattern =
	 * c.getTriggerPattern();
	 * 
	 * System.out.println(c.toString());
	 * 
	 * writer.println("INDEX: " + index); writer.println(c.toString());
	 * CTLStateFormula f2 = CTLFormula.getAnd(coreMovementPattern.accept(new
	 * Pattern2CTL()), (avoidancePattern != null) ? avoidancePattern.accept(new
	 * Pattern2CTL()) : CTLStateFormula.TRUE, (triggerPattern != null) ?
	 * triggerPattern.accept(new Pattern2CTL()) : CTLStateFormula.TRUE);
	 * 
	 * CTLFormula f = f2; // (new CTLNeg(f2));
	 * 
	 * writer.println(f.accept(new CTL2NuSMV()));
	 * 
	 * env.draw(e);
	 * 
	 * Set<RobotAvatar> robots = new HashSet<>();
	 * 
	 * robots.add(env.getRobot1());
	 * 
	 * e.setWorldSize((matrixSize + 1) * Room.ROOM_LENGHT);
	 * 
	 * // AbstractSimulatorMonitor controller = new SimulatorMonitor(robots, e);
	 * 
	 * // Thread.sleep(1000);
	 * 
	 * env.printMatrix(System.out);
	 * 
	 * String forrmula = "CTLSPEC\n" + f.accept(new CTL2NuSMV()) + ";\n";
	 * 
	 * String nuSMVFileName = "NuSMV/CTLmodel" + "_" + buildingConfig + "_" + index
	 * + ".smv"; FileUtils.writeStringToFile(new File(nuSMVFileName),
	 * (env.toNuSMVCTL() + forrmula));
	 * 
	 * String[] command = { "/bin/bash", "run_NuSMV.sh", nuSMVFileName };
	 * 
	 * Stopwatch timer = Stopwatch.createUnstarted(); ProcessBuilder builder = new
	 * ProcessBuilder(command); builder.redirectErrorStream(true); Process p =
	 * builder.start();
	 * 
	 * InputStream stdout = p.getInputStream();
	 * 
	 * BufferedReader reader = new BufferedReader(new InputStreamReader(stdout));
	 * 
	 * String line;
	 * 
	 * boolean result = true; List<String> path = new ArrayList<>(); List<String>
	 * prefix = new ArrayList<>();
	 * 
	 * while ((line = reader.readLine()) != null) {
	 * 
	 * if (line.contains("-- Loop starts here")) { prefix = path; path = new
	 * ArrayList<>(); } if (line.contains("is true")) { result = false; } else { if
	 * (line.contains("is false")) { result = true; } else { if
	 * (line.contains("state =")) { path.add(line.substring(line.indexOf("state = ")
	 * + 8)); } } } }
	 * 
	 * if (result) { writer.println("Plan found"); planFound[index] =
	 * planFound[index] + 1;
	 * 
	 * for (String s : prefix) { System.out.println("Robot sent to location: " + s);
	 * env.getRobot1().setDestination(env.getPosition(s));
	 * 
	 * // Thread.sleep(4000);
	 * 
	 * } System.out.println("-- Loop starts here");
	 * 
	 * for (String s : path) { System.out.println("Robot sent to location: " + s);
	 * // env.getRobot1().setDestination(env.getPosition(s));
	 * 
	 * // Thread.sleep(4000);
	 * 
	 * } } else { noPlanFound[index] = noPlanFound[index] + 1;
	 * 
	 * writer.println("No plan found"); System.out.println("No plan found"); } //
	 * Simbad frame = controller.getSimbadFrame(); // frame.dispatchEvent(new
	 * WindowEvent(frame, WindowEvent.WINDOW_CLOSING));
	 * 
	 * // frame.dispose(); index++; System.out.println(
	 * "------------------------------------------------------------");
	 * 
	 * }
	 * 
	 * }
	 * 
	 * writer.close();
	 * 
	 * String plandisp = "PlanFound: "; for (int i = 0; i < planFound.length; i++) {
	 * plandisp = plandisp + "\t" + planFound[i]; } System.out.println(plandisp);
	 * 
	 * String noplandisp = "NoPlanFound: "; for (int i = 0; i < planFound.length;
	 * i++) { noplandisp = noplandisp + "\t" + noPlanFound[i]; }
	 * System.out.println(noplandisp); } }
	 */

	private static void runLTLCTLExperiment(String patternFile, int numberOfEnvironments, String environmentDirectory,
			boolean directions) throws FileNotFoundException, IOException, Exception {

		String resultsFile = "results.txt";

		PrintStream writer = new PrintStream(new File(resultsFile));

		int confNumber = new ConfigurationLoader(patternFile).getConfNumber();
		int[] propertyTrue = new int[confNumber];
		int[] propertyFalse = new int[confNumber];

		for (int buildingConfig = 0; buildingConfig < numberOfEnvironments; buildingConfig++) {

			int matrixSize = 4;

			System.out.println("------------------------------------------------------------");
			System.out.println("Building: " + buildingConfig);
			System.out.println("------------------------------------------------------------");

			writer.println("------------------------------------------------------------");
			writer.println("Building: " + buildingConfig);
			writer.println("------------------------------------------------------------");


			Environment env = null;
			if (!directions) {
				env = Environment.loadEnvironmentNoDirections(environmentDirectory + "environment"+ buildingConfig + ".txt");
			} else {
				env = Environment
						.loadEnvironmentDirections(environmentDirectory + "environment"+ buildingConfig + ".txt");
			}

			env.printMatrix(writer);

			int index = 0;

			ConfigurationLoader loader = new ConfigurationLoader(patternFile);
			while (loader.hasNext()) {

				System.out.println("Configuration " + index);
				// e = new EnvironmentDescription();

				Configuration c = loader.getNextConfiguration();

				Pattern avoidancePattern = c.getAvoidancePattern();
				Pattern coreMovementPattern = c.getCoreMovementPattern();
				Pattern triggerPattern = c.getTriggerPattern();

				System.out.println(c.toString());

				writer.println("INDEX: " + index);
				writer.println(c.toString());
				CTLStateFormula ctlpattern = CTLFormula.getAnd(coreMovementPattern.accept(new Pattern2CTL()),
						(avoidancePattern != null) ? avoidancePattern.accept(new Pattern2CTL()) : CTLStateFormula.TRUE,
						(triggerPattern != null) ? triggerPattern.accept(new Pattern2CTL()) : CTLStateFormula.TRUE);

				CTLFormula f = ctlpattern;
				// (new CTLNeg(f2));

				writer.println(f.accept(new CTL2NuSMV()));


				Set<RobotAvatar> robots = new HashSet<>();

				robots.add(env.getRobot1());


				// AbstractSimulatorMonitor controller = new SimulatorMonitor(robots, e);

				// Thread.sleep(1000);

				env.printMatrix(System.out);

				String forrmula = "CTLSPEC\n" + f.accept(new CTL2NuSMV()) + ";\n";

				String nuSMVFileNameCTL = "NuSMV/CTLmodel" + "_" + buildingConfig + "_" + index + ".smv";
				FileUtils.writeStringToFile(new File(nuSMVFileNameCTL), (env.toNuSMVCTL() + forrmula));

				String[] command = { "/bin/bash", "run_NuSMV.sh", nuSMVFileNameCTL };

				Stopwatch timer = Stopwatch.createUnstarted();
				ProcessBuilder builder = new ProcessBuilder(command);
				builder.redirectErrorStream(true);
				Process p = builder.start();

				InputStream stdout = p.getInputStream();

				BufferedReader reader = new BufferedReader(new InputStreamReader(stdout));

				String line;

				boolean resultCTL = true;

				while ((line = reader.readLine()) != null) {

					if (line.contains("is true")) {
						resultCTL = true;
					} else {
						if (line.contains("is false")) {
							resultCTL = false;
						}
					}
				}

				LTLFormula f2 = LTLFormula.getAnd(
						coreMovementPattern.accept(new Pattern2LTL()),
						(avoidancePattern != null) ?  avoidancePattern.accept(new Pattern2LTL()) : LTLFormula.TRUE, 
								(triggerPattern != null) ? triggerPattern.accept(new Pattern2LTL()) : LTLFormula.TRUE);

				writer.println(f2.accept(new LTL2NuSMV()));

	
				robots.add(env.getRobot1());

	
	
				env.printMatrix(System.out);

				forrmula = "LTLSPEC\n" + f2.accept(new LTL2NuSMVSingleRobot()) + ";\n";

				String nuSMVFileNameLTL = "NuSMV/LTLmodel" + "_" + buildingConfig + "_" + index + ".smv";
				FileUtils.writeStringToFile(new File(nuSMVFileNameLTL), (env.toNuSMVCTL() + forrmula));

				String[] commandLTL = { "/bin/bash", "run_NuSMV.sh", nuSMVFileNameLTL };

				ProcessBuilder builder2 = new ProcessBuilder(commandLTL);
				builder2.redirectErrorStream(true);
				Process p2 = builder2.start();

				stdout = p2.getInputStream();

				reader = new BufferedReader(new InputStreamReader(stdout));

				boolean resultLTL = true;

				while ((line = reader.readLine()) != null) {

					if (line.contains("is true")) {
						resultLTL = true;
					} else {
						if (line.contains("is false")) {
							resultLTL = false;
						}
					}
				}

				if (resultLTL) {
					propertyTrue[index] = propertyTrue[index] + 1;
				}
				else {
					propertyFalse[index]=propertyFalse[index]+1;
				}
				System.out.println(nuSMVFileNameLTL);
				System.out.println(nuSMVFileNameCTL);
				System.out.println("LTL: " + resultLTL);
				System.out.println("CTL: " + resultCTL);
				
				writer.println(nuSMVFileNameLTL);
				writer.println(nuSMVFileNameCTL);
				writer.println("LTL: " + resultLTL);
				writer.println("CTL: " + resultCTL);
				if (resultLTL != resultCTL) {
					reader.close();
					throw new Exception("ERROR!!!!");
				}

				index++;
				System.out.println("------------------------------------------------------------");

			}

		}

		writer.close();

		String plandisp = "Property True: ";
		for (int i = 0; i < propertyTrue.length; i++) {
			plandisp = plandisp + "\t" + propertyTrue[i];
		}
		System.out.println(plandisp);

		String noplandisp = "Property False: ";
		for (int i = 0; i < propertyTrue.length; i++) {
			noplandisp = noplandisp + "\t" + propertyFalse[i];
		}
		System.out.println(noplandisp);

	}

}
