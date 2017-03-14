/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.innovatraasolutions.eev.ui;

import com.innovatraasolutions.eev.constants.Constants;
import com.innovatraasolutions.eev.controller.Controller;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author SuperMan
 */
public class DeleteParty extends javax.swing.JFrame {

    /**
     * Creates new form DeleteParty
     */
    public DeleteParty() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        dltpartytxt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        DltBtn = new javax.swing.JButton();
        errMsgLbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(480, 165));
        setMinimumSize(new java.awt.Dimension(480, 165));
        setPreferredSize(new java.awt.Dimension(480, 165));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Name Of Party:");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(10, 50, 98, 30);
        jPanel1.add(dltpartytxt);
        dltpartytxt.setBounds(110, 50, 237, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("                                          Delete Party");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(0, 0, 450, 40);

        DltBtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        DltBtn.setText("Delete");
        DltBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DltBtnActionPerformed(evt);
            }
        });
        jPanel1.add(DltBtn);
        DltBtn.setBounds(360, 50, 80, 30);

        errMsgLbl.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        errMsgLbl.setForeground(new java.awt.Color(255, 0, 0));
        errMsgLbl.setText("*Enter the Required Field");
        jPanel1.add(errMsgLbl);
        errMsgLbl.setBounds(40, 100, 350, 30);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 470, 140);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DltBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DltBtnActionPerformed
        Object[] parameters = new Object[1];
        Controller controller = new Controller();
        Object[] returnObj = null;
        
        parameters[0] = dltpartytxt.getText();
        
        if(parameters[0].equals(""))
        {
            errMsgLbl.setVisible(true);
        }
        else
        {
            ConfirmationBox confirmationBox = new ConfirmationBox(parameters);
            this.setVisible(false);
            confirmationBox.setVisible(true);
            
        }
        
    }//GEN-LAST:event_DltBtnActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        errMsgLbl.setVisible(false);
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
            java.util.logging.Logger.getLogger(DeleteParty.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DeleteParty.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DeleteParty.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DeleteParty.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DeleteParty().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DltBtn;
    private javax.swing.JTextField dltpartytxt;
    private javax.swing.JLabel errMsgLbl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
