package com.DSAProject;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Queue extends JFrame {

	private JPanel contentPane;
	private JTextField taEnterSize;
	private JTextField taEnterElement;
	private JTextField taDisplay;
	private int q[];
	private int size;
	private int r=-1;
	private int f=0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Queue frame = new Queue();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Queue() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(249, 200, 51));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblQueueHeading = new JLabel("QUEUE DATASTRUCTURE");
		lblQueueHeading.setFont(new Font("Algerian", Font.BOLD, 16));
		lblQueueHeading.setBounds(110, 10, 215, 22);
		contentPane.add(lblQueueHeading);
		
		JLabel lblEnterSize = new JLabel("ENTER QUEUE SIZE:");
		lblEnterSize.setForeground(new Color(128, 0, 64));
		lblEnterSize.setFont(new Font("Constantia", Font.BOLD, 14));
		lblEnterSize.setBounds(41, 42, 142, 18);
		contentPane.add(lblEnterSize);
		
		taEnterSize = new JTextField();
		taEnterSize.setBounds(183, 40, 96, 19);
		contentPane.add(taEnterSize);
		taEnterSize.setColumns(10);
		
		JButton btnCreateQueue = new JButton("CREATE QUEUE");
		btnCreateQueue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		    //code for creation
				size=Integer.valueOf(taEnterSize.getText());
				q=new int[size];
				String message="Queue of size "+size+" created";
				JOptionPane.showMessageDialog(contentPane, message);
				
			}
		});
		btnCreateQueue.setFont(new Font("Constantia", Font.BOLD, 14));
		btnCreateQueue.setBounds(121, 70, 148, 27);
		contentPane.add(btnCreateQueue);
		
		JLabel lblEnterElement = new JLabel("ENTER AN ELEMENT:");
		lblEnterElement.setFont(new Font("Constantia", Font.BOLD, 14));
		lblEnterElement.setBounds(41, 122, 147, 18);
		contentPane.add(lblEnterElement);
		
		taEnterElement = new JTextField();
		taEnterElement.setBounds(188, 120, 81, 19);
		contentPane.add(taEnterElement);
		taEnterElement.setColumns(10);
		
		JButton btnInsert = new JButton("INSERT");
		btnInsert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code for insertion
				int elem;
				if(r==size-1)
				{
					JOptionPane.showMessageDialog(contentPane, "Insertion not possible");
					taEnterElement.setText("");
				}
				else
				{
					elem=Integer.valueOf(taEnterElement.getText());
					++r;
					q[r]=elem;
					JOptionPane.showMessageDialog(contentPane, "Insertion successful");
					taEnterElement.setText("");
				}
				
			}
		});
		btnInsert.setFont(new Font("Constantia", Font.BOLD, 14));
		btnInsert.setBounds(287, 118, 96, 27);
		contentPane.add(btnInsert);
		
		JButton btnDelete = new JButton("DELETE");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code for deletion
				if(r==-1||f>r)
				{
					JOptionPane.showMessageDialog(contentPane, "Deletion not possible");
				}
				else
				{
					String message="Element deleted is "+q[f];
					JOptionPane.showMessageDialog(contentPane, message);
					++f;
				}
			}
		});
		btnDelete.setFont(new Font("Constantia", Font.BOLD, 14));
		btnDelete.setBounds(177, 161, 96, 27);
		contentPane.add(btnDelete);
		
		JButton btnDisplay = new JButton("DISPLAY");
		btnDisplay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code for display
				String msg="";
				if(r==-1||f>r)
				{
					JOptionPane.showMessageDialog(contentPane, "Display not possibel");
					taDisplay.setText("");
				}
				else	
				{
					for(int i=f; i<=r; i++)
					{
					msg=msg+" "+q[i];
					}
					taDisplay.setText(msg);
				}
			}
		});
		btnDisplay.setFont(new Font("Constantia", Font.BOLD, 14));
		btnDisplay.setBounds(174, 197, 104, 27);
		contentPane.add(btnDisplay);
		
		taDisplay = new JTextField();
		taDisplay.setBounds(80, 234, 282, 19);
		contentPane.add(taDisplay);
		taDisplay.setColumns(10);
	}
}
