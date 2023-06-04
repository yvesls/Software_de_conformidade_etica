/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.gestaoqualidadeprojetos.view.projeto;
import com.gestaoqualidadeprojetos.view.fase.AbrirFasesProjetoMembroEquipeView;
import com.gestaoqualidadeprojetos.view.dashboard.DashboardAdminView;
import com.gestaoqualidadeprojetos.view.iteracao.ListarPerguntasEtapaIteracaoProjetoView;
import com.gestaoqualidadeprojetos.view.iteracao.ListarPerguntasEtapaIteracaoProjetoView;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author Gabriel
 */
public class ListarProjetosMembroEquipeView extends javax.swing.JFrame {

    /**
     * Creates new form ListarProjetosView
     */
    public ListarProjetosMembroEquipeView() {
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
        btnFechar = new javax.swing.JButton();
        btnVerDashboard = new javax.swing.JButton();
        btnAbrirProjeto = new javax.swing.JButton();
        projetosAbertos = new javax.swing.JPanel();
        jScrollPaneTabelaProjetosAbertos = new javax.swing.JScrollPane();
        tableProjetosAbertos = new javax.swing.JTable();
        menuBarProjetosAdmin = new javax.swing.JMenuBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Todos os Projetos");

        txtTituloProjetos.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtTituloProjetos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtTituloProjetos.setText("Todos os Projetos");

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

        javax.swing.GroupLayout projetosAbertosLayout = new javax.swing.GroupLayout(projetosAbertos);
        projetosAbertos.setLayout(projetosAbertosLayout);
        projetosAbertosLayout.setHorizontalGroup(
            projetosAbertosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 909, Short.MAX_VALUE)
        );
        projetosAbertosLayout.setVerticalGroup(
            projetosAbertosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 275, Short.MAX_VALUE)
        );

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

        setJMenuBar(menuBarProjetosAdmin);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtTituloProjetos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPaneTabelaProjetosAbertos, javax.swing.GroupLayout.DEFAULT_SIZE, 909, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnFechar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 590, Short.MAX_VALUE)
                        .addComponent(btnAbrirProjeto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnVerDashboard, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(65, 65, 65))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(65, Short.MAX_VALUE)
                    .addComponent(projetosAbertos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(65, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(txtTituloProjetos)
                .addGap(35, 35, 35)
                .addComponent(jScrollPaneTabelaProjetosAbertos, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnFechar)
                    .addComponent(btnVerDashboard)
                    .addComponent(btnAbrirProjeto))
                .addGap(20, 20, 20))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(85, Short.MAX_VALUE)
                    .addComponent(projetosAbertos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(72, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharActionPerformed
        this.dispose();
        //TelaInicialAdminView telaInicialAdminView = new TelaInicialAdminView();
        //telaInicialAdminView.setVisible(true);
    }//GEN-LAST:event_btnFecharActionPerformed

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
            java.util.logging.Logger.getLogger(ListarProjetosMembroEquipeView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListarProjetosMembroEquipeView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListarProjetosMembroEquipeView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListarProjetosMembroEquipeView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListarProjetosMembroEquipeView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAbrirProjeto;
    private javax.swing.JButton btnFechar;
    private javax.swing.JButton btnVerDashboard;
    private javax.swing.JScrollPane jScrollPaneTabelaProjetosAbertos;
    private javax.swing.JMenuBar menuBarProjetosAdmin;
    private javax.swing.JPanel projetosAbertos;
    private javax.swing.JTable tableProjetosAbertos;
    private javax.swing.JLabel txtTituloProjetos;
    // End of variables declaration//GEN-END:variables
}
