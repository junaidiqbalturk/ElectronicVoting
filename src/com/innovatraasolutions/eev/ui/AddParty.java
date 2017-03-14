/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.innovatraasolutions.eev.ui;
import com.innovatraasolutions.eev.constants.Constants;
import com.innovatraasolutions.eev.controller.Controller;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author SuperMan
 */
public class AddParty extends javax.swing.JFrame {

    /**
     * Creates new form AddParty
     */
    public AddParty() {
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
        upartyname = new javax.swing.JTextField();
        uhoptxt = new javax.swing.JTextField();
        uelecttxt = new javax.swing.JTextField();
        SaveParty = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        errMsgLbl = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        backBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(599, 422));
        setMinimumSize(new java.awt.Dimension(599, 422));
        setPreferredSize(new java.awt.Dimension(599, 422));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("ADD NEW PARTY");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(180, 10, 240, 50);
        getContentPane().add(upartyname);
        upartyname.setBounds(120, 110, 200, 30);
        getContentPane().add(uhoptxt);
        uhoptxt.setBounds(120, 170, 200, 30);
        getContentPane().add(uelecttxt);
        uelecttxt.setBounds(120, 230, 200, 30);

        SaveParty.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        SaveParty.setText("Save & Next");
        SaveParty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SavePartyActionPerformed(evt);
            }
        });
        getContentPane().add(SaveParty);
        SaveParty.setBounds(410, 330, 120, 40);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jLabel3.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        jLabel3.setText("Registration Form:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(10, 60, 140, 30);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Electoral Symbol:");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(10, 230, 140, 40);

        errMsgLbl.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        errMsgLbl.setForeground(new java.awt.Color(255, 0, 0));
        errMsgLbl.setText("Cannot Save Data");
        jPanel1.add(errMsgLbl);
        errMsgLbl.setBounds(20, 270, 170, 50);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Name of Party:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(10, 110, 100, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Name of HOP:");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(10, 170, 100, 30);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/innovatraasolutions/eev/ui/ECPLOGO.png"))); // NOI18N
        jPanel1.add(jLabel7);
        jLabel7.setBounds(80, 10, 600, 440);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/innovatraasolutions/eev/ui/low_opacity_ecp.jpg"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(150, 10, 360, 370);

        backBtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        backBtn.setText("<<Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });
        jPanel1.add(backBtn);
        backBtn.setBounds(10, 330, 120, 40);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 600, 420);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SavePartyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SavePartyActionPerformed
        Controller controller = new Controller();
        Object[] parameters = new Object[4];
        Object[] returnObj = null;
        parameters[0] = upartyname.getText();
        parameters[1] = uhoptxt.getText();
        parameters[2] = uelecttxt.getText();
        
        if(parameters[0].equals("")|| parameters[1].equals("")|| parameters[2].equals("")){
            errMsgLbl.setVisible(true);
        }
        
        else
        {
            try {
                returnObj = controller.processRequest(Constants.AddParty, parameters);
            } catch (SQLException ex) {
                Logger.getLogger(AddParty.class.getName()).log(Level.SEVERE, null, ex);
            }
            PartyCandidateRegistration partycandidateregistration = new PartyCandidateRegistration();
            this.setVisible(false);
            partycandidateregistration.setVisible(true);
        }
    }//GEN-LAST:event_SavePartyActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        errMsgLbl.setVisible(false);
    }//GEN-LAST:event_formWindowOpened

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        ManageParties manageParties = new ManageParties();
        this.setVisible(false);
        manageParties.setVisible(true);
        
    }//GEN-LAST:event_backBtnActionPerformed

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
            java.util.logging.Logger.getLogger(AddParty.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddParty.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddParty.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddParty.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddParty().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton SaveParty;
    private javax.swing.JButton backBtn;
    private javax.swing.JLabel errMsgLbl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField uelecttxt;
    private javax.swing.JTextField uhoptxt;
    private javax.swing.JTextField upartyname;
    // End of variables declaration//GEN-END:variables
}