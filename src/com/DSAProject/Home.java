package com.DSAProject;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Home extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Home frame = new Home();
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
	public Home() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(128, 255, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblHeading = new JLabel("CHOOSE A DATASTRUCTURE");
		lblHeading.setForeground(new Color(128, 128, 192));
		lblHeading.setFont(new Font("Algerian", Font.BOLD, 14));
		lblHeading.setBounds(112, 10, 217, 19);
		contentPane.add(lblHeading);
		
		JButton btnArray = new JButton("ARRAY");
		btnArray.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//PLACE ARRAY WINDOW OPENING CODE HERE
				new Array().setVisible(true);
			}
		});
		btnArray.setForeground(new Color(0, 64, 128));
		btnArray.setFont(new Font("Constantia", Font.BOLD, 12));
		btnArray.setBounds(171, 39, 85, 21);
		contentPane.add(btnArray);
		
		JButton btnStack = new JButton("STACK");
		btnStack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//PLACE STACK WINDOW OPENING CODE HERE
				new Stack().setVisible(true);
			}
		});
		btnStack.setFont(new Font("Constantia", Font.BOLD, 12));
		btnStack.setBounds(65, 83, 75, 23);
		contentPane.add(btnStack);
		
		JButton btnQueue = new JButton("QUEUE");
		btnQueue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//PLACE QUEUE WINDOW OPENING CODE HERE
				new Queue().setVisible(true);

			}
		});
		btnQueue.setFont(new Font("Constantia", Font.BOLD, 12));
		btnQueue.setBounds(292, 83, 90, 23);
		contentPane.add(btnQueue);
		
		JButton btnCircularQueue = new JButton("CIRCULAR QUEUE");
		btnCircularQueue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//PLACE CIRCULAR QUEUE WINDOW OPENING CODE HERE
				new CircularQueue().setVisible(true);

			}
		});
		btnCircularQueue.setFont(new Font("Constantia", Font.BOLD, 12));
		btnCircularQueue.setBounds(24, 146, 163, 23);
		contentPane.add(btnCircularQueue);
		
		JButton btnSinglyLinkedList = new JButton("SINGLY LINKED LIST");
		btnSinglyLinkedList.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//PLACE SINGLY LINKED LIST WINDOW OPENING CODE HERE
				
				new SinglyLinkedList().setVisible(true);

			}
		});
		btnSinglyLinkedList.setFont(new Font("Constantia", Font.BOLD, 12));
		btnSinglyLinkedList.setBounds(254, 146, 172, 23);
		contentPane.add(btnSinglyLinkedList);
		
		JButton btnDoublyLinkedList = new JButton("DOUBLY LINKED LIST");
		btnDoublyLinkedList.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//PLACE DOUBLY LIKED LIST WINDOW OPENING CODE HERE
				new DoublyLinkedList().setVisible(true);

			}
		});
		btnDoublyLinkedList.setFont(new Font("Constantia", Font.BOLD, 12));
		btnDoublyLinkedList.setBounds(143, 214, 172, 23);
		contentPane.add(btnDoublyLinkedList);
	}
}