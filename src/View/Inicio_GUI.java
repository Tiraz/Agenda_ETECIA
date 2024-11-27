/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Laboratorio-Info
 */
public class Inicio_GUI extends javax.swing.JFrame {

    /**
     * Creates new form Inicio_GUI
     */
    public Inicio_GUI() {
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
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        entityManager = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("aprender?zeroDateTimeBehavior=convertToNullPU").createEntityManager();
        clienteQuery = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT c FROM Cliente c");
        clienteList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : clienteQuery.getResultList();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        nome_txt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        email_txt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tel_txt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        sair_btn = new javax.swing.JButton();
        cadastrar_btn = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        cod_txt = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        nome2_txt = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        email2_txt = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        tel2_txt = new javax.swing.JTextField();
        alterar_btn = new javax.swing.JButton();
        consultar_btn1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        cod2_txt = new javax.swing.JTextField();
        excluir_btn = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        ticket_DAO = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(null);

        jPanel3.setLayout(null);

        jLabel1.setText("AGENDA");
        jPanel3.add(jLabel1);
        jLabel1.setBounds(160, 20, 100, 20);
        jPanel3.add(nome_txt);
        nome_txt.setBounds(60, 80, 270, 20);

        jLabel2.setText("EMAIL:");
        jPanel3.add(jLabel2);
        jLabel2.setBounds(10, 120, 40, 20);
        jPanel3.add(email_txt);
        email_txt.setBounds(60, 120, 270, 20);

        jLabel3.setText("TELEFONE:");
        jPanel3.add(jLabel3);
        jLabel3.setBounds(10, 160, 70, 20);
        jPanel3.add(tel_txt);
        tel_txt.setBounds(80, 160, 150, 20);

        jLabel4.setText("NOME:");
        jPanel3.add(jLabel4);
        jLabel4.setBounds(10, 80, 50, 20);

        sair_btn.setText("SAIR");
        sair_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sair_btnActionPerformed(evt);
            }
        });
        jPanel3.add(sair_btn);
        sair_btn.setBounds(220, 210, 120, 40);

        cadastrar_btn.setText("CADASTRAR");
        cadastrar_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrar_btnActionPerformed(evt);
            }
        });
        jPanel3.add(cadastrar_btn);
        cadastrar_btn.setBounds(30, 210, 120, 40);

        jTabbedPane1.addTab("CADASTRAR", jPanel3);

        jPanel4.setLayout(null);

        org.jdesktop.swingbinding.JTableBinding jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, clienteList, jTable1);
        org.jdesktop.swingbinding.JTableBinding.ColumnBinding columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${cliCod}"));
        columnBinding.setColumnName("Código");
        columnBinding.setColumnClass(Integer.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${cliNome}"));
        columnBinding.setColumnName("Nome");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${cliEmail}"));
        columnBinding.setColumnName("Emaill");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${cliTel}"));
        columnBinding.setColumnName("Telefone");
        columnBinding.setColumnClass(Long.class);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();
        jScrollPane1.setViewportView(jTable1);

        jPanel4.add(jScrollPane1);
        jScrollPane1.setBounds(0, 1, 400, 90);

        jLabel5.setText("Código:");
        jPanel4.add(jLabel5);
        jLabel5.setBounds(20, 100, 80, 30);
        jPanel4.add(cod_txt);
        cod_txt.setBounds(70, 100, 59, 30);

        jLabel6.setText("Nome:");
        jPanel4.add(jLabel6);
        jLabel6.setBounds(20, 140, 80, 30);
        jPanel4.add(nome2_txt);
        nome2_txt.setBounds(70, 140, 150, 30);

        jLabel7.setText("Email:");
        jPanel4.add(jLabel7);
        jLabel7.setBounds(20, 180, 80, 30);
        jPanel4.add(email2_txt);
        email2_txt.setBounds(70, 180, 190, 30);

        jLabel8.setText("Telefone:");
        jPanel4.add(jLabel8);
        jLabel8.setBounds(20, 220, 80, 30);
        jPanel4.add(tel2_txt);
        tel2_txt.setBounds(70, 220, 100, 30);

        alterar_btn.setText("Alterar");
        alterar_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alterar_btnActionPerformed(evt);
            }
        });
        jPanel4.add(alterar_btn);
        alterar_btn.setBounds(280, 140, 100, 30);

        consultar_btn1.setText("Consultar");
        consultar_btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultar_btn1ActionPerformed(evt);
            }
        });
        jPanel4.add(consultar_btn1);
        consultar_btn1.setBounds(280, 100, 100, 30);

        jTabbedPane1.addTab("CONSULTAR/ALTERAR", jPanel4);

        jPanel1.setLayout(null);

        jLabel9.setText("Código");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(150, 50, 80, 30);
        jPanel1.add(cod2_txt);
        cod2_txt.setBounds(130, 80, 80, 30);

        excluir_btn.setText("Excluir");
        excluir_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                excluir_btnActionPerformed(evt);
            }
        });
        jPanel1.add(excluir_btn);
        excluir_btn.setBounds(130, 130, 80, 20);

        jTabbedPane1.addTab("EXCLUIR", jPanel1);

        jPanel2.setLayout(null);

        ticket_DAO.setText("TICKET");
        ticket_DAO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ticket_DAOActionPerformed(evt);
            }
        });
        jPanel2.add(ticket_DAO);
        ticket_DAO.setBounds(120, 50, 230, 40);

        jButton2.setText("ATESTADO");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2);
        jButton2.setBounds(120, 120, 230, 40);

        jButton3.setText("RELATÓRIO BD");
        jPanel2.add(jButton3);
        jButton3.setBounds(120, 190, 230, 40);

        jTabbedPane1.addTab("RELATÓRIO", jPanel2);

        getContentPane().add(jTabbedPane1);
        jTabbedPane1.setBounds(-1, 4, 400, 300);

        bindingGroup.bind();

        setSize(new java.awt.Dimension(400, 300));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void sair_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sair_btnActionPerformed
        System.exit(0);
    }//GEN-LAST:event_sair_btnActionPerformed

    private void cadastrar_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrar_btnActionPerformed
        Controller.Funcoes_DAO.Cadastrar();
    }//GEN-LAST:event_cadastrar_btnActionPerformed

    private void alterar_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alterar_btnActionPerformed
        Controller.Funcoes_DAO.alterar();
    }//GEN-LAST:event_alterar_btnActionPerformed

    private void consultar_btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultar_btn1ActionPerformed
        Controller.Funcoes_DAO.consultar();
    }//GEN-LAST:event_consultar_btn1ActionPerformed

    private void excluir_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_excluir_btnActionPerformed
        String x = JOptionPane.showInputDialog(null,"Deseja apagar o registro \n1-Sim\n2-Não");
        int op = Integer.parseInt(x);
        if(op == 1){
            Controller.Funcoes_DAO.excluir();
        }else{
            JOptionPane.showMessageDialog(null, "Exclusão cancelada!!");
        }
    }//GEN-LAST:event_excluir_btnActionPerformed

    private void ticket_DAOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ticket_DAOActionPerformed
        Controller.Ticket_DAO.impressao();
    }//GEN-LAST:event_ticket_DAOActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            Controller.Press_DAO.imprime();
        } catch (Exception ex) {
            //Erro padrao pode ser sunstituido por um JoptionPane com uma numeração especifica para identificar o problema.
            Logger.getLogger(Inicio_GUI.class.getName()).log(Level.SEVERE, null, ex);
        }
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
            java.util.logging.Logger.getLogger(Inicio_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio_GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton alterar_btn;
    private javax.swing.JButton cadastrar_btn;
    private java.util.List<View.Cliente> clienteList;
    private javax.persistence.Query clienteQuery;
    public static javax.swing.JTextField cod2_txt;
    public static javax.swing.JTextField cod_txt;
    private javax.swing.JButton consultar_btn1;
    public static javax.swing.JTextField email2_txt;
    public static javax.swing.JTextField email_txt;
    private javax.persistence.EntityManager entityManager;
    private javax.swing.JButton excluir_btn;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    public static javax.swing.JTextField nome2_txt;
    public static javax.swing.JTextField nome_txt;
    private javax.swing.JButton sair_btn;
    public static javax.swing.JTextField tel2_txt;
    public static javax.swing.JTextField tel_txt;
    private javax.swing.JButton ticket_DAO;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
