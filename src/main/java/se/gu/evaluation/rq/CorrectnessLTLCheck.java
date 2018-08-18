package se.gu.evaluation.rq;

import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;

import com.google.common.base.Stopwatch;

import project.AbstractSimulatorMonitor;
import se.gu.ctl.CTLFormula;
import se.gu.ctl.CTLStateFormula;
import se.gu.ctl.visitors.CTL2NuSMV;
import se.gu.evaluation.rq.environment.Element;
import se.gu.evaluation.rq.environment.Environment;
import se.gu.evaluation.rq.environment.Obstacle;
import se.gu.evaluation.rq.environment.RobotAvatar;
import se.gu.evaluation.rq.environment.Room;
import se.gu.evaluation.rq.environment.SimulatorMonitor;
import se.gu.ltl.LTLFormula;
import se.gu.ltl.LTLNeg;
import se.gu.ltl.visitors.LTL2NuSMV;
import se.gu.nusmv.LTL2NuSMVSingleRobot;
import se.gu.patterns.Pattern;
import se.gu.patterns.visitor.Pattern2CTL;
import se.gu.patterns.visitor.Pattern2LTL;
import simbad.gui.Simbad;
import simbad.sim.BlockWorldObject;
import simbad.sim.EnvironmentDescription;
import simbad.sim.World;
import project.Point;

public class CorrectnessLTLCheck {

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

