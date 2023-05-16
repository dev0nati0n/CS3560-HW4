package gui;
import javax.swing.*;
import java.awt.*;

public class OrderWindow extends JFrame
{
	private JPanel panel;
	private JPanel buttonPanel;
	private JLabel numberLabel;
	private JLabel dateLabel;
	private JLabel customerLabel;
	private JLabel itemLabel;
	private JLabel priceLabel;
	private JTextField numberField;
	private JTextField dateField;
	private JComboBox customerField;
	private JComboBox itemField;
	private JTextField priceField;
	private JButton searchButton;
	private JButton addButton;
	private JButton updateButton;
	private JButton deleteButton;
	
		
	public OrderWindow()
	{
		final int WINDOW_HEIGHT = 1920;
		final int WINDOW_WIDTH = 1080;
		
		setTitle("Customer");
		
		setSize(WINDOW_HEIGHT, WINDOW_WIDTH);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setVisible(true);
		
		panel = new JPanel();
		numberLabel = new JLabel("Number");
		numberField = new JTextField(15);
		dateLabel = new JLabel("Date");
		dateField = new JTextField(10);
		customerLabel = new JLabel("Customer");
		customerField = new JComboBox();
		itemLabel = new JLabel("Item");
		itemField = new JComboBox();
		priceLabel = new JLabel("Price");
		priceField = new JTextField(5);
		panel.add(numberLabel);
		panel.add(numberField);
		panel.add(dateLabel);
		panel.add(dateField);
		panel.add(customerLabel);
		panel.add(customerField);
		panel.add(itemLabel);
		panel.add(itemField);
		panel.add(priceLabel);
		panel.add(priceField);
		
		buttonPanel = new JPanel();
		searchButton = new JButton("Search");
		addButton = new JButton("Add");
		updateButton = new JButton("Update");
		deleteButton = new JButton("Delete");
		buttonPanel.add(searchButton);
		buttonPanel.add(addButton);
		buttonPanel.add(updateButton);
		buttonPanel.add(deleteButton);
		
		add(panel);
		panel.add(buttonPanel);
		pack();
		
	}
	
	public static void main(String args[])
	{
		new OrderWindow();
	}
}
