/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufmt.ic.locadora.gui;

import javax.swing.JPanel;

/**
 *
 * @author brunosette
 */
public class PrincipalJFrame extends javax.swing.JFrame {

    /**
     * Creates new form PrincipalJFrame
     */
    public PrincipalJFrame() {
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

        jMenu1 = new javax.swing.JMenu();
        principaljPanel = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        clientejMenu = new javax.swing.JMenu();
        clientejMenuItem = new javax.swing.JMenuItem();
        emprestimojMenuItem = new javax.swing.JMenuItem();
        funcionariojMenu = new javax.swing.JMenu();
        funcionariojMenuItem = new javax.swing.JMenuItem();
        estoquejMenu = new javax.swing.JMenu();
        estoquejMenuItem = new javax.swing.JMenuItem();
        filmesjMenu = new javax.swing.JMenu();
        filmesjMenuItem = new javax.swing.JMenuItem();
        doacaojMenuItem = new javax.swing.JMenuItem();
        usuariosjMenu = new javax.swing.JMenu();
        usuariosjMenuItem = new javax.swing.JMenuItem();
        BancojMenu = new javax.swing.JMenu();
        BancojMenuItem = new javax.swing.JMenuItem();

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setExtendedState(6);

        clientejMenu.setText("Cliente");

        clientejMenuItem.setText("Cliente");
        clientejMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clientejMenuItemActionPerformed(evt);
            }
        });
        clientejMenu.add(clientejMenuItem);

        emprestimojMenuItem.setText("Emprestimo");
        emprestimojMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emprestimojMenuItemActionPerformed(evt);
            }
        });
        clientejMenu.add(emprestimojMenuItem);

        jMenuBar1.add(clientejMenu);

        funcionariojMenu.setText("Funcionario");

        funcionariojMenuItem.setText("Funcionario");
        funcionariojMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                funcionariojMenuItemActionPerformed(evt);
            }
        });
        funcionariojMenu.add(funcionariojMenuItem);

        jMenuBar1.add(funcionariojMenu);

        estoquejMenu.setText("Estoque");

        estoquejMenuItem.setText("Estoque");
        estoquejMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                estoquejMenuItemActionPerformed(evt);
            }
        });
        estoquejMenu.add(estoquejMenuItem);

        jMenuBar1.add(estoquejMenu);

        filmesjMenu.setText("Filmes");

        filmesjMenuItem.setText("Filmes");
        filmesjMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filmesjMenuItemActionPerformed(evt);
            }
        });
        filmesjMenu.add(filmesjMenuItem);

        doacaojMenuItem.setText("Doacao");
        doacaojMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doacaojMenuItemActionPerformed(evt);
            }
        });
        filmesjMenu.add(doacaojMenuItem);

        jMenuBar1.add(filmesjMenu);

        usuariosjMenu.setText("Usuarios");

        usuariosjMenuItem.setText("Usuarios");
        usuariosjMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usuariosjMenuItemActionPerformed(evt);
            }
        });
        usuariosjMenu.add(usuariosjMenuItem);

        jMenuBar1.add(usuariosjMenu);

        BancojMenu.setText("Banco");

        BancojMenuItem.setText("Banco");
        BancojMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BancojMenuItemActionPerformed(evt);
            }
        });
        BancojMenu.add(BancojMenuItem);

        jMenuBar1.add(BancojMenu);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(principaljPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 539, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(principaljPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 312, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void funcionariojMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_funcionariojMenuItemActionPerformed
        // TODO add your handling code here:
        setConteudo(new FuncionarioJPanel());
    }//GEN-LAST:event_funcionariojMenuItemActionPerformed

    private void estoquejMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_estoquejMenuItemActionPerformed
        // TODO add your handling code here:
        setConteudo(new EstoqueFilmesJPanel());
    }//GEN-LAST:event_estoquejMenuItemActionPerformed

    private void filmesjMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filmesjMenuItemActionPerformed
        // TODO add your handling code here:
        setConteudo(new FilmesJPanel());
    }//GEN-LAST:event_filmesjMenuItemActionPerformed

    private void usuariosjMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usuariosjMenuItemActionPerformed
        // TODO add your handling code here:
        setConteudo(new UsuarioJPanel());
        
    }//GEN-LAST:event_usuariosjMenuItemActionPerformed

    private void BancojMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BancojMenuItemActionPerformed
        // TODO add your handling code here:
        setConteudo(new BancoJPanel());
    }//GEN-LAST:event_BancojMenuItemActionPerformed

    private void doacaojMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doacaojMenuItemActionPerformed
        // TODO add your handling code here:
        
        setConteudo(new DoacaoJPanel());
    }//GEN-LAST:event_doacaojMenuItemActionPerformed

    private void emprestimojMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emprestimojMenuItemActionPerformed
        // TODO add your handling code here:
        
        setConteudo(new ReservafilmeJPanel());
    }//GEN-LAST:event_emprestimojMenuItemActionPerformed

    private void clientejMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clientejMenuItemActionPerformed
        // TODO add your handling code here:
        setConteudo(new ClienteJPanel());
    }//GEN-LAST:event_clientejMenuItemActionPerformed

    
    private void setConteudo(JPanel tela){
        principaljPanel.removeAll();
        principaljPanel.add(tela);
        principaljPanel.setVisible(false);
        principaljPanel.setVisible(true);
    }
    
    
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
            java.util.logging.Logger.getLogger(PrincipalJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PrincipalJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PrincipalJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PrincipalJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PrincipalJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu BancojMenu;
    private javax.swing.JMenuItem BancojMenuItem;
    private javax.swing.JMenu clientejMenu;
    private javax.swing.JMenuItem clientejMenuItem;
    private javax.swing.JMenuItem doacaojMenuItem;
    private javax.swing.JMenuItem emprestimojMenuItem;
    private javax.swing.JMenu estoquejMenu;
    private javax.swing.JMenuItem estoquejMenuItem;
    private javax.swing.JMenu filmesjMenu;
    private javax.swing.JMenuItem filmesjMenuItem;
    private javax.swing.JMenu funcionariojMenu;
    private javax.swing.JMenuItem funcionariojMenuItem;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel principaljPanel;
    private javax.swing.JMenu usuariosjMenu;
    private javax.swing.JMenuItem usuariosjMenuItem;
    // End of variables declaration//GEN-END:variables
}