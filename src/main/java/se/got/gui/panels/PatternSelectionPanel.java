package se.got.gui.panels;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
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

import se.got.Avoidance;
import se.got.Co4robotsGUI;
import se.got.Composition;
import se.got.CoreMovementPatterns;
import se.got.Triggers;
import se.got.ltl.LTLFormula;
import se.got.ltl.atoms.LTLPropositionalAtom;
import se.got.ltl.visitors.LTLFormulaToStringVisitor;
import se.got.model.Workspace;

public class PatternSelectionPanel extends JPanel {

	private JPanel loadPanel;

	private JPanel actionsPanel;
	private JPanel locationsPanel;

	private JPanel input1JPanel;

	private JPanel input2JPanel;

	private JPanel composePanel;

	private JPanel dragAndDropPanel;

	private final Workspace model;

	private final String DRAG_AND_DROP_MESSAGE = "Drag and drop the considered locations and actions and separate them with comma";

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

	private JTextField ltlFormula;

	private final String LOAD_MISSION = "Add mission in library";

	private final static String PATTERN_SELECTION_PANEL = "Pattern selection panel";

	private JLabel patternInputsLabel;

	private JLabel patternInputsLabel2 = new JLabel("");

	private JLabel availableLocationsLabel;

	private JLabel dragAndDropJLabel;

	private JLabel availableActionsLabel;

	// private JScrollPane availableActionsScroller;

	private JLabel intentLabel;
	private JList<String> availableActions = new JList<String>();

	private JList<String> availableLocations = new JList<String>();
	private JPanel componentJPanel;
	private final DefaultComboBoxModel<String> patternItems;

	private DefaultListModel<String> actionsModel = new DefaultListModel<>();

	private DefaultListModel<String> locationsModel = new DefaultListModel<>();

	public String getSelectedRobotl() {
		return this.getName();
	}

