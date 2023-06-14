/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.gestaoqualidadeprojetos.view.projeto;
import com.gestaoqualidadeprojetos.view.gerenciamento.GerenciarIteracoesProjeto;
import com.gestaoqualidadeprojetos.view.dashboard.DashboardAdminView;
import com.gestaoqualidadeprojetos.view.gerenciamento.GerenciarEtapasIteracao;
import com.gestaoqualidadeprojetos.view.gerenciamento.GerenciarEtapasIteracao;
import com.gestaoqualidadeprojetos.view.questionario.QuestionarioView;
import javax.swing.DefaultCellEditor;
import javax.swing.JComboBox;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

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
        setResizable(false);
        this.setLocationRelativeTo(this.getParent());
        centralizarTabela();
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);//clicar no X não fechar o sistema inteiro
        
        // Adicionar o selectStatusProjeto como editor de célula na coluna "Status"
        JComboBox<String> comboBoxEditor = new JComboBox<>(new String[]{"Aberto", "Concluído", "Arquivado", "Rascunho"});
        tableProjetos.getColumnModel().getColumn(5).setCellEditor(new DefaultCellEditor(comboBoxEditor));
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

        selectStatusProjeto = new javax.swing.JComboBox<>();
        btnNovoProjeto = new javax.swing.JButton();
        btnFechar = new javax.swing.JButton();
        btnVerDashboard = new javax.swing.JButton();
        btnAbrirProjeto = new javax.swing.JButton();
        btnAbrirQuestionario = new javax.swing.JButton();
        jTextFieldBuscarProjeto = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPaneTabelaProjetosAbertos = new javax.swing.JScrollPane();
        tableProjetos = new javax.swing.JTable();
        menuBarProjetosAdmin = new javax.swing.JMenuBar();

        selectStatusProjeto.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        selectStatusProjeto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Aberto", "Concluído", "Arquivado", "Rascunho" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Todos os Projetos");

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

        btnVerDashboard.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnVerDashboard.setText("Ver Dashboard");
        btnVerDashboard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerDashboardActionPerformed(evt);
            }
        });

        btnAbrirProjeto.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnAbrirProjeto.setText("Abrir Projeto");
        btnAbrirProjeto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbrirProjetoActionPerformed(evt);
            }
        });

        btnAbrirQuestionario.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnAbrirQuestionario.setText("Responder Questionário");
        btnAbrirQuestionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbrirQuestionarioActionPerformed(evt);
            }
        });

        jTextFieldBuscarProjeto.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextFieldBuscarProjeto.setText("Nome do projeto");

        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton1.setText("Buscar");

        tableProjetos.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tableProjetos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"01", "Sistema de Padaria", "15/05/2023", "15/07/2023", "", "Aberto"},
                {"02", "App para Academia", "14/06/2023", "14/08/2023", "", "Aberto"},
                {"03", "Rede Social", "01/05/2023", "30/05/2023", "29/05/2023", "Concluído"},
                {"04", "Projeto Arquivado", "01/04/2023", "30/04/2023", "", "Arquivado"},
                {"05", "Projeto de Rascunho", "", null, null, "Rascunho"},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "#", "Nome", "Data de Abertura", "Previsão de Conclusão", "Data de Conclusão", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tableProjetos.setRowHeight(26);
        tableProjetos.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tableProjetos.setShowGrid(true);
        tableProjetos.setSurrendersFocusOnKeystroke(true);
        jScrollPaneTabelaProjetosAbertos.setViewportView(tableProjetos);
        if (tableProjetos.getColumnModel().getColumnCount() > 0) {
            tableProjetos.getColumnModel().getColumn(0).setMinWidth(50);
            tableProjetos.getColumnModel().getColumn(0).setPreferredWidth(50);
            tableProjetos.getColumnModel().getColumn(0).setMaxWidth(75);
            tableProjetos.getColumnModel().getColumn(1).setMinWidth(150);
            tableProjetos.getColumnModel().getColumn(1).setPreferredWidth(200);
            tableProjetos.getColumnModel().getColumn(5).setResizable(false);
        }

        setJMenuBar(menuBarProjetosAdmin);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextFieldBuscarProjeto, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnNovoProjeto, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAbrirProjeto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAbrirQuestionario)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnVerDashboard, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(271, 271, 271)
                        .addComponent(btnFechar))
                    .addComponent(jScrollPaneTabelaProjetosAbertos))
                .addGap(25, 25, 25))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldBuscarProjeto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(18, 18, 18)
                .addComponent(jScrollPaneTabelaProjetosAbertos, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNovoProjeto)
                    .addComponent(btnFechar)
                    .addComponent(btnAbrirProjeto)
                    .addComponent(btnAbrirQuestionario)
                    .addComponent(btnVerDashboard))
                .addContainerGap(20, Short.MAX_VALUE))
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

    private void btnVerDashboardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerDashboardActionPerformed
        //this.dispose();
        DashboardAdminView dashboardView = new DashboardAdminView();
        dashboardView.setVisible(true);
    }//GEN-LAST:event_btnVerDashboardActionPerformed

    private void btnAbrirProjetoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbrirProjetoActionPerformed
        //this.dispose();
        GerenciarIteracoesProjeto selecionarFasesProjetoMembroEquipeView = new GerenciarIteracoesProjeto();
        selecionarFasesProjetoMembroEquipeView.setVisible(true);
    }//GEN-LAST:event_btnAbrirProjetoActionPerformed

    private void btnAbrirQuestionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbrirQuestionarioActionPerformed
        //this.dispose();
        QuestionarioView questionarioView = new QuestionarioView();
        questionarioView.setVisible(true);
    }//GEN-LAST:event_btnAbrirQuestionarioActionPerformed

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
    private javax.swing.JButton btnAbrirProjeto;
    private javax.swing.JButton btnAbrirQuestionario;
    private javax.swing.JButton btnFechar;
    private javax.swing.JButton btnNovoProjeto;
    private javax.swing.JButton btnVerDashboard;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPaneTabelaProjetosAbertos;
    private javax.swing.JTextField jTextFieldBuscarProjeto;
    private javax.swing.JMenuBar menuBarProjetosAdmin;
    private javax.swing.JComboBox<String> selectStatusProjeto;
    private javax.swing.JTable tableProjetos;
    // End of variables declaration//GEN-END:variables
}
