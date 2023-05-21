/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.gestaoqualidadeprojetos.sistema_de_conformidade_etica.view;
import com.gestaoqualidadeprojetos.sistema_de_conformidade_etica.view.CriarNovoProjetoView;

/**
 *
 * @author Gabriel
 */
public class ListarProjetosView extends javax.swing.JFrame {

    /**
     * Creates new form ListarProjetosView
     */
    public ListarProjetosView() {
        initComponents();
        setVisible(true);
        this.setLocationRelativeTo(this.getParent());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtTituloProjetos = new javax.swing.JLabel();
        txtNomeUsuario = new javax.swing.JLabel();
        txtOla = new javax.swing.JLabel();
        txtTituloData = new javax.swing.JLabel();
        txtData = new javax.swing.JLabel();
        jScrollPaneTabelaProjetos = new javax.swing.JScrollPane();
        tableProjetos = new javax.swing.JTable();
        btnAbrirProjeto = new javax.swing.JButton();
        btnAbrirProjeto1 = new javax.swing.JButton();
        btnAbrirProjeto2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        btnFechar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtTituloProjetos.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtTituloProjetos.setText("Projetos");

        txtNomeUsuario.setText("Cliente");
        txtNomeUsuario.setToolTipText("");

        txtOla.setText("Olá, ");
        txtOla.setToolTipText("");

        txtTituloData.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtTituloData.setText("Data: ");

        txtData.setText("15/05/2023");

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
        tableProjetos.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tableProjetos.setShowGrid(true);
        tableProjetos.setSurrendersFocusOnKeystroke(true);
        jScrollPaneTabelaProjetos.setViewportView(tableProjetos);
        if (tableProjetos.getColumnModel().getColumnCount() > 0) {
            tableProjetos.getColumnModel().getColumn(0).setResizable(false);
            tableProjetos.getColumnModel().getColumn(1).setResizable(false);
            tableProjetos.getColumnModel().getColumn(2).setResizable(false);
            tableProjetos.getColumnModel().getColumn(3).setResizable(false);
            tableProjetos.getColumnModel().getColumn(4).setResizable(false);
        }

        btnAbrirProjeto.setText("Abrir");

        btnAbrirProjeto1.setText("Abrir");

        btnAbrirProjeto2.setText("Abrir");
        btnAbrirProjeto2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbrirProjeto2ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Ações");

        btnFechar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnFechar.setText("Fechar");
        btnFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFecharActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnFechar)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPaneTabelaProjetos, javax.swing.GroupLayout.PREFERRED_SIZE, 682, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAbrirProjeto)
                            .addComponent(btnAbrirProjeto1)
                            .addComponent(btnAbrirProjeto2)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(jLabel5)))
                        .addContainerGap(41, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtOla)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNomeUsuario)
                        .addGap(262, 262, 262)
                        .addComponent(txtTituloProjetos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtTituloData, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtData)
                        .addGap(31, 31, 31))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtOla)
                    .addComponent(txtNomeUsuario)
                    .addComponent(txtTituloProjetos)
                    .addComponent(txtTituloData)
                    .addComponent(txtData))
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPaneTabelaProjetos, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAbrirProjeto2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAbrirProjeto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAbrirProjeto1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnFechar)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAbrirProjeto2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbrirProjeto2ActionPerformed
        //Responder questionário
    }//GEN-LAST:event_btnAbrirProjeto2ActionPerformed

    private void btnFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharActionPerformed
        dispose();
    }//GEN-LAST:event_btnFecharActionPerformed

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
            java.util.logging.Logger.getLogger(ListarProjetosView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListarProjetosView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListarProjetosView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListarProjetosView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListarProjetosView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAbrirProjeto;
    private javax.swing.JButton btnAbrirProjeto1;
    private javax.swing.JButton btnAbrirProjeto2;
    private javax.swing.JButton btnFechar;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPaneTabelaProjetos;
    private javax.swing.JTable tableProjetos;
    private javax.swing.JLabel txtData;
    private javax.swing.JLabel txtNomeUsuario;
    private javax.swing.JLabel txtOla;
    private javax.swing.JLabel txtTituloData;
    private javax.swing.JLabel txtTituloProjetos;
    // End of variables declaration//GEN-END:variables
}
