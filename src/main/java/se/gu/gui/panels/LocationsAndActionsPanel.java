package se.gu.gui.panels;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.DropMode;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
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

public class LocationsAndActionsPanel extends JPanel implements Observer{

	private JPanel actionsPanel;
	private JPanel locationsPanel;

	private final String robotName = "robot";

	private final Workspace model;


	private javax.swing.JButton loadMission;
	private javax.swing.JPanel patternsJPanel;
	private JTextField input1;
	private JTextField input2;

	private JComboBox<String> f1;
	private JComboBox<String> f2;



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
	private DefaultComboBoxModel<String> patternItems;

	private DefaultListModel<String> actionsModel = new DefaultListModel<>();

	private DefaultListModel<String> locationsModel = new DefaultListModel<>();


	
	public String getSelectedRobotl() {
		return this.getName();
	}

	public LocationsAndActionsPanel(Workspace model, String name) {
		super();
		this.model=model;
		
		availableActionsLabel = new JLabel("Available actions:");
		availableActionsLabel.setForeground(Co4robotsGUI.GRAYCO4ROBOTS);
		availableActionsLabel.setFont(Co4robotsGUI.FONTTITLE);
		
		
				
		availableActions.setModel(actionsModel);
		availableActions.setBorder(new LineBorder(Color.BLACK));
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

		
		
		availableLocationsLabel = new JLabel("Available locations:");
		availableLocationsLabel.setForeground(Co4robotsGUI.GRAYCO4ROBOTS);
		availableLocationsLabel.setFont(Co4robotsGUI.FONTTITLE);
		
		

		
		availableLocations.setModel(locationsModel);
		availableLocations.setBorder(new LineBorder(Color.BLACK));
		availableLocations.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		availableLocations.setLayoutOrientation(JList.HORIZONTAL_WRAP);
		availableLocations.setAutoscrolls(true);
		availableLocations.setSelectedIndex(0);
		availableLocations.setFixedCellHeight(50);
		availableLocations.setFixedCellWidth(100);
		availableLocations.setModel(locationsModel);
		availableLocations.setVisibleRowCount(1);
		availableLocations.setDragEnabled(true);
		
		JScrollPane scrollPane2 = new JScrollPane();
		scrollPane2.getViewport().add(availableLocations);
		
		
		
		MouseListener mouseListener = new MouseAdapter() {
		    public void mouseClicked(MouseEvent e) {
	        	if (e.getClickCount() == 2) {


		           String selectedItem = (String) availableLocations.getSelectedValue();
		           // add selectedItem to your second list.
		           DefaultListModel model = (DefaultListModel) availableLocations.getModel();
		           if(model == null)
		           {
		                 model = new DefaultListModel();
		                 availableLocations.setModel(model);
		           }
		           model.addElement(selectedItem);

		         }
		    }
		};
		availableLocations.addMouseListener(mouseListener);

		JButton addLocation=new JButton("Create New Location");
		
		
		addLocation.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {

				String name = JOptionPane.showInputDialog("Location Name","");

				model.addLocation(name);
			}
		});
		
		
		JButton addAction=new JButton("Create New Action");
		
		addAction.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {

				String name = JOptionPane.showInputDialog("Action Name","");

				model.addAction(name);
			}
		});
		
		locationsPanel = new Co4robotPanel(availableLocationsLabel, scrollPane2,addLocation);
		actionsPanel = new Co4robotPanel(availableActionsLabel, scrollPane,addAction);
		

		

				
		JPanel locationsAndActionsPanel = new JPanel();
		locationsAndActionsPanel.add(actionsPanel);
		locationsAndActionsPanel.add(locationsPanel);
		
		locationsAndActionsPanel.setLayout(new BoxLayout(locationsAndActionsPanel, BoxLayout.PAGE_AXIS));

		locationsAndActionsPanel.setBackground(Co4robotsGUI.BACKGROUNDCOLOR);


		this.setLayout(new GridLayout(0, 1));
		this.add(locationsAndActionsPanel);
		this.setBackground(Co4robotsGUI.BACKGROUNDCOLOR);
		
	}

	@Override
	public void update(Observable o, Object arg) {
		
		Workspace w=(Workspace) o;
	
		DefaultListModel<String> actionsModel = new DefaultListModel<>();

		DefaultListModel<String> locationsModel = new DefaultListModel<>();


		for(String location: w.getAvailableLocations()) {
			locationsModel.addElement(location);
		}
		for(String action: w.getAvailableActions()) {
			actionsModel.addElement(action);
		}
		availableLocations.setModel(locationsModel);
		availableActions.setModel(actionsModel);
		
		this.repaint();
	}

}
