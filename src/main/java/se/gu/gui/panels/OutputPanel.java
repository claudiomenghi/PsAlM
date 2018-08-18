package se.gu.gui.panels;

import java.awt.GridLayout;

import javax.swing.JPanel;
import javax.swing.JTextArea;

import javafx.scene.control.TextArea;

public class OutputPanel extends JPanel {

	
	private final JTextArea output;
	
	public OutputPanel() {
		output=new JTextArea();

		GridLayout experimentLayout = new GridLayout(0, 1);

		this.setLayout(experimentLayout);

		output.setText("This area is going to contain the output of the desired operations");
		this.add(output);
	}
	
	public void setText(String text) {
		output.setText("");
		output.setText(text);
	}
}
