package se.gu.gui.panels;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Toolkit;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.border.TitledBorder;

import com.google.common.base.Preconditions;

import se.gu.Co4robotsGUI;
import se.gu.gui.panels.listeners.Mission2CTLListener;
import se.gu.gui.panels.listeners.Mission2LTLListener;
import se.gu.gui.panels.listeners.Mission2NusmvCTLListener;
import se.gu.gui.panels.listeners.Mission2NusmvLTLListener;
import se.gu.gui.panels.listeners.RunSimbadSimulatorListener;
import se.gu.gui.panels.listeners.SendMissionListener;
import se.gu.model.Workspace;

public class CurrentMissionPanel extends JPanel {

	private final static String SEND_MISSION = "Send mission";

	private final static String SHOW_LTL_MISSION = "Mission2LTL";

	private final static String SHOW_CTL_MISSION = "Mission2CTL";

	private final static String MISSION2NUSMV_LTL = "Mission2Nusmv LTL";

	private final static String MISSION2NUSMV_CTL = "Mission2Nusmv CTL";

	private javax.swing.JButton sendMission;

	private javax.swing.JButton showLTLMission;

	private javax.swing.JButton showCTLMission;

	private javax.swing.JButton mission2nusmvctl;
	private javax.swing.JButton mission2nusmvltl;

	private javax.swing.JButton mission2spectra;

	private javax.swing.JButton mission2simulator;

	private final String robotName;

	public void setCurrentMission(String currentMission) {

		Preconditions.checkNotNull(currentMission, "The mission cannot be null");
		selectedMissionJLabel.setText(currentMission);
		selectedMissionJLabel.repaint();

	}

	private javax.swing.JButton stopMission;

	private JLabel selectedMissionJLabel;
	private javax.swing.JButton fEE;
	private javax.swing.JCheckBox fEName;
	private javax.swing.JCheckBox fESpec;
	private javax.swing.JTextArea fMapping;
	private javax.swing.JButton fNE;
	private javax.swing.JTextPane fSELP;
	private javax.swing.JButton fSEs;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;

	private JPanel remotePanel;

	private javax.swing.JPanel jPanel5;
	private javax.swing.JPanel eventJPanel;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JScrollPane jScrollPane2;

	private javax.swing.JPanel optionJPanel;

