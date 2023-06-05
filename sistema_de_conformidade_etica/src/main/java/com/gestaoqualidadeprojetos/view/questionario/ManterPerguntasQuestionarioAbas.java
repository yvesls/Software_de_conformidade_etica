/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.gestaoqualidadeprojetos.view.questionario;

import com.gestaoqualidadeprojetos.view.gerenciamento.CriarNovaPerguntaView;
import com.gestaoqualidadeprojetos.view.gerenciamento.EditarPerguntaView;
import com.gestaoqualidadeprojetos.view.questionario.ManterQuestionariosView;

/**
 *
 * @author Gabriel
 */
public class ManterPerguntasQuestionarioAbas extends javax.swing.JFrame {

    /**
     * Creates new form PerguntasQuestionarioView
     */
    public ManterPerguntasQuestionarioAbas() {
        initComponents();
        setVisible(true);
        //this.setExtendedState(this.MAXIMIZED_BOTH);
        this.setLocationRelativeTo(this.getParent());
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);//clicar no X não fechar o sistema inteiro
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtTituloPerguntasQuestionario = new javax.swing.JLabel();
        btnNovaPergunta = new javax.swing.JButton();
        labelStatus = new javax.swing.JLabel();
        txtStatusQuestionario = new javax.swing.JLabel();
        btnSalvar1 = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        abasFasesIteracao = new javax.swing.JTabbedPane();
        faseIniciacao = new javax.swing.JPanel();
        jScrollPaneTabelaProjetos1 = new javax.swing.JScrollPane();
        tablePerguntasQuestionario1 = new javax.swing.JTable();
        faseRequisitos = new javax.swing.JPanel();
        jScrollPaneTabelaProjetos2 = new javax.swing.JScrollPane();
        tablePerguntasQuestionario2 = new javax.swing.JTable();
        faseProjeto = new javax.swing.JPanel();
        jScrollPaneTabelaProjetos3 = new javax.swing.JScrollPane();
        tablePerguntasQuestionario3 = new javax.swing.JTable();
        faseDesenvolvimento = new javax.swing.JPanel();
        jScrollPaneTabelaProjetos4 = new javax.swing.JScrollPane();
        tablePerguntasQuestionario4 = new javax.swing.JTable();
        faseTesteVerificacao = new javax.swing.JPanel();
        jScrollPaneTabelaProjetos5 = new javax.swing.JScrollPane();
        tablePerguntasQuestionario5 = new javax.swing.JTable();
        btnEditarPergunta = new javax.swing.JButton();
        btnExcluirPergunta = new javax.swing.JButton();
        menuAcoesPerguntasQuestionario = new javax.swing.JMenuBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Manter Perguntas do Questionário");

        txtTituloPerguntasQuestionario.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtTituloPerguntasQuestionario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtTituloPerguntasQuestionario.setText("Perguntas do Questionário: Questionário Padrão");

