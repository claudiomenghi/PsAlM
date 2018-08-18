package se.gu.evaluation.rq.environment;


import java.util.Set;

import project.AbstractSimulatorMonitor;
import simbad.sim.EnvironmentDescription;

public class SimulatorMonitor extends AbstractSimulatorMonitor<RobotAvatar> {

	public SimulatorMonitor( Set<RobotAvatar> robots, EnvironmentDescription e) {
		super(robots, e);
	}

	

	@Override
	public void update(RobotAvatar arg0) {
		
	}

}
