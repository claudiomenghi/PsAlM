package se.got.model;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "robot")
public class RobotType {

	private String name;
	private String iconPath;

	@XmlElementWrapper(name = "actions")
	@XmlElement(name = "action")
	private List<String> action;

	public List<String> getActions() {
		return Collections.unmodifiableList(action);
	}

	public void setActions(List<String> actions) {
		this.action = actions;
	}

	private RobotType() {
		this.name = "";
		this.iconPath = "";
		this.action = new ArrayList<>();
	}

	public RobotType(String name, String iconPaht) {
		this.name = name;
		this.iconPath = iconPaht;
		this.action = new ArrayList<>();
	}

	public String getName() {
		return name;
	}

	public String getIconPath() {
		return this.iconPath;
	}

	public ImageIcon getIcon() throws IOException {

		return new ImageIcon(ImageIO.read(new File(iconPath)));
	}

	@XmlElement
	public void setName(String name) {
		this.name = name;
	}

	@XmlElement
	public void setIconPath(String iconPath) {
		this.iconPath = iconPath;
	}

	/** (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Robot [name=" + name + ", iconPath=" + iconPath + ", actions=" + action + "]";
	}

	
}
