package se.got.gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JLabel;
import java.awt.Toolkit;
import javax.swing.JTabbedPane;
import java.awt.BorderLayout;
import javax.swing.JDesktopPane;
import javax.swing.JPanel;
import java.awt.FlowLayout;
import javax.swing.JSplitPane;
import javax.swing.JToolBar;

public class Co4robotApp {

	private JFrame co4robotsMainFrame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Co4robotApp window = new Co4robotApp();
					window.co4robotsMainFrame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Co4robotApp() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		co4robotsMainFrame = new JFrame();
		co4robotsMainFrame.setIconImage(Toolkit.getDefaultToolkit().getImage(Co4robotApp.class.getResource("/images/co4robotsLogo20px.png")));
		co4robotsMainFrame.setBounds(100, 100, 450, 300);
		co4robotsMainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JMenuBar menuBar = new JMenuBar();
		co4robotsMainFrame.setJMenuBar(menuBar);
		
		JMenu fileMenu = new JMenu("File");
		menuBar.add(fileMenu);
		
		JLabel fileOpen = new JLabel("Open");
		fileMenu.add(fileOpen);
		co4robotsMainFrame.getContentPane().setLayout(new BorderLayout(0, 0));
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		co4robotsMainFrame.getContentPane().add(tabbedPane, BorderLayout.CENTER);
	}
}
