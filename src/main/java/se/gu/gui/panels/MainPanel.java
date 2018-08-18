package se.gu.gui.panels;

import java.awt.GridLayout;

import javax.swing.JPanel;

import se.gu.model.Workspace;

public class MainPanel extends JPanel {

	private final PatternSelectionPanel patternSelectionPanel;

	private final MissionLibraryPanel missionLibraryPanel;

	public MainPanel(Workspace model, String name, CurrentMissionPanel currentMissionPanel) {
		patternSelectionPanel = new PatternSelectionPanel(model, name);

		missionLibraryPanel = new MissionLibraryPanel(currentMissionPanel, patternSelectionPanel, model, name);

		model.addObserver(missionLibraryPanel);

		GridLayout experimentLayout = new GridLayout(0, 1);

		this.setLayout(experimentLayout);
		this.add(patternSelectionPanel);
		this.add(missionLibraryPanel);

	}
}
