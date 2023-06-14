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
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DoublyLinkedList extends JFrame {

	private JPanel contentPane;
	private JTextField taEnterElement1;
	private JTextField taEnterElement2;
	private JTextField taDisplay;
	class Node{
		Node prelink;
		int data;
		Node nextlink;
		
	}
	private Node first;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DoublyLinkedList frame = new DoublyLinkedList();
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
	public DoublyLinkedList() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(216, 223, 206));
		contentPane.setForeground(new Color(216, 223, 206));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblDoublyLinkedListHeading = new JLabel("DOUBLY LINKED LIST DATASTRUCTURE");
		lblDoublyLinkedListHeading.setFont(new Font("Algerian", Font.BOLD, 16));
		lblDoublyLinkedListHeading.setBounds(58, 10, 327, 22);
		contentPane.add(lblDoublyLinkedListHeading);
		
		JLabel lblEnterElement1 = new JLabel("ENTER THE ELEMENT:");
		lblEnterElement1.setForeground(new Color(0, 128, 192));
		lblEnterElement1.setFont(new Font("Constantia", Font.BOLD, 14));
		lblEnterElement1.setHorizontalAlignment(SwingConstants.TRAILING);
		lblEnterElement1.setBounds(22, 46, 156, 18);
		contentPane.add(lblEnterElement1);
		
		taEnterElement1 = new JTextField();
		taEnterElement1.setBounds(188, 42, 77, 19);
		contentPane.add(taEnterElement1);
		taEnterElement1.setColumns(10);
		
		JButton btnInsertRear = new JButton("INSERT REAR");
		btnInsertRear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code for insertion at rear
				Node temp;
				int elem=Integer.valueOf(taEnterElement1.getText());
				JOptionPane.showMessageDialog(contentPane, "Element Inserted");
				taEnterElement1.setText("");
				Node newnode=new Node();
				newnode.data=elem;
				newnode.prelink=null;
				newnode.nextlink=null;
				if(first==null)
				{
					first=newnode;
					
				}
				else
				{
					temp=first;
					while(temp.nextlink!=null)
					{
						temp=temp.nextlink;
						
					}
					temp.nextlink=newnode;
					newnode.prelink=temp;
				}
				
			}
		});
		btnInsertRear.setForeground(new Color(0, 128, 192));
		btnInsertRear.setFont(new Font("Constantia", Font.BOLD, 14));
		btnInsertRear.setBounds(273, 42, 153, 27);
		contentPane.add(btnInsertRear);
		
		JLabel lblEnterElement2 = new JLabel("ENTER THE ELEMENT:");
		lblEnterElement2.setForeground(new Color(0, 128, 192));
		lblEnterElement2.setFont(new Font("Constantia", Font.BOLD, 14));
		lblEnterElement2.setBounds(22, 87, 156, 18);
		contentPane.add(lblEnterElement2);
		
		taEnterElement2 = new JTextField();
		taEnterElement2.setBounds(188, 85, 77, 19);
		contentPane.add(taEnterElement2);
		taEnterElement2.setColumns(10);
		
		JButton btnInsertFront = new JButton("INSERT FRONT");
		btnInsertFront.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code for insertion at front
				int elem=Integer.valueOf(taEnterElement2.getText());
				JOptionPane.showMessageDialog(contentPane, "Element Inserted");
				taEnterElement2.setText("");
				Node newnode = new Node();
				newnode.data=elem;
				newnode.prelink=null;
				newnode.nextlink=null;
				if(first==null)
				{
					first=newnode;
				}
				else
				{
					newnode.nextlink=first;
					first.prelink=newnode;
					first=newnode;
				}
			}
		});
		btnInsertFront.setForeground(new Color(0, 128, 192));
		btnInsertFront.setFont(new Font("Constantia", Font.BOLD, 14));
		btnInsertFront.setBounds(273, 83, 153, 27);
		contentPane.add(btnInsertFront);
		
		JButton btnDeleteRear = new JButton("DELETE REAR");
		btnDeleteRear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code for deletion from rear
				
				Node temp;
				  if(first==null)
				  {
					  JOptionPane.showMessageDialog(contentPane, "Deletion not possible");
				  }
				  else if(first.nextlink==null)
				  {
					  String message="Element deleted is "+first.data;
					  JOptionPane.showMessageDialog(contentPane, message);
					  first=null;
				  }
				  else
				  {
					  temp=first;
					  while(temp.nextlink.nextlink!=null)
					  {
						  temp=temp.nextlink;
					  }
					  String message="Element deleted is "+temp.nextlink.data;
					  JOptionPane.showMessageDialog(contentPane, message);
					  temp.nextlink=null;
				  }
			}
		});
		btnDeleteRear.setForeground(new Color(0, 128, 192));
		btnDeleteRear.setFont(new Font("Constantia", Font.BOLD, 14));
		btnDeleteRear.setBounds(147, 120, 153, 27);
		contentPane.add(btnDeleteRear);
		
		JButton btnDeleteFront = new JButton("DELETE FRONT");
		btnDeleteFront.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code for deletion from front
				
				if(first==null)
				{
					JOptionPane.showMessageDialog(contentPane, "Deletion not possible" );
				}
				else if(first.nextlink==null)
				{
					String message="Element deleted is "+first.data;
					JOptionPane.showMessageDialog(contentPane,message);
					first=null;
				}
				else
				{
					String message="Element deleted is "+first.data;
					JOptionPane.showMessageDialog(contentPane,message);
					//System.out.println("Element deleted is "+first.data);
					first=first.nextlink;
					first.prelink=null;
				}
			}
		});
		btnDeleteFront.setForeground(new Color(0, 128, 192));
		btnDeleteFront.setFont(new Font("Constantia", Font.BOLD, 14));
		btnDeleteFront.setBounds(147, 157, 153, 27);
		contentPane.add(btnDeleteFront);
		
		JButton btnDisplayForward = new JButton("DISPLAY FORWARD");
		btnDisplayForward.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code for display forward
				
				Node temp;
				String msg="";
				if(first==null)
				{
					JOptionPane.showMessageDialog(contentPane,"Display not possible");
					//System.out.println("Display not possible");
				}
				else if(first.nextlink==null)
				{
					taDisplay.setText(msg+first.data);
				}
				else
				{
					temp=first;
					while(temp!=null)
					{
						msg=msg+" "+temp.data;
						temp=temp.nextlink;
					}
				}
				taDisplay.setText(msg);
			}
		});
		btnDisplayForward.setForeground(new Color(0, 128, 192));
		btnDisplayForward.setFont(new Font("Constantia", Font.BOLD, 14));
		btnDisplayForward.setBounds(22, 194, 184, 27);
		contentPane.add(btnDisplayForward);
		
		JButton btnDisplayReverse = new JButton("DISPLAY REVERSE");
		btnDisplayReverse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code for display reverse
				
				Node temp;
				String msg="";
				if(first==null)
				{
					JOptionPane.showMessageDialog(contentPane, "Display not possible");
					//System.out.println("Display not possible");
				}
				else if(first.nextlink==null)
				{
					taDisplay.setText(msg+first.data);
					//System.out.println(first.data);
				}
				else
				{
					temp=first;
					while(temp.nextlink!=null)
					{
						temp=temp.nextlink;
					}
					while(temp!=null)
					{
						msg=msg+" "+temp.data;
						temp=temp.prelink;
					}
				}
				taDisplay.setText(msg);
			}
		});
		btnDisplayReverse.setForeground(new Color(0, 128, 192));
		btnDisplayReverse.setFont(new Font("Constantia", Font.BOLD, 14));
		btnDisplayReverse.setBounds(253, 194, 173, 27);
		contentPane.add(btnDisplayReverse);
		
		taDisplay = new JTextField();
		taDisplay.setFont(new Font("Constantia", Font.BOLD, 14));
		taDisplay.setBounds(71, 231, 282, 19);
		contentPane.add(taDisplay);
		taDisplay.setColumns(10);
	}

}