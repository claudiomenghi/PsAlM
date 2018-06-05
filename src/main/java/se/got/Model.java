package se.got;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Observable;
import java.util.Set;

import se.got.ltl.LTLFormula;

public class Model extends Observable {

	private Map<String, Map<String, LTLFormula>> mapSpecificationFormula = new HashMap<>();

	private Set<String> availableRobots;

	private Map<String, String> mapRobotIP;
	private Map<String, String> mapRobotPORT;

	private static final Model model = new Model();

	public static Model getModel() {

		return model;
	}

	private Model() {
		this.availableRobots = new HashSet<>();
		this.mapRobotIP = new HashMap<>();
		this.mapRobotPORT = new HashMap<>();
		this.mapSpecificationFormula = new HashMap<>();
	}

	public boolean containsRobot(String robotName) {
		return this.availableRobots.contains(robotName);
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

	public void addRobot(String robotName) {
		if (robotName == null) {
			throw new NullPointerException("The robot name cannot be null");
		}
		if (availableRobots.contains(robotName)) {
			throw new IllegalArgumentException("A robot with name " + robotName + "is already present");
		}
		availableRobots.add(robotName);
		mapSpecificationFormula.put(robotName, new HashMap<>());
		this.setChanged();
		this.notifyObservers();
	}

	public void addMission(String robotName, String missionName, LTLFormula formula) {
		if (!this.mapSpecificationFormula.containsKey(robotName)) {
			throw new IllegalArgumentException("robot " + robotName + "not contained into the set of robots");
		}

		if (this.mapSpecificationFormula.get(robotName).containsKey(missionName)) {
			throw new IllegalArgumentException(
					"mission  " + missionName + "for robots " + robotName + " already created");
		}
		System.out.println("Adding the mission "+missionName+" to the robot "+robotName);

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
