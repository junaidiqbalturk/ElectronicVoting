/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.innovatraasolutions.eev.ui;

import com.innovatraasolutions.eev.constants.Constants;
import com.innovatraasolutions.eev.controller.Controller;
import com.innovatraasolutions.eev.bo.Voters;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author SuperMan
 */
public class Voter extends javax.swing.JFrame {

    /**
     * Creates new form Voter
     */
    public Voter() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        VoterTable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        viewVoter = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        VoterTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "CNIC", "Full Name", "Last  Name", "Vote Registered", "Address"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(VoterTable);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(0, 57, 632, 323);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Voter's Detail");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(226, 0, 182, 51);

        viewVoter.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        viewVoter.setText("View All");
        viewVoter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewVoterActionPerformed(evt);
            }
        });
        getContentPane().add(viewVoter);
        viewVoter.setBounds(508, 398, 105, 35);

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setText("<<Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(10, 398, 105, 35);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/innovatraasolutions/eev/ui/low_opacity_ecp.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 630, 440);

        jPanel1.setLayout(null);
        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 630, 440);

        pack();
    }// </editor-fold>//GEN-END:initComponents
       public Object[] returnObj = null;
    private void viewVoterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewVoterActionPerformed
        Object[] parameters = new Object[5];
        Controller controller = new Controller();
        try {
            returnObj = controller.processRequest(Constants.viewVoter, parameters);
        } catch (SQLException ex) {
            Logger.getLogger(Voter.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        populateTable(VoterTable);
        
    }//GEN-LAST:event_viewVoterActionPerformed

    private void populateTable(JTable table){
            /* adding dummy data: you may have this populated already */
                   
                    
          
                
            table.setEnabled(true); /* so that we may select rows */
            DefaultTableModel model = new DefaultTableModel();
            model.setColumnIdentifiers(new Object[]{"CNIC","First Name","Last Name","Vote Registered","Address"}); /* set headers */
            table.setModel(model);
            
           for(int i=0;i<returnObj.length;i++){
                Voters voter = (Voters)returnObj[i];
                    
                model.addRow(new Object[]{voter.getCnic(),voter.getFname(),voter.getLname(),voter.getVoteRegistered(),voter.getAddress()});
            
            }
    }
            
            
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        WelcomeForm welcomeform = new WelcomeForm();
        this.setVisible(false);
        welcomeform.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Voter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Voter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Voter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Voter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Voter().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable VoterTable;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton viewVoter;
    // End of variables declaration//GEN-END:variables
}
