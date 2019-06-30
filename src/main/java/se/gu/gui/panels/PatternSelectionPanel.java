package se.gu.gui.panels;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.DropMode;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

import se.gu.Avoidance;
import se.gu.Co4robotsGUI;
import se.gu.Composition;
import se.gu.CoreMovementPatterns;
import se.gu.Triggers;
import se.gu.ltl.LTLFormula;
import se.gu.ltl.atoms.LTLPropositionalAtom;
import se.gu.ltl.atoms.PCAtom;
import se.gu.ltl.atoms.PLAtom;
import se.gu.ltl.visitors.LTLFormulaToStringVisitor;
import se.gu.model.Workspace;
import se.gu.patterns.Pattern;
import se.gu.patterns.avoidance.conditional.FutureAvoidance;
import se.gu.patterns.avoidance.conditional.GlobalAvoidance;
import se.gu.patterns.avoidance.conditional.PastAvoidance;
import se.gu.patterns.avoidance.restricted.ExactRestrictedAvoidance;
import se.gu.patterns.avoidance.restricted.LowerRestrictedAvoidance;
import se.gu.patterns.avoidance.restricted.UpperRestrictedAvoidance;

public class PatternSelectionPanel extends JPanel {

	private JPanel loadPanel;

	private JPanel actionsPanel;
	private JPanel locationsPanel;

	private JPanel input1JPanel;

	private JPanel input2JPanel;

	private final String robotName = "robot";

	private JPanel composePanel;

	private JPanel dragAndDropPanel;

	private final Workspace model;

	private final String DRAG_AND_DROP_MESSAGE = "Write the locations/actions that parametrize the pattern separated by comma";

	private javax.swing.JButton loadMission;
	private JLabel f1Label = new JLabel("Formula f1:");
	private JLabel f2Label = new JLabel("Formula f2:");

	private javax.swing.JPanel patternsJPanel;
	private JTextField input1;
	private JTextField input2;

	private JComboBox<String> f1;
	private JComboBox<String> f2;

	private JComboBox<String> patternCategorySelector;
	private JComboBox<String> patternBoxSelector;

	private final String LOAD_MISSION = "Add mission in library";

	private final static String PATTERN_SELECTION_PANEL = "Pattern selection panel";

	private JLabel patternInputsLabel;

	private JLabel patternInputsLabel2 = new JLabel("");


	private JLabel dragAndDropJLabel;


	// private JScrollPane availableActionsScroller;

	private JLabel intentLabel;
	private JPanel componentJPanel;
	private DefaultComboBoxModel<String> patternItems;


	public String getSelectedRobotl() {
		return this.getName();
	}

