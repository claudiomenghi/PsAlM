package se.got.panels;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Toolkit;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

import com.google.common.base.Preconditions;

import se.got.Co4robotsGUI;
import se.got.MissionSender;
import se.got.Model;
import se.got.ltl.LTLFormula;
import se.got.ltl.atoms.LTLIPropositionalAtom;
import se.got.ltl.visitors.LTLFormulaToStringVisitor;

public class CurrentMissionPanel extends JPanel {

	private final static String SEND_MISSION = "Send mission";


	private javax.swing.JButton sendMission;
	
	
	private final String robotName;
	
	
	public void setCurrentMission(String currentMission) {
		
		Preconditions.checkNotNull(currentMission, "The mission cannot be null");
		selectedMissionJLabel.setText(currentMission);
		selectedMissionJLabel.repaint();
		
	}

	private javax.swing.JButton stopMission;

	private final PatternSelectionPanel patternSelectionPanel;

	private  JLabel selectedMissionJLabel;
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

	public CurrentMissionPanel(Model model, String name) {

		this.setName(name);

		
		this.robotName=name;
		patternSelectionPanel = new PatternSelectionPanel(model, name);

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

		selectedMissionJLabel = new JLabel("No mission selected");
		
		this.setBackground(Color.RED);

		this.sendMission.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {

				if (selectedMissionJLabel.getText().equals("No mission selected")) {
					JOptionPane.showMessageDialog(null, "No mission selected");
				} else {

					MissionSender sender = new MissionSender();
//					try {
//						LTLFormula f = LTLFormula.TRUE;
//						for (int i = 0; i < PatternSelectionPanel.locationsModel.size(); i++) {
//							for (int j = i + 1; j < PatternSelectionPanel.locationsModel.size(); j++) {
//
//								if (i != j) {
//									f = LTLFormula.and(f,
//											LTLFormula.not(LTLFormula.and(
//													new LTLIPropositionalAtom(
//															PatternSelectionPanel.locationsModel.getElementAt(i)),
//													new LTLIPropositionalAtom(
//															PatternSelectionPanel.locationsModel.getElementAt(j)))));
//								}
//							}
//						}


						sender.send(
									model.getMission(robotName, selectedMissionJLabel.getText())
										.accept(new LTLFormulaToStringVisitor()),

								model.getIP(patternSelectionPanel.getSelectedRobotl()),
								model.getPORT(patternSelectionPanel.getSelectedRobotl()));
//					} catch (Exception e) {
//						e.printStackTrace();
//					}
				}
			}

		});

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

		clientServer.add(this.sendMission);

		this.stopMission = new JButton("Stop mission");
		clientServer.add(this.stopMission);

		this.stopMission.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {

				MissionSender sender = new MissionSender();

				sender.send("stop", model.getIP(patternSelectionPanel.getSelectedRobotl()),
						model.getPORT(patternSelectionPanel.getSelectedRobotl()));
			}

		});

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

		MissionLibraryPanel missionLibraryPanel = new MissionLibraryPanel(this,patternSelectionPanel, model, this.getName());

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(mainPanel);
		mainPanel.setLayout(layout);

		layout.setAutoCreateGaps(true);
		layout.setAutoCreateContainerGaps(true);

		layout.createSequentialGroup();

		layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(
				layout.createParallelGroup().addComponent(remotePanel).addComponent(patternSelectionPanel).addGroup(
						layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(missionLibraryPanel))));

		layout.setVerticalGroup(layout.createSequentialGroup().addComponent(remotePanel)
				.addComponent(patternSelectionPanel).addComponent(missionLibraryPanel));

		model.addObserver(missionLibraryPanel);

		System.out.println("adding the observer to the model");

		this.setBackground(Co4robotsGUI.BACKGROUNDCOLOR);
		
		this.setMaximumSize(new Dimension((int) Toolkit.getDefaultToolkit().getScreenSize().getWidth(),(int) Toolkit.getDefaultToolkit().getScreenSize().getHeight() ));

		this.repaint();
	}
}
