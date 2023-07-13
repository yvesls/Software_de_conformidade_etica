
package com.gestaoqualidadeprojetos.view.login;

import com.gestaoqualidadeprojetos.view.TelaInicialMembroEquipeView;
import static java.awt.image.ImageObserver.WIDTH;
import javax.swing.JOptionPane;

/**
 *
 * @author lucas
 */
public class LoginTermoAceitaçãoView extends javax.swing.JFrame {

    /**
     * Creates new form LoginTermoAceitaçãoView
     */
    public LoginTermoAceitaçãoView() {
        initComponents();
        setResizable(false);
        this.setLocationRelativeTo(null);
        this.dispose();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnLogar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtTermo = new javax.swing.JTextArea();
        btnCancelar = new javax.swing.JButton();
        checkAceito = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Termo de Aceitação");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED), "TERMO DE PARTICIPAÇÃO", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 14))); // NOI18N

        btnLogar.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnLogar.setText("Logar");
        btnLogar.setEnabled(false);
        btnLogar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogarActionPerformed(evt);
            }
        });

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        txtTermo.setEditable(false);
        txtTermo.setColumns(20);
        txtTermo.setFont(new java.awt.Font("Dialog", 2, 14)); // NOI18N
        txtTermo.setRows(5);
        txtTermo.setText("\nEu declaro que estou ciente e concordo com os princípios éticos estabelecidos \npara o desenvolvimento deste software. Estes princípios têm como objetivo \ngarantir que o software desenvolvido atenda às necessidades dos usuários finais \nde maneira justa, levando em consideração questões éticas. Comprometo-me a \nrespeitar e aplicar esses princípios em todas as fases do projeto, desde a \nconcepção até a entrega final do produto.\n\nO Desenvolvimento de Software Orientado a Ética é uma abordagem nova e \nprática para o desenvolvimento de software que preenche uma lacuna e cria um \nvínculo entre as habilidades éticas e profissionais, propondo assim um processo \nde desenvolvimento de software mais transparente e que traz uma melhor \nconscientização do riscos e limitações no processo de desenvolvimento de \nsoftware. As questões éticas torna-se, assim, parte do processo necessário para \no desenvolvimento de produtos de Software de Qualidade.\n\nOs princípios éticos incluem, mas não se limitam a:\n\n1. Privacidade;\n2. Segurança;\n3. Acessibilidade;\n4. Responsabilidade Social;\n5. Transparência;\n6. Honestidade.\n\nO software ético exige que os stakeholders reflitam. Ele serve como uma \nferramenta para aumentar a conscientização sobre as ramificações éticas do \nprocesso. As perguntas selecionadas devem ser apresentadas à todos os \nenvolvidos de modo compreensível para que se possa obter informações e \nalinhamento.\n\nAo aceitar este documento, declaro meu entendimento e concordância com \nesses princípios éticos e comprometo-me a aderir a eles durante todo o processo\nde desenvolvimento de software. Compreendo que qualquer violação desses \nprincípios pode resultar em consequências éticas e legais.\n\n\nData/Hora: [SISTEMA]\n");
        txtTermo.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jScrollPane1.setViewportView(txtTermo);

        btnCancelar.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        checkAceito.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        checkAceito.setText("Aceito");
        checkAceito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkAceitoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 539, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(checkAceito)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnLogar, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 541, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLogar)
                    .addComponent(btnCancelar)
                    .addComponent(checkAceito))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void checkAceitoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkAceitoActionPerformed
        // TODO add your handling code here:
        if(checkAceito.isSelected())
            btnLogar.setEnabled(true);
        else
            btnLogar.setEnabled(false);
    }//GEN-LAST:event_checkAceitoActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
        //this.setVisible(false);
        this.dispose();
        LoginView login = new LoginView();
        login.setVisible(true);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnLogarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogarActionPerformed
        // TODO add your handling code here:
        TelaInicialMembroEquipeView telaInicial = new TelaInicialMembroEquipeView();
        this.dispose();
        telaInicial.setVisible(true);
        JOptionPane.showMessageDialog(null, "Usuário criado com sucesso!", "Novo Usuário", WIDTH);
    }//GEN-LAST:event_btnLogarActionPerformed

    
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
            java.util.logging.Logger.getLogger(LoginTermoAceitaçãoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginTermoAceitaçãoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginTermoAceitaçãoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginTermoAceitaçãoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginTermoAceitaçãoView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnLogar;
    private javax.swing.JCheckBox checkAceito;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtTermo;
    // End of variables declaration//GEN-END:variables
}
