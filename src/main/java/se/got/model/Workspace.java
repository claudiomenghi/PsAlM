package se.got.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Observable;
import java.util.Set;
import java.util.stream.Collectors;

import se.got.ltl.LTLFormula;

public class Workspace extends Observable {

	private Map<String, Map<String, LTLFormula>> mapSpecificationFormula = new HashMap<>();

	private Set<Robot> availableRobots;

	private Map<String, String> mapRobotIP;
	private Map<String, String> mapRobotPORT;

	private static final Workspace model = new Workspace();

	private RobotLibrary library;

	public static Workspace getModel() {

		return model;
	}

	private Workspace() {
		this.library = new RobotLibrary(new ArrayList<>(), "");
		this.availableRobots = new HashSet<>();
		this.mapRobotIP = new HashMap<>();
		this.mapRobotPORT = new HashMap<>();
		this.mapSpecificationFormula = new HashMap<>();
	}

	public void setRobotLibrary(RobotLibrary availableRobots) {
		this.library = availableRobots;
		this.setChanged();
		this.notifyObservers();
	}

	public RobotLibrary getRobotLibrary() {
		return this.library;
	}

	public boolean containsRobot(String robotName) {
		return this.availableRobots.stream().map(r -> r.getName()).collect(Collectors.toSet()).contains(robotName);
	}

	public String getIP(String robotName) {
		return this.mapRobotIP.get(robotName);
	}

	public String getPORT(String robotName) {
		return this.mapRobotPORT.get(robotName);
	}

	public LTLFormula getMission(String robotName, String mission) {
		return this.mapSpecificationFormula.get(robotName).get(mission);
	}

	public Map<String, LTLFormula> getRobotMissions(String robotName) {
		if (robotName == null) {
			throw new NullPointerException("The robot name cannot be null");
		}

		if (!this.mapSpecificationFormula.containsKey(robotName)) {
			throw new IllegalArgumentException("A robot with name " + robotName + "is not present");
		}
		return this.mapSpecificationFormula.get(robotName);
	}

	public void addRobot(String robotName, RobotType robotType) {
		if (robotName == null) {
			throw new NullPointerException("The robot name cannot be null");
		}
		if (availableRobots.stream().map(r -> r.getName()).collect(Collectors.toSet()).contains(robotName)) {
			throw new IllegalArgumentException("A robot with name " + robotName + "is already present");
		}
		availableRobots.add(new Robot(robotName, robotType));
		mapSpecificationFormula.put(robotName, new HashMap<>());
		this.setChanged();
		this.notifyObservers();
	}

	public Set<Robot> getAvailableRobots() {
		return this.availableRobots;
	}

	public void addMission(String robotName, String missionName, LTLFormula formula) {
		if (!this.mapSpecificationFormula.containsKey(robotName)) {
			throw new IllegalArgumentException("robot " + robotName + "not contained into the set of robots");
		}

		if (this.mapSpecificationFormula.get(robotName).containsKey(missionName)) {
			throw new IllegalArgumentException(
					"mission  " + missionName + "for robots " + robotName + " already created");
		}
		System.out.println("Adding the mission " + missionName + " to the robot " + robotName);

		this.mapSpecificationFormula.get(robotName).put(missionName, formula);
		this.setChanged();

		this.notifyObservers();
	}

	public void setIP(String robotName, String ip) {
		if (robotName == null) {
			throw new NullPointerException("The robot name cannot be null");
		}
		if (ip == null) {
			throw new NullPointerException("The ip cannot be null");
		}
		mapRobotIP.put(robotName, ip);
		this.setChanged();

		this.notifyObservers();
	}

	public void setPORT(String robotName, String port) {
		if (robotName == null) {
			throw new NullPointerException("The robot name cannot be null");
		}
		if (port == null) {
			throw new NullPointerException("The port cannot be null");
		}

		mapRobotPORT.put(robotName, port);
		this.setChanged();

		this.notifyObservers();
	}

	public void setRobotIPandPORT(String robotName, String ip, String port) {
		this.setIP(robotName, ip);
		this.setPORT(robotName, port);
		this.setChanged();

		this.notifyObservers();
	}
}
