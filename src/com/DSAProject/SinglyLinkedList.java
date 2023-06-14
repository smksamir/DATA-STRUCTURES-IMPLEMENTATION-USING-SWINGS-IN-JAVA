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

public class SinglyLinkedList extends JFrame {

	private JPanel contentPane;
	private JTextField taEnterElement1;
	private JTextField taEnterElement2;
	private JTextField taDisplay;
	class Node
	{
		int data; 
		Node link;
		
	}
	private Node first;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SinglyLinkedList frame = new SinglyLinkedList();
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
	public SinglyLinkedList() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(249, 183, 221));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblSinglyLinkedListHeading = new JLabel("SINGLY LINKED LIST DATASTRUCTURE");
		lblSinglyLinkedListHeading.setFont(new Font("Algerian", Font.BOLD, 15));
		lblSinglyLinkedListHeading.setBounds(72, 10, 297, 21);
		contentPane.add(lblSinglyLinkedListHeading);
		
		JLabel lblEnterElement1 = new JLabel("ENTER THE ELEMENT:");
		lblEnterElement1.setFont(new Font("Constantia", Font.BOLD, 14));
		lblEnterElement1.setBounds(35, 41, 156, 18);
		contentPane.add(lblEnterElement1);
		
		taEnterElement1 = new JTextField();
		taEnterElement1.setBounds(190, 41, 72, 19);
		contentPane.add(taEnterElement1);
		taEnterElement1.setColumns(10);
		
		JLabel lblEnterElement2 = new JLabel("ENTER THE ELEMENT:");
		lblEnterElement2.setFont(new Font("Constantia", Font.BOLD, 14));
		lblEnterElement2.setBounds(35, 72, 156, 18);
		contentPane.add(lblEnterElement2);
		
		JButton btnInsertRear = new JButton("INSERT REAR");
		btnInsertRear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code for insertion at rear
				Node temp;
				int elem=Integer.valueOf(taEnterElement1.getText());
				JOptionPane.showMessageDialog(contentPane,"Element Inserted");
				taEnterElement1.setText("");
				Node newnode= new Node();
				newnode.data=elem;
				newnode.link= null;
				if(first==null)
				{ 
					first=newnode;
				}
				
				else
				{
					
					temp=first;
				while(temp.link!=null)
				{
					temp=temp.link;
				}
				temp.link=newnode;
				}
			}
		});
		btnInsertRear.setFont(new Font("Constantia", Font.BOLD, 14));
		btnInsertRear.setBounds(272, 37, 154, 27);
		contentPane.add(btnInsertRear);
		
		JButton btnInsertFront = new JButton("INSERT FRONT");
		btnInsertFront.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code for insertion at front
				Node temp;
				int elem=Integer.valueOf(taEnterElement2.getText());
				JOptionPane.showMessageDialog(contentPane, "Element Inserted");
				taEnterElement2.setText("");
				Node newnode= new Node();
				newnode.data=elem;
				newnode.link= null;
				if(first==null)
				{ 
					first=newnode;
					
				}
				else
				{
		            newnode.link=first;
		            first=newnode;

				}
			}
		});
		btnInsertFront.setFont(new Font("Constantia", Font.BOLD, 14));
		btnInsertFront.setBounds(272, 68, 154, 27);
		contentPane.add(btnInsertFront);
		
		JButton btnDeleteRear = new JButton("DELETE REAR");
		btnDeleteRear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code for deletion from rear
				
				Node temp;
				if(first==null)
				{
					JOptionPane.showMessageDialog(contentPane,"Deletion not possible");
				}
				else if(first.link==null)
				{
					String message="Element deleted is "+first.data;
					JOptionPane.showMessageDialog(contentPane,message);
					first=null;
					
				}
				else
				{
					temp=first;
					while(temp.link.link!=null)
					{
					  temp=temp.link;
					}
				
					JOptionPane.showMessageDialog(contentPane, "Element deleted is "+temp.link.data);
					temp.link=null;
				}
			}
		});
		btnDeleteRear.setFont(new Font("Constantia", Font.BOLD, 14));
		btnDeleteRear.setBounds(146, 111, 140, 27);
		contentPane.add(btnDeleteRear);
		
		taEnterElement2 = new JTextField();
		taEnterElement2.setBounds(190, 70, 72, 19);
		contentPane.add(taEnterElement2);
		taEnterElement2.setColumns(10);
		
		JButton btnDeleteFront = new JButton("DELETE FRONT");
		btnDeleteFront.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code for deletion from front
				
				if(first==null)
				{
					JOptionPane.showMessageDialog(contentPane, "Deletion not possible");
				}
				else if(first.link==null)
				{
					String message="Element deleted is "+first.data;
					JOptionPane.showMessageDialog(contentPane, message);
				}
				else
				{
					String message="Element deleted is "+first.data;
					JOptionPane.showMessageDialog(contentPane,message);
					first=first.link;
				}
				
			}
		});
		btnDeleteFront.setFont(new Font("Constantia", Font.BOLD, 14));
		btnDeleteFront.setBounds(144, 148, 154, 27);
		contentPane.add(btnDeleteFront);
		
		JButton btnDisplay = new JButton("DISPLAY");
		btnDisplay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code for display
				
				Node temp;
				String msg="";
				if(first==null)
				{
					JOptionPane.showMessageDialog(contentPane,"Display not possible");
				    taDisplay.setText("");
				}
				
				else if(first.link==null)
				{
					taDisplay.setText(msg+first.data);
				}
				else
				{
					temp=first;
					while(temp!=null)
					{
						msg=msg+" "+temp.data;
						temp=temp.link;
					}
					taDisplay.setText(msg);
				}	
			}
		});
		btnDisplay.setFont(new Font("Constantia", Font.BOLD, 14));
		btnDisplay.setBounds(169, 201, 105, 27);
		contentPane.add(btnDisplay);
		
		taDisplay = new JTextField();
		taDisplay.setFont(new Font("Constantia", Font.BOLD, 14));
		taDisplay.setBounds(85, 233, 267, 19);
		contentPane.add(taDisplay);
		taDisplay.setColumns(10);
	}

}