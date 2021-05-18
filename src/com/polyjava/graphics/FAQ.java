/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.polyjava.graphics;

import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.UIManager;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;


public class FAQ  extends MoveJFrame{

    /**
     * Creates new form AppInfo
     */
    public FAQ() {
    	getContentPane().setBackground(UIManager.getColor("Button.darkShadow"));
        initComponents();
         setExtendedState(JFrame.MAXIMIZED_HORIZ);
        setResizable(false);
    }
    private void initComponents() {
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("FAQ");
        setBounds(new java.awt.Rectangle(70, 150, 0, 0));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Courier New", 0, 20)); // NOI18N
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);
        
        btnNewButton = new JButton("Retourner");
        btnNewButton.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 14));
        btnNewButton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
				dispose();
				Main main =new Main();
				main.setVisible(true);
        	}
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(layout.createSequentialGroup()
        			.addContainerGap(24, Short.MAX_VALUE)
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addComponent(btnNewButton)
        				.addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 778, GroupLayout.PREFERRED_SIZE))
        			.addGap(27))
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addGap(38)
        			.addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 199, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addComponent(btnNewButton)
        			.addContainerGap(20, Short.MAX_VALUE))
        );
        getContentPane().setLayout(layout);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        String s="Cette application realisee pour un but non lucratif par les eleves ingenieurs CHOKRI Marouane - RABALLAND Axel - MOREAU Clement - AUGIER Jean pour un projet tutore en matiere de Java \nCette application est pour objectif de calculer les heures de travail des employees d une entreprise et calculer leurs heures de pointages." +"\nRemerciement a notre prof : Mr.Esswin"+"\nRemerciement a notre ecole : POLYTECH Tours\n"+ "\nEmail :marouane.chokri@etu.univ-tours.fr\nEmail :axel.raballand@etu.univ-tours.fr\nEmail :clement.moreau@etu.univ-tours.fr\nEmail :jean.augier@etu.univ-tours.fr\n";
        jTextArea1.setText(s);
        
    }//GEN-LAST:event_formWindowOpened

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FAQ.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FAQ.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FAQ.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FAQ.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FAQ().setVisible(true);
            }
        });
    }
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private JButton btnNewButton;
    // End of variables declaration//GEN-END:variables
}
