package se.got.panels;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;

import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.ListCellRenderer;
import javax.swing.border.EmptyBorder;

import se.got.Co4robotsGUI;

public class MyCellRenderer implements ListCellRenderer {

	private Color textSelectionColor = Color.WHITE;
	private Color backgroundSelectionColor = Co4robotsGUI.REDCO4ROBOTS;
	private Color textNonSelectionColor = Color.WHITE;
	private Color backgroundNonSelectionColor = Co4robotsGUI.GRAYCO4ROBOTS;

	private JPanel p;
	private JTextArea ta;

	public MyCellRenderer() {
		p = new JPanel();
		p.setLayout(new BorderLayout());

		// text
		ta = new JTextArea();
		ta.setLineWrap(true);
		ta.setWrapStyleWord(true);

		p.add(ta, BorderLayout.CENTER);
		p.setBorder(new EmptyBorder(5, 5, 5, 5));
		ta.setForeground(Color.BLACK);
	}

	@Override
	public Component getListCellRendererComponent(final JList list, final Object value, final int index,
			final boolean isSelected, final boolean hasFocus) {

		ta.setText((String) value);
		int width = list.getWidth();
		// this is just to lure the ta's internal sizing mechanism into action
		if (width > 0)
			ta.setSize(width, Short.MAX_VALUE);
		
		ta.setBackground(Co4robotsGUI.BACKGROUNDCOLOR);
		
		if (isSelected) {
			p.setBackground(Co4robotsGUI.GRAYCO4ROBOTS);
			p.setForeground(Co4robotsGUI.GRAYCO4ROBOTS);
			
			ta.setBackground(Co4robotsGUI.GRAYCO4ROBOTS);
			ta.setForeground(Color.WHITE);
			
			
		} else {
			p.setBackground(Co4robotsGUI.BACKGROUNDCOLOR);
			p.setForeground(Co4robotsGUI.BACKGROUNDCOLOR);
			
			ta.setBackground(Co4robotsGUI.BACKGROUNDCOLOR);
			ta.setForeground(Color.BLACK);
		}
		
		return p;

	}
}