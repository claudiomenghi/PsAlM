package se.gu.gui.panels.listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTabbedPane;

import se.gu.ctl.CTLFormula;
import se.gu.ctl.visitors.CTLFormulaToStringVisitor;
import se.gu.gui.panels.OutputPanel;
import se.gu.model.Workspace;
import se.gu.patterns.visitor.Pattern2CTL;

public class Mission2CTLListener implements ActionListener {

	private final OutputPanel outputArea;

	private final JLabel selectedMission;

	private final Workspace model;

	private final JTabbedPane tabbedPane;

	public Mission2CTLListener(OutputPanel outputArea, JLabel selectedMission, Workspace model,
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
			System.out.println(selectedMission.getText());
			System.out.println(this.model.getMissions());
			CTLFormula f = this.model.getSpecification(selectedMission.getText()).accept(new Pattern2CTL());

			outputArea.setText(f.accept(new CTLFormulaToStringVisitor()));
			tabbedPane.setSelectedIndex(1);
		}
	}

}
