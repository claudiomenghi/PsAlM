package se.gu.model;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "robotsLibrary")
public class RobotLibrary {

	@XmlElement(name = "robot")
	private List<RobotType> robotList = new ArrayList<>();

	private String path;

	private RobotLibrary() {
		robotList = new ArrayList<>();
		path = "";
	}

	public RobotLibrary(List<RobotType> robots, String path) {
		this.robotList = robots;
		this.path = path;

	}
	
	public void setPath(String path) {
		this.path=path;
	}

	public String getPath() {
		return this.path;
	}

	public void addRobot(RobotType element) {
		this.robotList.add(element);
	}

	public List<RobotType> getRobots() {
		return this.robotList;
	}

	public void setRobots(List<RobotType> robots) {
		this.robotList = robots;
	}

	@Override
	public String toString() {
		return "RobotLibrary [robots=" + robotList + "]";
	}

	public static RobotLibrary loadRobotLibrary(String libraryPath) {
		File file = new File(libraryPath);
		JAXBContext jaxbContext;
		try {
			jaxbContext = JAXBContext.newInstance(RobotLibrary.class);

			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			RobotLibrary robots = (RobotLibrary) jaxbUnmarshaller.unmarshal(file);

			return robots;

		} catch (JAXBException e) {

			return new RobotLibrary(new ArrayList<>(),"");
		}

	}
}
