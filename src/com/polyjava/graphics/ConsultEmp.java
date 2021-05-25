package com.polyjava.graphics;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ConsultEmp {

	public JFrame frame;
	private JTable table;
	
	
	
/**
 * Constructor
 */
	public ConsultEmp() {
		initialize();
	}

	/**
	 * Initializer
	 */
	private void initialize() {
		frame = new JFrame();     /** Setting the frame of the windows */
		frame.setBounds(100, 100, 450, 300);     /** Setting the bounds of the frame */
		frame.setResizable(false);        /** Setting the resizability of the frame */

		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);     /** Setting the close option to the window's frame */
		frame.getContentPane().setLayout(new BorderLayout(0, 0));  /** Setting the borderLayout to the frame's contentPane */
		
		JLabel lblEmployee = new JLabel("                                               Employee");
		lblEmployee.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 14));
		frame.getContentPane().add(lblEmployee, BorderLayout.NORTH);  /** Setting the north borderLayout to the label */
		
		JButton btnSupprimer = new JButton("Delete selected employee");
		frame.getContentPane().add(btnSupprimer, BorderLayout.SOUTH);   /** Setting the south borderLayout to the label */
		
		JScrollPane scrollPane = new JScrollPane();
		frame.getContentPane().add(scrollPane, BorderLayout.CENTER);   /** Setting the center borderLayout to the label */
		
		table = new JTable();
	    /** 
	     * Setting the model of jtable for current window
	     * 
	     * @param 2D array ( Objects array and Header strings array for the table )
	     */
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
			},
			new String[] {
				"ID", "FirstName", "LastName", "Department"
			}
		) {
			Class[] columnTypes = new Class[] {
				Integer.class, String.class, String.class, String.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		/**
		 * Put the jtable in scrollPane
		 */
		scrollPane.setViewportView(table);
	}

}
