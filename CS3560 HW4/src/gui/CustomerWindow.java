package gui;
import javax.swing.*;
import java.awt.event.*;

public class CustomerWindow extends JFrame
{
	private JPanel panel;
	private JPanel addressPanel;
	private JPanel buttonPanel;
	private JLabel nameLabel;
	private JLabel phoneLabel;
	private JLabel emailLabel;
	private JLabel streetLabel;
	private JLabel cityLabel;
	private JLabel stateLabel;
	private JLabel zipLabel;
	private JTextField nameField;
	private JTextField phoneField;
	private JTextField emailField;
	private JTextField streetField;
	private JTextField cityField;
	private JTextField stateField;
	private JTextField zipField;
	private JButton searchButton;
	private JButton addButton;
	private JButton updateButton;
	private JButton deleteButton;
		
	public CustomerWindow()
	{
		final int WINDOW_HEIGHT = 1920;
		final int WINDOW_WIDTH = 1080;
		
		setTitle("Customer");
		
		setSize(WINDOW_HEIGHT, WINDOW_WIDTH);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setVisible(true);
		
		panel = new JPanel();
		nameLabel = new JLabel("Name");
		nameField = new JTextField(15);
		phoneLabel = new JLabel("Phone");
		phoneField = new JTextField(10);
		emailLabel = new JLabel("Email");
		emailField = new JTextField(20);
		panel.add(nameLabel);
		panel.add(nameField);
		panel.add(phoneLabel);
		panel.add(phoneField);
		panel.add(emailLabel);
		panel.add(emailField);
		
		addressPanel = new JPanel();
		streetLabel = new JLabel("Street");
		streetField = new JTextField(20);
		cityLabel = new JLabel("City");
		cityField = new JTextField(15);
		stateLabel = new JLabel("State");
		stateField = new JTextField(10);
		zipLabel = new JLabel("ZIP Code");
		zipField = new JTextField(5);
		addressPanel.add(streetLabel);
		addressPanel.add(streetField);
		addressPanel.add(cityLabel);
		addressPanel.add(cityField);
		addressPanel.add(stateLabel);
		addressPanel.add(stateField);
		addressPanel.add(zipLabel);
		addressPanel.add(zipField);
		
		buttonPanel = new JPanel();
		searchButton = new JButton("Search");
		addButton = new JButton("Add");
		updateButton = new JButton("Update");
		deleteButton = new JButton("Delete");
		searchButton.addActionListener(new ButtonListener());
		addButton.addActionListener(new ButtonListener());
		updateButton.addActionListener(new ButtonListener());
		deleteButton.addActionListener(new ButtonListener());
		buttonPanel.add(searchButton);
		buttonPanel.add(addButton);
		buttonPanel.add(updateButton);
		buttonPanel.add(deleteButton);
		
		
		add(panel);
		panel.add(addressPanel);
		panel.add(buttonPanel);
		pack();
		
	}
	
	private class ButtonListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			String actionCommand = e.getActionCommand();
			if (e.getSource() == searchButton)
			{
				System.out.println("Searching...");
			}
			else if (e.getSource() == addButton)
			{
				System.out.println("Adding...");
			}
			else if (e.getSource() == updateButton)
			{
				System.out.println("Updating...");
			}
			else
			{
				System.out.println("Deleting...");
			}
		}
	}
	
	public static void main(String args[])
	{
		new CustomerWindow();
	}
}
