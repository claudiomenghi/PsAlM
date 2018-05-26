package se.got.panels;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map.Entry;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.DropMode;
import javax.swing.GroupLayout;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

import se.got.Avoidance;
import se.got.Co4robotsGUI;
import se.got.Composition;
import se.got.CoreMovementPatterns;
import se.got.MissionLibrary;
import se.got.Triggers;
import se.got.ltl.LTLFormula;
import se.got.ltl.atoms.LTLIPropositionalAtom;
import se.got.ltl.visitors.LTLFormulaToStringVisitor;

public class PatternSelectionPanel extends JPanel {

	public final static Color BACKGROUNDCOLOR = Color.WHITE;
	private static final Color redCo4robots = new Color(157, 15, 0);
	private static final Color grayCo4robots = new Color(105, 105, 105);
	private static final Font font = new Font("Arial", Font.PLAIN, 16);
	private static final Font fonttitle = new Font("Arial", Font.BOLD, 16);

	private final String DRAG_AND_DROP_MESSAGE = "Drag and drop the considered locations and actions and separate them with comma";

	private javax.swing.JButton loadMission;
	private JLabel f1Label = new JLabel("Formula f1:");
	private JLabel f2Label = new JLabel("Formula f2:");

	private javax.swing.JPanel patternsJPanel;
	private JTextField input1;
	private JTextField input2;

	private JTextField actions;
	private JComboBox<String> f1;
	private JComboBox<String> f2;

	private JComboBox<String> patternCategorySelector;
	private JComboBox<String> patternBoxSelector;
	private JTextArea ltlFormula;

	private final String LOAD_MISSION = "Add mission in library";

	private final static String PATTERN_SELECTION_PANEL = "Pattern selection panel";

	private static JLabel patternInputsLabel;

	private static JLabel availableLocationsLabel;

	private static JLabel dragAndDropJLabel;

	private static JLabel availableActionsLabel;

	private static JLabel intentLabel;
	public static JList<String> availableActions = new JList<String>();

	public static JList<String> availableLocations = new JList<String>();
	private JPanel patternInputsPanel;

	private JPanel actionJPanel;
	private JPanel locationJPanel;
	private JTextArea intentText;
	private final DefaultComboBoxModel<String> patternItems;

	public static DefaultListModel<String> actionsModel = new DefaultListModel<>();

	public static DefaultListModel<String> locationsModel = new DefaultListModel<>();

