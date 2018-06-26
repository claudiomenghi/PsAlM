package se.got.model;

public class Robot {

	private final String name;
	private final RobotType type;

	public Robot(String name, RobotType type) {
		this.name = name;
		this.type = type;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the type
	 */
	public RobotType getType() {
		return type;
	}

}
