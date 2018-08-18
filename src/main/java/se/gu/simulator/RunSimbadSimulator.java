package se.gu.simulator;

import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.swing.JOptionPane;

import org.apache.commons.io.FileUtils;

import com.google.common.base.Stopwatch;

import project.AbstractSimulatorMonitor;
import se.gu.evaluation.rq.environment.Environment;
import se.gu.evaluation.rq.environment.RobotAvatar;
import se.gu.evaluation.rq.environment.Room;
import se.gu.evaluation.rq.environment.SimulatorMonitor;
import se.gu.ltl.LTLFormula;
import se.gu.ltl.LTLNeg;
import se.gu.nusmv.LTL2NuSMVSingleRobot;
import se.gu.patterns.Pattern;
import se.gu.patterns.visitor.Pattern2LTL;
import simbad.gui.Simbad;
import simbad.sim.EnvironmentDescription;
import simbad.sim.World;

public class RunSimbadSimulator implements Runnable{

	
	private final String environmentFile;
	private final Pattern pattern;
	
	public RunSimbadSimulator(String environmentFile,Pattern pattern) {
		this.environmentFile=environmentFile;
		this.pattern=pattern;
	}
	public void run()  {
		try {

		EnvironmentDescription e = new EnvironmentDescription();

		Environment env = Environment.loadEnvironmentNoDirections(environmentFile);


		Set<RobotAvatar> robots = new HashSet<>();

		robots.add(env.getRobot1());
		e.add(env.getRobot1());

		System.out.println("Number of locations: "+env.getLocations().size());
		e.setWorldSize(
				
				(env.getMatrixSize()+ 1) * Room.ROOM_LENGHT);
		
		env.draw(e);


		AbstractSimulatorMonitor<RobotAvatar> controller = new SimulatorMonitor(robots, e);

		Simbad frame = controller.getSimbadFrame();

		frame.getWorld().changeViewPoint(World.VIEW_FROM_TOP, null);
		

		Thread.sleep(3000);
		LTLFormula f = (new LTLNeg(pattern.accept(new Pattern2LTL())));


		env.printSimbadMatrix(System.out);

		String forrmula = "LTLSPEC\n" + f.accept(new LTL2NuSMVSingleRobot()) + ";\n";

		String nuSMVFileName = "tmp.smv";
		FileUtils.writeStringToFile(new File(nuSMVFileName), (env.toNuSMVCTL() + forrmula));

		String[] command = { "/bin/bash", "run_NuSMV.sh", nuSMVFileName };

		Stopwatch timer = Stopwatch.createUnstarted();
		ProcessBuilder builder = new ProcessBuilder(command);
		builder.redirectErrorStream(true);
		Process p = builder.start();

		InputStream stdout = p.getInputStream();

		BufferedReader reader = new BufferedReader(new InputStreamReader(stdout));

		String line;

		boolean result = false;
		List<String> locations_prefix = new ArrayList<>();

		List<String> actions_prefix = new ArrayList<>();

		int currindex = -1;
		while ((line = reader.readLine()) != null && !line.contains("-- Loop starts here")) {
			System.out.println(line);
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

			for (int i = 0; i < locations_prefix.size(); i++) {
				String nextPosition = locations_prefix.get(i);
				System.out.println("Robot sent to location: " + nextPosition);
				if (env.isConnected(currRobotLocation, nextPosition)) {
					env.getRobot1().setDestination(env.getPosition(nextPosition));
				} else {
					env.getRobot1().resetPosition(env.getPosition(nextPosition));
					env.getRobot1().setDestination(env.getPosition(nextPosition));
				}
				currRobotLocation = nextPosition;

				Thread.sleep(4000);
				if (actions_prefix.get(i).equals("act")) {

					System.out.println("Robot executing action: " + actions_prefix.get(i));

					env.getRobot1().changeColor();
					;

				}

			}
			System.out.println("-- Loop starts here");

			for (int i = 0; i < locations_suffix.size(); i++) {

				String nextPosition = locations_suffix.get(i);
				System.out.println("Robot sent to location: " + nextPosition);
				if (env.isConnected(currRobotLocation, nextPosition)) {
					env.getRobot1().setDestination(env.getPosition(nextPosition));
				} else {
					env.getRobot1().resetPosition(env.getPosition(nextPosition));
					env.getRobot1().setDestination(env.getPosition(nextPosition));
				}

				Thread.sleep(4000);
				currRobotLocation = nextPosition;

				if (actions_suffix.get(i).equals("act")) {
					System.out.println("Robot executing action: " + actions_suffix.get(i));
					env.getRobot1().changeColor();

				}

			}
		} else {
			System.out.println("No plan found");
		}

		frame.setDefaultCloseOperation(frame.DISPOSE_ON_CLOSE);
		frame.dispatchEvent(new WindowEvent(frame, WindowEvent.WINDOW_CLOSING));
		
		if(!result) {
			JOptionPane.showMessageDialog(null, "No plan found");

		}
		}
		catch(Exception e) {
			System.out.println(e.toString());
		}
	
	}

	
}
