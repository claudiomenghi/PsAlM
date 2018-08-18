package se.gu.gui.panels.listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

import org.apache.commons.io.FileUtils;

import com.google.common.base.Stopwatch;

import project.AbstractSimulatorMonitor;
import se.gu.evaluation.rq.Configuration;
import se.gu.evaluation.rq.ConfigurationLoader;
import se.gu.evaluation.rq.environment.Environment;
import se.gu.evaluation.rq.environment.RobotAvatar;
import se.gu.evaluation.rq.environment.Room;
import se.gu.evaluation.rq.environment.SimulatorMonitor;
import se.gu.gui.panels.OutputPanel;
import se.gu.ltl.LTLFormula;
import se.gu.ltl.LTLNeg;
import se.gu.ltl.visitors.LTL2NuSMV;
import se.gu.model.Workspace;
import se.gu.nusmv.LTL2NuSMVSingleRobot;
import se.gu.patterns.Pattern;
import se.gu.patterns.visitor.Pattern2LTL;
import se.gu.simulator.RunSimbadSimulator;
import simbad.gui.Simbad;
import simbad.sim.EnvironmentDescription;
import simbad.sim.World;

public class RunSimbadSimulatorListener implements ActionListener {

	private final JLabel selectedMission;

	private final Workspace model;

	private final JPanel mainPanel;

	public RunSimbadSimulatorListener(JLabel selectedMission, Workspace model, JPanel mainPanel) {
		this.selectedMission = selectedMission;
		this.model = model;
		this.mainPanel = mainPanel;
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (selectedMission.getText().equals("No mission selected")) {
			JOptionPane.showMessageDialog(null, "No mission selected");
		} else {

			Pattern f = this.model.getSpecification(selectedMission.getText());

			final JFileChooser fc = new JFileChooser();
			int returnVal = fc.showOpenDialog(mainPanel);

			if (returnVal == JFileChooser.APPROVE_OPTION) {
				File file = fc.getSelectedFile();
				System.out.println("Opening: " + file.getName());

				try {

					Thread thread = new Thread(new RunSimbadSimulator(file.getAbsolutePath(), f));
					thread.start();

				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			} else {
				System.out.println("Open command cancelled by user.");
			}
		}
	}

}
