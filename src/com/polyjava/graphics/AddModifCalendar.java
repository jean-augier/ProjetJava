package com.polyjava.graphics;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import com.toedter.components.JSpinField;
import javax.swing.JButton;

public class AddModifCalendar {

	public JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddModifCalendar window = new AddModifCalendar();
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
	public AddModifCalendar() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 176);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Planning");
		lblNewLabel.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 14));
		lblNewLabel.setBounds(182, 11, 66, 20);
		frame.getContentPane().add(lblNewLabel);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(10, 50, 97, 22);
		comboBox.addItem("Lundi");
		comboBox.addItem("Mardi");
		comboBox.addItem("Mercredi");
		comboBox.addItem("Jeudi");
		comboBox.addItem("Vendredi");
		frame.getContentPane().add(comboBox);
		
		JLabel lblNewLabel_1 = new JLabel("Hour");
		lblNewLabel_1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(147, 54, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Minutes");
		lblNewLabel_2.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 12));
		lblNewLabel_2.setBounds(288, 54, 46, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JSpinField spinField = new JSpinField();
		spinField.setBounds(192, 52, 30, 20);
		frame.getContentPane().add(spinField);
		
		JSpinField spinField_1 = new JSpinField();
		spinField_1.setBounds(344, 52, 30, 20);
		frame.getContentPane().add(spinField_1);
		
		JButton btnNewButton = new JButton("Confirm");
		btnNewButton.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 14));
		btnNewButton.setBounds(162, 104, 89, 23);
		frame.getContentPane().add(btnNewButton);
	}
}
