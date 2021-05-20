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


public class Main extends javax.swing.JFrame {

	private JLabel dateToday= new JLabel();
	private JLabel dateHourToday= new JLabel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main window = new Main();
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
	public Main() {
		initialize();
	}
	/**
	 * Initialize the contents of the .
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
		
		JButton faqBtn = new JButton("FAQ");
		faqBtn.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 14));
		faqBtn.setBounds(446, 11, 89, 23);
		getContentPane().add(faqBtn);
		faqBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	faqBtnActionPerformed(evt);
            }
        });
		
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
		insertEmp.setBounds(128, 89, 226, 40);
		getContentPane().add(insertEmp);
		
		JButton btnConsultEMP = new JButton("Consult EMP");
		btnConsultEMP.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 12));
		btnConsultEMP.setBounds(10, 13, 111, 23);
		getContentPane().add(btnConsultEMP);
		btnConsultEMP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	btnConsultEMPActionPerformed(evt);
            }
        });
		
		JButton btnAddEmp = new JButton("Add EMP");
		btnAddEmp.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 12));
		btnAddEmp.setBounds(10, 46, 111, 23);
		getContentPane().add(btnAddEmp);
		btnAddEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	btnAddEmpActionPerformed(evt);
            }
        });
		
         addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
	}
	protected void settingsBtnActionPerformed(ActionEvent evt) {
		dispose();
		Settings settings = new Settings();
		settings.setVisible(true);
	}

	protected void btnAddEmpActionPerformed(ActionEvent evt) {
		AddModifEmp add = new AddModifEmp();
		add.frame.setVisible(true);
	}

	protected void btnConsultEMPActionPerformed(ActionEvent evt) {
		ConsultEmp consult = new ConsultEmp();
		consult.frame.setVisible(true);
	}

	private void ShowDate(JLabel jdate) {
	    Date d=new Date();
	    SimpleDateFormat sdf=new SimpleDateFormat("E dd-MM-YYYY");
	    jdate.setText(sdf.format(d));
	}

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

    private void quitBtnActionPerformed(java.awt.event.ActionEvent evt) {
    		System.exit(0);
    	}
    private void faqBtnActionPerformed(java.awt.event.ActionEvent evt) {
		dispose();
		FAQ faq =new FAQ();
		faq.setVisible(true);
	}
	protected void formWindowActivated(WindowEvent evt) {
	}
}