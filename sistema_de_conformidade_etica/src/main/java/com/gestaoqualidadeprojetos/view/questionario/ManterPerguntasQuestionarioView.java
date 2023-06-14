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
public class ManterPerguntasQuestionarioView extends javax.swing.JFrame {

    /**
     * Creates new form PerguntasQuestionarioView
     */
    public ManterPerguntasQuestionarioView() {
        initComponents();
        setVisible(true);
        setResizable(false);
        //this.setExtendedState(this.MAXIMIZED_BOTH);
        this.setLocationRelativeTo(this.getParent());
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);//clicar no X não fechar o sistema inteiro
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtTituloPerguntasQuestionario = new javax.swing.JLabel();
        btnNovaPergunta = new javax.swing.JButton();
        btnSalvar1 = new javax.swing.JButton();
        btnFechar = new javax.swing.JButton();
        btnEditarPergunta = new javax.swing.JButton();
        btnExcluirPergunta = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jScrollPaneTabelaProjetos6 = new javax.swing.JScrollPane();
        tablePerguntasQuestionario6 = new javax.swing.JTable();
        txtTituloPerguntasQuestionario1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        selectIteracao = new javax.swing.JComboBox<>();
        menuAcoesPerguntasQuestionario = new javax.swing.JMenuBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Manter Perguntas do Questionário");

        txtTituloPerguntasQuestionario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtTituloPerguntasQuestionario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtTituloPerguntasQuestionario.setText("Questionário:");

        btnNovaPergunta.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnNovaPergunta.setText("Nova Pergunta");
        btnNovaPergunta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovaPerguntaActionPerformed(evt);
            }
        });

        btnSalvar1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnSalvar1.setText("Salvar Perguntas");
        btnSalvar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvar1ActionPerformed(evt);
            }
        });

        btnFechar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnFechar.setText("Fechar");
        btnFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFecharActionPerformed(evt);
            }
        });

        btnEditarPergunta.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnEditarPergunta.setText("Editar Pergunta");
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

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Etapas:");

        jComboBox1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Iniciação", "Requisitos", "Projeto", "Desenvolvimento", "Teste e Verficação" }));

        tablePerguntasQuestionario6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tablePerguntasQuestionario6.setModel(new javax.swing.table.DefaultTableModel(
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
        tablePerguntasQuestionario6.setRowHeight(26);
        tablePerguntasQuestionario6.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tablePerguntasQuestionario6.setShowGrid(true);
        tablePerguntasQuestionario6.setSurrendersFocusOnKeystroke(true);
        jScrollPaneTabelaProjetos6.setViewportView(tablePerguntasQuestionario6);
        if (tablePerguntasQuestionario6.getColumnModel().getColumnCount() > 0) {
            tablePerguntasQuestionario6.getColumnModel().getColumn(0).setMinWidth(50);
            tablePerguntasQuestionario6.getColumnModel().getColumn(0).setPreferredWidth(10);
            tablePerguntasQuestionario6.getColumnModel().getColumn(0).setMaxWidth(10);
        }

        txtTituloPerguntasQuestionario1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtTituloPerguntasQuestionario1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtTituloPerguntasQuestionario1.setText("Questionario Etico 2");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Iteração:");

        selectIteracao.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        selectIteracao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sprint 1", "Sprint 2", "Sprint 3", "Sprint 4" }));
        setJMenuBar(menuAcoesPerguntasQuestionario);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPaneTabelaProjetos6)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnNovaPergunta)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnEditarPergunta)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnExcluirPergunta)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnSalvar1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnFechar)))
                        .addGap(25, 25, 25))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtTituloPerguntasQuestionario)
                                    .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(49, 49, 49)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(830, 830, 830))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(selectIteracao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTituloPerguntasQuestionario1))
                                .addGap(0, 0, Short.MAX_VALUE))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTituloPerguntasQuestionario)
                    .addComponent(txtTituloPerguntasQuestionario1))
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(selectIteracao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addComponent(jScrollPaneTabelaProjetos6, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnSalvar1)
                        .addComponent(btnFechar))
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
        this.dispose();
    }//GEN-LAST:event_btnSalvar1ActionPerformed

    private void btnFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnFecharActionPerformed

    private void btnEditarPerguntaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarPerguntaActionPerformed
        //this.dispose();
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
            java.util.logging.Logger.getLogger(ManterPerguntasQuestionarioView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManterPerguntasQuestionarioView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManterPerguntasQuestionarioView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManterPerguntasQuestionarioView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManterPerguntasQuestionarioView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditarPergunta;
    private javax.swing.JButton btnExcluirPergunta;
    private javax.swing.JButton btnFechar;
    private javax.swing.JButton btnNovaPergunta;
    private javax.swing.JButton btnSalvar1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPaneTabelaProjetos6;
    private javax.swing.JMenuBar menuAcoesPerguntasQuestionario;
    private javax.swing.JComboBox<String> selectIteracao;
    private javax.swing.JTable tablePerguntasQuestionario6;
    private javax.swing.JLabel txtTituloPerguntasQuestionario;
    private javax.swing.JLabel txtTituloPerguntasQuestionario1;
    // End of variables declaration//GEN-END:variables
}
