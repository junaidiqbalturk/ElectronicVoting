/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.innovatraasolutions.eev.ui;

import com.innovatraasolutions.eev.bo.Voters;
import com.innovatraasolutions.eev.controller.Controller;
import com.innovatraasolutions.eev.constants.Constants;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.*;

/**
 *
 * @author SuperMan
 */
public class VoteForm extends javax.swing.JFrame {

    /**
     * Creates new form VoteForm
     */
    public Object returnObj = new Object[5];
    public Voters voter = new Voters();
    
    public VoteForm() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cnictxt = new javax.swing.JTextField();
        proceedBtn = new javax.swing.JButton();
        errMsgLbl = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(760, 522));
        setMinimumSize(new java.awt.Dimension(760, 522));
        setPreferredSize(new java.awt.Dimension(760, 522));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("EFFECTIVE ELECTRONIC VOTE");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(180, 10, 400, 80);

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Enter your CNIC:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(110, 130, 130, 50);
        getContentPane().add(cnictxt);
        cnictxt.setBounds(250, 140, 250, 30);

        proceedBtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        proceedBtn.setText("Proceed");
        proceedBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                proceedBtnActionPerformed(evt);
            }
        });
        getContentPane().add(proceedBtn);
        proceedBtn.setBounds(420, 220, 120, 40);

        errMsgLbl.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        errMsgLbl.setForeground(new java.awt.Color(255, 255, 255));
        errMsgLbl.setText("Incorrect CNIC!! enter correct CNIC");
        getContentPane().add(errMsgLbl);
        errMsgLbl.setBounds(80, 210, 290, 50);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/innovatraasolutions/eev/ui/Votepic.jpg"))); // NOI18N
        jLabel1.setOpaque(true);
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 760, 520);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
       errMsgLbl.setVisible(false);
    }//GEN-LAST:event_formWindowOpened

    private void proceedBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proceedBtnActionPerformed
        Controller controller = new Controller();
        Object[] parameters = new Object[1];
        
        parameters[0] = cnictxt.getText();
        try {
            returnObj = controller.processRequest(Constants.CastVote,parameters);
        } catch (SQLException ex) {
            Logger.getLogger(VoteForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        if(returnObj == null){
            errMsgLbl.setVisible(true);
        }
        
        
        else{
            VoterDetails voterDetails = new VoterDetails();
            this.setVisible(false);
            voterDetails.setVisible(true);
        }
        
     
    }//GEN-LAST:event_proceedBtnActionPerformed

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
            java.util.logging.Logger.getLogger(VoteForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VoteForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VoteForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VoteForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VoteForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cnictxt;
    private javax.swing.JLabel errMsgLbl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton proceedBtn;
    // End of variables declaration//GEN-END:variables
}
