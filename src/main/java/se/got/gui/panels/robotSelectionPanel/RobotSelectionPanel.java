package se.got.gui.panels.robotSelectionPanel;

import java.awt.Color;
import java.awt.Component;
import java.awt.GridLayout;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Observable;
import java.util.Observer;
import java.util.stream.Collectors;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListCellRenderer;
import javax.swing.DefaultListModel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.ListCellRenderer;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.filechooser.FileSystemView;

import com.google.common.base.Preconditions;

import se.got.Co4robotsGUI;
import se.got.Subscriber;
import se.got.gui.panels.Co4robotsLabel;
import se.got.gui.panels.CurrentMissionPanel;
import se.got.model.Robot;
import se.got.model.RobotLibrary;
import se.got.model.RobotType;
import se.got.model.Workspace;

public class RobotSelectionPanel extends JPanel implements Observer {

	private static JTextField ipTextField;
	private static JTextField robotTextField;
	private static JTextField portTextField;
	private static JTextField publisherportTextField;

	private static final Color redCo4robots = new Color(157, 15, 0);
	private static final Color grayCo4robots = new Color(105, 105, 105);

	private DefaultListModel<Robot> robotLibraryModel;

	private Color textSelectionColor = Color.WHITE;
	private Color backgroundSelectionColor = redCo4robots;
	private Color textNonSelectionColor = Color.WHITE;
	private Color backgroundNonSelectionColor = Color.WHITE;

	private JComboBox robotTypeList;

	private JList<Robot> robotTeamLibrary;
	private javax.swing.JButton addRobot;

	private static Subscriber sub;

	private final Workspace model;

