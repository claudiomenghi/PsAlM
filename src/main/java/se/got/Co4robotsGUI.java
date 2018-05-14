/**ro
 * Copyright (C) 2011-20Olo14 The University of Gotheborg
 *
 * These file have been developed as a part of the co4robots project.
 * It is a tool
 */
package se.got;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.DropMode;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.UIManager;
import javax.swing.border.TitledBorder;
import javax.swing.plaf.ColorUIResource;

import se.got.ltl.LTLFormula;
import se.got.ltl.visitors.LTLFormulaToStringVisitor;

public class Co4robotsGUI extends javax.swing.JFrame {

	private static final String INIT_POSITION_MESSAGE = "Insert the positions to be considered separated by a comma";

	private static final int FRAME_INIT_HEIGTH = 600;

	private static final int FRAME_INIT_WIDTH = 800;

	private static final Color redCo4robots = new Color(157, 15, 0);
	private static final Color grayCo4robots = new Color(105, 105, 105);
	private static final Font font = new Font("Arial", Font.PLAIN, 16);
	private static final Font fonttitle = new Font("Arial", Font.BOLD, 16);

	
	private static DefaultListModel<String> listModel=new DefaultListModel<>();
	
	
	private static JList<String> list = new JList<String>(); // data has type Object[]
	
	private static DefaultListModel<String> missionModel=new DefaultListModel<>();
	
	private static JList<String> missionItem = new JList<String>(); // data has type Object[]

	
	private JPanel locationPanel;
	private static JTextField ipTextField;
	private static JTextField portTextField;
	private static JTextField publisherportTextField;

	private JPanel remotePanel;
	private static int FORMULA_COUNTER = 1;

	private static Map<String, LTLFormula> formulae = new HashMap<>();



	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private final static String TITLE = "PsAlMISt: Pattern bAsed MIssion Specifier";
	private final static String SEND_MISSION = "Send mission";
	private final static String LOAD_MISSION = "Add mission in library";

	private final static String PATTERN_SELECTION_PANEL = "Pattern selection panel";

	private static JList<String> propertyList;

	private JComboBox<String> patternCategorySelector;
	private JComboBox<String> patternBoxSelector;
	private JTextArea ltlFormula;

	private static Subscriber sub;

	private JTextArea intentText;
	private JTextArea examples;
	private JTextArea occurences;
	private JComboBox<String> f1;
	private JComboBox<String> f2;
	private final DefaultComboBoxModel<String> patternItems;

	private JTextField locations;
	public final static Color BACKGROUNDCOLOR = Color.WHITE;

	public Co4robotsGUI(String ip, String port) {
		super();

		list.setModel(listModel);
		
		this.getContentPane().setBackground(BACKGROUNDCOLOR);

		UIManager.put("ComboBox.background", new ColorUIResource(Color.WHITE));

		patternItems = new DefaultComboBoxModel<>();

		this.f1 = new JComboBox<String>();
		this.f2 = new JComboBox<String>();
		String[] elements = { "" };
		f1 = new JComboBox<>();

		f1.setBorder(javax.swing.BorderFactory.createTitledBorder("Formula f1"));
		f1.setToolTipText("");

		f2.setBorder(javax.swing.BorderFactory.createTitledBorder("Formula f2"));
		f2.setToolTipText("");

		TitledBorder movementPatternTitle = BorderFactory.createTitledBorder("Property  List");
		movementPatternTitle.setTitlePosition(TitledBorder.RIGHT);

		propertyList = new JList<String>(elements);
		propertyList.setBackground(Color.GRAY);

		propertyList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		initComponents(ip, port);
		System.out.println("GUI loaded");

	}

	// Entry point

