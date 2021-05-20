package com.polyjava.graphics;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;

import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;

public class AddModifEmp {

	public JFrame frame;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddModifEmp window = new AddModifEmp();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public AddModifEmp() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.getContentPane().setFont(new Font("Segoe UI Semibold", Font.PLAIN, 12));
		frame.getContentPane().setLayout(null);
		JLabel lblNewLabel = new JLabel("Employee");
		lblNewLabel.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 14));
		lblNewLabel.setBounds(179, 11, 76, 20);
		frame.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(96, 42, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(96, 73, 86, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(96, 104, 86, 22);		
		frame.getContentPane().add(comboBox);
		
		JLabel lblNewLabel_1 = new JLabel("First name");
		lblNewLabel_1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(10, 45, 76, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Last name");
		lblNewLabel_2.setBounds(10, 76, 64, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Department");
		lblNewLabel_3.setBounds(10, 108, 64, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		JButton btnNewButton = new JButton("Confirm");
		btnNewButton.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 14));
		btnNewButton.setBounds(164, 144, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Planning");
		btnNewButton_1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 12));
		btnNewButton_1.setBounds(263, 72, 89, 23);
		btnNewButton_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	btnEmpActionPerformed(evt);
            }
        });
		frame.getContentPane().add(btnNewButton_1);
		frame.setBounds(100, 100, 450, 216);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}

	protected void btnEmpActionPerformed(ActionEvent evt) {
		ConsultCalendar calendar  = new ConsultCalendar();
		calendar.frame.setVisible(true);
	}

}
