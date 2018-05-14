package se.got;

import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.ListModel;

public class Subscriber implements Runnable {

	private int port;
	private String ip;
	private JList<String> list;
	private DefaultListModel<String> listModel;

	public Subscriber(String ip, int port, JList<String> list, DefaultListModel<String> listModel) {
		this.port = port;
		this.ip = ip;
		this.list = list;
		this.listModel=listModel;
	}

	public void run() {

		System.out.println("Subscribing to the publisher with IP:" + ip + "\t on the PORT: " + port);
		Socket socket;
		try {
			//socket = new Socket(ip, port);

			int j=0;
			//Scanner scanner = new Scanner(socket.getInputStream());
			while (j<2) {
				j++;
				// Read envelope with address
				//String message = scanner.nextLine();
				
				String message="locations [l1,l2,l3]";
				System.out.println("Subscriber, new message received: " + message);

				String messageType = message.substring(0, message.indexOf(" "));

				System.out.println("Message type:" + messageType);

				switch (messageType) {
				case "locations":
					String locations = message.substring(message.indexOf("[")+1, message.indexOf("]"));

					String[] locationArray = locations.split(",");
					System.out.println("locations: "+locationArray.toString());
							
							
					for (int i = 0; i < locationArray.length; i++) {
						System.out.println(locationArray[i]);
						listModel.addElement(locationArray[i].replaceAll("'",""));
					}
					
					list.repaint();

					break;
				case "actions":
					String actions = message.substring(message.indexOf("[")+1, message.indexOf("]"));

					String[] actionArray = actions.split(",");
					
					for (int i = 0; i < actionArray.length; i++) {
						listModel.addElement(actionArray[i].replaceAll("'",""));
					}
					list.repaint();
					break;
				default:
					break;
				}
				System.out.println("Message type:" + message.substring(0, message.indexOf(" ")));
			}

		} catch (Exception e//IOException |
				//InterruptedException e
				) {
			JOptionPane.showMessageDialog(null, "Subscriber, connection with the remote publisher lost");
		}

	}
}
