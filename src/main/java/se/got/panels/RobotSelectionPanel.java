package se.got.panels;

import java.awt.GridLayout;

import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.google.common.base.Preconditions;

import se.got.Co4robotsGUI;
import se.got.Model;
import se.got.Subscriber;

public class RobotSelectionPanel extends JPanel {

	private static JTextField ipTextField;
	private static JTextField robotTextField;
	private static JTextField portTextField;
	private static JTextField publisherportTextField;

	private javax.swing.JButton addRobot;

	private static Subscriber sub;
	

	public RobotSelectionPanel(Model model) {

		Preconditions.checkNotNull(model, "The model cannot be null");
		
		JLabel robotNameJLabel = new JLabel("ROBOT NAME:");
		robotNameJLabel.setForeground(Co4robotsGUI.GRAYCO4ROBOTS);
		robotNameJLabel.setFont(Co4robotsGUI.FONTTITLE);

		
		
		
		robotTextField = new JTextField(15);
		robotTextField.setText("");
		robotTextField.setColumns(15);
		
		
		JLabel ipLabel = new JLabel("IP:");
		ipLabel.setForeground(Co4robotsGUI.GRAYCO4ROBOTS);
		ipLabel.setFont(Co4robotsGUI.FONTTITLE);

		JLabel portLabel = new JLabel("Server PORT:");
		portLabel.setForeground(Co4robotsGUI.GRAYCO4ROBOTS);
		portLabel.setFont(Co4robotsGUI.FONTTITLE);

		JLabel publisherLabel = new JLabel("Publisher PORT:");
		publisherLabel.setForeground(Co4robotsGUI.GRAYCO4ROBOTS);
		publisherLabel.setFont(Co4robotsGUI.FONTTITLE);

		this.addRobot = new javax.swing.JButton();

		this.addRobot.setText("Add");

		ipTextField = new JTextField(15);
		ipTextField.setText("");
		ipTextField.setColumns(15);

		portTextField = new JTextField(5);
		portTextField.setText("13000");

		publisherportTextField = new JTextField(5);
		publisherportTextField.setText("13001");

		
		
		GridLayout gridlayout = new GridLayout(0, 2);
		this.setLayout(gridlayout);
		
		this.add(robotNameJLabel);
		this.add(robotTextField);
		
		
		this.add(ipLabel);
		this.add(ipTextField);
		

		this.add(publisherLabel);
		this.add(publisherportTextField);

		this.add(portLabel);
		this.add(portTextField);

		JPanel clientServer = new JPanel();
		clientServer.setBackground(Co4robotsGUI.BACKGROUNDCOLOR);


		

		this.addRobot.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {

				//sub = new Subscriber(ipTextField.getText(), Integer.parseInt(publisherportTextField.getText()),
				//		PatternSelectionPanel.availableActions, PatternSelectionPanel.actionsModel);
				//Thread t = new Thread(sub);
				//t.start();
				
				if(model.containsRobot(robotTextField.getText())) {
					throw new IllegalArgumentException("Robot "+robotTextField.getText()+" already present in the system");
				}
				
				CurrentMissionPanel p=new CurrentMissionPanel(model,robotTextField.getText());
				Co4robotsGUI.tabbedPane.addTab(robotTextField.getText(), p);
				model.addRobot(robotTextField.getText());
				model.setRobotIPandPORT(robotTextField.getText(), ipTextField.getText(), portTextField.getText());
				
			}
			
		});
		

		this.add(addRobot);
		
		
		this.setBackground(Co4robotsGUI.BACKGROUNDCOLOR);

	}
}
