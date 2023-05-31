/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.gestaoqualidadeprojetos.view.projeto;
import com.gestaoqualidadeprojetos.view.fase.AbrirFasesProjetoMembroEquipeView;
import com.gestaoqualidadeprojetos.view.dashboard.DashboardAdminView;
import com.gestaoqualidadeprojetos.view.pergunta.ListarPerguntasFaseProjetoView;
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
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);//clicar no X não fechar o sistema inteiro

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
        ConfigurarProjetosAdmin = new javax.swing.JButton();
        btnVerDashboard = new javax.swing.JButton();
        jScrollPaneTabelaProjetos = new javax.swing.JScrollPane();
        tableProjetos = new javax.swing.JTable();
        btnAbrirProjeto = new javax.swing.JButton();
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

        ConfigurarProjetosAdmin.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ConfigurarProjetosAdmin.setText("Configurar Projeto");
        ConfigurarProjetosAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfigurarProjetosAdminActionPerformed(evt);
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
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableProjetos.setRowHeight(26);
        tableProjetos.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tableProjetos.setShowGrid(true);
        tableProjetos.setSurrendersFocusOnKeystroke(true);
        jScrollPaneTabelaProjetos.setViewportView(tableProjetos);

        btnAbrirProjeto.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnAbrirProjeto.setText("Abrir Projeto");
        btnAbrirProjeto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbrirProjetoActionPerformed(evt);
            }
        });
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 146, Short.MAX_VALUE)
                .addComponent(ConfigurarProjetosAdmin)
                .addGap(18, 18, 18)
                .addComponent(btnAbrirProjeto)
                .addGap(18, 18, 18)
                .addComponent(btnVerDashboard, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(47, 47, 47)
                    .addComponent(jScrollPaneTabelaProjetos, javax.swing.GroupLayout.DEFAULT_SIZE, 759, Short.MAX_VALUE)
                    .addGap(48, 48, 48)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(txtTituloProjetos)
                .addGap(146, 146, 146)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNovoProjeto)
                    .addComponent(btnFechar)
                    .addComponent(ConfigurarProjetosAdmin)
                    .addComponent(btnVerDashboard)
                    .addComponent(btnAbrirProjeto, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(70, 70, 70)
                    .addComponent(jScrollPaneTabelaProjetos, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(59, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNovoProjetoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNovoProjetoMouseClicked
        
    }//GEN-LAST:event_btnNovoProjetoMouseClicked

    private void btnNovoProjetoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoProjetoActionPerformed
        this.dispose();
        CriarNovoProjetoView criarNovoProjeto = new CriarNovoProjetoView();
        criarNovoProjeto.setVisible(true);
    }//GEN-LAST:event_btnNovoProjetoActionPerformed

    private void btnFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharActionPerformed
        this.dispose();
        //TelaInicialAdminView telaInicialAdminView = new TelaInicialAdminView();
        //telaInicialAdminView.setVisible(true);
    }//GEN-LAST:event_btnFecharActionPerformed

    private void ConfigurarProjetosAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfigurarProjetosAdminActionPerformed
        this.dispose();
        ListarPerguntasFaseProjetoView listarPerguntasFaseProjetoView = new ListarPerguntasFaseProjetoView();
        listarPerguntasFaseProjetoView.setVisible(true);
    }//GEN-LAST:event_ConfigurarProjetosAdminActionPerformed

    private void btnVerDashboardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerDashboardActionPerformed
        this.dispose();
        DashboardAdminView dashboardView = new DashboardAdminView();
        dashboardView.setVisible(true);
    }//GEN-LAST:event_btnVerDashboardActionPerformed

    private void btnAbrirProjetoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbrirProjetoActionPerformed
        this.dispose();
        AbrirFasesProjetoMembroEquipeView selecionarFasesProjetoMembroEquipeView = new AbrirFasesProjetoMembroEquipeView();
        selecionarFasesProjetoMembroEquipeView.setVisible(true);
    }//GEN-LAST:event_btnAbrirProjetoActionPerformed

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
    private javax.swing.JButton ConfigurarProjetosAdmin;
    private javax.swing.JButton btnAbrirProjeto;
    private javax.swing.JButton btnFechar;
    private javax.swing.JButton btnNovoProjeto;
    private javax.swing.JButton btnVerDashboard;
    private javax.swing.JScrollPane jScrollPaneTabelaProjetos;
    private javax.swing.JMenuBar menuBarProjetosAdmin;
    private javax.swing.JTable tableProjetos;
    private javax.swing.JLabel txtTituloProjetos;
    // End of variables declaration//GEN-END:variables
}
