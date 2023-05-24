/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.gestaoqualidadeprojetos.sistema_de_conformidade_etica.view;

import javax.swing.JFrame;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author Note102
 */
public class DashboardView extends javax.swing.JFrame {

    /**
     * Creates new form DashboardView
     */
    public DashboardView() {
        initComponents();
        modoTelaCheia();
        this.setLocationRelativeTo( null );
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
    
    private void modoTelaCheia(){
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }
    
    public void criarGrafico(){
        DefaultCategoryDataset barra = new DefaultCategoryDataset();
        barra.setValue(59, "Cliente", "");
        barra.setValue(70, "Desenvolvedor", "");
        barra.setValue(93, "Arquiteto de software", "");
        barra.setValue(100, "Gerente de projeto", "");
        barra.setValue(70, "Líder técnico", "");
        barra.setValue(100, "Analista de qualidade", "");
         barra.setValue(82, "Total", "");
        
        JFreeChart grafico = ChartFactory.createBarChart("Percentual por agente", "Agentes", "Porcentagem de respostas 'Sim'", barra, PlotOrientation.VERTICAL, true, true, false);
        
        ChartPanel painel = new ChartPanel(grafico);
        painel.setSize(graficoPainel.getWidth(),graficoPainel.getHeight());
        painel.setVisible(true);
        
        graficoPainel.add(painel);
        graficoPainel.validate();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        graficoPainel = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setExtendedState(1);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton1.setText("Emitir certificado");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(777, 705, -1, -1));

        jTable1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Cliente", "59", "C"},
                {"Desenvolvedor", "70", "B"},
                {"Arquiteto de software", "93", "A"},
                {"Gerente de projeto", "100", "A"},
                {"Líder técnico", "70", "B"},
                {"Analista de qualidade", "100", "A"}
            },
            new String [] {
                "Agente", "Resposta (%)", "Faixa"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setAlignmentX(1.0F);
        jTable1.setAlignmentY(1.0F);
        jTable1.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        jTable1.setEditingColumn(2);
        jTable1.setEditingRow(2);
        jTable1.setFocusable(false);
        jTable1.setIntercellSpacing(new java.awt.Dimension(5, 5));
        jTable1.setMinimumSize(new java.awt.Dimension(45, 150));
        jTable1.setRowHeight(24);
        jTable1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jTable1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jTable1.setShowGrid(true);
        jTable1.setSurrendersFocusOnKeystroke(true);
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(239, 563, 464, 175));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cliente", "Desenvolvedor", "Arquiteto", "Gerente", "Lider técnico", "Analista de qualidade" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(724, 595, 218, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Visualizar detalhes da faixa:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(724, 563, 218, -1));

        jButton2.setText("Visualizar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(865, 621, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Olá, Leôncio.");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 11, 235, 48));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Dashboard");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(267, 11, 464, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Data: 20/05/2024");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(737, 11, 205, 48));

        javax.swing.GroupLayout graficoPainelLayout = new javax.swing.GroupLayout(graficoPainel);
        graficoPainel.setLayout(graficoPainelLayout);
        graficoPainelLayout.setHorizontalGroup(
            graficoPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        graficoPainelLayout.setVerticalGroup(
            graficoPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 416, Short.MAX_VALUE)
        );

        getContentPane().add(graficoPainel, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 129, 916, -1));

        jButton3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton3.setText("Visualizar gráfico por fase");
        jButton3.setToolTipText("");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 563, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText("Sprint 1: Sistema de Padaria");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 76, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 153, 153));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("B");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(577, 70, 21, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 153, 153));
        jLabel7.setText("82%");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(604, 70, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        new FaixaPorAgenteView().setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new ConfirmacaoCertificadoView().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        new GraficoPorFaseView().setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(DashboardView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DashboardView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DashboardView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DashboardView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               DashboardView view = new DashboardView();
               view.setVisible(true);
               view.criarGrafico();
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel graficoPainel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
