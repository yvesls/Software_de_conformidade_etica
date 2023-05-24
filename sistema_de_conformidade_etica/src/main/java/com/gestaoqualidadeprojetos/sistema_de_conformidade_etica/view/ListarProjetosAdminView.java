/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.gestaoqualidadeprojetos.sistema_de_conformidade_etica.view;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author Gabriel
 */
public class ListarProjetosAdminView extends javax.swing.JFrame {

    /**
     * Creates new form ListarProjetosView
     */
    public ListarProjetosAdminView() {
        initComponents();
        setVisible(true);
        this.setLocationRelativeTo(this.getParent());
        centralizarTabela();
    }
    
    public void centralizarTabela() {
        DefaultTableCellRenderer centralizado = new DefaultTableCellRenderer();
	centralizado.setHorizontalAlignment(SwingConstants.CENTER);
	int i = 0;
	while (i < this.tableProjetos.getColumnCount()) {
            this.tableProjetos.getColumnModel().getColumn(i).setCellRenderer(centralizado);
            i++;
	}
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtTituloProjetos = new javax.swing.JLabel();
        btnNovoProjeto = new javax.swing.JButton();
        btnFechar = new javax.swing.JButton();
        btnAbrirProjetosAdmin = new javax.swing.JButton();
        btnVerDashboard = new javax.swing.JButton();
        jScrollPaneTabelaProjetos = new javax.swing.JScrollPane();
        tableProjetos = new javax.swing.JTable();
        menuBarProjetosAdmin = new javax.swing.JMenuBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtTituloProjetos.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtTituloProjetos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtTituloProjetos.setText("Projetos");

        btnNovoProjeto.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnNovoProjeto.setText("Novo Projeto");
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

        btnAbrirProjetosAdmin.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnAbrirProjetosAdmin.setText("Abrir Projeto");
        btnAbrirProjetosAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbrirProjetosAdminActionPerformed(evt);
            }
        });

        btnVerDashboard.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnVerDashboard.setText("Ver Dashboard");
        btnVerDashboard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerDashboardActionPerformed(evt);
            }
        });

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
        tableProjetos.setRowHeight(26);
        tableProjetos.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tableProjetos.setShowGrid(true);
        tableProjetos.setSurrendersFocusOnKeystroke(true);
        jScrollPaneTabelaProjetos.setViewportView(tableProjetos);

        setJMenuBar(menuBarProjetosAdmin);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtTituloProjetos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(btnNovoProjeto, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnFechar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 246, Short.MAX_VALUE)
                .addComponent(btnAbrirProjetosAdmin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnVerDashboard, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(47, 47, 47)
                    .addComponent(jScrollPaneTabelaProjetos, javax.swing.GroupLayout.DEFAULT_SIZE, 682, Short.MAX_VALUE)
                    .addGap(48, 48, 48)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(txtTituloProjetos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 148, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNovoProjeto)
                    .addComponent(btnFechar)
                    .addComponent(btnAbrirProjetosAdmin)
                    .addComponent(btnVerDashboard))
                .addGap(14, 14, 14))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(70, 70, 70)
                    .addComponent(jScrollPaneTabelaProjetos, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(56, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNovoProjetoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNovoProjetoMouseClicked
        
    }//GEN-LAST:event_btnNovoProjetoMouseClicked

    private void btnNovoProjetoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoProjetoActionPerformed
        dispose();
        CriarNovoProjetoView criarNovoProjeto = new CriarNovoProjetoView();
        criarNovoProjeto.setVisible(true);
    }//GEN-LAST:event_btnNovoProjetoActionPerformed

    private void btnFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharActionPerformed
        dispose();
    }//GEN-LAST:event_btnFecharActionPerformed

    private void btnAbrirProjetosAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbrirProjetosAdminActionPerformed
        ListarPerguntasFaseProjeto listarQuestionariosView = new ListarPerguntasFaseProjeto();
        listarQuestionariosView.setVisible(true);
    }//GEN-LAST:event_btnAbrirProjetosAdminActionPerformed

    private void btnVerDashboardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerDashboardActionPerformed
        /*DashboardView dashboardView = new DashboardView();
        dashboardView.setVisible(true);*/
    }//GEN-LAST:event_btnVerDashboardActionPerformed

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
            java.util.logging.Logger.getLogger(ListarProjetosAdminView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListarProjetosAdminView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListarProjetosAdminView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListarProjetosAdminView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListarProjetosAdminView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAbrirProjetosAdmin;
    private javax.swing.JButton btnFechar;
    private javax.swing.JButton btnNovoProjeto;
    private javax.swing.JButton btnVerDashboard;
    private javax.swing.JScrollPane jScrollPaneTabelaProjetos;
    private javax.swing.JMenuBar menuBarProjetosAdmin;
    private javax.swing.JTable tableProjetos;
    private javax.swing.JLabel txtTituloProjetos;
    // End of variables declaration//GEN-END:variables
}