	public PatternSelectionPanel(Workspace model, String name) {
		super();

		this.setBackground(Color.RED);
		this.setMaximumSize(new Dimension((int) Toolkit.getDefaultToolkit().getScreenSize().getWidth(),
				(int) Toolkit.getDefaultToolkit().getScreenSize().getHeight()));
		this.setName(name);

		this.model = model;
		

		GridLayout gridlayout = new GridLayout(0, 2);

		componentJPanel = new JPanel();

		componentJPanel.setBackground(Co4robotsGUI.BACKGROUNDCOLOR);

		componentJPanel.setLayout(gridlayout);

		

		// actionsModel.addElement("raise_fire_alarm");
		// actionsModel.addElement("call_for_fika");

		

		patternItems = new DefaultComboBoxModel<>();

		patternBoxSelector = new JComboBox<String>(patternItems);

		input1 = new JTextField(40);
		input1.setDropMode(DropMode.INSERT);

		input2 = new JTextField(40);

		input2.setDropMode(DropMode.INSERT);

		JLabel ltlLabel = new JLabel("LTL formula:");
		ltlLabel.setForeground(Co4robotsGUI.GRAYCO4ROBOTS);
		ltlLabel.setBackground(Co4robotsGUI.BACKGROUNDCOLOR);
		ltlLabel.setFont(Co4robotsGUI.FONTTITLE);

		intentLabel = new JLabel("Intent:");
		intentLabel.setForeground(Co4robotsGUI.GRAYCO4ROBOTS);
		intentLabel.setFont(Co4robotsGUI.FONTTITLE);




		TitledBorder variationTitle = BorderFactory.createTitledBorder("Variations");
		variationTitle.setTitlePosition(TitledBorder.RIGHT);

		// ending the initials
		patternsJPanel = new javax.swing.JPanel();
		patternsJPanel.setBackground(Co4robotsGUI.BACKGROUNDCOLOR);


		this.loadMission = new javax.swing.JButton();

		this.loadMission.setText(LOAD_MISSION);

		this.loadMission.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {

				try {
					loadMission();

					showCoreMovementPatternView();
					// patternCategorySelector.setSelectedIndex(0);
					// patternBoxSelector.setSelectedIndex(0);
					input1.setText("");
					input2.setText("");

				} catch (Exception e) {
					e.printStackTrace();
					JOptionPane.showMessageDialog(null, e.getMessage());
				}

			}

		});


		JPanel patternPanel = new JPanel();

		patternPanel.setBackground(Co4robotsGUI.BACKGROUNDCOLOR);

		patternPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, PATTERN_SELECTION_PANEL, 2, 2,
				Co4robotsGUI.FONT, Co4robotsGUI.REDCO4ROBOTS));

		String[] patternCategories = { "Core Movement", "Triggers", "Avoidance", "Composition" };
		DefaultComboBoxModel<String> patternCategoriestItems = new DefaultComboBoxModel<>();

		Arrays.asList(patternCategories).stream().forEach(p -> patternCategoriestItems.addElement(p.toString()));

		patternCategorySelector = new JComboBox<String>(patternCategoriestItems);

		patternCategorySelector.setBackground(Co4robotsGUI.BACKGROUNDCOLOR);

		patternPanel.setLayout(new BoxLayout(patternPanel, BoxLayout.Y_AXIS));

		this.f1 = new JComboBox<String>();
		this.f2 = new JComboBox<String>();

		f1Label = new JLabel("Formula f1:");
		f1Label.setForeground(Co4robotsGUI.GRAYCO4ROBOTS);
		f1Label.setFont(Co4robotsGUI.FONTTITLE);

		f2Label = new JLabel("Formula f2:");
		f2Label.setForeground(Co4robotsGUI.GRAYCO4ROBOTS);
		f2Label.setFont(Co4robotsGUI.FONTTITLE);

		JLabel patternLabel = new JLabel("Pattern:");
		patternLabel.setForeground(Co4robotsGUI.GRAYCO4ROBOTS);
		patternLabel.setFont(Co4robotsGUI.FONTTITLE);

		JLabel patternCategoryLabel = new JLabel("Pattern category:");
		patternCategoryLabel.setForeground(Co4robotsGUI.GRAYCO4ROBOTS);
		patternCategoryLabel.setFont(Co4robotsGUI.FONTTITLE);

		patternPanel.setLayout(new BoxLayout(patternPanel, BoxLayout.PAGE_AXIS));

		patternPanel.setBackground(Co4robotsGUI.BACKGROUNDCOLOR);

		dragAndDropJLabel = new JLabel(DRAG_AND_DROP_MESSAGE);

		patternInputsLabel = new JLabel("Pattern inputs:");
		patternInputsLabel.setForeground(Co4robotsGUI.GRAYCO4ROBOTS);
		patternInputsLabel.setBackground(Co4robotsGUI.BACKGROUNDCOLOR);
		patternInputsLabel.setFont(Co4robotsGUI.FONTTITLE);

		componentJPanel.add(patternCategoryLabel);
		componentJPanel.add(patternCategorySelector);

		componentJPanel.add(patternLabel);
		JPanel ale=new JPanel();
		ale.setBackground(Co4robotsGUI.BACKGROUNDCOLOR);
		ale.setLayout(new GridLayout(0,1));
		ale.add(patternBoxSelector);
		componentJPanel.add(ale);

		// componentJPanel.add(ltlLabel);
		// componentJPanel.add(ltlFormula);

		input1JPanel = new Co4robotPanel(patternInputsLabel, input1);

		input2JPanel = new Co4robotPanel(patternInputsLabel2, input2);

		dragAndDropPanel = new Co4robotPanel(new JLabel(""), dragAndDropJLabel);
		
		composePanel = new Co4robotPanel(f1, f2);

		loadPanel = new Co4robotPanel(new JLabel(""), this.loadMission);

		patternPanel.add(componentJPanel);
		patternPanel.add(input1JPanel);
		patternPanel.add(input2JPanel);

		patternPanel.add(dragAndDropPanel);

		patternPanel.add(composePanel);
		patternPanel.add(loadPanel);

		this.setLayout(new GridLayout(0, 1));
		this.add(patternPanel);
		this.setBackground(Co4robotsGUI.BACKGROUNDCOLOR);

		patternBoxSelector.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				String selectedItem = (String) patternBoxSelector.getSelectedItem();
				if (selectedItem != null) {
					switch (selectedItem) {

					case "OR":
						showComposeView();
						break;

					case "AND":
						showComposeView();
						break;

					case "Wait":
						showTriggerView();
						break;

					case "Instantaneous_Reaction":
						showTriggerView();
						break;
					case "Delayed_Reaction":
						showTriggerView();
						break;
					case "Visit":
						showCoreMovementPatternView();
						break;
					case "Sequenced Visit":
						showCoreMovementPatternView();
						break;
					case "Ordered_Visit":
						showCoreMovementPatternView();
						break;
					case "Strict_Ordered_Visit":
						showCoreMovementPatternView();
						break;
					case "Fair_Visit":
						showCoreMovementPatternView();
						break;

					case "Patrolling":
						showCoreMovementPatternView();
						break;

					case "Sequenced_Patrolling":
						showCoreMovementPatternView();
						break;

					case "Ordered Patrolling":
						showCoreMovementPatternView();
						break;

					case "Strict_Ordered_Patrolling":
						showCoreMovementPatternView();
						break;

					case "Fair_Patrolling":
						showCoreMovementPatternView();
						break;

					case "Past_Avoidance":
						showAvoidanceView();
						break;
					case "Future_Avoidance":
						showAvoidanceView();
						break;
					case "Global_Avoidance":

						showCoreMovementPatternView();
					case "Lower_Restricted_Avoidance":

						showAvoidanceView();
					case "Upper_Restricted_Avoidance":

						showAvoidanceView();
					case "Exact_Restricted_Avoidance":

						showAvoidanceView();
					default:
						break;
					}

				}
			}
		});

		javax.swing.GroupLayout patternSelectionPanel = new javax.swing.GroupLayout(patternsJPanel);

		patternsJPanel.setLayout(patternSelectionPanel);

		patternSelectionPanel
				.setHorizontalGroup(patternSelectionPanel.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(patternSelectionPanel.createSequentialGroup()
								.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

		patternSelectionPanel
				.setVerticalGroup(patternSelectionPanel.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(patternSelectionPanel.createSequentialGroup()
								.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

		Arrays.asList(CoreMovementPatterns.values()).stream().forEach(p -> patternItems.addElement(p.toString()));

		patternCategorySelector.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String selectedItem = (String) patternCategorySelector.getSelectedItem();
				switch (selectedItem) {
				case "Core Movement":

					patternItems.removeAllElements();

					Arrays.asList(CoreMovementPatterns.values()).stream()
							.forEach(p -> patternItems.addElement(p.toString()));

					patternBoxSelector.setModel(patternItems);

					break;
				case "Triggers":
					patternItems.removeAllElements();

					Arrays.asList(Triggers.values()).stream().forEach(p -> patternItems.addElement(p.toString()));
					patternBoxSelector.setModel(patternItems);
					showTriggerView();
					break;
				case "Avoidance":
					patternItems.removeAllElements();
					Arrays.asList(Avoidance.values()).stream().forEach(p -> patternItems.addElement(p.toString()));
					patternBoxSelector.setModel(patternItems);
					showAvoidanceView();
					break;
				case "Composition":
					patternItems.removeAllElements();
					Arrays.asList(Composition.values()).stream().forEach(p -> patternItems.addElement(p.toString()));

					patternBoxSelector.setModel(patternItems);

					break;
				default:
					break;

				}

				patternBoxSelector.setPreferredSize(new Dimension(30, 30));
				patternBoxSelector.validate();
				patternBoxSelector.updateUI();
				patternBoxSelector.repaint();
				patternBoxSelector.doLayout();

			}
		});

	}

	private void showComposeView() {

		f1.removeAllItems();
		f2.removeAllItems();

		DefaultComboBoxModel<String> formulaeList1 = new DefaultComboBoxModel<String>();
		DefaultComboBoxModel<String> formulaeList2 = new DefaultComboBoxModel<String>();

		model.getMissions().stream().forEach(p -> formulaeList1.addElement(p));

		model.getMissions().stream().forEach(p -> formulaeList2.addElement(p));

		f1.setModel(formulaeList1);
		f2.setModel(formulaeList2);

		input1JPanel.setVisible(false);
		input2JPanel.setVisible(false);

		dragAndDropPanel.setVisible(false);

		locationsPanel.setVisible(false);

		actionsPanel.setVisible(false);

		composePanel.setVisible(true);
	}

	private void showCoreMovementPatternView() {

		input1JPanel.setVisible(true);
		input2JPanel.setVisible(false);

		dragAndDropPanel.setVisible(true);



		composePanel.setVisible(false);

	}

	private void showTriggerView() {

		input1JPanel.setVisible(true);
		input2JPanel.setVisible(true);

		dragAndDropPanel.setVisible(false);

		

		composePanel.setVisible(false);

	}

	private void showAvoidanceView() {

		input1JPanel.setVisible(true);
		input2JPanel.setVisible(true);

		dragAndDropPanel.setVisible(true);

		

		composePanel.setVisible(false);

	}

	private String getSelectedRobot() {
		return (String) this.getName();
	}

	public Pattern loadMission() throws Exception {

		String selectedIdem = (String) patternBoxSelector.getSelectedItem();
		String patternCategory = (String) patternCategorySelector.getSelectedItem();

		Pattern pattern = null;

		String locationsText = input1.getText().replaceAll(" ", "");
		String[] selectedLocations = locationsText.split(",");

		switch (patternCategory) {
		case "Triggers":
			Triggers p2 = Triggers.valueOf(selectedIdem.toUpperCase().replaceAll(" ", "_"));
			// computedltlformula = p2.getMission(selectedLocations);

			pattern = p2.getMission((String) input1.getText(), (String) input2.getText(), null, null);

			model.addMission((String) patternBoxSelector.getSelectedItem() + " (" + input1.getText() + ", "
					+ input2.getText() + ")", pattern);

			break;
		case "Avoidance":

			Avoidance p = Avoidance.valueOf(selectedIdem.toUpperCase().replaceAll(" ", "_"));

			if (selectedIdem.equals("Global_Avoidance")) {
				String[] inputs = new String[1];
				inputs[0] = input1.getText();

				pattern = new GlobalAvoidance(new PLAtom(robotName, input1.getText()));
			}

			if (selectedIdem.equals("Past_Avoidance")) {
				pattern = new PastAvoidance(new PCAtom(input1.getText()), new PLAtom(robotName, input2.getText()));
			}
			if (selectedIdem.equals("Future_Avoidance")) {
				pattern = new FutureAvoidance(new PCAtom(input1.getText()), new PLAtom(robotName, input2.getText()));
			}
			if (selectedIdem.equals("Lower_Restricted_Avoidance")) {
				pattern = new LowerRestrictedAvoidance(new PLAtom(robotName, input1.getText()),
						Integer.parseInt(input2.getText()));
			}
			if (selectedIdem.equals("Upper_Restricted_Avoidance")) {
				pattern = new UpperRestrictedAvoidance(new PLAtom(robotName, input1.getText()),
						Integer.parseInt(input2.getText()));
			}
			if (selectedIdem.equals("Exact_Restricted_Avoidance")) {
				pattern = new ExactRestrictedAvoidance(new PLAtom(robotName, input1.getText()),
						Integer.parseInt(input2.getText()));
			}

			break;
		case "Core Movement":
			CoreMovementPatterns p1 = CoreMovementPatterns.valueOf(selectedIdem.toUpperCase().replaceAll(" ", "_"));
			pattern = p1.getMission(selectedLocations);
	
			if(model.getAvailableLocations().containsAll(new HashSet<String>(Arrays.asList(selectedLocations)))){
				ArrayList<String> array = new ArrayList<String>(model.getMissions());
				String[] d = new String[array.size()];
				array.toArray(d);

				model.addMission((String) patternBoxSelector.getSelectedItem() + " (" + input1.getText() + ")", pattern);
			}
			else {
				JOptionPane.showMessageDialog(this, "Core movement patterns should be parametrized with locations. Check that all the locations have been defined.");
			}


			break;
		case "Composition":
			Composition c = Composition.valueOf(selectedIdem.toUpperCase().replaceAll(" ", "_"));

			pattern = c.getMission(model.getSpecification((String) f1.getSelectedItem()),
					model.getSpecification((String) f2.getSelectedItem()));

			model.addMission((String) patternBoxSelector.getSelectedItem() + " (" + f1.getSelectedItem() + ", "
					+ f2.getSelectedItem() + ")", pattern);

			ArrayList<String> array = new ArrayList<String>(model.getMissions());
			String[] d = new String[array.size()];
			array.toArray(d);

		default:
			break;
		}

		return pattern;
	}

}
