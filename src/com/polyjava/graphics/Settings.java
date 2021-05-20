package com.polyjava.graphics;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;

import javax.swing.JTextField;
import javax.swing.JButton;

public class Settings extends MoveJFrame {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Settings window = new Settings();
					window.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Settings() {
		initialize();
	}

	/**
	 * Initialize the contents of the 
	 */
	private void initialize() {
		 setBounds(100, 100, 450, 146);
		 setResizable(false);
		 setLocationRelativeTo(null);
		 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("IP Adresse");
		lblNewLabel.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 14));
		lblNewLabel.setBounds(10, 55, 71, 14);
		getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Port");
		lblNewLabel_1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(225, 56, 28, 14);
		getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Advanced Settings");
		lblNewLabel_2.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		lblNewLabel_2.setBounds(154, 11, 153, 20);
		getContentPane().add(lblNewLabel_2);
		
		textField = new JTextField();
		textField.setBounds(81, 54, 134, 20);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(263, 54, 134, 20);
		getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton = new JButton("Confirm");
		btnNewButton.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 14));
		btnNewButton.setBounds(175, 85, 89, 23);
		getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Return");
		btnNewButton_1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 14));
		btnNewButton_1.setBounds(355, 0, 89, 23);
		getContentPane().add(btnNewButton_1);
		btnNewButton_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	RtrnEmpActionPerformed(evt);
            }
        });
	}

	protected void RtrnEmpActionPerformed(ActionEvent evt) {
		dispose();
		Main mn = new Main();
		mn.setVisible(true);
	}

}
