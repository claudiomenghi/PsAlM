package se.gu.gui.panels;

import javax.swing.JLabel;

import se.gu.Co4robotsGUI;

public class Co4robotsLabel extends JLabel {
	
	
	public Co4robotsLabel(String label) {
		super(label);
		this.setBackground(Co4robotsGUI.BACKGROUNDCOLOR);
		this.setForeground(Co4robotsGUI.GRAYCO4ROBOTS);
		this.setFont(Co4robotsGUI.FONTTITLE);
		
		this.setAlignmentX(LEFT_ALIGNMENT);
	}

}
