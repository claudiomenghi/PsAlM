package se.gu.gui.panels;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.Toolkit;
import java.util.StringTokenizer;

import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.ListCellRenderer;
import javax.swing.UIManager;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;

public class TabListCellRender extends JPanel implements ListCellRenderer {

	private static final Border NO_FOCUS_BORDER = new EmptyBorder(1, 1, 1, 1);

	private final JTextArea contentArea;

	public TabListCellRender() {
		contentArea = new JTextArea();
		
		contentArea.setMaximumSize(new Dimension((int) Toolkit.getDefaultToolkit().getScreenSize().getWidth()/3,(int) Toolkit.getDefaultToolkit().getScreenSize().getHeight() ));

		contentArea.setBackground(Color.RED);
		contentArea.setLineWrap(true);
		contentArea.setWrapStyleWord(true);
		contentArea.setOpaque(true);
		contentArea.setBackground(Color.LIGHT_GRAY);
		build();
	}

	private void build() {

		setLayout(new BorderLayout());
		add(contentArea, BorderLayout.CENTER);
	}

	public Component getListCellRendererComponent(JList list, Object value, int index, boolean isSelected,
			boolean cellHasFocus) {

		setBorder(cellHasFocus ? UIManager.getBorder("List.focusCellHighlightBorder") : NO_FOCUS_BORDER);

		contentArea.setText(value.toString());
		return this;
	}
}
