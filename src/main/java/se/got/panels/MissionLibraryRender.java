package se.got.panels;

import java.awt.Color;
import java.awt.Component;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.LinkOption;

import javax.imageio.ImageIO;
import javax.swing.DefaultListCellRenderer;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.filechooser.FileSystemView;

public class MissionLibraryRender extends DefaultListCellRenderer {

	private JLabel label;
	private FileSystemView fileSystemView;

	private static final Color redCo4robots = new Color(157, 15, 0);
	private static final Color grayCo4robots = new Color(105, 105, 105);

	private Color textSelectionColor = Color.WHITE;
	private Color backgroundSelectionColor = redCo4robots;
	private Color textNonSelectionColor = Color.WHITE;
	private Color backgroundNonSelectionColor = grayCo4robots;

	private ImageIcon icon;

	public MissionLibraryRender() {
		label = new JLabel();
		label.setOpaque(true);

	}

	@Override
	public Component getListCellRendererComponent(JList<? extends Object> list, Object value, int index,
			boolean isSelected, boolean cellHasFocus) {

		try {
			String val = (String) value;
			// File f= new File(getClass().getClassLoader().("images/"+val.substring(0,
			// val.indexOf(" "))+".png").getPath());
			// if(f.exists()){
			System.out.println("Loading image: " + "images/" + val.substring(0, val.indexOf(" ")) + ".png");
			// System.out.println("Path: "+getClass().getResource("images/"+val.substring(0,
			// val.indexOf(" "))+".png").toURI());

			icon = new ImageIcon(ImageIO.read(getClass().getClassLoader()
					.getResourceAsStream("images/" + val.substring(0, val.indexOf(" ")) + ".png")));
			Image image = icon.getImage(); // transform it
			Image newimg = image.getScaledInstance(40, 40, java.awt.Image.SCALE_SMOOTH); // scale it the smooth way
			icon = new ImageIcon(newimg);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		label.setText((String) value);
		label.setIcon(icon);

		if (isSelected) {
			label.setBackground(backgroundSelectionColor);
			label.setForeground(textSelectionColor);
		} else {
			label.setBackground(backgroundNonSelectionColor);
			label.setForeground(textNonSelectionColor);
		}
		return label;
	}

}
