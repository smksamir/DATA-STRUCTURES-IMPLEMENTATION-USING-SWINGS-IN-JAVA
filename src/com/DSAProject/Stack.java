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

public class Stack extends JFrame {

	private JPanel contentPane;
	private JTextField taEnterSize;
	private JTextField taEnterElement;
	private JTextField taDisplay;
	private int s[];
	private int size;
	private int top=-1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Stack frame = new Stack();
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
	public Stack() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(253, 120, 32));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblStackHeading = new JLabel("STACK DATASTRUCTURE");
		lblStackHeading.setFont(new Font("Algerian", Font.BOLD, 16));
		lblStackHeading.setBounds(119, 10, 222, 22);
		contentPane.add(lblStackHeading);
		
		JLabel lblEnterStackSize = new JLabel("ENTER THE STACK SIZE:");
		lblEnterStackSize.setForeground(new Color(0, 128, 128));
		lblEnterStackSize.setFont(new Font("Constantia", Font.BOLD, 14));
		lblEnterStackSize.setBounds(31, 54, 169, 18);
		contentPane.add(lblEnterStackSize);
		
		taEnterSize = new JTextField();
		taEnterSize.setBounds(210, 52, 77, 19);
		contentPane.add(taEnterSize);
		taEnterSize.setColumns(10);
		
		JButton btnCreateStack = new JButton("CREATE STACK");
		btnCreateStack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code for stack creation
				size=Integer.valueOf(taEnterSize.getText());
				s=new int[size];
				String message="Stack of size "+size+" created";
				JOptionPane.showMessageDialog(contentPane, message);
				
				
			}
		});
		btnCreateStack.setFont(new Font("Constantia", Font.BOLD, 14));
		btnCreateStack.setForeground(new Color(0, 128, 128));
		btnCreateStack.setBounds(137, 82, 150, 27);
		contentPane.add(btnCreateStack);
		
		JLabel lblEnterElement = new JLabel("ENTER AN ELEMENT:");
		lblEnterElement.setForeground(new Color(0, 128, 128));
		lblEnterElement.setFont(new Font("Constantia", Font.BOLD, 14));
		lblEnterElement.setBounds(37, 119, 147, 18);
		contentPane.add(lblEnterElement);
		
		taEnterElement = new JTextField();
		taEnterElement.setBounds(191, 119, 96, 19);
		contentPane.add(taEnterElement);
		taEnterElement.setColumns(10);
		
		JButton btnPush = new JButton("PUSH");
		btnPush.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code for push
				int elem;
				if(top==size-1)
				{
					JOptionPane.showMessageDialog(contentPane, "Push not Possible");
				}
				else
				{
					
	                 elem=Integer.valueOf(taEnterElement.getText());
					++top;
					s[top]=elem;
					JOptionPane.showMessageDialog(contentPane, "Push Successful");
					taEnterElement.setText("");
				}
			}
		});
		btnPush.setForeground(new Color(0, 128, 128));
		btnPush.setFont(new Font("Constantia", Font.BOLD, 14));
		btnPush.setBounds(297, 115, 84, 27);
		contentPane.add(btnPush);
		
		JButton btnPop = new JButton("POP");
		btnPop.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code for pop
				if(top==-1)
				{
					JOptionPane.showMessageDialog(contentPane, "Pop not possible");
					
				}
				else
				{
					String message="Element deleted is "+s[top];
					JOptionPane.showMessageDialog(contentPane,message);
					--top;
				}
			}
		});
		btnPop.setForeground(new Color(0, 128, 128));
		btnPop.setFont(new Font("Constantia", Font.BOLD, 14));
		btnPop.setBounds(177, 158, 74, 27);
		contentPane.add(btnPop);
		
		JButton btnDisplay = new JButton("DISPLAY");
		btnDisplay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code for display
				String msg="";
				if(top==-1)
				{
					JOptionPane.showMessageDialog(contentPane, "Display not possible");
					taDisplay.setText("");
				}
				else
				{
					for(int i=top;i>=0; i--)
					{
						msg=msg+" "+s[i];
					}
					taDisplay.setText(msg);	
				}
			}
		});
		btnDisplay.setForeground(new Color(0, 128, 128));
		btnDisplay.setFont(new Font("Constantia", Font.BOLD, 14));
		btnDisplay.setBounds(158, 195, 104, 27);
		contentPane.add(btnDisplay);
		
		taDisplay = new JTextField();
		taDisplay.setBounds(83, 234, 258, 19);
		contentPane.add(taDisplay);
		taDisplay.setColumns(10);
	}
}