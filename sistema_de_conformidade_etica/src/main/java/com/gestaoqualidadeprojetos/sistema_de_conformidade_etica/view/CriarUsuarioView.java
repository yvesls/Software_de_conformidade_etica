
package com.gestaoqualidadeprojetos.sistema_de_conformidade_etica.view;

import javax.swing.JOptionPane;

/**
 *
 * @author lucas
 */
public class CriarUsuarioView extends javax.swing.JFrame {

    /**
     * Creates new form CriarUsuarioView
     */
    public CriarUsuarioView() {
        initComponents();
        this.setLocationRelativeTo(null); //abrir centralizado
        this.dispose();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtSobrenome = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtSenha = new javax.swing.JPasswordField();
        txtConfirmarSenha = new javax.swing.JPasswordField();
        lblNome = new javax.swing.JLabel();
        lblSobrenome = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        lblConfirmarSenha = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        lblSenha = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtTermo = new javax.swing.JTextArea();
        checkAceito = new javax.swing.JCheckBox();
        btnCancelar = new javax.swing.JButton();
        btnCadastrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Novo Usuário");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED), "Cadastrar", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 14))); // NOI18N

        txtEmail.setActionCommand("<Not Set>");
        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });

        txtConfirmarSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtConfirmarSenhaActionPerformed(evt);
            }
        });

        lblNome.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        lblNome.setText("Nome");

        lblSobrenome.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        lblSobrenome.setText("Sobrenome");

        lblEmail.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        lblEmail.setText("Email");

        lblConfirmarSenha.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        lblConfirmarSenha.setText("Confirmar");

        lblSenha.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        lblSenha.setText("Senha");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblEmail)
                    .addComponent(lblNome)
                    .addComponent(lblSenha))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblSobrenome)
                            .addComponent(lblConfirmarSenha))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtConfirmarSenha, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)
                            .addComponent(txtSobrenome)))
                    .addComponent(txtEmail))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNome)
                    .addComponent(txtSobrenome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSobrenome))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmail)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblSenha))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtConfirmarSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblConfirmarSenha)))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED), "TERMO DE PARTICIPAÇÃO", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 14))); // NOI18N

        txtTermo.setEditable(false);
        txtTermo.setColumns(20);
        txtTermo.setFont(new java.awt.Font("Dialog", 2, 14)); // NOI18N
        txtTermo.setRows(5);
        txtTermo.setText("\nEu declaro que estou ciente e concordo com os princípios éticos \nestabelecidos para o desenvolvimento deste software. Estes princípios \ntêm como objetivo garantir que o software desenvolvido atenda às \nnecessidades dos usuários finais de maneira justa, levando em \nconsideração questões éticas. Comprometo-me a respeitar e aplicar \nesses princípios em todas as fases do projeto, desde a concepção até a \nentrega final do produto.\n\nO Desenvolvimento de Software Orientado a Ética é uma abordagem \nnova e prática para o desenvolvimento de software que preenche uma \nlacuna e cria um vínculo entre as habilidades éticas e profissionais, \npropondo assim um processo de desenvolvimento de software mais \ntransparente e que traz uma melhor conscientização do riscos e \nlimitações no processo de desenvolvimento de software. \nAs questões éticas torna-se, assim, parte do processo necessário para\no desenvolvimento de produtos de Software de Qualidade.\n\nOs princípios éticos incluem, mas não se limitam a:\n\n1. Privacidade;\n2. Segurança;\n3. Acessibilidade;\n4. Responsabilidade Social;\n5. Transparência;\n6. Honestidade.\n\nO software ético exige que os stakeholders reflitam. Ele serve como uma\nferramenta para aumentar a conscientização sobre as ramificações \néticas do processo. As perguntas selecionadas devem ser apresentadas \nà todos os envolvidos de modo compreensível para que se possa obter \ninformações e alinhamento.\n\nAo aceitar este documento, declaro meu entendimento e concordância \ncom esses princípios éticos e comprometo-me a aderir a eles durante \ntodo o processo de desenvolvimento de software. Compreendo que \nqualquer violação desses princípios pode resultar em consequências \néticas e legais.\n\n\nData/Hora: [SISTEMA]\n");
        txtTermo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane1.setViewportView(txtTermo);

        checkAceito.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        checkAceito.setText("Aceito");
        checkAceito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkAceitoActionPerformed(evt);
            }
        });

        btnCancelar.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnCadastrar.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnCadastrar.setText("Cadastrar");
        btnCadastrar.setEnabled(false);
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 485, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(checkAceito)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCadastrar)
                    .addComponent(btnCancelar)
                    .addComponent(checkAceito))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtConfirmarSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtConfirmarSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtConfirmarSenhaActionPerformed

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
        if(checkAceito.isSelected())
            btnCadastrar.setEnabled(true);
    }//GEN-LAST:event_txtEmailActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        LoginView login = new LoginView();
        this.dispose();
        login.setVisible(true);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "Usuário criado com sucesso!", "Novo Usuário", WIDTH);
        this.setVisible(false);
        LoginView login = new LoginView();
        this.dispose();
        login.setVisible(true);
        
        
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void checkAceitoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkAceitoActionPerformed
        // TODO add your handling code here:
        if(checkAceito.isSelected())
            btnCadastrar.setEnabled(true);
        else
            btnCadastrar.setEnabled(false);
    }//GEN-LAST:event_checkAceitoActionPerformed

    
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
            java.util.logging.Logger.getLogger(CriarUsuarioView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CriarUsuarioView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CriarUsuarioView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CriarUsuarioView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CriarUsuarioView().setVisible(true);               
            }           
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JCheckBox checkAceito;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblConfirmarSenha;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblSenha;
    private javax.swing.JLabel lblSobrenome;
    private javax.swing.JPasswordField txtConfirmarSenha;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNome;
    private javax.swing.JPasswordField txtSenha;
    private javax.swing.JTextField txtSobrenome;
    private javax.swing.JTextArea txtTermo;
    // End of variables declaration//GEN-END:variables
}
