package se.gu.gui.panels;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;

import se.gu.Co4robotsGUI;

public class JButtonCouple extends JPanel {

	public JButtonCouple(JButton b1, JButton b2, String title) {

		this.setBackground(Co4robotsGUI.BACKGROUNDCOLOR);

		this.setBorder(javax.swing.BorderFactory.createTitledBorder(null, title, 2, 2,
				Co4robotsGUI.FONT, Co4robotsGUI.REDCO4ROBOTS));

		GridLayout experimentLayout = new GridLayout(0, 1);

		this.setLayout(experimentLayout);
		this.add(b1);
		if (b2 != null) {
			this.add(b2);
		}
	}
}
