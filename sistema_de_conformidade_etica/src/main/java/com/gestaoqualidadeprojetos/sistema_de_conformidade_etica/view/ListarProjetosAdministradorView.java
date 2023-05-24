/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.gestaoqualidadeprojetos.sistema_de_conformidade_etica.view;
import com.gestaoqualidadeprojetos.sistema_de_conformidade_etica.view.CriarNovoProjetoView;

/**
 *
 * @author Gabriel
 */
public class ListarProjetosAdministradorView extends javax.swing.JFrame {

    /**
     * Creates new form ListarProjetosView
     */
    public ListarProjetosAdministradorView() {
        initComponents();
        setVisible(true);
        this.setLocationRelativeTo(this.getParent());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtTituloProjetos = new javax.swing.JLabel();
        txtNomeUsuario = new javax.swing.JLabel();
        txtOla = new javax.swing.JLabel();
        txtTituloData = new javax.swing.JLabel();
        txtData = new javax.swing.JLabel();
        jScrollPaneTabelaProjetos = new javax.swing.JScrollPane();
        tableProjetos = new javax.swing.JTable();
        btnNovoProjeto = new javax.swing.JButton();
        btnFechar = new javax.swing.JButton();
        menuBarProjetosAdmin = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        menuAbrir = new javax.swing.JMenuItem();
        menuNotificar = new javax.swing.JMenuItem();
        menuDashboard = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtTituloProjetos.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtTituloProjetos.setText("Projetos");

        txtNomeUsuario.setText("Administrador.");
        txtNomeUsuario.setToolTipText("");

        txtOla.setText("Olá, ");
        txtOla.setToolTipText("");

        txtTituloData.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtTituloData.setText("Data: ");

        txtData.setText("15/05/2023");

        tableProjetos.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tableProjetos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"01", "Sistema de Padaria", "15/05/2023", "15/07/2023", "Aberto"},
                {"02", "App para academia", "15/05/2023", "30/07/2023", "Aberto"},
                {"03", "Rede social", "01/04/2023", "15/05/2023", "Fechado"}
            },
            new String [] {
                "#", "Nome", "Data Abertura", "Data Limite", "Status"
            }
        ));
        tableProjetos.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tableProjetos.setShowGrid(true);
        tableProjetos.setSurrendersFocusOnKeystroke(true);
        jScrollPaneTabelaProjetos.setViewportView(tableProjetos);
        if (tableProjetos.getColumnModel().getColumnCount() > 0) {
            tableProjetos.getColumnModel().getColumn(0).setResizable(false);
            tableProjetos.getColumnModel().getColumn(1).setResizable(false);
            tableProjetos.getColumnModel().getColumn(2).setResizable(false);
            tableProjetos.getColumnModel().getColumn(3).setResizable(false);
            tableProjetos.getColumnModel().getColumn(4).setResizable(false);
        }

        btnNovoProjeto.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnNovoProjeto.setText("Novo projeto");
        btnNovoProjeto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnNovoProjetoMouseClicked(evt);
            }
        });
        btnNovoProjeto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoProjetoActionPerformed(evt);
            }
        });

        btnFechar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnFechar.setText("Fechar");
        btnFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFecharActionPerformed(evt);
            }
        });

        jMenu1.setText("Ações");

        menuAbrir.setText("Abrir");
        menuAbrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAbrirActionPerformed(evt);
            }
        });
        jMenu1.add(menuAbrir);

        menuNotificar.setText("Notificar");
        jMenu1.add(menuNotificar);

        menuBarProjetosAdmin.add(jMenu1);

        menuDashboard.setText("Ver Dashboard");
        menuBarProjetosAdmin.add(menuDashboard);

        setJMenuBar(menuBarProjetosAdmin);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtOla)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNomeUsuario)
                        .addGap(204, 204, 204)
                        .addComponent(txtTituloProjetos)
                        .addGap(199, 199, 199)
                        .addComponent(txtTituloData, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtData))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPaneTabelaProjetos, javax.swing.GroupLayout.PREFERRED_SIZE, 690, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btnNovoProjeto)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(btnFechar))))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtOla)
                            .addComponent(txtNomeUsuario)
                            .addComponent(txtTituloProjetos)
                            .addComponent(txtTituloData)
                            .addComponent(txtData))
                        .addGap(134, 134, 134))
                    .addComponent(jScrollPaneTabelaProjetos, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNovoProjeto)
                    .addComponent(btnFechar))
                .addGap(41, 41, 41))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNovoProjetoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNovoProjetoMouseClicked
        
    }//GEN-LAST:event_btnNovoProjetoMouseClicked

    private void btnNovoProjetoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoProjetoActionPerformed
        CriarNovoProjetoView criarNovoProjeto = new CriarNovoProjetoView();
        criarNovoProjeto.setVisible(true);
    }//GEN-LAST:event_btnNovoProjetoActionPerformed

    private void btnFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharActionPerformed
        dispose();
    }//GEN-LAST:event_btnFecharActionPerformed

    private void menuAbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAbrirActionPerformed
        ListarQuestionariosView listarQuestionariosView = new ListarQuestionariosView();
        listarQuestionariosView.setVisible(true);
    }//GEN-LAST:event_menuAbrirActionPerformed

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
            java.util.logging.Logger.getLogger(ListarProjetosAdministradorView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListarProjetosAdministradorView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListarProjetosAdministradorView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListarProjetosAdministradorView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListarProjetosAdministradorView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFechar;
    private javax.swing.JButton btnNovoProjeto;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JScrollPane jScrollPaneTabelaProjetos;
    private javax.swing.JMenuItem menuAbrir;
    private javax.swing.JMenuBar menuBarProjetosAdmin;
    private javax.swing.JMenu menuDashboard;
    private javax.swing.JMenuItem menuNotificar;
    private javax.swing.JTable tableProjetos;
    private javax.swing.JLabel txtData;
    private javax.swing.JLabel txtNomeUsuario;
    private javax.swing.JLabel txtOla;
    private javax.swing.JLabel txtTituloData;
    private javax.swing.JLabel txtTituloProjetos;
    // End of variables declaration//GEN-END:variables
}
