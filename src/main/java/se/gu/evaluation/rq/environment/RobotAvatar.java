package se.gu.evaluation.rq.environment;


import java.awt.Color;

import javax.media.j3d.Material;
import javax.vecmath.Color3f;

import project.AbstractRobotSimulator;
import project.Point;

public class RobotAvatar extends AbstractRobotSimulator {

	
	
	public RobotAvatar(Point position, String name) {
		super(position, name);
		
	}
	
	
	

	@Override
	public String toString() {
		return "Robot " + this.getName();
	}

}
