package se.got.panels;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Map;
import java.util.Map.Entry;

import javax.swing.BoxLayout;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.TitledBorder;

import se.got.Co4robotsGUI;
import se.got.MissionLibrary;
import se.got.ltl.LTLFormula;

public class MissionLibraryPanel extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private static final Color redCo4robots = new Color(157, 15, 0);
	private static final Color grayCo4robots = new Color(105, 105, 105);
	private static final Font font = new Font("Arial", Font.PLAIN, 16);
	private static final Font fonttitle = new Font("Arial", Font.BOLD, 16);

	public final static Color BACKGROUNDCOLOR = Color.WHITE;

	private static JPanel missionLibraryPanel = new JPanel();

	private JButton loadLibrary = new JButton("Load mission library");

	private JButton saveLibrary = new JButton("Save mission library");
	
	private JButton selectMission = new JButton("Select mission");

	private JPanel missionLibraryAction = new JPanel();

	private static DefaultListModel<String> missionLibraryModel;


	public MissionLibraryPanel(JList<String> missionLibrary, DefaultListModel<String> missionLibraryModel) {
		super();

		TitledBorder missionLibraryBorder = javax.swing.BorderFactory.createTitledBorder(null, "Missions Library", 2, 2,
				font, redCo4robots);

		JScrollPane p = new JScrollPane(missionLibrary);
		p.setBackground(grayCo4robots);

		missionLibraryPanel.setBorder(missionLibraryBorder);
		missionLibraryPanel.setBackground(BACKGROUNDCOLOR);
		// missionLibraryPanel.add(p);

		javax.swing.GroupLayout lay2 = new javax.swing.GroupLayout(missionLibraryPanel);
		lay2.setHorizontalGroup(lay2.createSequentialGroup().addComponent(p));
		lay2.setVerticalGroup(lay2.createSequentialGroup().addComponent(p));

		missionLibraryPanel.setLayout(lay2);

		this.setLayout(new BorderLayout());

		MissionLibraryPanel.missionLibraryModel = missionLibraryModel;
		missionLibraryAction.add(loadLibrary);
		missionLibraryAction.add(saveLibrary);
		missionLibraryAction.add(selectMission);

		saveLibrary.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {

				JFileChooser fc = new JFileChooser();

				fc.setFileSelectionMode(JFileChooser.SAVE_DIALOG);
				fc.showSaveDialog(MissionLibraryPanel.missionLibraryPanel);

				String path = fc.getSelectedFile().getAbsolutePath();

			
				FileOutputStream out;
				try {
					out = new FileOutputStream(path);
					ObjectOutputStream o=new ObjectOutputStream(out);
					o.writeObject(MissionLibrary.mapSpecificationFormula);
					o.close();
					out.close();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
		});
		
		loadLibrary.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {

				JFileChooser fc = new JFileChooser();

				fc.setFileSelectionMode(JFileChooser.OPEN_DIALOG);
				fc.showOpenDialog(MissionLibraryPanel.missionLibraryPanel);

				String path = fc.getSelectedFile().getAbsolutePath();

			
				FileInputStream in;
				try {
					in = new FileInputStream(path);
					ObjectInputStream o=new ObjectInputStream(in);
					MissionLibrary.mapSpecificationFormula=(Map<String, LTLFormula>) o.readObject();
					o.close();
					in.close();

					Co4robotsGUI.missionLibraryModel = new DefaultListModel<>();
					for (Entry<String, LTLFormula> e : MissionLibrary.mapSpecificationFormula.entrySet()) {
						Co4robotsGUI.missionLibraryModel.addElement(e.getKey());
					}

					Co4robotsGUI.missionLibrary.setModel(Co4robotsGUI.missionLibraryModel);
					System.out.println("End load mission" + Co4robotsGUI.missionLibraryModel);

					Co4robotsGUI.missionLibrary.repaint();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
		});
		
		
		selectMission.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {

				Co4robotsGUI.currentMission=missionLibrary.getSelectedValue();
				Co4robotsGUI.selectedMissionJLabel.setText(Co4robotsGUI.currentMission);

			}
		});

		missionLibraryAction.setBackground(BACKGROUNDCOLOR);
		this.add(missionLibraryPanel, BorderLayout.CENTER);
		this.add(missionLibraryAction, BorderLayout.EAST);

		missionLibraryAction.setLayout(new BoxLayout(missionLibraryAction, BoxLayout.PAGE_AXIS));
	}
}
