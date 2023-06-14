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

public class CircularQueue extends JFrame {

	private JPanel contentPane;
	private JTextField taEnterSize;
	private JTextField taEnterElement;
	private JTextField taDisplay;
	private int cq[];
	private int size;
	private int f=0; 
	private int r=-1; 
	private int count=0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CircularQueue frame = new CircularQueue();
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
	public CircularQueue() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(133, 188, 180));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCircularQueueHeading = new JLabel("CIRCULAR QUEUE DATASTRUCTURE");
		lblCircularQueueHeading.setFont(new Font("Algerian", Font.BOLD, 16));
		lblCircularQueueHeading.setBounds(68, 7, 302, 22);
		contentPane.add(lblCircularQueueHeading);
		
		JLabel lblEnterSize = new JLabel("ENTER QUEUE SIZE:");
		lblEnterSize.setForeground(new Color(19, 0, 85));
		lblEnterSize.setFont(new Font("Constantia", Font.BOLD, 14));
		lblEnterSize.setBounds(32, 39, 142, 18);
		contentPane.add(lblEnterSize);
		
		taEnterSize = new JTextField();
		taEnterSize.setBounds(177, 37, 85, 19);
		contentPane.add(taEnterSize);
		taEnterSize.setColumns(10);
		
		JButton btnCreateQueue = new JButton("CREATE QUEUE");
		btnCreateQueue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code for creation
				
				size=Integer.valueOf(taEnterSize.getText());
				cq=new int[size];
				String message="Queue of size "+size+" created";
				JOptionPane.showMessageDialog(contentPane, message);
			}
		});
		btnCreateQueue.setFont(new Font("Constantia", Font.BOLD, 14));
		btnCreateQueue.setBounds(135, 67, 155, 27);
		contentPane.add(btnCreateQueue);
		
		JLabel lblEnterElement = new JLabel("ENTER AN ELEMENT:");
		lblEnterElement.setFont(new Font("Constantia", Font.BOLD, 14));
		lblEnterElement.setBounds(32, 117, 147, 18);
		contentPane.add(lblEnterElement);
		
		taEnterElement = new JTextField();
		taEnterElement.setBounds(177, 115, 85, 19);
		contentPane.add(taEnterElement);
		taEnterElement.setColumns(10);
		
		JButton btnInsert = new JButton("INSERT");
		btnInsert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code for insertion
				

				if(count==size)
				{
				JOptionPane.showMessageDialog(contentPane,"Insertion not possible");
				taEnterElement.setText("");

				}
				else
				{
					
					int elem=Integer.valueOf(taEnterElement.getText());
					r=(r+1)%size;
					cq[r]=elem;
					count++;
					JOptionPane.showMessageDialog(contentPane, "Insertion successful");
					taEnterElement.setText("");
				}
			}
		});
		btnInsert.setFont(new Font("Constantia", Font.BOLD, 14));
		btnInsert.setBounds(277, 113, 93, 27);
		contentPane.add(btnInsert);
		
		JButton btnDelete = new JButton("DELETE");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code for deletion
				
				if(count==0)
				{
					JOptionPane.showMessageDialog(contentPane, "Deletion not possible");
				}
				else
				{
					String message="Element deleted is "+cq[f];
					JOptionPane.showMessageDialog(contentPane, message);
					f=(f+1)%size;
					count--;
					
				}
			}
		});
		btnDelete.setFont(new Font("Constantia", Font.BOLD, 14));
		btnDelete.setBounds(177, 154, 99, 27);
		contentPane.add(btnDelete);
		
		JButton btnDisplay = new JButton("DISPLAY");
		btnDisplay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code for display
				String msg="";
				int f1=f;
				if(count==0)
				{
					JOptionPane.showMessageDialog(contentPane, "Display not possible");
					taDisplay.setText("");
				}
				else
				{
					for(int i=1; i<=count; i++)
					{
						msg=msg+" "+cq[f1];
						f1=(f1+1)%size;
					}
					taDisplay.setText(msg);
				}
				
				
			}
		});
		btnDisplay.setFont(new Font("Constantia", Font.BOLD, 14));
		btnDisplay.setBounds(177, 191, 99, 27);
		contentPane.add(btnDisplay);
		
		taDisplay = new JTextField();
		taDisplay.setBounds(87, 234, 275, 19);
		contentPane.add(taDisplay);
		taDisplay.setColumns(10);
	}

}