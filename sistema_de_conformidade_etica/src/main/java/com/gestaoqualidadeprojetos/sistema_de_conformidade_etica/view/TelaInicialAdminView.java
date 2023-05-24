
package com.gestaoqualidadeprojetos.sistema_de_conformidade_etica.view;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author lucas
 */
public class TelaInicialAdminView extends javax.swing.JFrame {

    /**
     * Creates new form TelaInicialView
     */
    public TelaInicialAdminView() {
        initComponents();
        this.setExtendedState(this.MAXIMIZED_BOTH); //abrir maximizado
        this.setLocationRelativeTo(null);
        this.dispose();
        //lblBemVindo.setText("Bem-Vindo, " + "nome" + "!");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        txtInfoEtica = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuProjetos = new javax.swing.JMenu();
        itemMenuAcessarProjetos = new javax.swing.JMenuItem();
        itemMenuAcessarQuestionarios = new javax.swing.JMenuItem();
        menuAvisos = new javax.swing.JMenu();
        itemMenuVerAvisos = new javax.swing.JMenuItem();
        menuSair = new javax.swing.JMenu();
        itemMenuLogout = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu");

        txtInfoEtica.setEditable(false);
        txtInfoEtica.setColumns(20);
        txtInfoEtica.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        txtInfoEtica.setLineWrap(true);
        txtInfoEtica.setRows(5);
        txtInfoEtica.setText("\nO Desenvolvimento de Software Orientado a Ética é uma abordagem nova e prática para o \ndesenvolvimento de software que preenche uma lacuna e cria um vínculo entre as habilidades\néticas e profissionais, propondo assim um processo de desenvolvimento de software mais\ntransparente e que traz uma melhor conscientização do riscos e limitações no processo de\ndesenvolvimento de software. As questões éticas torna-se, assim, parte do processo necessário\npara o desenvolvimento de produtos de Software de Qualidade.\n\nAlguns princípios éticos incluem: Privacidade; Segurança; Acessibilidade; Responsabilidade \nSocial; Transparência; Honestidade.\n\nO software ético exige que os colaboradores reflitam. Ele serve como uma ferramenta para\naumentar a conscientização sobre as ramificações éticas do processo. As perguntas \nselecionadas devem ser apresentadas à todos os envolvidos de modo compreensível para \nque se possa obter informações e alinhamento. Qualquer violação dos princípios pode resultar\nem consequências éticas e legais.\n");
        txtInfoEtica.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Bem-Vindo!", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 26))); // NOI18N
        txtInfoEtica.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jScrollPane1.setViewportView(txtInfoEtica);

        menuProjetos.setText("Projetos");
        menuProjetos.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        itemMenuAcessarProjetos.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        itemMenuAcessarProjetos.setText("Acessar projetos");
        itemMenuAcessarProjetos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemMenuAcessarProjetosActionPerformed(evt);
            }
        });
        menuProjetos.add(itemMenuAcessarProjetos);

        itemMenuAcessarQuestionarios.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        itemMenuAcessarQuestionarios.setText("Acessar questionários");
        itemMenuAcessarQuestionarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemMenuAcessarQuestionariosActionPerformed(evt);
            }
        });
        menuProjetos.add(itemMenuAcessarQuestionarios);

        jMenuBar1.add(menuProjetos);

        menuAvisos.setText("Avisos");
        menuAvisos.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        itemMenuVerAvisos.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        itemMenuVerAvisos.setText("Ver Avisos");
        itemMenuVerAvisos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemMenuVerAvisosActionPerformed(evt);
            }
        });
        menuAvisos.add(itemMenuVerAvisos);

        jMenuBar1.add(menuAvisos);

        menuSair.setText("Sair");
        menuSair.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        itemMenuLogout.setText("Logout");
        itemMenuLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemMenuLogoutActionPerformed(evt);
            }
        });
        menuSair.add(itemMenuLogout);

        jMenuBar1.add(menuSair);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 748, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void itemMenuVerAvisosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemMenuVerAvisosActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null,"Você possui x questionários em aberto!");

    }//GEN-LAST:event_itemMenuVerAvisosActionPerformed

    private void itemMenuLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemMenuLogoutActionPerformed
        // TODO add your handling code here:
        int querSair = JOptionPane.showConfirmDialog(null, "Quer realmente sair?", "SAIR", WIDTH); //0=sim, 1=nao, outro=cancel
        if(querSair == 0){
            this.setVisible(false);
            LoginView login = new LoginView();
            this.dispose();
            login.setVisible(true);
        }
        else if(querSair != 0); //continua na tela            ;
        
    }//GEN-LAST:event_itemMenuLogoutActionPerformed

    private void itemMenuAcessarProjetosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemMenuAcessarProjetosActionPerformed
        ListarProjetosAdminView listarProjetosAdminView = new ListarProjetosAdminView();
        listarProjetosAdminView.setVisible(true);
    }//GEN-LAST:event_itemMenuAcessarProjetosActionPerformed

    private void itemMenuAcessarQuestionariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemMenuAcessarQuestionariosActionPerformed
        ManterQuestionariosView manterQuesionariosView = new ManterQuestionariosView();
        manterQuesionariosView.setVisible(true);
    }//GEN-LAST:event_itemMenuAcessarQuestionariosActionPerformed

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
            java.util.logging.Logger.getLogger(TelaInicialAdminView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaInicialAdminView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaInicialAdminView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaInicialAdminView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaInicialAdminView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem itemMenuAcessarProjetos;
    private javax.swing.JMenuItem itemMenuAcessarQuestionarios;
    private javax.swing.JMenuItem itemMenuLogout;
    private javax.swing.JMenuItem itemMenuVerAvisos;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenu menuAvisos;
    private javax.swing.JMenu menuProjetos;
    private javax.swing.JMenu menuSair;
    private javax.swing.JTextArea txtInfoEtica;
    // End of variables declaration//GEN-END:variables
}