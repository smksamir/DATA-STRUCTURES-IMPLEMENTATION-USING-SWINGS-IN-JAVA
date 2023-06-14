package com.DSAProject;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Array extends JFrame {

	private JPanel contentPane;
	private JTextField taLength;
	private JTextField taElement;
	private JTextField taDeletePos;
	private JTextField taPosition;
	private JTextField taDisplayBox;
	private int arr[];

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Array frame = new Array();
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
	public Array() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 598, 354);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(248, 226, 103));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblArrayHeading = new JLabel("ARRAY DATASTRUCTURE");
		lblArrayHeading.setBounds(176, 10, 199, 22);
		lblArrayHeading.setFont(new Font("Algerian", Font.BOLD, 16));
		contentPane.add(lblArrayHeading);
		
		JLabel lblEnterArrayLength = new JLabel("ENTER ARRAY LENGTH:");
		lblEnterArrayLength.setForeground(new Color(0, 64, 64));
		lblEnterArrayLength.setFont(new Font("Constantia", Font.BOLD, 14));
		lblEnterArrayLength.setBounds(115, 47, 166, 18);
		contentPane.add(lblEnterArrayLength);
		
		taLength = new JTextField();
		taLength.setBounds(291, 47, 96, 19);
		contentPane.add(taLength);
		taLength.setColumns(10);
		
		JButton btnCreateArray = new JButton("CREATE ARRAY");
		btnCreateArray.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code for creating array
				int len=Integer.valueOf(taLength.getText());
				arr=new int[len];
				String message="Array of length "+len+" created";
				JOptionPane.showMessageDialog(contentPane,message);
				
			
				
			
				
			}
		});
		btnCreateArray.setForeground(new Color(64, 0, 64));
		btnCreateArray.setFont(new Font("Constantia", Font.BOLD, 14));
		btnCreateArray.setBounds(207, 77, 148, 27);
		contentPane.add(btnCreateArray);
		
		JLabel lblInsertArrayElement = new JLabel("INSERT AN INTEGER ELEMENT:");
		lblInsertArrayElement.setFont(new Font("Constantia", Font.BOLD, 14));
		lblInsertArrayElement.setBounds(30, 138, 219, 18);
		contentPane.add(lblInsertArrayElement);
		
		taElement = new JTextField();
		taElement.setBounds(246, 136, 67, 19);
		contentPane.add(taElement);
		taElement.setColumns(10);
		
		JButton btnInsert = new JButton("INSERT");
		btnInsert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code for insertion
				int elem=Integer.valueOf(taElement.getText());
				int pos=Integer.valueOf(taPosition.getText());
				arr[pos]=elem;
				String message="Element "+elem+" inserted @ position "+pos;
				JOptionPane.showMessageDialog(contentPane, message);
				taElement.setText("");
				taPosition.setText("");
				
				
				
			    
				
			}
		});
		btnInsert.setFont(new Font("Constantia", Font.BOLD, 14));
		btnInsert.setBounds(470, 134, 96, 27);
		contentPane.add(btnInsert);
		
		JLabel lbLDeletePosition = new JLabel("DELETE POSITION:");
		lbLDeletePosition.setFont(new Font("Constantia", Font.BOLD, 14));
		lbLDeletePosition.setHorizontalAlignment(SwingConstants.TRAILING);
		lbLDeletePosition.setBounds(30, 190, 134, 18);
		contentPane.add(lbLDeletePosition);
		
		taDeletePos = new JTextField();
		taDeletePos.setBounds(177, 188, 96, 19);
		contentPane.add(taDeletePos);
		taDeletePos.setColumns(10);
		
		taPosition = new JTextField();
		taPosition.setBounds(406, 136, 54, 19);
		contentPane.add(taPosition);
		taPosition.setColumns(10);
		
		JLabel lblPosition = new JLabel("POSITION:");
		lblPosition.setFont(new Font("Constantia", Font.BOLD, 14));
		lblPosition.setHorizontalAlignment(SwingConstants.TRAILING);
		lblPosition.setBounds(323, 139, 77, 18);
		contentPane.add(lblPosition);
		
		JButton btnDelete = new JButton("DELETE");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code for deletion
				int pos=Integer.valueOf(taDeletePos.getText());
				arr[pos]=0;
				String message="Element deleted @ position "+pos;
				JOptionPane.showMessageDialog(contentPane, message);
				taDeletePos.setText("");
				
				
				
			}
		});
		btnDelete.setFont(new Font("Constantia", Font.BOLD, 14));
		btnDelete.setBounds(283, 187, 96, 27);
		contentPane.add(btnDelete);
		
		JButton btnDisplay = new JButton("DISPLAY");
		btnDisplay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code for display
				String msg="";
				for(int i=0; i<=arr.length-1; i++)
				{
					msg=msg+" "+arr[i];
				}
				taDisplayBox.setText(msg);
			}
		});
		btnDisplay.setFont(new Font("Constantia", Font.BOLD, 14));
		btnDisplay.setBounds(234, 235, 104, 27);
		contentPane.add(btnDisplay);
		
		taDisplayBox = new JTextField();
		taDisplayBox.setBounds(127, 272, 288, 19);
		contentPane.add(taDisplayBox);
		taDisplayBox.setColumns(10);
	}
}