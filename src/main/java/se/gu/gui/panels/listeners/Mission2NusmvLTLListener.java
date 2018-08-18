package se.gu.gui.panels.listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTabbedPane;

import se.gu.ctl.CTLFormula;
import se.gu.ctl.visitors.CTLFormulaToStringVisitor;
import se.gu.gui.panels.OutputPanel;
import se.gu.ltl.LTLFormula;
import se.gu.ltl.visitors.LTL2NuSMV;
import se.gu.model.Workspace;
import se.gu.patterns.visitor.Pattern2CTL;
import se.gu.patterns.visitor.Pattern2LTL;

public class Mission2NusmvLTLListener implements ActionListener {

	private final OutputPanel outputArea;

	private final JLabel selectedMission;

	private final Workspace model;

	private final JTabbedPane tabbedPane;

	public Mission2NusmvLTLListener(OutputPanel outputArea, JLabel selectedMission, Workspace model,
			JTabbedPane tabbedPane) {
		this.outputArea = outputArea;
		this.selectedMission = selectedMission;
		this.model = model;
		this.tabbedPane = tabbedPane;
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (selectedMission.getText().equals("No mission selected")) {
			JOptionPane.showMessageDialog(null, "No mission selected");
		} else {

			LTLFormula f = this.model.getSpecification(selectedMission.getText()).accept(new Pattern2LTL());

			outputArea.setText(f.accept(new LTL2NuSMV()));
			tabbedPane.setSelectedIndex(1);
		}
	}

}