	public static void main(String args[]) {
		/* Create and display the form */
		final String ip = args.length > 0 ? args[0] : "127.0.0.1";
		final String port = args.length > 0 ? args[1] : "13000";

		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				(new Co4robotsGUI(ip, port)).showEditor();
			}
		});
	}

	public void showEditor() {
		setLocationRelativeTo(null); // center?
		setVisible(true);
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	private void initComponents(String ip, String port) {
		setLayout(new BorderLayout());

		// ending the initials
		patternsJPanel = new javax.swing.JPanel();
		patternsJPanel.setBackground(BACKGROUNDCOLOR);

		patternJPanel = new javax.swing.JPanel();
		optionJPanel = new javax.swing.JPanel();
		jPanelLogo = new javax.swing.JPanel();
		fEName = new javax.swing.JCheckBox();
		fESpec = new javax.swing.JCheckBox();
		this.sendMission = new javax.swing.JButton();
		this.loadMission = new javax.swing.JButton();
		this.subscribe = new javax.swing.JButton();
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
		javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(optionJPanel);

		getContentPane().setBackground(BACKGROUNDCOLOR);
		patternJPanel.setBackground(BACKGROUNDCOLOR);
		optionJPanel.setBackground(BACKGROUNDCOLOR);
		jPanelLogo.setBackground(BACKGROUNDCOLOR);
		fEName.setBackground(BACKGROUNDCOLOR);
		fESpec.setBackground(BACKGROUNDCOLOR);
		jPanel5.setBackground(BACKGROUNDCOLOR);
		jScrollPane1.setBackground(BACKGROUNDCOLOR);
		fSELP.setBackground(BACKGROUNDCOLOR);
		jScrollPane2.setBackground(BACKGROUNDCOLOR);
		fMapping.setBackground(BACKGROUNDCOLOR);
		jLabel1.setBackground(BACKGROUNDCOLOR);
		jLabel2.setBackground(BACKGROUNDCOLOR);
		eventJPanel.setBackground(BACKGROUNDCOLOR);
		fNE.setBackground(BACKGROUNDCOLOR);
		fSEs.setBackground(BACKGROUNDCOLOR);
		fEE.setBackground(BACKGROUNDCOLOR);
		jPanelLogo.setBackground(Color.WHITE);

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setTitle(TITLE);
		setResizable(true);

		javax.swing.GroupLayout patternSelectionPanel = new javax.swing.GroupLayout(patternsJPanel);

		patternsJPanel.setLayout(patternSelectionPanel);

		// patternSelectionJPanel.se

		// patternsJPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(MOVEMENT_PATTERN));
		// patternsJPanel.setToolTipText("");

		String[] patternCategories = { "Core Movement", "Triggers", "Avoidance", "Composition" };
		DefaultComboBoxModel<String> patternCategoriestItems = new DefaultComboBoxModel<>();

		Arrays.asList(patternCategories).stream().forEach(p -> patternCategoriestItems.addElement(p.toString()));

		patternCategorySelector = new JComboBox<String>(patternCategoriestItems);

		Arrays.asList(CoreMovementPatterns.values()).stream().forEach(p -> patternItems.addElement(p.toString()));

		patternBoxSelector = new JComboBox<String>(patternItems);

		patternBoxSelector.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String selectedItem = (String) patternBoxSelector.getSelectedItem();
				if (selectedItem != null) {
					switch (selectedItem) {

					case "OR":
						intentText.setText(Composition.OR.getDescription());
						f1.removeAllItems();
						f2.removeAllItems();

						DefaultComboBoxModel<String> formulaeList1 = new DefaultComboBoxModel<String>();
						DefaultComboBoxModel<String> formulaeList2 = new DefaultComboBoxModel<String>();

						formulae.keySet().stream().forEach(p -> formulaeList1.addElement(p));
						formulae.keySet().stream().forEach(p -> formulaeList2.addElement(p));

						f1.setModel(formulaeList1);
						f2.setModel(formulaeList2);
						break;
					case "AND":
						intentText.setText(Composition.AND.getDescription());
						f1.removeAllItems();
						f2.removeAllItems();

						formulaeList1 = new DefaultComboBoxModel<String>();
						formulaeList2 = new DefaultComboBoxModel<String>();

						formulae.keySet().stream().forEach(p -> formulaeList1.addElement(p));
						formulae.keySet().stream().forEach(p -> formulaeList2.addElement(p));

						f1.setModel(formulaeList1);
						f2.setModel(formulaeList2);

						break;
					// triggers
					case "Wait":
						intentText.setText(Triggers.WAIT.getDescription());
						//// variation.setText(Triggers.WAIT.getVariations());
						examples.setText(Triggers.WAIT.getExamples());
						occurences.setText(Triggers.WAIT.getOccurrences());
						f1.removeAllItems();
						f2.removeAllItems();

						formulaeList1 = new DefaultComboBoxModel<String>();
						formulaeList2 = new DefaultComboBoxModel<String>();

						formulae.keySet().stream().forEach(p -> formulaeList1.addElement(p));
						formulae.keySet().stream().forEach(p -> formulaeList2.addElement(p));

						f1.setModel(formulaeList1);
						f2.setModel(formulaeList2);
						break;
					case "Instantaneous Reaction":
						intentText.setText(Triggers.INSTANTANEOUS_REACTION.getDescription());
						//// variation.setText(Triggers.INSTANTANEOUS_REACTION.getVariations());
						examples.setText(Triggers.INSTANTANEOUS_REACTION.getExamples());
						occurences.setText(Triggers.INSTANTANEOUS_REACTION.getOccurrences());
						f1.removeAllItems();
						f2.removeAllItems();

						formulaeList1 = new DefaultComboBoxModel<String>();
						formulaeList2 = new DefaultComboBoxModel<String>();

						formulae.keySet().stream().forEach(p -> formulaeList1.addElement(p));
						formulae.keySet().stream().forEach(p -> formulaeList2.addElement(p));

						f1.setModel(formulaeList1);
						f2.setModel(formulaeList2);

						break;
					case "Delayed Reaction":
						intentText.setText(Triggers.DELAYED_REACTION.getDescription());
						//// variation.setText(Triggers.DELAYED_REACTION.getVariations());
						examples.setText(Triggers.DELAYED_REACTION.getExamples());
						occurences.setText(Triggers.DELAYED_REACTION.getOccurrences());
						f1.removeAllItems();
						f2.removeAllItems();

						formulaeList1 = new DefaultComboBoxModel<String>();
						formulaeList2 = new DefaultComboBoxModel<String>();

						formulae.keySet().stream().forEach(p -> formulaeList1.addElement(p));
						formulae.keySet().stream().forEach(p -> formulaeList2.addElement(p));

						f1.setModel(formulaeList1);
						f2.setModel(formulaeList2);
						break;
					// core movements
					// visits
					case "Visit":
						intentText.setText(CoreMovementPatterns.VISIT.getDescription());
						//// variation.setText(CoreMovementPatterns.VISIT.getVariations());
						examples.setText(CoreMovementPatterns.VISIT.getExamples());
						occurences.setText(CoreMovementPatterns.VISIT.getOccurrences());
						f1.removeAllItems();
						f2.removeAllItems();

						formulaeList1 = new DefaultComboBoxModel<String>();
						formulaeList2 = new DefaultComboBoxModel<String>();

						formulae.keySet().stream().forEach(p -> formulaeList1.addElement(p));
						formulae.keySet().stream().forEach(p -> formulaeList2.addElement(p));

						f1.setModel(formulaeList1);
						f2.setModel(formulaeList2);
						break;
					case "Sequenced Visit":
						intentText.setText(CoreMovementPatterns.SEQUENCED_VISIT.getDescription());
						// variation.setText(CoreMovementPatterns.SEQUENCED_VISIT.getVariations());
						examples.setText(CoreMovementPatterns.SEQUENCED_VISIT.getExamples());
						occurences.setText(CoreMovementPatterns.SEQUENCED_VISIT.getOccurrences());
						f1.removeAllItems();
						f2.removeAllItems();

						formulaeList1 = new DefaultComboBoxModel<String>();
						formulaeList2 = new DefaultComboBoxModel<String>();

						formulae.keySet().stream().forEach(p -> formulaeList1.addElement(p));
						formulae.keySet().stream().forEach(p -> formulaeList2.addElement(p));

						f1.setModel(formulaeList1);
						f2.setModel(formulaeList2);
						break;
					case "Ordered Visit":
						intentText.setText(CoreMovementPatterns.ORDERED_VISIT.getDescription());
						// variation.setText(CoreMovementPatterns.ORDERED_VISIT.getVariations());
						examples.setText(CoreMovementPatterns.ORDERED_VISIT.getExamples());
						occurences.setText(CoreMovementPatterns.ORDERED_VISIT.getOccurrences());
						f1.removeAllItems();
						f2.removeAllItems();

						formulaeList1 = new DefaultComboBoxModel<String>();
						formulaeList2 = new DefaultComboBoxModel<String>();

						formulae.keySet().stream().forEach(p -> formulaeList1.addElement(p));
						formulae.keySet().stream().forEach(p -> formulaeList2.addElement(p));

						f1.setModel(formulaeList1);
						f2.setModel(formulaeList2);
						break;
					case "Strict Ordered Visit":
						intentText.setText(CoreMovementPatterns.STRICT_ORDERED_VISIT.getDescription());
						// variation.setText(CoreMovementPatterns.STRICT_ORDERED_VISIT.getVariations());
						examples.setText(CoreMovementPatterns.STRICT_ORDERED_VISIT.getExamples());
						occurences.setText(CoreMovementPatterns.STRICT_ORDERED_VISIT.getOccurrences());
						f1.removeAllItems();
						f2.removeAllItems();

						formulaeList1 = new DefaultComboBoxModel<String>();
						formulaeList2 = new DefaultComboBoxModel<String>();

						formulae.keySet().stream().forEach(p -> formulaeList1.addElement(p));
						formulae.keySet().stream().forEach(p -> formulaeList2.addElement(p));

						f1.setModel(formulaeList1);
						f2.setModel(formulaeList2);
						break;
					case "Fair Visit":
						intentText.setText(CoreMovementPatterns.FAIR_VISIT.getDescription());
						// variation.setText(CoreMovementPatterns.FAIR_VISIT.getVariations());
						examples.setText(CoreMovementPatterns.FAIR_VISIT.getExamples());
						occurences.setText(CoreMovementPatterns.FAIR_VISIT.getOccurrences());
						f1.removeAllItems();
						f2.removeAllItems();

						formulaeList1 = new DefaultComboBoxModel<String>();
						formulaeList2 = new DefaultComboBoxModel<String>();

						formulae.keySet().stream().forEach(p -> formulaeList1.addElement(p));
						formulae.keySet().stream().forEach(p -> formulaeList2.addElement(p));

						f1.setModel(formulaeList1);
						f2.setModel(formulaeList2);
						break;
					// patrolling
					case "Patrolling":
						intentText.setText(CoreMovementPatterns.PATROLLING.getDescription());
						// variation.setText(CoreMovementPatterns.PATROLLING.getVariations());
						examples.setText(CoreMovementPatterns.PATROLLING.getExamples());
						occurences.setText(CoreMovementPatterns.PATROLLING.getOccurrences());
						f1.removeAllItems();
						f2.removeAllItems();

						formulaeList1 = new DefaultComboBoxModel<String>();
						formulaeList2 = new DefaultComboBoxModel<String>();

						formulae.keySet().stream().forEach(p -> formulaeList1.addElement(p));
						formulae.keySet().stream().forEach(p -> formulaeList2.addElement(p));

						f1.setModel(formulaeList1);
						f2.setModel(formulaeList2);
						break;
					case "Sequenced Patrolling":
						intentText.setText(CoreMovementPatterns.SEQUENCED_PATROLLING.getDescription());
						// variation.setText(CoreMovementPatterns.SEQUENCED_PATROLLING.getVariations());
						examples.setText(CoreMovementPatterns.SEQUENCED_PATROLLING.getExamples());
						occurences.setText(CoreMovementPatterns.SEQUENCED_PATROLLING.getOccurrences());
						f1.removeAllItems();
						f2.removeAllItems();

						formulaeList1 = new DefaultComboBoxModel<String>();
						formulaeList2 = new DefaultComboBoxModel<String>();

						formulae.keySet().stream().forEach(p -> formulaeList1.addElement(p));
						formulae.keySet().stream().forEach(p -> formulaeList2.addElement(p));

						f1.setModel(formulaeList1);
						f2.setModel(formulaeList2);
						break;
					case "Ordered Patrolling":
						intentText.setText(CoreMovementPatterns.ORDERED_PATROLLING.getDescription());
						// variation.setText(CoreMovementPatterns.ORDERED_PATROLLING.getVariations());
						examples.setText(CoreMovementPatterns.ORDERED_PATROLLING.getExamples());
						occurences.setText(CoreMovementPatterns.ORDERED_PATROLLING.getOccurrences());
						f1.removeAllItems();
						f2.removeAllItems();

						formulaeList1 = new DefaultComboBoxModel<String>();
						formulaeList2 = new DefaultComboBoxModel<String>();

						formulae.keySet().stream().forEach(p -> formulaeList1.addElement(p));
						formulae.keySet().stream().forEach(p -> formulaeList2.addElement(p));

						f1.setModel(formulaeList1);
						f2.setModel(formulaeList2);
						break;
					case "Strict Ordered Patrolling":
						intentText.setText(CoreMovementPatterns.STRICT_ORDERED_PATROLLING.getDescription());
						//// variation.setText(CoreMovementPatterns.STRICT_ORDERED_PATROLLING.getVariations());
						examples.setText(CoreMovementPatterns.STRICT_ORDERED_PATROLLING.getExamples());
						occurences.setText(CoreMovementPatterns.STRICT_ORDERED_PATROLLING.getOccurrences());
						f1.removeAllItems();
						f2.removeAllItems();

						formulaeList1 = new DefaultComboBoxModel<String>();
						formulaeList2 = new DefaultComboBoxModel<String>();

						formulae.keySet().stream().forEach(p -> formulaeList1.addElement(p));
						formulae.keySet().stream().forEach(p -> formulaeList2.addElement(p));

						f1.setModel(formulaeList1);
						f2.setModel(formulaeList2);
						break;
					case "Fair Patrolling":
						intentText.setText(CoreMovementPatterns.FAIR_PATROLLING.getDescription());
						//// variation.setText(CoreMovementPatterns.FAIR_PATROLLING.getVariations());
						examples.setText(CoreMovementPatterns.FAIR_PATROLLING.getExamples());
						occurences.setText(CoreMovementPatterns.FAIR_PATROLLING.getOccurrences());
						f1.removeAllItems();
						f2.removeAllItems();

						formulaeList1 = new DefaultComboBoxModel<String>();
						formulaeList2 = new DefaultComboBoxModel<String>();

						formulae.keySet().stream().forEach(p -> formulaeList1.addElement(p));
						formulae.keySet().stream().forEach(p -> formulaeList2.addElement(p));

						f1.setModel(formulaeList1);
						f2.setModel(formulaeList2);
						break;
					// avoidance
					// past avoidance
					case "Past Avoidance":
						intentText.setText(Avoidance.PAST_AVOIDANCE.getDescription());
						// variation.setText(Avoidance.PAST_AVOIDANCE.getVariations());
						examples.setText(Avoidance.PAST_AVOIDANCE.getExamples());
						occurences.setText(Avoidance.PAST_AVOIDANCE.getOccurrences());
						f1.removeAllItems();
						f2.removeAllItems();

						formulaeList1 = new DefaultComboBoxModel<String>();
						formulaeList2 = new DefaultComboBoxModel<String>();

						formulae.keySet().stream().forEach(p -> formulaeList1.addElement(p));
						formulae.keySet().stream().forEach(p -> formulaeList2.addElement(p));

						f1.setModel(formulaeList1);
						f2.setModel(formulaeList2);
						break;
					case "Future Avoidance":
						intentText.setText(Avoidance.FUTURE_AVOIDANCE.getDescription());
						// variation.setText(Avoidance.FUTURE_AVOIDANCE.getVariations());
						examples.setText(Avoidance.FUTURE_AVOIDANCE.getExamples());
						occurences.setText(Avoidance.FUTURE_AVOIDANCE.getOccurrences());
						f1.removeAllItems();
						f2.removeAllItems();

						formulaeList1 = new DefaultComboBoxModel<String>();
						formulaeList2 = new DefaultComboBoxModel<String>();

						formulae.keySet().stream().forEach(p -> formulaeList1.addElement(p));
						formulae.keySet().stream().forEach(p -> formulaeList2.addElement(p));

						f1.setModel(formulaeList1);
						f2.setModel(formulaeList2);
						break;
					case "Global Avoidance":
						intentText.setText(Avoidance.GLOBAL_AVOIDANCE.getDescription());
						// variation.setText(Avoidance.GLOBAL_AVOIDANCE.getVariations());
						examples.setText(Avoidance.GLOBAL_AVOIDANCE.getExamples());
						occurences.setText(Avoidance.GLOBAL_AVOIDANCE.getOccurrences());
						f1.removeAllItems();
						f2.removeAllItems();

						formulaeList1 = new DefaultComboBoxModel<String>();
						formulaeList2 = new DefaultComboBoxModel<String>();

						formulae.keySet().stream().forEach(p -> formulaeList1.addElement(p));
						formulae.keySet().stream().forEach(p -> formulaeList2.addElement(p));

						f1.setModel(formulaeList1);
						f2.setModel(formulaeList2);
					default:
						break;
					}
				}

			}
		});

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
					locationPanel.setVisible(true);
					remotePanel.setVisible(true);
					ltlFormula.setVisible(true);
					intentText.setVisible(true);
					// variation.setVisible(true);
					examples.setVisible(true);
					occurences.setVisible(true);

					break;
				case "Triggers":

					patternItems.removeAllElements();
					Arrays.asList(Triggers.values()).stream().forEach(p -> patternItems.addElement(p.toString()));

					patternBoxSelector.setModel(patternItems);
					locationPanel.setVisible(false);
					remotePanel.setVisible(true);
					intentText.setVisible(true);
					ltlFormula.setVisible(true);
					// variation.setVisible(true);
					examples.setVisible(true);
					occurences.setVisible(true);

					break;
				case "Avoidance":

					patternItems.removeAllElements();
					Arrays.asList(Avoidance.values()).stream().forEach(p -> patternItems.addElement(p.toString()));

					patternBoxSelector.setModel(patternItems);
					locationPanel.setVisible(true);
					remotePanel.setVisible(true);
					intentText.setVisible(true);
					ltlFormula.setVisible(true);
					// variation.setVisible(true);
					examples.setVisible(true);
					occurences.setVisible(true);

					break;
				case "Composition":
					patternItems.removeAllElements();
					Arrays.asList(Composition.values()).stream().forEach(p -> patternItems.addElement(p.toString()));

					patternBoxSelector.setModel(patternItems);
					locationPanel.setVisible(false);
					remotePanel.setVisible(true);
					intentText.setVisible(true);
					ltlFormula.setVisible(true);// edited
					// variation.setVisible(false);
					examples.setVisible(false);
					occurences.setVisible(false);

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
		patternSelectionPanel
				.setHorizontalGroup(patternSelectionPanel.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(patternSelectionPanel.createSequentialGroup()
								.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

		patternSelectionPanel
				.setVerticalGroup(patternSelectionPanel.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(patternSelectionPanel.createSequentialGroup()
								.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

		optionJPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Options"));

		this.sendMission.setText(SEND_MISSION);
		this.loadMission.setText(LOAD_MISSION);
		this.subscribe.setText("Subscribe");

		this.sendMission.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				if (locations.getText().equals(INIT_POSITION_MESSAGE)) {
					JOptionPane.showMessageDialog(null, "Insert the set of locations to be considered");
				} else {
					MissionSender sender = new MissionSender();
					try {
						sender.send(loadMission().accept(new LTLFormulaToStringVisitor()), ipTextField.getText(),
								portTextField.getText());
					} catch (Exception e) {
						e.printStackTrace();
					}
				}

			}
		});

		this.subscribe.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {

				sub = new Subscriber(ipTextField.getText(), Integer.parseInt(publisherportTextField.getText()),list,listModel);
				Thread t = new Thread(sub);
				t.start();
			}
		});
		this.loadMission.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {

				if (locations.getText().equals(INIT_POSITION_MESSAGE)) {
					JOptionPane.showMessageDialog(null, "Insert the set of locations to be considered");
				} else {

					try {
						loadMission();
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}

		});

		optionJPanel.setLayout(jPanel3Layout);

		jPanelLogo.setLayout(new BorderLayout());

		BufferedImage myPicture;
		try {
			myPicture = ImageIO.read(getClass().getClassLoader().getResourceAsStream("images/co4robotsLogo.png"));

			ImageIcon icon = new ImageIcon(myPicture);
			JLabel picLabel = new JLabel(icon);
			jPanelLogo.add(picLabel);
		} catch (IOException e) {
			e.printStackTrace();
		}
		// capturing the main panel
		JPanel mainPanel = new JPanel();
		mainPanel.setBackground(BACKGROUNDCOLOR);
		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(mainPanel);
		mainPanel.setLayout(layout);
		getContentPane().add(mainPanel);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		getContentPane().add(scrollPane, BorderLayout.CENTER);
		scrollPane.setViewportView(mainPanel);
		// end capturing

		layout.setAutoCreateGaps(true);
		layout.setAutoCreateContainerGaps(true);

		remotePanel = new JPanel();

		ipTextField = new JTextField(15);
		ipTextField.setText(ip);
		ipTextField.setColumns(15);
		
		

		portTextField = new JTextField(5);
		portTextField.setText("13000");
		

		publisherportTextField = new JTextField(5);
		publisherportTextField.setText("13001");

		JLabel ipLabel = new JLabel("IP:");
		ipLabel.setForeground(grayCo4robots);
		ipLabel.setFont(fonttitle);

		JLabel portLabel = new JLabel("Server PORT:");
		portLabel.setForeground(grayCo4robots);
		portLabel.setFont(fonttitle);

		JLabel publisherLabel = new JLabel("Publisher PORT:");
		publisherLabel.setForeground(grayCo4robots);
		publisherLabel.setFont(fonttitle);

		locationPanel = new JPanel();

		locations = new JTextField(40);
		locations.setDropMode(DropMode.INSERT);
		locations.setText("Drag here");
		locations.setText(INIT_POSITION_MESSAGE);
		locationPanel.setBackground(BACKGROUNDCOLOR);
		
		//list.setTransferHandler(new TransferHandlerCustom());
		locationPanel.add(locations);
		
		javax.swing.GroupLayout memotePalenlLayout = new javax.swing.GroupLayout(remotePanel);


		JPanel p1=new JPanel();
		p1.setBackground(BACKGROUNDCOLOR);
		p1.add(ipTextField);
		
		JPanel p2=new JPanel();
		p2.setBackground(BACKGROUNDCOLOR);
		p2.add(publisherportTextField);
		
		JPanel p3=new JPanel();
		p3.setBackground(BACKGROUNDCOLOR);
		p3.add(portTextField);
		
		JPanel clientServer=new JPanel();
		clientServer.setBackground(BACKGROUNDCOLOR);
		FlowLayout f=new FlowLayout();
		
		clientServer.setLayout(f);
		clientServer.add(ipLabel);
		clientServer.add(p1);
		clientServer.add(portLabel);
		clientServer.add(p3);
		clientServer.add(this.sendMission);
		
		JPanel pubSub=new JPanel();
		pubSub.setBackground(BACKGROUNDCOLOR);
		FlowLayout pubsublayout=new FlowLayout();
		pubSub.setLayout(pubsublayout);
		pubSub.add(locationPanel);
		pubSub.add(publisherLabel);
		pubSub.add(p2);
		pubSub.add(this.subscribe);
		
		memotePalenlLayout.setHorizontalGroup(memotePalenlLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(memotePalenlLayout.createSequentialGroup().addComponent(clientServer)
				//.addComponent(ipLabel)
				//.addComponent(p1)
				//.addComponent(portLabel)
				//.addComponent(p3)
				//.addComponent(this.sendMission)
						)
				.addGroup(memotePalenlLayout.createSequentialGroup().addComponent(pubSub)
				));

		memotePalenlLayout.setVerticalGroup(memotePalenlLayout.createSequentialGroup()
				.addGroup(memotePalenlLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
						//.addComponent(ipLabel)
				//.addComponent(p1)
				//.addComponent(portLabel)
				//.addComponent(p3)
				//.addComponent(this.sendMission)
						.addComponent(clientServer))
				.addGroup(memotePalenlLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addComponent(pubSub)));

		remotePanel.setLayout(memotePalenlLayout);
		

		remotePanel.setBackground(BACKGROUNDCOLOR);

		TitledBorder titleBorder = javax.swing.BorderFactory.createTitledBorder(null, "Robot network settings", 2, 2,
				font, redCo4robots);
		remotePanel.setBorder(titleBorder);

		

		JLabel locationLabel = new JLabel("Actions or locations:");
		locationLabel.setForeground(grayCo4robots);
		locationLabel.setFont(fonttitle);

		ltlFormula = new JTextArea();
		JLabel ltlLabel = new JLabel("LTL formula:");
		ltlLabel.setForeground(grayCo4robots);
		ltlLabel.setFont(fonttitle);
		// ltlFormulaTitle.setTitlePosition(TitledBorder.RIGHT);
		// ltlFormula.setBorder(ltlFormulaTitle);

		intentText = new JTextArea();
		intentText.setLineWrap(true);

		JLabel intentLabel = new JLabel("Intent:");
		intentLabel.setForeground(grayCo4robots);
		intentLabel.setFont(fonttitle);

		JLabel availableActionsLabel = new JLabel("Available actions or locations:");
		availableActionsLabel.setForeground(grayCo4robots);
		availableActionsLabel.setFont(fonttitle);

		// variation = new JTextArea();
		// variation.setLineWrap(true);
		TitledBorder variationTitle = BorderFactory.createTitledBorder("Variations");
		variationTitle.setTitlePosition(TitledBorder.RIGHT);
		// variation.setBorder(variationTitle);

		examples = new JTextArea();
		examples.setLineWrap(true);
		TitledBorder examplesTitle = BorderFactory.createTitledBorder("Examples and Known Uses");
		examplesTitle.setTitlePosition(TitledBorder.RIGHT);
		examples.setBorder(examplesTitle);

		TitledBorder relationshipsTitle = BorderFactory.createTitledBorder("Relationships");
		relationshipsTitle.setTitlePosition(TitledBorder.RIGHT);

		occurences = new JTextArea();
		occurences.setLineWrap(true);
		TitledBorder occuttencesTitle = BorderFactory.createTitledBorder("Occurences");
		occuttencesTitle.setTitlePosition(TitledBorder.RIGHT);
		occurences.setBorder(occuttencesTitle);

		JPanel propertyLibrary = new JPanel();
		JScrollPane p = new JScrollPane(this.propertyList);
		p.setBackground(BACKGROUNDCOLOR);

		TitledBorder propertiesTitle = javax.swing.BorderFactory.createTitledBorder(null, "Missions Library", 2, 2,
				font, redCo4robots);

		propertyLibrary.setBackground(BACKGROUNDCOLOR);
		propertyLibrary.setBorder(propertiesTitle);

		javax.swing.GroupLayout lay2 = new javax.swing.GroupLayout(propertyLibrary);
		lay2.setHorizontalGroup(lay2.createSequentialGroup().addComponent(p));
		lay2.setVerticalGroup(lay2.createSequentialGroup().addComponent(p));

		propertyLibrary.setLayout(lay2);

		layout.createSequentialGroup();

		JPanel actionAvailable = new JPanel();
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		list.setLayoutOrientation(JList.HORIZONTAL_WRAP);
		list.setAutoscrolls(true);
		list.setMaximumSize(new Dimension(30, 20));
		list.setSelectedIndex(0);
		list.setVisibleRowCount(2);
		JScrollPane listScroller = new JScrollPane(list);
		listScroller.setPreferredSize(new Dimension(30, 20));

		actionAvailable.setLayout(new GridBagLayout());

		actionAvailable.setBackground(Color.WHITE);
		actionAvailable.add(list);
		list.setDragEnabled(true);	

		JLabel patternLabel = new JLabel("Pattern:");
		patternLabel.setForeground(grayCo4robots);
		patternLabel.setFont(fonttitle);

		JLabel patternCategoryLabel = new JLabel("Pattern category:");
		patternCategoryLabel.setForeground(grayCo4robots);
		patternCategoryLabel.setFont(fonttitle);

		locationPanel.setBackground(BACKGROUNDCOLOR);
		JPanel patternPanel = new JPanel();

		patternPanel.setBackground(Color.WHITE);

		patternPanel.setBorder(
				javax.swing.BorderFactory.createTitledBorder(null, PATTERN_SELECTION_PANEL, 2, 2, font, redCo4robots));

		patternCategorySelector.setBackground(BACKGROUNDCOLOR);

		layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(jPanelLogo)
				.addGroup(layout.createParallelGroup().addComponent(remotePanel).addComponent(patternPanel).addGroup(
						layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(propertyLibrary))));

		layout.setVerticalGroup(layout.createSequentialGroup().addComponent(jPanelLogo).addComponent(remotePanel)
				.addComponent(patternPanel).addComponent(propertyLibrary));

		javax.swing.GroupLayout lay = new javax.swing.GroupLayout(patternPanel);

		lay.setHorizontalGroup(lay.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(patternCategoryLabel)
				.addComponent(patternCategorySelector).addComponent(patternLabel).addComponent(patternBoxSelector)
				.addComponent(locationLabel).addComponent(locationPanel).addComponent(availableActionsLabel)
				.addComponent(actionAvailable).addComponent(ltlLabel).addComponent(ltlFormula).addComponent(intentLabel)
				.addComponent(intentText).addComponent(f1).addComponent(f2).addComponent(this.loadMission));

		lay.setVerticalGroup(lay.createSequentialGroup().addComponent(patternCategoryLabel)
				.addComponent(patternCategorySelector).addComponent(patternLabel).addComponent(patternBoxSelector)
				.addComponent(locationLabel).addComponent(locationPanel).addComponent(availableActionsLabel)
				.addComponent(actionAvailable).addComponent(ltlLabel).addComponent(ltlFormula).addComponent(intentLabel)
				.addComponent(intentText).addComponent(f1).addComponent(f2).addComponent(this.loadMission));

		patternPanel.setLayout(lay);

		f1.setVisible(false);
		f2.setVisible(false);

		setBounds(0, 0, FRAME_INIT_WIDTH, FRAME_INIT_HEIGTH);
		setVisible(false);
		this.setBackground(BACKGROUNDCOLOR);
		this.getContentPane().setBackground(BACKGROUNDCOLOR);
		this.setResizable(true);
	}

	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.JButton sendMission;
	private javax.swing.JButton subscribe;
	private javax.swing.JButton loadMission;
	private javax.swing.JButton fEE;
	private javax.swing.JCheckBox fEName;
	private javax.swing.JCheckBox fESpec;
	private javax.swing.JTextArea fMapping;
	private javax.swing.JButton fNE;
	private javax.swing.JTextPane fSELP;
	private javax.swing.JButton fSEs;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JPanel patternsJPanel;
	private javax.swing.JPanel patternJPanel;
	private javax.swing.JPanel optionJPanel;
	private javax.swing.JPanel jPanelLogo;
	private javax.swing.JPanel jPanel5;
	private javax.swing.JPanel eventJPanel;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JScrollPane jScrollPane2;
	// End of variables declaration//GEN-END:variables

	private LTLFormula loadMission() throws Exception {

		String selectedIdem = (String) patternBoxSelector.getSelectedItem();
		String patternCategory = (String) patternCategorySelector.getSelectedItem();

		LTLFormula computedltlformula = LTLFormula.TRUE;

		String locationsText = locations.getText().replaceAll(" ", "");
		String[] selectedLocations = locationsText.split(",");

		switch (patternCategory) {
		case "Triggers":
			Triggers p2 = Triggers.valueOf(selectedIdem.toUpperCase().replaceAll(" ", "_"));
			// computedltlformula = p2.getMission(selectedLocations);

			intentText.setText(p2.getDescription());
			// variation.setText(p2.getVariations());
			examples.setText(p2.getExamples());
			occurences.setText(p2.getOccurrences());

			computedltlformula = p2.getMission(formulae.get((String) f1.getSelectedItem()),
					formulae.get((String) f2.getSelectedItem()));

			ltlFormula.setText(computedltlformula.accept(new LTLFormulaToStringVisitor()));

			formulae.put(FORMULA_COUNTER + " - " + (String) patternBoxSelector.getSelectedItem() + "("
					+ f1.getSelectedItem() + ", " + f2.getSelectedItem() + ")", computedltlformula);

			List<String> array1 = new ArrayList<String>(formulae.keySet());
			String[] t = new String[array1.size()];
			array1.toArray(t);
			propertyList.setListData(t);

			FORMULA_COUNTER = FORMULA_COUNTER + 1;
			break;
		case "Avoidance":
			Avoidance p = Avoidance.valueOf(selectedIdem.toUpperCase().replaceAll(" ", "_"));
			computedltlformula = p.getMission(selectedLocations);
			intentText.setText(p.getDescription());

			// variation.setText(p.getVariations());

			examples.setText(p.getExamples());

			occurences.setText(p.getOccurrences());
			ltlFormula.setText(computedltlformula.accept(new LTLFormulaToStringVisitor()));

			formulae.put(FORMULA_COUNTER + " - " + (String) patternBoxSelector.getSelectedItem() + "("
					+ locations.getText() + ")", computedltlformula);

			List<String> array = new ArrayList<String>(formulae.keySet());
			String[] d = new String[array.size()];
			array.toArray(d);
			propertyList.setListData(d);
			FORMULA_COUNTER = FORMULA_COUNTER + 1;

			break;
		case "Core Movement":
			CoreMovementPatterns p1 = CoreMovementPatterns.valueOf(selectedIdem.toUpperCase().replaceAll(" ", "_"));
			computedltlformula = p1.getMission(selectedLocations);
			intentText.setText(p1.getDescription());
			// variation.setText(p1.getVariations());
			examples.setText(p1.getExamples());
			occurences.setText(p1.getOccurrences());

			ltlFormula.setText(computedltlformula.accept(new LTLFormulaToStringVisitor()));

			// formulae.put(FORMULA_COUNTER + " - " + (String)
			// patternBoxSelector.getSelectedItem() + "(" + locations.getText()
			// + ")", computedltlformula);
			array = new ArrayList<String>(formulae.keySet());
			d = new String[array.size()];
			array.toArray(d);
			propertyList.setListData(d);
			FORMULA_COUNTER = FORMULA_COUNTER + 1;

			break;
		case "Composition":
			Composition c = Composition.valueOf(selectedIdem.toUpperCase().replaceAll(" ", "_"));
			intentText.setText(c.getDescription());

			computedltlformula = c.getMission(formulae.get((String) f1.getSelectedItem()),
					formulae.get((String) f2.getSelectedItem()));

			ltlFormula.setText(computedltlformula.accept(new LTLFormulaToStringVisitor()));

			formulae.put(FORMULA_COUNTER + " - " + (String) patternBoxSelector.getSelectedItem() + "("
					+ f1.getSelectedItem() + ", " + f2.getSelectedItem() + ")", computedltlformula);

			array = new ArrayList<String>(formulae.keySet());
			d = new String[array.size()];
			array.toArray(d);
			propertyList.setListData(d);

			FORMULA_COUNTER = FORMULA_COUNTER + 1;
		default:
			break;
		}

		return computedltlformula;
	}

	private void cleanPanels() {
		;
		intentText.setText("");
		ltlFormula.setText("");
		// variation.setText("");
		examples.setText("");
		occurences.setText("");
	}
}