	public PatternSelectionPanel() {
		super();

		locationsModel.addElement("coffe");
		//locationsModel.addElement("patrizio_office");
		locationsModel.addElement("claudio_office");
		//locationsModel.addElement("kitchen");
		//locationsModel.addElement("corridor");
		//locationsModel.addElement("area1");
		//locationsModel.addElement("area2");

		
		
		actionsModel.addElement("ask_load_coffe");
		actionsModel.addElement("ask_unload_coffe");
		//actionsModel.addElement("raise_fire_alarm");
		//actionsModel.addElement("call_for_fika");

		availableActions.setModel(actionsModel);
		availableActions.setBorder(new LineBorder(Color.BLACK));
		

		availableLocations.setModel(locationsModel);
		availableLocations.setBorder(new LineBorder(Color.BLACK));
		
		
		patternItems = new DefaultComboBoxModel<>();

		patternBoxSelector = new JComboBox<String>(patternItems);

		patternInputsPanel = new JPanel();

		patternInputsPanel.setBackground(BACKGROUNDCOLOR);

		patternInputsPanel.setLayout(new BoxLayout(patternInputsPanel, BoxLayout.PAGE_AXIS));

		input1 = new JTextField(80);
		input1.setDropMode(DropMode.INSERT);

		input2 = new JTextField(80);
		input2.setDropMode(DropMode.INSERT);

		patternInputsPanel.add(input1);
		patternInputsPanel.add(input2);

		patternInputsLabel = new JLabel("Pattern inputs:");
		patternInputsLabel.setForeground(grayCo4robots);
		patternInputsLabel.setFont(fonttitle);

		ltlFormula = new JTextArea();
		JLabel ltlLabel = new JLabel("LTL formula:");
		ltlLabel.setForeground(grayCo4robots);
		ltlLabel.setFont(fonttitle);

		intentText = new JTextArea();
		intentText.setLineWrap(true);

		intentLabel = new JLabel("Intent:");
		intentLabel.setForeground(grayCo4robots);
		intentLabel.setFont(fonttitle);

		availableActionsLabel = new JLabel("Available actions:");
		availableActionsLabel.setForeground(grayCo4robots);
		availableActionsLabel.setFont(fonttitle);

		availableLocationsLabel = new JLabel("Available locations:");
		availableLocationsLabel.setForeground(grayCo4robots);
		availableLocationsLabel.setFont(fonttitle);

		TitledBorder variationTitle = BorderFactory.createTitledBorder("Variations");
		variationTitle.setTitlePosition(TitledBorder.RIGHT);

		// ending the initials
		patternsJPanel = new javax.swing.JPanel();
		patternsJPanel.setBackground(BACKGROUNDCOLOR);

		availableActions.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		availableActions.setLayoutOrientation(JList.HORIZONTAL_WRAP);
		availableActions.setAutoscrolls(true);
		availableActions.setMaximumSize(new Dimension(30, 20));
		availableActions.setSelectedIndex(0);
		availableActions.setVisible(false);

		availableActions.setFixedCellHeight(50);
		availableActions.setFixedCellWidth(100);

		
		availableLocations.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		availableLocations.setLayoutOrientation(JList.HORIZONTAL_WRAP);
		availableLocations.setAutoscrolls(true);
		availableLocations.setMaximumSize(new Dimension(30, 20));
		availableLocations.setSelectedIndex(0);

		availableLocations.setFixedCellHeight(50);
		availableLocations.setFixedCellWidth(100);
		
		this.loadMission = new javax.swing.JButton();

		this.loadMission.setText(LOAD_MISSION);

		this.loadMission.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {

				try {
					loadMission();
					repaint();
				} catch (Exception e) {
					e.printStackTrace();
					JOptionPane.showMessageDialog(null, e.getMessage());
				}

			}

		});

		availableActions.setVisibleRowCount(1);
		availableLocations.setVisibleRowCount(1);

		JScrollPane availableActionsScroller = new JScrollPane(availableActions);
		JPanel actionAvailable = new JPanel();
		availableActionsScroller.setPreferredSize(new Dimension(30, 20));
		actionAvailable.setLayout(new GridBagLayout());
		actionAvailable.setBackground(Color.WHITE);
		actionAvailable.add(availableActions);
		availableActions.setDragEnabled(true);

		JScrollPane availableLocationsScroller = new JScrollPane(availableLocations);
		JPanel locationsAvailable = new JPanel();
		availableLocationsScroller.setPreferredSize(new Dimension(30, 20));
		locationsAvailable.setLayout(new GridBagLayout());
		locationsAvailable.setBackground(Color.WHITE);
		locationsAvailable.add(availableLocations);
		availableLocations.setDragEnabled(true);

		patternInputsPanel.setBackground(BACKGROUNDCOLOR);

		JPanel patternPanel = new JPanel();

		patternPanel.setBackground(Color.WHITE);

		patternPanel.setBorder(
				javax.swing.BorderFactory.createTitledBorder(null, PATTERN_SELECTION_PANEL, 2, 2, font, redCo4robots));

		String[] patternCategories = { "Core Movement", "Triggers", "Avoidance", "Composition" };
		DefaultComboBoxModel<String> patternCategoriestItems = new DefaultComboBoxModel<>();

		Arrays.asList(patternCategories).stream().forEach(p -> patternCategoriestItems.addElement(p.toString()));

		patternCategorySelector = new JComboBox<String>(patternCategoriestItems);

		patternCategorySelector.setBackground(BACKGROUNDCOLOR);

		javax.swing.GroupLayout lay = new javax.swing.GroupLayout(patternPanel);

		this.f1 = new JComboBox<String>();
		this.f2 = new JComboBox<String>();

		f1Label = new JLabel("Formula f1:");
		f1Label.setForeground(grayCo4robots);
		f1Label.setFont(fonttitle);
		f1Label.setVisible(false);

		f2Label = new JLabel("Formula f2:");
		f2Label.setForeground(grayCo4robots);
		f2Label.setFont(fonttitle);
		f2Label.setVisible(false);

		JLabel patternLabel = new JLabel("Pattern:");
		patternLabel.setForeground(grayCo4robots);
		patternLabel.setFont(fonttitle);

		JLabel patternCategoryLabel = new JLabel("Pattern category:");
		patternCategoryLabel.setForeground(grayCo4robots);
		patternCategoryLabel.setFont(fonttitle);

		actionJPanel = new JPanel();

		locationJPanel = new JPanel();

		dragAndDropJLabel = new JLabel(DRAG_AND_DROP_MESSAGE);
		lay.setHorizontalGroup(lay.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(patternCategoryLabel)
				.addComponent(patternCategorySelector).addComponent(patternLabel).addComponent(patternBoxSelector)
				.addComponent(patternInputsLabel).addComponent(patternInputsPanel).addComponent(dragAndDropJLabel)
				.addComponent(actionJPanel).addComponent(availableLocationsLabel).addComponent(locationsAvailable)
				.addComponent(f1Label).addComponent(f1).addComponent(f2Label).addComponent(f2).addComponent(ltlLabel)
				.addComponent(ltlFormula).addComponent(intentLabel).addComponent(intentText)
				.addComponent(this.loadMission));

		lay.setVerticalGroup(lay.createSequentialGroup().addComponent(patternCategoryLabel)
				.addComponent(patternCategorySelector).addComponent(patternLabel).addComponent(patternBoxSelector)
				.addComponent(patternInputsLabel).addComponent(patternInputsPanel).addComponent(dragAndDropJLabel)
				.addComponent(actionJPanel).addComponent(availableLocationsLabel).addComponent(locationsAvailable)
				.addComponent(f1Label).addComponent(f1).addComponent(f2Label).addComponent(f2).addComponent(ltlLabel)
				.addComponent(ltlFormula).addComponent(intentLabel).addComponent(intentText)
				.addComponent(this.loadMission));

		patternPanel.setLayout(lay);

		actionJPanel.setBackground(BACKGROUNDCOLOR);

		actionJPanel.setLayout(new BoxLayout(actionJPanel, BoxLayout.LINE_AXIS));

		actionJPanel.add(availableActionsLabel, BorderLayout.EAST);
		actionJPanel.add(actionAvailable, BorderLayout.EAST);

		actionJPanel.setVisible(false);

		locationJPanel.setBackground(BACKGROUNDCOLOR);

		locationJPanel.setLayout(new BoxLayout(locationJPanel, BoxLayout.LINE_AXIS));

		locationJPanel.add(availableLocationsLabel, BorderLayout.EAST);
		locationJPanel.add(locationsAvailable, BorderLayout.EAST);

		locationJPanel.setVisible(true);

		f1.setVisible(false);
		f2.setVisible(false);

		this.setLayout(new BorderLayout());
		this.add(patternPanel, BorderLayout.CENTER);

		patternBoxSelector.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				String selectedItem = (String) patternBoxSelector.getSelectedItem();
				if (selectedItem != null) {
					switch (selectedItem) {

					case "OR":
						intentText.setText(Composition.OR.getDescription());
						showComposeView();
						break;

					case "AND":
						intentText.setText(Composition.AND.getDescription());
						showComposeView();
						break;

					case "Wait":
						intentText.setText(Triggers.WAIT.getDescription());
						showTriggerView();
						break;

					case "Instantaneous_Reaction":
						intentText.setText(Triggers.INSTANTANEOUS_REACTION.getDescription());
						showTriggerView();
						break;
					case "Delayed_Reaction":
						intentText.setText(Triggers.DELAYED_REACTION.getDescription());
						showTriggerView();
						break;
					case "Visit":
						intentText.setText(CoreMovementPatterns.VISIT.getDescription());
						showCoreMovementPatternView();
						break;
					case "Sequenced Visit":
						intentText.setText(CoreMovementPatterns.SEQUENCED_VISIT.getDescription());
						showCoreMovementPatternView();
						break;
					case "Ordered_Visit":
						intentText.setText(CoreMovementPatterns.ORDERED_VISIT.getDescription());
						showCoreMovementPatternView();
						break;
					case "Strict_Ordered_Visit":
						intentText.setText(CoreMovementPatterns.STRICT_ORDERED_VISIT.getDescription());
						showCoreMovementPatternView();
						break;
					case "Fair_Visit":
						intentText.setText(CoreMovementPatterns.FAIR_VISIT.getDescription());
						showCoreMovementPatternView();
						break;

					case "Patrolling":
						intentText.setText(CoreMovementPatterns.PATROLLING.getDescription());
						showCoreMovementPatternView();
						break;

					case "Sequenced_Patrolling":
						intentText.setText(CoreMovementPatterns.SEQUENCED_PATROLLING.getDescription());
						showCoreMovementPatternView();
						break;

					case "Ordered Patrolling":
						intentText.setText(CoreMovementPatterns.ORDERED_PATROLLING.getDescription());
						showCoreMovementPatternView();
						break;

					case "Strict_Ordered_Patrolling":
						intentText.setText(CoreMovementPatterns.STRICT_ORDERED_PATROLLING.getDescription());
						showCoreMovementPatternView();
						break;

					case "Fair_Patrolling":
						intentText.setText(CoreMovementPatterns.FAIR_PATROLLING.getDescription());
						showCoreMovementPatternView();
						break;

					case "Past_Avoidance":
						intentText.setText(Avoidance.PAST_AVOIDANCE.getDescription());
						showAvoidanceView();
						break;
					case "Future_Avoidance":
						intentText.setText(Avoidance.FUTURE_AVOIDANCE.getDescription());
						showAvoidanceView();
						break;
					case "Global_Avoidance":

						intentText.setText(Avoidance.GLOBAL_AVOIDANCE.getDescription());
						showCoreMovementPatternView();
					case "Lower_Restricted_Avoidance":

						intentText.setText(Avoidance.LOWER_RESTRICTED_AVOIDANCE.getDescription());
						showAvoidanceView();
					case "Upper_Restricted_Avoidance":

						intentText.setText(Avoidance.UPPER_RESTRICTED_AVOIDANCE.getDescription());
						showAvoidanceView();
					case "Exact_Restricted_Avoidance":

						intentText.setText(Avoidance.EXACT_RESTRICTED_AVOIDANCE.getDescription());
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
					patternInputsPanel.setVisible(true);
					ltlFormula.setVisible(true);
					intentText.setVisible(true);

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
					patternInputsPanel.setVisible(false);
					intentText.setVisible(true);
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

		MissionLibrary.mapSpecificationFormula.entrySet().stream().forEach(p -> formulaeList1.addElement(p.getKey()));
		MissionLibrary.mapSpecificationFormula.entrySet().stream().forEach(p -> formulaeList2.addElement(p.getKey()));

		f1.setModel(formulaeList1);
		f2.setModel(formulaeList2);

		f1.setVisible(true);
		f2.setVisible(true);
		f1Label.setVisible(true);
		f2Label.setVisible(true);

		patternInputsLabel.setVisible(false);
		availableActionsLabel.setVisible(false);
		intentLabel.setVisible(false);
		availableActions.setVisible(false);
		dragAndDropJLabel.setVisible(false);
		patternInputsPanel.setVisible(false);
		ltlFormula.setVisible(false);
		intentText.setVisible(false);
	}

	private void showCoreMovementPatternView() {

		f1Label.setVisible(false);
		f2Label.setVisible(false);
		f1.setVisible(false);
		f2.setVisible(false);
		patternInputsLabel.setVisible(true);
		availableActionsLabel.setVisible(true);
		intentLabel.setVisible(true);
		availableActions.setVisible(true);
		dragAndDropJLabel.setVisible(true);
		patternInputsPanel.setVisible(true);
		ltlFormula.setVisible(true);
		intentText.setVisible(true);

		actionJPanel.setVisible(false);

		input2.setVisible(false);

	}

	private void showTriggerView() {

		f1Label.setVisible(false);
		f2Label.setVisible(false);
		f1.setVisible(false);
		f2.setVisible(false);
		patternInputsLabel.setVisible(true);
		availableActionsLabel.setVisible(true);
		intentLabel.setVisible(true);
		availableActions.setVisible(true);
		dragAndDropJLabel.setVisible(true);
		patternInputsPanel.setVisible(true);
		ltlFormula.setVisible(true);
		intentText.setVisible(true);

		actionJPanel.setVisible(true);

		input2.setVisible(true);
	}

	private void showAvoidanceView() {

		f1Label.setVisible(false);
		f2Label.setVisible(false);
		f1.setVisible(false);
		f2.setVisible(false);
		patternInputsLabel.setVisible(true);
		availableActionsLabel.setVisible(true);
		intentLabel.setVisible(true);
		availableActions.setVisible(true);
		dragAndDropJLabel.setVisible(true);
		patternInputsPanel.setVisible(true);
		ltlFormula.setVisible(true);
		intentText.setVisible(true);

		actionJPanel.setVisible(true);

		input2.setVisible(true);
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

			computedltlformula = p2.getMission(new LTLIPropositionalAtom((String) input1.getText()),
					new LTLIPropositionalAtom((String) input2.getText()));

			intentText.setText(p2.getDescription());

			ltlFormula.setText(computedltlformula.accept(new LTLFormulaToStringVisitor()));

			MissionLibrary.mapSpecificationFormula.put((String) patternBoxSelector.getSelectedItem() + " ("
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
			intentText.setText(p.getDescription());

			ltlFormula.setText(computedltlformula.accept(new LTLFormulaToStringVisitor()));

			if (selectedIdem.equals("Global_Avoidance")) {
				MissionLibrary.mapSpecificationFormula.put(
						(String) patternBoxSelector.getSelectedItem() + " (" + input1.getText() + ")",
						computedltlformula);
			} else {
				MissionLibrary.mapSpecificationFormula.put((String) patternBoxSelector.getSelectedItem() + " ("
						+ input1.getText() + ", " + input2.getText() + ")", computedltlformula);
			}
			List<String> array = new ArrayList<String>(MissionLibrary.mapSpecificationFormula.keySet());
			String[] d = new String[array.size()];
			array.toArray(d);

			break;
		case "Core Movement":
			CoreMovementPatterns p1 = CoreMovementPatterns.valueOf(selectedIdem.toUpperCase().replaceAll(" ", "_"));
			computedltlformula = p1.getMission(selectedLocations);
			intentText.setText(p1.getDescription());

			ltlFormula.setText(computedltlformula.accept(new LTLFormulaToStringVisitor()));

			array = new ArrayList<String>(MissionLibrary.mapSpecificationFormula.keySet());
			d = new String[array.size()];
			array.toArray(d);

			MissionLibrary.mapSpecificationFormula.put(
					(String) patternBoxSelector.getSelectedItem() + " (" + input1.getText() + ")", computedltlformula);

			break;
		case "Composition":
			Composition c = Composition.valueOf(selectedIdem.toUpperCase().replaceAll(" ", "_"));
			intentText.setText(c.getDescription());

			computedltlformula = c.getMission(MissionLibrary.mapSpecificationFormula.get((String) f1.getSelectedItem()),
					MissionLibrary.mapSpecificationFormula.get((String) f2.getSelectedItem()));

			ltlFormula.setText(computedltlformula.accept(new LTLFormulaToStringVisitor()));

			MissionLibrary.mapSpecificationFormula.put((String) patternBoxSelector.getSelectedItem() + " ("
					+ f1.getSelectedItem() + ", " + f2.getSelectedItem() + ")", computedltlformula);

			array = new ArrayList<String>(MissionLibrary.mapSpecificationFormula.keySet());
			d = new String[array.size()];
			array.toArray(d);

		default:
			break;
		}

		Co4robotsGUI.missionLibraryModel = new DefaultListModel<>();
		for (Entry<String, LTLFormula> e : MissionLibrary.mapSpecificationFormula.entrySet()) {
			Co4robotsGUI.missionLibraryModel.addElement(e.getKey());
		}

		Co4robotsGUI.missionLibrary.setModel(Co4robotsGUI.missionLibraryModel);
		Co4robotsGUI.missionLibrary.setModel(Co4robotsGUI.missionLibraryModel);
		System.out.println("End load mission" + Co4robotsGUI.missionLibraryModel);

		Co4robotsGUI.missionLibrary.repaint();
		Co4robotsGUI.missionLibrary.repaint();
		repaint();
		return computedltlformula;
	}

	private void cleanPanels() {
		;
		intentText.setText("");
		ltlFormula.setText("");
	}
}