        btnNovaPergunta.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnNovaPergunta.setText("Nova pergunta");
        btnNovaPergunta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovaPerguntaActionPerformed(evt);
            }
        });

        labelStatus.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelStatus.setText("Status:");

        txtStatusQuestionario.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtStatusQuestionario.setText("Publicado");

        btnSalvar1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnSalvar1.setText("Salvar");
        btnSalvar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvar1ActionPerformed(evt);
            }
        });

        btnCancelar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnCancelar.setText("Voltar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        abasFasesIteracao.setToolTipText("");
        abasFasesIteracao.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        abasFasesIteracao.setName("Fases da Iteração"); // NOI18N

        tablePerguntasQuestionario1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tablePerguntasQuestionario1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"01", "Você entendeu os objetivos do software?"},
                {"02", "Você está disposto a fornecer feedback para a equipe de desenvolvimento durante todo o processo?"},
                {"03", "Foi determinado quem toma as decisões em nome da sua empresa?"},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "#", "Pergunta"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablePerguntasQuestionario1.setRowHeight(26);
        tablePerguntasQuestionario1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tablePerguntasQuestionario1.setShowGrid(true);
        tablePerguntasQuestionario1.setSurrendersFocusOnKeystroke(true);
        jScrollPaneTabelaProjetos1.setViewportView(tablePerguntasQuestionario1);
        if (tablePerguntasQuestionario1.getColumnModel().getColumnCount() > 0) {
            tablePerguntasQuestionario1.getColumnModel().getColumn(0).setMinWidth(50);
            tablePerguntasQuestionario1.getColumnModel().getColumn(0).setPreferredWidth(10);
            tablePerguntasQuestionario1.getColumnModel().getColumn(0).setMaxWidth(10);
        }

        javax.swing.GroupLayout faseIniciacaoLayout = new javax.swing.GroupLayout(faseIniciacao);
        faseIniciacao.setLayout(faseIniciacaoLayout);
        faseIniciacaoLayout.setHorizontalGroup(
            faseIniciacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPaneTabelaProjetos1)
        );
        faseIniciacaoLayout.setVerticalGroup(
            faseIniciacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(faseIniciacaoLayout.createSequentialGroup()
                .addComponent(jScrollPaneTabelaProjetos1, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        abasFasesIteracao.addTab("Iniciação", faseIniciacao);

        tablePerguntasQuestionario2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tablePerguntasQuestionario2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"01", "Você entendeu os objetivos do software?"},
                {"02", "Você está disposto a fornecer feedback para a equipe de desenvolvimento durante todo o processo?"},
                {"03", "Foi determinado quem toma as decisões em nome da sua empresa?"},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "#", "Pergunta"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablePerguntasQuestionario2.setRowHeight(26);
        tablePerguntasQuestionario2.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tablePerguntasQuestionario2.setShowGrid(true);
        tablePerguntasQuestionario2.setSurrendersFocusOnKeystroke(true);
        jScrollPaneTabelaProjetos2.setViewportView(tablePerguntasQuestionario2);
        if (tablePerguntasQuestionario2.getColumnModel().getColumnCount() > 0) {
            tablePerguntasQuestionario2.getColumnModel().getColumn(0).setMinWidth(50);
            tablePerguntasQuestionario2.getColumnModel().getColumn(0).setPreferredWidth(10);
            tablePerguntasQuestionario2.getColumnModel().getColumn(0).setMaxWidth(10);
        }

        javax.swing.GroupLayout faseRequisitosLayout = new javax.swing.GroupLayout(faseRequisitos);
        faseRequisitos.setLayout(faseRequisitosLayout);
        faseRequisitosLayout.setHorizontalGroup(
            faseRequisitosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPaneTabelaProjetos2)
        );
        faseRequisitosLayout.setVerticalGroup(
            faseRequisitosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(faseRequisitosLayout.createSequentialGroup()
                .addComponent(jScrollPaneTabelaProjetos2, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        abasFasesIteracao.addTab("Requisitos", faseRequisitos);

        tablePerguntasQuestionario3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tablePerguntasQuestionario3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"01", "Você entendeu os objetivos do software?"},
                {"02", "Você está disposto a fornecer feedback para a equipe de desenvolvimento durante todo o processo?"},
                {"03", "Foi determinado quem toma as decisões em nome da sua empresa?"},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "#", "Pergunta"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablePerguntasQuestionario3.setRowHeight(26);
        tablePerguntasQuestionario3.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tablePerguntasQuestionario3.setShowGrid(true);
        tablePerguntasQuestionario3.setSurrendersFocusOnKeystroke(true);
        jScrollPaneTabelaProjetos3.setViewportView(tablePerguntasQuestionario3);
        if (tablePerguntasQuestionario3.getColumnModel().getColumnCount() > 0) {
            tablePerguntasQuestionario3.getColumnModel().getColumn(0).setMinWidth(50);
            tablePerguntasQuestionario3.getColumnModel().getColumn(0).setPreferredWidth(10);
            tablePerguntasQuestionario3.getColumnModel().getColumn(0).setMaxWidth(10);
        }

        javax.swing.GroupLayout faseProjetoLayout = new javax.swing.GroupLayout(faseProjeto);
        faseProjeto.setLayout(faseProjetoLayout);
        faseProjetoLayout.setHorizontalGroup(
            faseProjetoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPaneTabelaProjetos3)
        );
        faseProjetoLayout.setVerticalGroup(
            faseProjetoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(faseProjetoLayout.createSequentialGroup()
                .addComponent(jScrollPaneTabelaProjetos3, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        abasFasesIteracao.addTab("Projeto", faseProjeto);

        tablePerguntasQuestionario4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tablePerguntasQuestionario4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"01", "Você entendeu os objetivos do software?"},
                {"02", "Você está disposto a fornecer feedback para a equipe de desenvolvimento durante todo o processo?"},
                {"03", "Foi determinado quem toma as decisões em nome da sua empresa?"},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "#", "Pergunta"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablePerguntasQuestionario4.setRowHeight(26);
        tablePerguntasQuestionario4.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tablePerguntasQuestionario4.setShowGrid(true);
        tablePerguntasQuestionario4.setSurrendersFocusOnKeystroke(true);
        jScrollPaneTabelaProjetos4.setViewportView(tablePerguntasQuestionario4);
        if (tablePerguntasQuestionario4.getColumnModel().getColumnCount() > 0) {
            tablePerguntasQuestionario4.getColumnModel().getColumn(0).setMinWidth(50);
            tablePerguntasQuestionario4.getColumnModel().getColumn(0).setPreferredWidth(10);
            tablePerguntasQuestionario4.getColumnModel().getColumn(0).setMaxWidth(10);
        }

        javax.swing.GroupLayout faseDesenvolvimentoLayout = new javax.swing.GroupLayout(faseDesenvolvimento);
        faseDesenvolvimento.setLayout(faseDesenvolvimentoLayout);
        faseDesenvolvimentoLayout.setHorizontalGroup(
            faseDesenvolvimentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPaneTabelaProjetos4)
        );
        faseDesenvolvimentoLayout.setVerticalGroup(
            faseDesenvolvimentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(faseDesenvolvimentoLayout.createSequentialGroup()
                .addComponent(jScrollPaneTabelaProjetos4, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        abasFasesIteracao.addTab("Desenvolvimento", faseDesenvolvimento);

        tablePerguntasQuestionario5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tablePerguntasQuestionario5.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"01", "Você entendeu os objetivos do software?"},
                {"02", "Você está disposto a fornecer feedback para a equipe de desenvolvimento durante todo o processo?"},
                {"03", "Foi determinado quem toma as decisões em nome da sua empresa?"},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "#", "Pergunta"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablePerguntasQuestionario5.setRowHeight(26);
        tablePerguntasQuestionario5.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tablePerguntasQuestionario5.setShowGrid(true);
        tablePerguntasQuestionario5.setSurrendersFocusOnKeystroke(true);
        jScrollPaneTabelaProjetos5.setViewportView(tablePerguntasQuestionario5);
        if (tablePerguntasQuestionario5.getColumnModel().getColumnCount() > 0) {
            tablePerguntasQuestionario5.getColumnModel().getColumn(0).setMinWidth(50);
            tablePerguntasQuestionario5.getColumnModel().getColumn(0).setPreferredWidth(10);
            tablePerguntasQuestionario5.getColumnModel().getColumn(0).setMaxWidth(10);
        }

        javax.swing.GroupLayout faseTesteVerificacaoLayout = new javax.swing.GroupLayout(faseTesteVerificacao);
        faseTesteVerificacao.setLayout(faseTesteVerificacaoLayout);
        faseTesteVerificacaoLayout.setHorizontalGroup(
            faseTesteVerificacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPaneTabelaProjetos5, javax.swing.GroupLayout.DEFAULT_SIZE, 1003, Short.MAX_VALUE)
        );
        faseTesteVerificacaoLayout.setVerticalGroup(
            faseTesteVerificacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPaneTabelaProjetos5, javax.swing.GroupLayout.DEFAULT_SIZE, 283, Short.MAX_VALUE)
        );

        abasFasesIteracao.addTab("Teste e Verificação", faseTesteVerificacao);

        btnEditarPergunta.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnEditarPergunta.setText("Editar");
        btnEditarPergunta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarPerguntaActionPerformed(evt);
            }
        });

        btnExcluirPergunta.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnExcluirPergunta.setText("Excluir");
        btnExcluirPergunta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirPerguntaActionPerformed(evt);
            }
        });
        setJMenuBar(menuAcoesPerguntasQuestionario);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtTituloPerguntasQuestionario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(0, 0, Short.MAX_VALUE)
                            .addComponent(labelStatus)
                            .addGap(11, 11, 11)
                            .addComponent(txtStatusQuestionario))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btnNovaPergunta)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnEditarPergunta)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnExcluirPergunta)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnCancelar)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnSalvar1)))
                    .addComponent(abasFasesIteracao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(65, 65, 65))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(txtTituloPerguntasQuestionario)
                .addGap(35, 35, 35)
                .addComponent(abasFasesIteracao, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelStatus)
                    .addComponent(txtStatusQuestionario))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnSalvar1)
                        .addComponent(btnCancelar))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnNovaPergunta)
                        .addComponent(btnEditarPergunta)
                        .addComponent(btnExcluirPergunta)))
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    
    private void btnNovaPerguntaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovaPerguntaActionPerformed
        CriarNovaPerguntaView criarNovaPerguntaView = new CriarNovaPerguntaView();
        criarNovaPerguntaView.setVisible(true);
    }//GEN-LAST:event_btnNovaPerguntaActionPerformed

    private void btnSalvar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSalvar1ActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        
        
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnEditarPerguntaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarPerguntaActionPerformed
        this.dispose();
        EditarPerguntaView editarPerguntaView = new EditarPerguntaView();
        editarPerguntaView.setVisible(true);
    }//GEN-LAST:event_btnEditarPerguntaActionPerformed

    private void btnExcluirPerguntaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirPerguntaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnExcluirPerguntaActionPerformed

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
            java.util.logging.Logger.getLogger(ManterPerguntasQuestionarioAbas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManterPerguntasQuestionarioAbas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManterPerguntasQuestionarioAbas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManterPerguntasQuestionarioAbas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManterPerguntasQuestionarioAbas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane abasFasesIteracao;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEditarPergunta;
    private javax.swing.JButton btnExcluirPergunta;
    private javax.swing.JButton btnNovaPergunta;
    private javax.swing.JButton btnSalvar1;
    private javax.swing.JPanel faseDesenvolvimento;
    private javax.swing.JPanel faseIniciacao;
    private javax.swing.JPanel faseProjeto;
    private javax.swing.JPanel faseRequisitos;
    private javax.swing.JPanel faseTesteVerificacao;
    private javax.swing.JScrollPane jScrollPaneTabelaProjetos1;
    private javax.swing.JScrollPane jScrollPaneTabelaProjetos2;
    private javax.swing.JScrollPane jScrollPaneTabelaProjetos3;
    private javax.swing.JScrollPane jScrollPaneTabelaProjetos4;
    private javax.swing.JScrollPane jScrollPaneTabelaProjetos5;
    private javax.swing.JLabel labelStatus;
    private javax.swing.JMenuBar menuAcoesPerguntasQuestionario;
    private javax.swing.JTable tablePerguntasQuestionario1;
    private javax.swing.JTable tablePerguntasQuestionario2;
    private javax.swing.JTable tablePerguntasQuestionario3;
    private javax.swing.JTable tablePerguntasQuestionario4;
    private javax.swing.JTable tablePerguntasQuestionario5;
    private javax.swing.JLabel txtStatusQuestionario;
    private javax.swing.JLabel txtTituloPerguntasQuestionario;
    // End of variables declaration//GEN-END:variables
}
