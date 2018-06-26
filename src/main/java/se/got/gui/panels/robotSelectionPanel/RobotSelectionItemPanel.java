package se.got.gui.panels.robotSelectionPanel;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;

import se.got.Co4robotsGUI;

public class RobotSelectionItemPanel extends JPanel {

	public RobotSelectionItemPanel(JLabel c1, Component c2) {

		this.setBackground(Co4robotsGUI.BACKGROUNDCOLOR);
		this.setLayout(new BoxLayout(this, BoxLayout.LINE_AXIS));

		c1.setAlignmentX(Component.LEFT_ALIGNMENT);

		JPanel p = new JPanel();
		p.add(c1);

		p.setBackground(Co4robotsGUI.BACKGROUNDCOLOR);
		this.add(p);

		JPanel p2 = new JPanel();
		p2.setLayout(new FlowLayout());

		p2.setBackground(Co4robotsGUI.BACKGROUNDCOLOR);

		p2.add(c2, BorderLayout.CENTER);
		this.add(p2);

		this.setAlignmentX(Component.LEFT_ALIGNMENT);

	}

}