	public RobotSelectionPanel(Workspace model) throws IOException {

		Preconditions.checkNotNull(model, "The model cannot be null");

		this.model = model;
		model.addObserver(this);
		robotTextField = new JTextField(15);
		robotTextField.setText("");
		robotTextField.setColumns(15);

		this.addRobot = new javax.swing.JButton();

		this.addRobot.setText("Add");

		ipTextField = new JTextField(15);
		ipTextField.setText("");
		ipTextField.setColumns(15);

		portTextField = new JTextField(5);
		portTextField.setText("13000");

		publisherportTextField = new JTextField(5);
		publisherportTextField.setText("13001");

		this.robotLibraryModel = new DefaultListModel<>();

		RobotLibrary robots = null;

		this.robotTypeList = new JComboBox<>();

		this.robotTeamLibrary = new JList<>();

		String libraryPath = this.getClass().getClassLoader().getResource("robotlibrary/").getPath();

		System.out.println(libraryPath);
		robots = RobotLibrary.loadRobotLibrary(libraryPath + "robotLibrary.xml");
		System.out.println(robots);

		robots.setPath(libraryPath);

		model.setRobotLibrary(robots);

		this.updateGUI();

		// contentPane.add(scrollPane, BorderLayout.CENTER);

		// JComboBox comboBox = new JComboBox(elements);
		// comboBox.setRenderer(renderer);

		this.setLayout(new GridLayout(0, 1));

		JPanel robotCreationPanel = new JPanel();
		robotCreationPanel.setLayout(new BoxLayout(robotCreationPanel, BoxLayout.Y_AXIS));

		robotCreationPanel.add(new RobotSelectionItemPanel(new Co4robotsLabel("Robot name:"), robotTextField));

		robotTypeList.setBackground(backgroundNonSelectionColor);
		robotCreationPanel.add(new RobotSelectionItemPanel(new Co4robotsLabel("Robot model:"), robotTypeList));

		robotCreationPanel.add(new RobotSelectionItemPanel(new Co4robotsLabel("IP:"), ipTextField));

		robotCreationPanel
				.add(new RobotSelectionItemPanel(new Co4robotsLabel("Publisher PORT:"), publisherportTextField));

		robotCreationPanel.add(new RobotSelectionItemPanel(new Co4robotsLabel("Server PORT"), portTextField));

		robotCreationPanel.add(new RobotSelectionItemPanel(new JLabel(""), this.addRobot));

		this.add(robotCreationPanel);

		JPanel robotTeamp = new JPanel();

		
		TitledBorder missionLibraryBorder = javax.swing.BorderFactory.createTitledBorder(null, "Members of the robotic team", 2, 2,
				Co4robotsGUI.FONT, Co4robotsGUI.REDCO4ROBOTS);

		
		robotTeamp.setBorder(missionLibraryBorder);
		robotTeamp.add(this.robotTeamLibrary);
		robotTeamp.setBackground(Co4robotsGUI.BACKGROUNDCOLOR);
		
		this.add(robotTeamp);

		List<RobotType> robotList = robots.getRobots();

		this.addRobot.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {

				// sub = new Subscriber(ipTextField.getText(),
				// Integer.parseInt(publisherportTextField.getText()),
				// PatternSelectionPanel.availableActions, PatternSelectionPanel.actionsModel);
				// Thread t = new Thread(sub);
				// t.start();

				if (model.containsRobot(robotTextField.getText())) {
					throw new IllegalArgumentException(
							"Robot " + robotTextField.getText() + " already present in the system");
				}

				if (robotTextField.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "You should type a name for the robot ");

				} else {
					CurrentMissionPanel p = new CurrentMissionPanel(model, robotTextField.getText());
					Co4robotsGUI.tabbedPane.addTab(robotTextField.getText(), p);

					String robotName = ((RobotType) robotTypeList.getSelectedItem()).getName();

					RobotType r = robotList.stream().filter(ro -> ro.getName().equals(robotName))
							.collect(Collectors.toList()).get(0);
					model.addRobot(robotTextField.getText(), r);
					model.setRobotIPandPORT(robotTextField.getText(), ipTextField.getText(), portTextField.getText());

				}
			}

		});

		this.setBackground(Co4robotsGUI.BACKGROUNDCOLOR);

	}

	public void updateGUI() {

		Object[] iconMap = model.getRobotLibrary().getRobots().toArray();

		robotTypeList.setModel(new DefaultComboBoxModel(iconMap));

		IconListRenderer l = new IconListRenderer(iconMap, model);
		robotTypeList.setRenderer(l);

		this.robotTypeList.repaint();

	}

	public class TeamRender extends DefaultListCellRenderer {

		private FileSystemView fileSystemView;

		private Color textSelectionColor = Color.WHITE;
		private Color backgroundSelectionColor = redCo4robots;
		private Color textNonSelectionColor = Color.WHITE;
		private Color backgroundNonSelectionColor = grayCo4robots;

		private Workspace p;

		private ImageIcon icon;

		public TeamRender(Workspace p) {

			this.p = p;
		}

		@Override
		public Component getListCellRendererComponent(JList<? extends Object> list, Object value, int index,
				boolean isSelected, boolean cellHasFocus) {

			Robot val = (Robot) value;

			String iconPath=p.getRobotLibrary().getPath() + "/"+val.getType().getIconPath();
			System.out.println(iconPath);
			icon = new ImageIcon(iconPath);
			int size = 40;
			
			Image image = icon.getImage();
			Image newimg = image.getScaledInstance(
					image.getWidth(this) / (image.getHeight(this) / size), size,
					java.awt.Image.SCALE_SMOOTH);
			// // scale it the smooth way
			icon = new ImageIcon(newimg);

			setText(val.getName());
			setIcon(icon);

			if (isSelected) {
				setBackground(backgroundSelectionColor);
				setForeground(textSelectionColor);
			} else {
				setBackground(backgroundNonSelectionColor);
				setForeground(textNonSelectionColor);
			}
			return this;
		}

	}

	class IconListRenderer extends JLabel implements ListCellRenderer {
		private static final long serialVersionUID = 1L;
		private Object[] icons = null;

		int size = 20;
		private final Workspace p;

		public IconListRenderer(Object[] icons, Workspace p) {
			this.icons = icons;
			this.p = p;

			setOpaque(true);
			setHorizontalAlignment(CENTER);
			setVerticalAlignment(CENTER);

		}

		@Override
		public Component getListCellRendererComponent(JList list, Object value, int index, boolean isSelected,
				boolean cellHasFocus) {

			RobotType r = (RobotType) value;
			// Get icon to use for the list item value

			ImageIcon summitIcon;
			try {
				String path2 = p.getRobotLibrary().getPath() + "/" + r.getIconPath();
				summitIcon = new ImageIcon(ImageIO.read(new File(path2)));

				Image summitimage = summitIcon.getImage(); // transform it

				Image newimg = summitimage.getScaledInstance(
						summitimage.getWidth(this) / (summitimage.getHeight(this) / size), size,
						java.awt.Image.SCALE_SMOOTH); // scale it the smooth way
				summitIcon = new ImageIcon(newimg);

				Icon icon = (Icon) new ImageIcon(newimg);

				// Set icon to display for value
				setText(r.getName());
				setIcon(icon);

				if (isSelected) {
					this.setBackground(backgroundSelectionColor);
					this.setForeground(Color.BLACK);
				} else {
					this.setBackground(backgroundNonSelectionColor);
					this.setForeground(Color.BLACK);
				}

				return this;
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return null;

		}
	}

	@Override
	public void update(Observable o, Object arg) {

		if (model == null) {
			throw new InternalError("Internal error, the model cannot be null");
		}
		if (this.model.getRobotLibrary() == null) {
			throw new InternalError("Internal error, the robot library cannot be null");
		}

		this.updateGUI();
		this.repaint();

		// robotTeamLibrary.setCellRenderer(new MissionLibraryRender());
		robotTeamLibrary.setBackground(Co4robotsGUI.BACKGROUNDCOLOR);
		robotTeamLibrary.setForeground(Co4robotsGUI.BACKGROUNDCOLOR);

		System.out.println("Update model of the robot " + this.getName());
		robotLibraryModel = new DefaultListModel<>();

		robotTeamLibrary.setCellRenderer(new TeamRender(model));

		for (Robot e : model.getAvailableRobots()) {
			robotLibraryModel.addElement(e);
		}

		this.robotTeamLibrary.setModel(robotLibraryModel);
		this.repaint();

	}
}
