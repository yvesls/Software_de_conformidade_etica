/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.gestaoqualidadeprojetos.sistema_de_conformidade_etica.view;

/**
 *
 * @author Gabriel
 */
public class PerguntasQuestionarioView extends javax.swing.JFrame {

    /**
     * Creates new form PerguntasQuestionarioView
     */
    public PerguntasQuestionarioView() {
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

        txtTituloPerguntasQuestionario = new javax.swing.JLabel();
        labelFase = new javax.swing.JLabel();
        selectFasePerguntaQuestionario = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        selectFuncaoAtor = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jScrollPaneTabelaProjetos = new javax.swing.JScrollPane();
        tablePerguntasQuestionario = new javax.swing.JTable();
        btnExcluirPergunta1 = new javax.swing.JButton();
        labelAcoes = new javax.swing.JLabel();
        btnEditarPergunta2 = new javax.swing.JButton();
        btnEditarPergunta3 = new javax.swing.JButton();
        btnEditarPergunta1 = new javax.swing.JButton();
        btnDuplicarPergunta2 = new javax.swing.JButton();
        btnDuplicarPergunta3 = new javax.swing.JButton();
        btnDuplicarPergunta1 = new javax.swing.JButton();
        btnExcluirPergunta2 = new javax.swing.JButton();
        btnExcluirPergunta3 = new javax.swing.JButton();
        btnNovaPergunta = new javax.swing.JButton();
        labelStatus = new javax.swing.JLabel();
        txtStatusQuestionario = new javax.swing.JLabel();
        btnSalvar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtTituloPerguntasQuestionario.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtTituloPerguntasQuestionario.setText("Perguntas do questionário");

        labelFase.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelFase.setText("Fase:");

        selectFasePerguntaQuestionario.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        selectFasePerguntaQuestionario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Fase I", "Fase II", "Fase III", "Fase IV", "Fase V" }));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Participante:");

        selectFuncaoAtor.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        selectFuncaoAtor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cliente", "Desenvolvedor", "Arquiteto de Software", "Líder Técnico", "Gerente de Projeto", "Analista de Qualidade" }));
        selectFuncaoAtor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectFuncaoAtorActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Perguntas:");

        tablePerguntasQuestionario.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tablePerguntasQuestionario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"01", "Você entendeu os objetivos do software?"},
                {"02", "Você está disposto a fornecer feedback para a equipe de desenvolvimento durante todo o processo?"},
                {"03", "Foi determinado quem toma as decisões em nome da sua empresa?"}
            },
            new String [] {
                "#", "Pergunta"
            }
        ));
        tablePerguntasQuestionario.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tablePerguntasQuestionario.setShowGrid(true);
        tablePerguntasQuestionario.setSurrendersFocusOnKeystroke(true);
        jScrollPaneTabelaProjetos.setViewportView(tablePerguntasQuestionario);
        if (tablePerguntasQuestionario.getColumnModel().getColumnCount() > 0) {
            tablePerguntasQuestionario.getColumnModel().getColumn(0).setMinWidth(50);
        }

        btnExcluirPergunta1.setText("Excluir");

        labelAcoes.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelAcoes.setText("Ações");

        btnEditarPergunta2.setText("Abrir");

        btnEditarPergunta3.setText("Abrir");

        btnEditarPergunta1.setText("Abrir");

        btnDuplicarPergunta2.setText("Duplicar");

        btnDuplicarPergunta3.setText("Duplicar");

        btnDuplicarPergunta1.setText("Duplicar");
        btnDuplicarPergunta1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDuplicarPergunta1ActionPerformed(evt);
            }
        });

        btnExcluirPergunta2.setText("Excluir");

        btnExcluirPergunta3.setText("Excluir");

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
        txtStatusQuestionario.setText("Rascunho");

        btnSalvar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnSalvar.setText("Salvar questionário");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(419, 419, 419)
                .addComponent(txtTituloPerguntasQuestionario)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(56, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(640, 640, 640))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jScrollPaneTabelaProjetos, javax.swing.GroupLayout.PREFERRED_SIZE, 687, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(26, 26, 26)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(labelStatus)
                                        .addGap(11, 11, 11)
                                        .addComponent(txtStatusQuestionario))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btnEditarPergunta2)
                                            .addComponent(btnEditarPergunta3)
                                            .addComponent(btnEditarPergunta1))
                                        .addGap(12, 12, 12)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btnDuplicarPergunta2)
                                            .addComponent(btnDuplicarPergunta3)
                                            .addComponent(btnDuplicarPergunta1))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btnExcluirPergunta2)
                                            .addComponent(btnExcluirPergunta3)
                                            .addComponent(btnExcluirPergunta1)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(labelAcoes)
                                        .addGap(100, 100, 100))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnNovaPergunta)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnSalvar)))
                        .addGap(54, 54, 54))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(labelFase, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(selectFasePerguntaQuestionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(117, 117, 117)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(selectFuncaoAtor, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(269, 269, 269))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(txtTituloPerguntasQuestionario)
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelFase)
                    .addComponent(selectFasePerguntaQuestionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(selectFuncaoAtor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPaneTabelaProjetos, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelAcoes)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnEditarPergunta1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnEditarPergunta2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnEditarPergunta3))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnDuplicarPergunta1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnDuplicarPergunta2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnDuplicarPergunta3))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnExcluirPergunta1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnExcluirPergunta2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnExcluirPergunta3)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelStatus)
                    .addComponent(txtStatusQuestionario))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNovaPergunta)
                    .addComponent(btnSalvar))
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void selectFuncaoAtorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectFuncaoAtorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_selectFuncaoAtorActionPerformed

    private void btnDuplicarPergunta1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDuplicarPergunta1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDuplicarPergunta1ActionPerformed

    private void btnNovaPerguntaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovaPerguntaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnNovaPerguntaActionPerformed

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
            java.util.logging.Logger.getLogger(PerguntasQuestionarioView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PerguntasQuestionarioView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PerguntasQuestionarioView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PerguntasQuestionarioView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PerguntasQuestionarioView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDuplicarPergunta1;
    private javax.swing.JButton btnDuplicarPergunta2;
    private javax.swing.JButton btnDuplicarPergunta3;
    private javax.swing.JButton btnEditarPergunta1;
    private javax.swing.JButton btnEditarPergunta2;
    private javax.swing.JButton btnEditarPergunta3;
    private javax.swing.JButton btnExcluirPergunta1;
    private javax.swing.JButton btnExcluirPergunta2;
    private javax.swing.JButton btnExcluirPergunta3;
    private javax.swing.JButton btnNovaPergunta;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPaneTabelaProjetos;
    private javax.swing.JLabel labelAcoes;
    private javax.swing.JLabel labelFase;
    private javax.swing.JLabel labelStatus;
    private javax.swing.JComboBox<String> selectFasePerguntaQuestionario;
    private javax.swing.JComboBox<String> selectFuncaoAtor;
    private javax.swing.JTable tablePerguntasQuestionario;
    private javax.swing.JLabel txtStatusQuestionario;
    private javax.swing.JLabel txtTituloPerguntasQuestionario;
    // End of variables declaration//GEN-END:variables
}
