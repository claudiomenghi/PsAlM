package se.gu.gui.panels;

import java.awt.GridLayout;

import javax.swing.JPanel;

import se.gu.model.Workspace;

public class MainPanel extends JPanel {

	private final PatternSelectionPanel patternSelectionPanel;

	private final MissionLibraryPanel missionLibraryPanel;
	
	private final LocationsAndActionsPanel locationAndActionsPanel;

	public MainPanel(Workspace model, String name, CurrentMissionPanel currentMissionPanel) {
		this.patternSelectionPanel = new PatternSelectionPanel(model, name);

		this.missionLibraryPanel = new MissionLibraryPanel(currentMissionPanel, patternSelectionPanel, model, name);

		this.locationAndActionsPanel= new LocationsAndActionsPanel(model, name);
		
		model.addObserver(missionLibraryPanel);
		model.addObserver(locationAndActionsPanel);
		
		GridLayout experimentLayout = new GridLayout(0, 1);

		this.setLayout(experimentLayout);
		this.add(patternSelectionPanel);
		this.add(locationAndActionsPanel);
		this.add(missionLibraryPanel);

	}
}