	public CurrentMissionPanel(Workspace model, String name) {

		this.setName(name);

		this.robotName = name;

		// capturing the main panel
		JPanel mainPanel = new JPanel();
		mainPanel.setBackground(Co4robotsGUI.BACKGROUNDCOLOR);
		this.add(mainPanel);

		this.add(mainPanel, BorderLayout.CENTER);
		// end capturing

		optionJPanel = new javax.swing.JPanel();

		fEName = new javax.swing.JCheckBox();
		fESpec = new javax.swing.JCheckBox();
		this.sendMission = new javax.swing.JButton();
		jPanel5 = new javax.swing.JPanel();
		jScrollPane1 = new javax.swing.JScrollPane();
		fSELP = new javax.swing.JTextPane();
		jScrollPane2 = new javax.swing.JScrollPane();
		fMapping = new javax.swing.JTextArea();
		jLabel1 = new javax.swing.JLabel();
		jLabel2 = new javax.swing.JLabel();
		eventJPanel = new javax.swing.JPanel();
		fNE = new javax.swing.JButton();
		fSEs = new javax.swing.JButton();
		fEE = new javax.swing.JButton();

		fEName.setBackground(Co4robotsGUI.BACKGROUNDCOLOR);
		fESpec.setBackground(Co4robotsGUI.BACKGROUNDCOLOR);
		jPanel5.setBackground(Co4robotsGUI.BACKGROUNDCOLOR);
		jScrollPane1.setBackground(Co4robotsGUI.BACKGROUNDCOLOR);
		fSELP.setBackground(Co4robotsGUI.BACKGROUNDCOLOR);
		jScrollPane2.setBackground(Co4robotsGUI.BACKGROUNDCOLOR);
		fMapping.setBackground(Co4robotsGUI.BACKGROUNDCOLOR);
		jLabel1.setBackground(Co4robotsGUI.BACKGROUNDCOLOR);
		jLabel2.setBackground(Co4robotsGUI.BACKGROUNDCOLOR);
		eventJPanel.setBackground(Co4robotsGUI.BACKGROUNDCOLOR);
		fNE.setBackground(Co4robotsGUI.BACKGROUNDCOLOR);
		fSEs.setBackground(Co4robotsGUI.BACKGROUNDCOLOR);
		fEE.setBackground(Co4robotsGUI.BACKGROUNDCOLOR);

		optionJPanel.setBackground(Co4robotsGUI.BACKGROUNDCOLOR);
		optionJPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Options"));

		javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(optionJPanel);

		optionJPanel.setLayout(jPanel3Layout);

		this.sendMission.setText(SEND_MISSION);

		this.showCTLMission = new JButton(SHOW_CTL_MISSION);

		this.showLTLMission = new JButton(SHOW_LTL_MISSION);

		this.mission2nusmvltl = new JButton(MISSION2NUSMV_LTL);
		this.mission2nusmvctl = new JButton(MISSION2NUSMV_CTL);

		this.mission2spectra = new JButton("Mission2Spectra");

		this.mission2simulator = new JButton("Run Simbad simulator");

		selectedMissionJLabel = new JLabel("No mission selected");

		this.setBackground(Color.RED);

		JLabel missionJLabel = new JLabel("Mission:");
		missionJLabel.setForeground(Co4robotsGUI.GRAYCO4ROBOTS);
		missionJLabel.setFont(Co4robotsGUI.FONTTITLE);

		JPanel p4 = new JPanel();
		p4.setBackground(Co4robotsGUI.BACKGROUNDCOLOR);
		p4.add(missionJLabel);
		p4.add(selectedMissionJLabel);

		JPanel clientServer = new JPanel();
		clientServer.setBackground(Co4robotsGUI.BACKGROUNDCOLOR);
		FlowLayout f = new FlowLayout();

		clientServer.setLayout(f);

		clientServer.add(new JButtonCouple(this.showLTLMission, this.showCTLMission, "Logic"));

		clientServer.add(new JButtonCouple(mission2nusmvltl, mission2nusmvctl, "NuSMV"));

		clientServer.add(

				new JButtonCouple(this.mission2spectra, null, "Spectra"));
		clientServer.add(

				new JButtonCouple(this.mission2simulator, null, "Simulator"));

		//this.stopMission = new JButton("Stop mission");
		clientServer.add(this.sendMission);

	

		remotePanel = new JPanel();

		javax.swing.GroupLayout memotePalenlLayout = new javax.swing.GroupLayout(remotePanel);

		memotePalenlLayout.setHorizontalGroup(memotePalenlLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(memotePalenlLayout.createSequentialGroup().addComponent(p4))
				.addGroup(memotePalenlLayout.createSequentialGroup().addComponent(clientServer))
				.addGroup(memotePalenlLayout.createSequentialGroup()));

		memotePalenlLayout.setVerticalGroup(memotePalenlLayout.createSequentialGroup()
				.addGroup(memotePalenlLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(p4))
				.addGroup(memotePalenlLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
						.addComponent(clientServer))
				.addGroup(memotePalenlLayout.createSequentialGroup())
				.addGroup(memotePalenlLayout.createParallelGroup(GroupLayout.Alignment.LEADING)));

		remotePanel.setLayout(memotePalenlLayout);

		remotePanel.setBackground(Co4robotsGUI.BACKGROUNDCOLOR);

		TitledBorder titleBorder = javax.swing.BorderFactory.createTitledBorder(null, "Mission management" + "", 2, 2,
				Co4robotsGUI.FONT, Co4robotsGUI.REDCO4ROBOTS);
		remotePanel.setBorder(titleBorder);

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(mainPanel);
		mainPanel.setLayout(layout);

		layout.setAutoCreateGaps(true);
		layout.setAutoCreateContainerGaps(true);

		layout.createSequentialGroup();

		JTabbedPane tabbedPane = new JTabbedPane();

		MainPanel p = new MainPanel(model, name, this);

		tabbedPane.add("Main Panel", p);

		OutputPanel outputPanel = new OutputPanel();

		tabbedPane.addTab("Output Panel", outputPanel);

		this.showLTLMission
				.addActionListener(new Mission2LTLListener(outputPanel, selectedMissionJLabel, model, tabbedPane));

		this.showCTLMission
				.addActionListener(new Mission2CTLListener(outputPanel, selectedMissionJLabel, model, tabbedPane));

		this.mission2nusmvltl
				.addActionListener(new Mission2NusmvLTLListener(outputPanel, selectedMissionJLabel, model, tabbedPane));

		this.mission2nusmvctl
				.addActionListener(new Mission2NusmvCTLListener(outputPanel, selectedMissionJLabel, model, tabbedPane));

		this.mission2simulator
				.addActionListener(new RunSimbadSimulatorListener(selectedMissionJLabel, model, remotePanel));

		this.sendMission.addActionListener(new SendMissionListener(selectedMissionJLabel, model, remotePanel));

		layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(layout.createParallelGroup().addComponent(remotePanel).addComponent(tabbedPane)));

		layout.setVerticalGroup(layout.createSequentialGroup().addComponent(remotePanel).addComponent(tabbedPane));

		this.setBackground(Co4robotsGUI.BACKGROUNDCOLOR);

		this.setMaximumSize(new Dimension((int) Toolkit.getDefaultToolkit().getScreenSize().getWidth(),
				(int) Toolkit.getDefaultToolkit().getScreenSize().getHeight()));

		this.repaint();
	}
}
