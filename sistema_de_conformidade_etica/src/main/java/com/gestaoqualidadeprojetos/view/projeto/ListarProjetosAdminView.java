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
	while (i < this.tableProjetosAbertos.getColumnCount()) {
            this.tableProjetosAbertos.getColumnModel().getColumn(i).setCellRenderer(centralizado);
            i++;
	}
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtTituloProjetos = new javax.swing.JLabel();
        btnNovoProjeto = new javax.swing.JButton();
        btnFechar = new javax.swing.JButton();
        btnVerDashboard = new javax.swing.JButton();
        btnAbrirProjeto = new javax.swing.JButton();
        abasMembrosEquipe = new javax.swing.JTabbedPane();
        projetosAbertos = new javax.swing.JPanel();
        jScrollPaneTabelaProjetosAbertos = new javax.swing.JScrollPane();
        tableProjetosAbertos = new javax.swing.JTable();
        projetosFechados = new javax.swing.JPanel();
        jScrollPaneTabelaProjetosAbertos2 = new javax.swing.JScrollPane();
        tableProjetosAbertos2 = new javax.swing.JTable();
        projetosRascunhos = new javax.swing.JPanel();
        jScrollPaneTabelaProjetosAbertos4 = new javax.swing.JScrollPane();
        tableProjetosAbertos4 = new javax.swing.JTable();
        btnAbrirQuestionario = new javax.swing.JButton();
        menuBarProjetosAdmin = new javax.swing.JMenuBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Todos os Projetos");

        txtTituloProjetos.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtTituloProjetos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtTituloProjetos.setText("Todos os Projetos");

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
        btnAbrirProjeto.setText("Abrir");
        btnAbrirProjeto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbrirProjetoActionPerformed(evt);
            }
        });

        abasMembrosEquipe.setToolTipText("");
        abasMembrosEquipe.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        abasMembrosEquipe.setName("Fases da Iteração"); // NOI18N

        tableProjetosAbertos.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tableProjetosAbertos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"02", "Sistema de Padaria", "15/05/2023", "15/07/2023", "30/07/2023"},
                {"03", "App para Academia", "26/05/2023", "30/07/2023", "15/08/2023"},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "#", "Nome", "Data Abertura", "Data Limite", "Data Final"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tableProjetosAbertos.setRowHeight(26);
        tableProjetosAbertos.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tableProjetosAbertos.setShowGrid(true);
        tableProjetosAbertos.setSurrendersFocusOnKeystroke(true);
        jScrollPaneTabelaProjetosAbertos.setViewportView(tableProjetosAbertos);

        javax.swing.GroupLayout projetosAbertosLayout = new javax.swing.GroupLayout(projetosAbertos);
        projetosAbertos.setLayout(projetosAbertosLayout);
        projetosAbertosLayout.setHorizontalGroup(
            projetosAbertosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPaneTabelaProjetosAbertos, javax.swing.GroupLayout.DEFAULT_SIZE, 850, Short.MAX_VALUE)
        );
        projetosAbertosLayout.setVerticalGroup(
            projetosAbertosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(projetosAbertosLayout.createSequentialGroup()
                .addComponent(jScrollPaneTabelaProjetosAbertos, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );

        abasMembrosEquipe.addTab("Abertos", projetosAbertos);

        tableProjetosAbertos2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tableProjetosAbertos2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"01", "Sistema de Matrícula", "15/05/2023", "15/06/2023", "30/06/2023"},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "#", "Nome", "Data Abertura", "Data Limite", "Data Final"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tableProjetosAbertos2.setRowHeight(26);
        tableProjetosAbertos2.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tableProjetosAbertos2.setShowGrid(true);
        tableProjetosAbertos2.setSurrendersFocusOnKeystroke(true);
        jScrollPaneTabelaProjetosAbertos2.setViewportView(tableProjetosAbertos2);

        javax.swing.GroupLayout projetosFechadosLayout = new javax.swing.GroupLayout(projetosFechados);
        projetosFechados.setLayout(projetosFechadosLayout);
        projetosFechadosLayout.setHorizontalGroup(
            projetosFechadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPaneTabelaProjetosAbertos2, javax.swing.GroupLayout.DEFAULT_SIZE, 850, Short.MAX_VALUE)
        );
        projetosFechadosLayout.setVerticalGroup(
            projetosFechadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(projetosFechadosLayout.createSequentialGroup()
                .addComponent(jScrollPaneTabelaProjetosAbertos2, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );

        abasMembrosEquipe.addTab("Fechados", projetosFechados);

        tableProjetosAbertos4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tableProjetosAbertos4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"", "Rede social", "", "", "30/07/2023"},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "#", "Nome", "Data Abertura", "Data Limite", "Data Final"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tableProjetosAbertos4.setRowHeight(26);
        tableProjetosAbertos4.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tableProjetosAbertos4.setShowGrid(true);
        tableProjetosAbertos4.setSurrendersFocusOnKeystroke(true);
        jScrollPaneTabelaProjetosAbertos4.setViewportView(tableProjetosAbertos4);

        javax.swing.GroupLayout projetosRascunhosLayout = new javax.swing.GroupLayout(projetosRascunhos);
        projetosRascunhos.setLayout(projetosRascunhosLayout);
        projetosRascunhosLayout.setHorizontalGroup(
            projetosRascunhosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPaneTabelaProjetosAbertos4, javax.swing.GroupLayout.DEFAULT_SIZE, 850, Short.MAX_VALUE)
        );
        projetosRascunhosLayout.setVerticalGroup(
            projetosRascunhosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(projetosRascunhosLayout.createSequentialGroup()
                .addComponent(jScrollPaneTabelaProjetosAbertos4, javax.swing.GroupLayout.DEFAULT_SIZE, 286, Short.MAX_VALUE)
                .addContainerGap())
        );

        abasMembrosEquipe.addTab("Rascunhos", projetosRascunhos);

        btnAbrirQuestionario.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnAbrirQuestionario.setText("Responder Questionário");
        btnAbrirQuestionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbrirQuestionarioActionPerformed(evt);
            }
        });
        setJMenuBar(menuBarProjetosAdmin);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtTituloProjetos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnNovoProjeto, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAbrirProjeto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAbrirQuestionario)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnVerDashboard, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnFechar))
                    .addComponent(abasMembrosEquipe))
                .addGap(65, 65, 65))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(txtTituloProjetos)
                .addGap(35, 35, 35)
                .addComponent(abasMembrosEquipe, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNovoProjeto)
                    .addComponent(btnFechar)
                    .addComponent(btnAbrirProjeto)
                    .addComponent(btnAbrirQuestionario)
                    .addComponent(btnVerDashboard))
                .addGap(20, 20, 20))
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
    private javax.swing.JTabbedPane abasMembrosEquipe;
    private javax.swing.JButton btnAbrirProjeto;
    private javax.swing.JButton btnAbrirQuestionario;
    private javax.swing.JButton btnFechar;
    private javax.swing.JButton btnNovoProjeto;
    private javax.swing.JButton btnVerDashboard;
    private javax.swing.JScrollPane jScrollPaneTabelaProjetosAbertos;
    private javax.swing.JScrollPane jScrollPaneTabelaProjetosAbertos2;
    private javax.swing.JScrollPane jScrollPaneTabelaProjetosAbertos4;
    private javax.swing.JMenuBar menuBarProjetosAdmin;
    private javax.swing.JPanel projetosAbertos;
    private javax.swing.JPanel projetosFechados;
    private javax.swing.JPanel projetosRascunhos;
    private javax.swing.JTable tableProjetosAbertos;
    private javax.swing.JTable tableProjetosAbertos2;
    private javax.swing.JTable tableProjetosAbertos4;
    private javax.swing.JLabel txtTituloProjetos;
    // End of variables declaration//GEN-END:variables
}