	public PatternSelectionPanel(Workspace model, String name) {
		super();

		this.setMaximumSize(new Dimension((int) Toolkit.getDefaultToolkit().getScreenSize().getWidth(),(int) Toolkit.getDefaultToolkit().getScreenSize().getHeight() ));
		this.setName(name);

		this.model = model;
		locationsModel.addElement("r1");
		locationsModel.addElement("r2");
		locationsModel.addElement("r3");
		locationsModel.addElement("r4");

		GridLayout gridlayout = new GridLayout(0, 2);

		componentJPanel = new JPanel();

		componentJPanel.setBackground(Co4robotsGUI.BACKGROUNDCOLOR);

		componentJPanel.setLayout(gridlayout);

		actionsModel.addElement("call_for_loading");
		actionsModel.addElement("call_for_unloading");

		actionsModel.addElement("col_loading");
		actionsModel.addElement("col_unloading");


		// actionsModel.addElement("raise_fire_alarm");
		// actionsModel.addElement("call_for_fika");

		availableActions.setModel(actionsModel);
		availableActions.setBorder(new LineBorder(Color.BLACK));

		availableLocations.setModel(locationsModel);
		availableLocations.setBorder(new LineBorder(Color.BLACK));

		patternItems = new DefaultComboBoxModel<>();

		patternBoxSelector = new JComboBox<String>(patternItems);

		input1 = new JTextField(40);
		input1.setDropMode(DropMode.INSERT);

		input2 = new JTextField(40);

		input2.setDropMode(DropMode.INSERT);

		ltlFormula = new JTextField(40);
		JLabel ltlLabel = new JLabel("LTL formula:");
		ltlLabel.setForeground(Co4robotsGUI.GRAYCO4ROBOTS);
		ltlLabel.setBackground(Co4robotsGUI.BACKGROUNDCOLOR);
		ltlLabel.setFont(Co4robotsGUI.FONTTITLE);

		intentLabel = new JLabel("Intent:");
		intentLabel.setForeground(Co4robotsGUI.GRAYCO4ROBOTS);
		intentLabel.setFont(Co4robotsGUI.FONTTITLE);

		availableActionsLabel = new JLabel("Available actions:");
		availableActionsLabel.setForeground(Co4robotsGUI.GRAYCO4ROBOTS);
		availableActionsLabel.setFont(Co4robotsGUI.FONTTITLE);

		availableLocationsLabel = new JLabel("Available locations:");
		availableLocationsLabel.setForeground(Co4robotsGUI.GRAYCO4ROBOTS);
		availableLocationsLabel.setFont(Co4robotsGUI.FONTTITLE);

		TitledBorder variationTitle = BorderFactory.createTitledBorder("Variations");
		variationTitle.setTitlePosition(TitledBorder.RIGHT);

		// ending the initials
		patternsJPanel = new javax.swing.JPanel();
		patternsJPanel.setBackground(Co4robotsGUI.BACKGROUNDCOLOR);

		availableActions.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		availableActions.setLayoutOrientation(JList.HORIZONTAL_WRAP);
		availableActions.setAutoscrolls(true);
		availableActions.setSelectedIndex(0);
		availableActions.setFixedCellHeight(50);
		availableActions.setFixedCellWidth(120);
		availableActions.setModel(actionsModel);
		availableActions.setVisibleRowCount(1);
		availableActions.setDragEnabled(true);

		
		
		JScrollPane scrollPane = new JScrollPane();
	    scrollPane.getViewport().add(availableActions);
	    
		// availableActionsScroller=new JScrollPane(availableActions);

		availableLocations.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		availableLocations.setLayoutOrientation(JList.HORIZONTAL_WRAP);
		availableLocations.setAutoscrolls(true);
		availableLocations.setSelectedIndex(0);

		availableLocations.setFixedCellHeight(50);
		availableLocations.setFixedCellWidth(100);
		availableLocations.setModel(locationsModel);

		availableLocations.setVisibleRowCount(1);
		availableLocations.setDragEnabled(true);

		this.loadMission = new javax.swing.JButton();

		this.loadMission.setText(LOAD_MISSION);

		this.loadMission.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {

				try {
					loadMission();

					repaint();
					showCoreMovementPatternView();
					patternCategorySelector.setSelectedIndex(0);
					patternBoxSelector.setSelectedIndex(0);
					input1.setText("");
					input2.setText("");
				} catch (Exception e) {
					e.printStackTrace();
					JOptionPane.showMessageDialog(null, e.getMessage());
				}

			}

		});

		JPanel locationsAvailable = new JPanel();
		locationsAvailable.add(availableLocations);

		locationsAvailable.setBackground(Co4robotsGUI.BACKGROUNDCOLOR);

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
		componentJPanel.add(patternBoxSelector);

		// componentJPanel.add(ltlLabel);
		// componentJPanel.add(ltlFormula);

		input1JPanel = new Co4robotPanel(patternInputsLabel, input1);

		input2JPanel = new Co4robotPanel(patternInputsLabel2, input2);

		dragAndDropPanel = new Co4robotPanel(new JLabel(""), dragAndDropJLabel);
		locationsPanel = new Co4robotPanel(availableLocationsLabel, availableLocations);
		actionsPanel = new Co4robotPanel(availableActionsLabel, scrollPane);
		composePanel = new Co4robotPanel(f1, f2);

		loadPanel = new Co4robotPanel(new JLabel(""), this.loadMission);

		patternPanel.add(componentJPanel);
		patternPanel.add(input1JPanel);
		patternPanel.add(input2JPanel);

		patternPanel.add(dragAndDropPanel);

		patternPanel.add(locationsPanel);
		patternPanel.add(actionsPanel);
		patternPanel.add(composePanel);
		patternPanel.add(loadPanel);

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
				cleanPanels();
				switch (selectedItem) {
				case "Core Movement":

					patternItems.removeAllElements();

					Arrays.asList(CoreMovementPatterns.values()).stream()
							.forEach(p -> patternItems.addElement(p.toString()));

					patternBoxSelector.setModel(patternItems);
					ltlFormula.setVisible(true);

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
					ltlFormula.setVisible(true);

					break;
				default:
					break;

				}

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

		model.getRobotMissions(this.getSelectedRobot()).entrySet().stream()
				.forEach(p -> formulaeList1.addElement(p.getKey()));
		model.getRobotMissions(this.getSelectedRobot()).entrySet().stream()
				.forEach(p -> formulaeList2.addElement(p.getKey()));

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

		locationsPanel.setVisible(true);

		actionsPanel.setVisible(false);

		composePanel.setVisible(false);

	}

	private void showTriggerView() {

		input1JPanel.setVisible(true);
		input2JPanel.setVisible(true);

		dragAndDropPanel.setVisible(false);

		locationsPanel.setVisible(false);

		actionsPanel.setVisible(true);

		composePanel.setVisible(false);

	}

	private void showAvoidanceView() {

		input1JPanel.setVisible(true);
		input2JPanel.setVisible(true);

		dragAndDropPanel.setVisible(true);

		locationsPanel.setVisible(false);

		actionsPanel.setVisible(true);

		composePanel.setVisible(false);

	}

	private String getSelectedRobot() {
		return (String) this.getName();
	}

	public LTLFormula loadMission() throws Exception {

		String selectedIdem = (String) patternBoxSelector.getSelectedItem();
		String patternCategory = (String) patternCategorySelector.getSelectedItem();

		LTLFormula computedltlformula = LTLFormula.TRUE;

		String locationsText = input1.getText().replaceAll(" ", "");
		String[] selectedLocations = locationsText.split(",");

		switch (patternCategory) {
		case "Triggers":
			Triggers p2 = Triggers.valueOf(selectedIdem.toUpperCase().replaceAll(" ", "_"));
			// computedltlformula = p2.getMission(selectedLocations);

			computedltlformula = p2.getMission(new LTLPropositionalAtom((String) input1.getText()),
					new LTLPropositionalAtom((String) input2.getText()));

			ltlFormula.setText(computedltlformula.accept(new LTLFormulaToStringVisitor()));

			model.addMission(this.getSelectedRobot(), (String) patternBoxSelector.getSelectedItem() + " ("
					+ input1.getText() + ", " + input2.getText() + ")", computedltlformula);

			break;
		case "Avoidance":

			Avoidance p = Avoidance.valueOf(selectedIdem.toUpperCase().replaceAll(" ", "_"));

			if (selectedIdem.equals("Global_Avoidance")) {
				String[] inputs = new String[1];
				inputs[0] = input1.getText();
				computedltlformula = p.getMission(inputs);
			} else {
				String[] inputs = new String[2];
				inputs[0] = input1.getText();
				inputs[1] = input2.getText();
				computedltlformula = p.getMission(inputs);
			}

			ltlFormula.setText(computedltlformula.accept(new LTLFormulaToStringVisitor()));

			if (selectedIdem.equals("Global_Avoidance")) {

				model.addMission(this.getSelectedRobot(),
						(String) patternBoxSelector.getSelectedItem() + " (" + input1.getText() + ")",
						computedltlformula);
			} else {
				model.addMission(this.getSelectedRobot(), (String) patternBoxSelector.getSelectedItem() + " ("
						+ input1.getText() + ", " + input2.getText() + ")", computedltlformula);
			}
			List<String> array = new ArrayList<String>(model.getRobotMissions(this.getSelectedRobot()).keySet());
			String[] d = new String[array.size()];
			array.toArray(d);

			break;
		case "Core Movement":
			CoreMovementPatterns p1 = CoreMovementPatterns.valueOf(selectedIdem.toUpperCase().replaceAll(" ", "_"));
			computedltlformula = p1.getMission(selectedLocations);

			ltlFormula.setText(computedltlformula.accept(new LTLFormulaToStringVisitor()));

			array = new ArrayList<String>(model.getRobotMissions(this.getSelectedRobot()).keySet());
			d = new String[array.size()];
			array.toArray(d);

			model.addMission(this.getSelectedRobot(),
					(String) patternBoxSelector.getSelectedItem() + " (" + input1.getText() + ")", computedltlformula);

			break;
		case "Composition":
			Composition c = Composition.valueOf(selectedIdem.toUpperCase().replaceAll(" ", "_"));

			computedltlformula = c.getMission(
					model.getRobotMissions(this.getSelectedRobot()).get((String) f1.getSelectedItem()),
					model.getRobotMissions(this.getSelectedRobot()).get((String) f2.getSelectedItem()));

			ltlFormula.setText(computedltlformula.accept(new LTLFormulaToStringVisitor()));

			model.addMission(this.getSelectedRobot(), (String) patternBoxSelector.getSelectedItem() + " ("
					+ f1.getSelectedItem() + ", " + f2.getSelectedItem() + ")", computedltlformula);

			array = new ArrayList<String>(model.getRobotMissions(this.getSelectedRobot()).keySet());
			d = new String[array.size()];
			array.toArray(d);

		default:
			break;
		}

		return computedltlformula;
	}

	private void cleanPanels() {
		;
		ltlFormula.setText("");
	}
}
