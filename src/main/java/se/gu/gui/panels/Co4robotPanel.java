package se.gu.gui.panels;

import java.awt.Component;
import java.awt.GridLayout;

import javax.swing.JPanel;

import se.gu.Co4robotsGUI;

public class Co4robotPanel extends JPanel {

	public Co4robotPanel(Component c1, Component c2) {
		super();

		this.setBackground(Co4robotsGUI.BACKGROUNDCOLOR);
		GridLayout loadlayout = new GridLayout(1, 2);

		this.setLayout(loadlayout);
		this.add(c1);
		this.add(c2);
		

	}

}
