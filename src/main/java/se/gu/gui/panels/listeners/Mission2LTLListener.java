package se.gu.gui.panels.listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;

import se.gu.gui.panels.OutputPanel;
import se.gu.ltl.LTLFormula;
import se.gu.ltl.visitors.LTLFormulaToStringVisitor;
import se.gu.model.Workspace;
import se.gu.patterns.visitor.Pattern2LTL;

public class Mission2LTLListener implements ActionListener {

	private final OutputPanel outputArea;

	private final JLabel selectedMission;

	private final Workspace model;

	private final JTabbedPane tabbedPane;

	public Mission2LTLListener(OutputPanel outputArea, JLabel selectedMission, Workspace model,
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

			outputArea.setText(f.accept(new LTLFormulaToStringVisitor()));
			tabbedPane.setSelectedIndex(1);
		}
	}

}
