/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Laboratorio-Info
 */
public class Tela_GUI extends javax.swing.JFrame {

    /**
     * Creates new form Tela_GUI
     */
    public Tela_GUI() {
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
        fechar_btn = new javax.swing.JButton();
        receita_btn = new javax.swing.JButton();
        atestado_btn = new javax.swing.JButton();
        declaracao_btn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(null);

        jPanel1.setLayout(null);

        fechar_btn.setText("X");
        fechar_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fechar_btnActionPerformed(evt);
            }
        });
        jPanel1.add(fechar_btn);
        fechar_btn.setBounds(320, 230, 60, 50);

        receita_btn.setText("Receituário");
        receita_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                receita_btnActionPerformed(evt);
            }
        });
        jPanel1.add(receita_btn);
        receita_btn.setBounds(40, 120, 150, 50);

        atestado_btn.setText("Atestado");
        atestado_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atestado_btnActionPerformed(evt);
            }
        });
        jPanel1.add(atestado_btn);
        atestado_btn.setBounds(40, 50, 150, 50);

        declaracao_btn.setText("Declaração");
        declaracao_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                declaracao_btnActionPerformed(evt);
            }
        });
        jPanel1.add(declaracao_btn);
        declaracao_btn.setBounds(40, 190, 150, 50);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(5, 3, 390, 300);

        setSize(new java.awt.Dimension(400, 300));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void fechar_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fechar_btnActionPerformed
        System.exit (0);
    }//GEN-LAST:event_fechar_btnActionPerformed

    private void receita_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_receita_btnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_receita_btnActionPerformed

    private void atestado_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atestado_btnActionPerformed
        try {
            Controller.Funcoes_DAO.Atestado();
        } catch (Exception ex) {
            Logger.getLogger(Tela_GUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_atestado_btnActionPerformed

    private void declaracao_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_declaracao_btnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_declaracao_btnActionPerformed

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
            java.util.logging.Logger.getLogger(Tela_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela_GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton atestado_btn;
    private javax.swing.JButton declaracao_btn;
    private javax.swing.JButton fechar_btn;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton receita_btn;
    // End of variables declaration//GEN-END:variables
}