		runLTLExperiment(args[0], Integer.parseInt(args[1]), args[2], Boolean.parseBoolean(args[3]));

	}

	private static void runLTLExperiment(String patternFile, int numberOfEnvironments, String environmentDirectory,
			boolean directions) throws FileNotFoundException, IOException, Exception {

		System.out.println("File to be considered: " + patternFile);
		PrintStream writer = new PrintStream(new File("results.txt"));

		int confNumber = new ConfigurationLoader(patternFile).getConfNumber();
		int[] planFound = new int[confNumber];
		int[] noPlanFound = new int[confNumber];

		for (int buildingConfig = 0; buildingConfig < numberOfEnvironments; buildingConfig++) {

			int matrixSize = 4;

			System.out.println("------------------------------------------------------------");
			System.out.println("Building: " + buildingConfig);
			System.out.println("------------------------------------------------------------");

			writer.println("------------------------------------------------------------");
			writer.println("Building: " + buildingConfig);
			writer.println("------------------------------------------------------------");

			int index = 0;

			ConfigurationLoader loader = new ConfigurationLoader(patternFile);
			while (loader.hasNext()) {

				EnvironmentDescription e = new EnvironmentDescription();

				Environment env = null;

				if (!directions) {
					env = Environment.loadEnvironmentNoDirections(
							environmentDirectory + "environment" + buildingConfig + ".txt");
				} else {
					env = Environment.loadEnvironmentDirections("environment" + buildingConfig + ".txt");
				}

				env.printSimbadMatrix(writer);

				env.draw(e);

				Set<RobotAvatar> robots = new HashSet<>();

				robots.add(env.getRobot1());
				e.add(env.getRobot1());

				e.setWorldSize((matrixSize + 1) * Room.ROOM_LENGHT);

				AbstractSimulatorMonitor<RobotAvatar> controller = new SimulatorMonitor(robots, e);

				Simbad frame = controller.getSimbadFrame();

				frame.getWorld().changeViewPoint(World.VIEW_FROM_TOP, null);

				Configuration c = loader.getNextConfiguration();

				Pattern avoidancePattern = c.getAvoidancePattern();
				Pattern coreMovementPattern = c.getCoreMovementPattern();
				Pattern triggerPattern = c.getTriggerPattern();

				System.out.println(c.toString());

				writer.println("INDEX: " + index);
				writer.println(c.toString());

				LTLFormula f = (new LTLNeg(LTLFormula.getAnd(coreMovementPattern.accept(new Pattern2LTL()),
						avoidancePattern.accept(new Pattern2LTL()), triggerPattern.accept(new Pattern2LTL()))));

				writer.println(f.accept(new LTL2NuSMV()));

				Thread.sleep(1000);

				env.printSimbadMatrix(System.out);

				String forrmula = "LTLSPEC\n" + f.accept(new LTL2NuSMVSingleRobot()) + ";\n";

				String nuSMVFileName = "NuSMV/LTLmodel" + "_" + buildingConfig + "_" + index + ".smv";
				FileUtils.writeStringToFile(new File(nuSMVFileName), (env.toNuSMVCTL() + forrmula));

				String[] command = { "/bin/bash", "run_NuSMV.sh", nuSMVFileName };

				Stopwatch timer = Stopwatch.createUnstarted();
				ProcessBuilder builder = new ProcessBuilder(command);
				builder.redirectErrorStream(true);
				Process p = builder.start();

				InputStream stdout = p.getInputStream();

				BufferedReader reader = new BufferedReader(new InputStreamReader(stdout));

				String line;

				boolean result = true;
				List<String> locations_prefix = new ArrayList<>();

				List<String> actions_prefix = new ArrayList<>();

				int currindex = -1;
				while ((line = reader.readLine()) != null && !line.contains("-- Loop starts here")) {
					if (line.contains("-> State:")) {
						currindex++;
					}
					if (line.contains("is true")) {
						result = false;
					} else {
						if (line.contains("is false")) {
							result = true;
						} else {
							if (line.contains("state =")) {

								locations_prefix.add(line.substring(line.indexOf("state = ") + 8));
								if (actions_prefix.size() != currindex + 1) {
									actions_prefix.add("");
								}

							} else {
								if (line.contains("act = TRUE")) {
									if (currindex > 0 && actions_prefix.size() == currindex + 1) {
										actions_prefix.remove(currindex - 1);
									}
									actions_prefix.add("act");
								}
							}
						}
					}
				}
				List<String> locations_suffix = new ArrayList<>();
				List<String> actions_suffix = new ArrayList<>();

				currindex = -1;
				while ((line = reader.readLine()) != null) {
					if (line.contains("-> State:")) {
						currindex++;
					}
					if (line.contains("state =")) {

						locations_suffix.add(line.substring(line.indexOf("state = ") + 8));
						if (actions_suffix.size() != currindex + 1) {
							actions_suffix.add("");
						}

					} else {
						if (line.contains("act = TRUE")) {
							if (currindex > 0 && actions_suffix.size() == currindex + 1) {
								actions_suffix.remove(currindex - 1);
							}
							actions_suffix.add("act");
						}
					}

				}

				String currRobotLocation = "l0";
				if (result) {
					writer.println("Plan found");
					planFound[index] = planFound[index] + 1;

					for (int i = 0; i < locations_prefix.size(); i++) {
						String nextPosition=locations_prefix.get(i);
						System.out.println("Robot sent to location: " + nextPosition);
						writer.println("Robot sent to location: " + nextPosition);
						if (env.isConnected(currRobotLocation, nextPosition)) {
							env.getRobot1().setDestination(env.getPosition(nextPosition));
						}
						else {
							env.getRobot1().resetPosition(env.getPosition(nextPosition));	
							env.getRobot1().setDestination(env.getPosition(nextPosition));
						}
						currRobotLocation=nextPosition;
						
						Thread.sleep(4000);
						if (actions_prefix.get(i).equals("act")) {
							
							System.out.println("Robot executing action: " + actions_prefix.get(i));
							writer.println("Robot executing action: " + actions_prefix.get(i));

							env.getRobot1().changeColor();
							;

						}

					}
					writer.println("-- Loop starts here");
					System.out.println("-- Loop starts here");

					for (int i = 0; i < locations_suffix.size(); i++) {

						String nextPosition=locations_suffix.get(i);
						writer.println("Robot sent to location: " + nextPosition);
						System.out.println("Robot sent to location: " + nextPosition);
						if (env.isConnected(currRobotLocation, nextPosition)) {
							env.getRobot1().setDestination(env.getPosition(nextPosition));
						}
						else {
							env.getRobot1().resetPosition(env.getPosition(nextPosition));	
							env.getRobot1().setDestination(env.getPosition(nextPosition));
						}

						Thread.sleep(4000);
						currRobotLocation=nextPosition;
						
						
						if (actions_suffix.get(i).equals("act")) {
							writer.println("Robot executing action: " + actions_suffix.get(i));
							System.out.println("Robot executing action: " + actions_suffix.get(i));
							env.getRobot1().changeColor();

						}



					}
				} else {
					noPlanFound[index] = noPlanFound[index] + 1;

					writer.println("No plan found");
					System.out.println("No plan found");
				}

				frame.setDefaultCloseOperation(frame.DISPOSE_ON_CLOSE);
				frame.dispatchEvent(new WindowEvent(frame, WindowEvent.WINDOW_CLOSING));

				// frame.dispose();
				index++;
				writer.println("------------------------------------------------------------");
				System.out.println("------------------------------------------------------------");

			}

		}


		String plandisp = "PlanFound: ";
		for (int i = 0; i < planFound.length; i++) {
			plandisp = plandisp + "\t" + planFound[i];
		}
		writer.println(plandisp);
		System.out.println(plandisp);

		writer.println(plandisp);

		String noplandisp = "NoPlanFound: ";
		for (int i = 0; i < planFound.length; i++) {
			noplandisp = noplandisp + "\t" + noPlanFound[i];
		}
		System.out.println(noplandisp);
		writer.println(noplandisp);
		writer.close();
	}

}
