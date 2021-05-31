package com.polyjava.graphics;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.Timer;


import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTextPane;

//crud empoye , historic g�n�rales et historic g�n�rales , config 
public class JGraphicMainServer extends javax.swing.JFrame {

	private JLabel dateToday= new JLabel();
	private JLabel dateHourToday= new JLabel();

	/**
	 * Constructor
	 */
	public JGraphicMainServer() {
		initialize();
	}
	
	/**
	 * Initializer
	 */
	private void initialize() {
		
		 setBounds(100, 100, 561, 200);
		 setUndecorated(true);
		 setResizable(false);
		 setLocationRelativeTo(null);
		 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 getContentPane().setLayout(null);
		
		JLabel dateToday = new JLabel("");
		dateToday.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 22));
		dateToday.setBounds(173, 11, 178, 32);
		ShowDate(dateToday);
		getContentPane().add(dateToday);
		
		JLabel dateHourToday = new JLabel("");
		dateHourToday.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 18));
		dateHourToday.setBounds(216, 46, 124, 32);
		ShowTime(dateHourToday);
		getContentPane().add(dateHourToday);
		
		JButton settingsBtn = new JButton("Advanced Settings");
		settingsBtn.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 14));
		settingsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	settingsBtnActionPerformed(evt);
            }
        });
		settingsBtn.setBounds(10, 168, 157, 23);
		getContentPane().add(settingsBtn);
		
		JButton quitBtn = new JButton("Quit");
		quitBtn.setFont(new Font("Segoe UI Semibold", Font.BOLD, 14));
		quitBtn.setBounds(446, 168, 89, 23);
		getContentPane().add(quitBtn);
		quitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	quitBtnActionPerformed(evt);
            }
        });
		
		JButton checkInOutBtn = new JButton("CheckInOut");
		checkInOutBtn.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 14));
		checkInOutBtn.setBounds(399, 89, 124, 40);
		getContentPane().add(checkInOutBtn);
		
		JTextPane insertEmp = new JTextPane();
		insertEmp.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 22));
		insertEmp.setBounds(128, 89, 226, 40);
		getContentPane().add(insertEmp);
		
         addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
	}
    /** 
     * Action listener to  settings clickable buttonsbutton
     * 
     * @param ActionEvent evt (waited event)
     */
	protected void settingsBtnActionPerformed(ActionEvent evt) {
		dispose();
		SettingsServer settings = new SettingsServer();
		settings.setVisible(true);
	}
    /** 
     * Show current date method 
     * 
     * @param JLabel jdate label of current window
     */
	private void ShowDate(JLabel jdate) {
	    Date d=new Date();
	    SimpleDateFormat sdf=new SimpleDateFormat("E dd-MM-YYYY");
	    jdate.setText(sdf.format(d));
	}
    /** 
     * Show current time method 
     * 
     * @param JLabel jtime label of current window
     */
	private void ShowTime(JLabel jtime) {
	    new Timer(0,new ActionListener() {

			@Override
	        public void actionPerformed(ActionEvent e) {
	            Date d=new Date();
	             SimpleDateFormat sdf=new SimpleDateFormat("hh:mm:ss a");
	        jtime.setText(sdf.format(d));
	        }
	    }).start();
	}
    /** 
     * Quitting button action listener
     */
    private void quitBtnActionPerformed(java.awt.event.ActionEvent evt) {
    		System.exit(0);
    	}
    /** 
     * Auto launched method when opening current window
     */
	protected void formWindowActivated(WindowEvent evt) {
	}
}