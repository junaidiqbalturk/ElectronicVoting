/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.innovatraasolutions.eev.ui;

/**
 *
 * @author SpiderMan
 */
public class WelcomeForm extends javax.swing.JFrame {

    /**
     * Creates new form WelcomeForm
     */
    public WelcomeForm() {
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
        jPanel1 = new javax.swing.JPanel();
        RegstratnBtn = new javax.swing.JButton();
        mangeparties = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        VotingBtn = new javax.swing.JButton();
        ViewVoters = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(645, 500));
        setMinimumSize(new java.awt.Dimension(645, 500));
        setPreferredSize(new java.awt.Dimension(645, 500));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        RegstratnBtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        RegstratnBtn.setText("Registration");
        RegstratnBtn.setOpaque(false);
        RegstratnBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegstratnBtnActionPerformed(evt);
            }
        });
        jPanel1.add(RegstratnBtn);
        RegstratnBtn.setBounds(380, 270, 150, 50);

        mangeparties.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        mangeparties.setText("Manage Parties");
        mangeparties.setOpaque(false);
        mangeparties.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mangepartiesActionPerformed(evt);
            }
        });
        jPanel1.add(mangeparties);
        mangeparties.setBounds(90, 270, 150, 50);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("ADMIN PANEL");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(240, 10, 140, 80);

        VotingBtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        VotingBtn.setText("Start Voting");
        VotingBtn.setOpaque(false);
        VotingBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VotingBtnActionPerformed(evt);
            }
        });
        jPanel1.add(VotingBtn);
        VotingBtn.setBounds(90, 370, 150, 50);

        ViewVoters.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ViewVoters.setText("View Voters");
        ViewVoters.setOpaque(false);
        ViewVoters.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewVotersActionPerformed(evt);
            }
        });
        jPanel1.add(ViewVoters);
        ViewVoters.setBounds(380, 370, 150, 50);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/innovatraasolutions/eev/ui/low_opacity_ecp.jpg"))); // NOI18N
        jPanel1.add(jLabel3);
        jLabel3.setBounds(120, 10, 380, 400);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 630, 460);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RegstratnBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegstratnBtnActionPerformed
        PartyCandidateRegistration CandidateRegistration = new PartyCandidateRegistration();
        this.setVisible(false);
        CandidateRegistration.setVisible(true);
    }//GEN-LAST:event_RegstratnBtnActionPerformed

    private void mangepartiesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mangepartiesActionPerformed
        ManageParties manageparties = new ManageParties();
        this.setVisible(false);
        manageparties.setVisible(true);
    }//GEN-LAST:event_mangepartiesActionPerformed

    private void VotingBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VotingBtnActionPerformed
        VoteForm voteform = new VoteForm();
        this.setVisible(false);
        voteform.setVisible(true);
    }//GEN-LAST:event_VotingBtnActionPerformed

    private void ViewVotersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewVotersActionPerformed
        Voter voter = new Voter();
        this.setVisible(false);
        voter.setVisible(true);
    }//GEN-LAST:event_ViewVotersActionPerformed

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
            java.util.logging.Logger.getLogger(WelcomeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WelcomeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WelcomeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WelcomeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new WelcomeForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton RegstratnBtn;
    private javax.swing.JButton ViewVoters;
    private javax.swing.JButton VotingBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton mangeparties;
    // End of variables declaration//GEN-END:variables
}