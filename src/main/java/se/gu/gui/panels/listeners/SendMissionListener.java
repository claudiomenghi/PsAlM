package se.gu.gui.panels.listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import se.gu.MissionSender;
import se.gu.ltl.LTLFormula;
import se.gu.ltl.visitors.LTLFormulaToStringVisitor;
import se.gu.model.Workspace;
import se.gu.patterns.visitor.Pattern2LTL;

public class SendMissionListener implements ActionListener {

	private final JLabel selectedMission;

	private final Workspace model;

	private final JPanel mainPanel;

	public SendMissionListener(JLabel selectedMission, Workspace model, JPanel mainPanel) {
		this.selectedMission = selectedMission;
		this.model = model;
		this.mainPanel = mainPanel;
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (selectedMission.getText().equals("No mission selected")) {
			JOptionPane.showMessageDialog(null, "No mission selected");
		} else {
			LTLFormula f = this.model.getSpecification(selectedMission.getText()).accept(new Pattern2LTL());

			String ip = JOptionPane.showInputDialog("Please insert the ip of the robot: ");

			String port = JOptionPane.showInputDialog("Please insert the port of the robot: ");
			try {
				MissionSender sender = new MissionSender();

				sender.send(f.accept(new LTLFormulaToStringVisitor()), ip, port);
				
				JOptionPane.showMessageDialog(null, "Mission sent to the robot!");
			} catch (Exception expt) {
				JOptionPane.showMessageDialog(null, "Cannot connect with the robot!");
			}
		}
	}

}
