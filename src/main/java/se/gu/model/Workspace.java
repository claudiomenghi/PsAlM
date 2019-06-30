package se.gu.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Observable;
import java.util.Set;
import java.util.stream.Collectors;

import com.google.inject.internal.util.Preconditions;

import se.gu.patterns.Pattern;

public class Workspace extends Observable {

	private Map<String, Pattern> mapSpecificationFormula;

	private Set<Robot> availableRobots;

	private Map<String, String> mapRobotIP;
	private Map<String, String> mapRobotPORT;
	
	
	/**
	 * Contains the actions that the robot can perform
	 */
	private final Set<String> availableActions;
	
	/**
	 * contains the locations that the robot can visit
	 */
	private final Set<String> availableLocations;

	public Set<String> getAvailableActions() {
		return Collections.unmodifiableSet(availableActions);
	}

	public Set<String> getAvailableLocations() {
		return Collections.unmodifiableSet(availableLocations);
	}
	
	/**
	 * adds an action to the set of actions present in the model
	 * @param action the action to be added
	 * @throws NullPointerException if the action is null
	 */
	public void addAction(String action) {
		Preconditions.checkNotNull(action);
		this.availableActions.add(action);
		this.setChanged();
		this.notifyObservers();

	}
	
	/**
	 * adds a location to the set of locations present in the model
	 * @param location the location to be added
	 * @throws NullPointerException if the location is null
	 */
	public void addLocation(String location) {
		Preconditions.checkNotNull(location);
		this.availableLocations.add(location);
		this.setChanged();
		this.notifyObservers();

	}

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
		this.availableActions=new HashSet<String>();
		this.availableLocations=new HashSet<String>();
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

	

	public Set<String> getMissions(){
		return this.mapSpecificationFormula.keySet();
	}
	
	public Pattern getSpecification(String missionName) {
		return this.mapSpecificationFormula.get(missionName);
	}
	public Set<Robot> getAvailableRobots() {
		return this.availableRobots;
	}

	public void addMission( String missionName, Pattern formula) {

		if (this.mapSpecificationFormula.containsKey(missionName)) {
			throw new IllegalArgumentException(
					"mission  " + missionName  + " already created");
		}
	
		this.mapSpecificationFormula.put(missionName, formula);
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
