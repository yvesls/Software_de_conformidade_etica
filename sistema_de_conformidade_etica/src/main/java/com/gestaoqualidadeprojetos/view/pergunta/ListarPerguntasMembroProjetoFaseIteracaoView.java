/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.gestaoqualidadeprojetos.view.pergunta;
import com.gestaoqualidadeprojetos.view.iteracao.AbrirIteracaoProjetoAdminView;
import com.gestaoqualidadeprojetos.view.projeto.ListarProjetosAdminView;
import com.gestaoqualidadeprojetos.view.projeto.CriarNovoProjetoView;

/**
 *
 * @author Gabriel
 */
public class ListarPerguntasMembroProjetoFaseIteracaoView extends javax.swing.JFrame {

    /**
     * Creates new form ListarProjetosView
     */
    public ListarPerguntasMembroProjetoFaseIteracaoView() {
        initComponents();
        setVisible(true);
        setResizable(false);
        this.setLocationRelativeTo(this.getParent());
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);//clicar no X não fechar o sistema inteiro
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnFechar = new javax.swing.JButton();
        btnAbrirPerguntasQuestionario = new javax.swing.JButton();
        btnPublicarPerguntasFaseProjeto = new javax.swing.JButton();
        abasFasesIteracao = new javax.swing.JTabbedPane();
        faseIniciacao = new javax.swing.JPanel();
        iniciacaoPerguntasProjeto = new javax.swing.JScrollPane();
        tableIniciacaoPerguntasProjeto = new javax.swing.JTable();
        faseRequisitos = new javax.swing.JPanel();
        requisitosPerguntasProjeto = new javax.swing.JScrollPane();
        tableRequisitosPerguntasProjeto = new javax.swing.JTable();
        faseProjeto = new javax.swing.JPanel();
        projetoPerguntasProjeto = new javax.swing.JScrollPane();
        tableProjetoPerguntasProjeto = new javax.swing.JTable();
        faseDesenvolvimento = new javax.swing.JPanel();
        desenvolvimentoPerguntasProjeto = new javax.swing.JScrollPane();
        tableDesenvolvimentoPerguntasProjeto = new javax.swing.JTable();
        faseTesteVerificacao = new javax.swing.JPanel();
        testeVerificacaoPerguntasProjeto = new javax.swing.JScrollPane();
        tableTesteVerificacaoPerguntasProjeto = new javax.swing.JTable();
        menuBarQuestionarios = new javax.swing.JMenuBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtTituloProjetos.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtTituloProjetos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtTituloProjetos.setText("Sistema de Padaria");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Iteração:");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("Sprint III");

        btnFechar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnFechar.setText("Voltar");
        btnFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFecharActionPerformed(evt);
            }
        });

        btnAbrirPerguntasQuestionario.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnAbrirPerguntasQuestionario.setText("Abrir Perguntas");
        btnAbrirPerguntasQuestionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbrirPerguntasQuestionarioActionPerformed(evt);
            }
        });

        btnPublicarPerguntasFaseProjeto.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnPublicarPerguntasFaseProjeto.setText("Publicar Fase");
        btnPublicarPerguntasFaseProjeto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPublicarPerguntasFaseProjetoActionPerformed(evt);
            }
        });

        abasFasesIteracao.setToolTipText("");
        abasFasesIteracao.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        abasFasesIteracao.setName("Fases da Iteração"); // NOI18N

        tableIniciacaoPerguntasProjeto.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tableIniciacaoPerguntasProjeto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"01", "Cliente", "15/05/2023", "20/05/2023", "Fechado"},
                {"02", "Desenvolvedor", "15/05/2023", "20/05/2023", "Fechado"},
                {"03", "Arquiteto de Software", "15/05/2023", "15/06/2023", "Aberto"},
                {"04", "Gerente de Projeto", "15/05/2023", "15/06/2023", "Aberto"},
                {"05", "Líder Técnico", "", "", "Rascunho"},
                {"06", "Analista de Qualidade", "", "", "Rascunho"}
            },
            new String [] {
                "#", "Participante", "Data Abertura", "Data Limite", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableIniciacaoPerguntasProjeto.setRowHeight(26);
        tableIniciacaoPerguntasProjeto.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tableIniciacaoPerguntasProjeto.setShowGrid(true);
        tableIniciacaoPerguntasProjeto.setSurrendersFocusOnKeystroke(true);
        iniciacaoPerguntasProjeto.setViewportView(tableIniciacaoPerguntasProjeto);
        if (tableIniciacaoPerguntasProjeto.getColumnModel().getColumnCount() > 0) {
            tableIniciacaoPerguntasProjeto.getColumnModel().getColumn(0).setMinWidth(50);
            tableIniciacaoPerguntasProjeto.getColumnModel().getColumn(0).setPreferredWidth(10);
            tableIniciacaoPerguntasProjeto.getColumnModel().getColumn(0).setMaxWidth(50);
            tableIniciacaoPerguntasProjeto.getColumnModel().getColumn(1).setPreferredWidth(100);
            tableIniciacaoPerguntasProjeto.getColumnModel().getColumn(2).setPreferredWidth(20);
            tableIniciacaoPerguntasProjeto.getColumnModel().getColumn(3).setPreferredWidth(20);
            tableIniciacaoPerguntasProjeto.getColumnModel().getColumn(4).setPreferredWidth(5);
        }

        javax.swing.GroupLayout faseIniciacaoLayout = new javax.swing.GroupLayout(faseIniciacao);
        faseIniciacao.setLayout(faseIniciacaoLayout);
        faseIniciacaoLayout.setHorizontalGroup(
            faseIniciacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(iniciacaoPerguntasProjeto, javax.swing.GroupLayout.DEFAULT_SIZE, 748, Short.MAX_VALUE)
        );
        faseIniciacaoLayout.setVerticalGroup(
            faseIniciacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(faseIniciacaoLayout.createSequentialGroup()
                .addComponent(iniciacaoPerguntasProjeto, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        abasFasesIteracao.addTab("Iniciação", faseIniciacao);

        tableRequisitosPerguntasProjeto.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tableRequisitosPerguntasProjeto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"01", "Cliente", "15/05/2023", "20/05/2023", "Fechado"},
                {"02", "Desenvolvedor", "15/05/2023", "20/05/2023", "Fechado"},
                {"03", "Arquiteto de Software", "15/05/2023", "15/06/2023", "Aberto"},
                {"04", "Gerente de Projeto", "15/05/2023", "15/06/2023", "Aberto"},
                {"05", "Líder Técnico", "", "", "Rascunho"},
                {"06", "Analista de Qualidade", "", "", "Rascunho"}
            },
            new String [] {
                "#", "Participante", "Data Abertura", "Data Limite", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableRequisitosPerguntasProjeto.setRowHeight(26);
        tableRequisitosPerguntasProjeto.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tableRequisitosPerguntasProjeto.setShowGrid(true);
        tableRequisitosPerguntasProjeto.setSurrendersFocusOnKeystroke(true);
        requisitosPerguntasProjeto.setViewportView(tableRequisitosPerguntasProjeto);
        if (tableRequisitosPerguntasProjeto.getColumnModel().getColumnCount() > 0) {
            tableRequisitosPerguntasProjeto.getColumnModel().getColumn(0).setMinWidth(50);
            tableRequisitosPerguntasProjeto.getColumnModel().getColumn(0).setPreferredWidth(10);
            tableRequisitosPerguntasProjeto.getColumnModel().getColumn(0).setMaxWidth(50);
            tableRequisitosPerguntasProjeto.getColumnModel().getColumn(1).setPreferredWidth(100);
            tableRequisitosPerguntasProjeto.getColumnModel().getColumn(2).setPreferredWidth(20);
            tableRequisitosPerguntasProjeto.getColumnModel().getColumn(3).setPreferredWidth(20);
            tableRequisitosPerguntasProjeto.getColumnModel().getColumn(4).setPreferredWidth(5);
        }

        javax.swing.GroupLayout faseRequisitosLayout = new javax.swing.GroupLayout(faseRequisitos);
        faseRequisitos.setLayout(faseRequisitosLayout);
        faseRequisitosLayout.setHorizontalGroup(
            faseRequisitosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(faseRequisitosLayout.createSequentialGroup()
                .addComponent(requisitosPerguntasProjeto, javax.swing.GroupLayout.PREFERRED_SIZE, 746, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 2, Short.MAX_VALUE))
        );
        faseRequisitosLayout.setVerticalGroup(
            faseRequisitosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, faseRequisitosLayout.createSequentialGroup()
                .addComponent(requisitosPerguntasProjeto, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        abasFasesIteracao.addTab("Requisitos", faseRequisitos);

        tableProjetoPerguntasProjeto.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tableProjetoPerguntasProjeto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"01", "Cliente", "15/05/2023", "20/05/2023", "Fechado"},
                {"02", "Desenvolvedor", "15/05/2023", "20/05/2023", "Fechado"},
                {"03", "Arquiteto de Software", "15/05/2023", "15/06/2023", "Aberto"},
                {"04", "Gerente de Projeto", "15/05/2023", "15/06/2023", "Aberto"},
                {"05", "Líder Técnico", "", "", "Rascunho"},
                {"06", "Analista de Qualidade", "", "", "Rascunho"}
            },
            new String [] {
                "#", "Participante", "Data Abertura", "Data Limite", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableProjetoPerguntasProjeto.setRowHeight(26);
        tableProjetoPerguntasProjeto.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tableProjetoPerguntasProjeto.setShowGrid(true);
        tableProjetoPerguntasProjeto.setSurrendersFocusOnKeystroke(true);
        projetoPerguntasProjeto.setViewportView(tableProjetoPerguntasProjeto);
        if (tableProjetoPerguntasProjeto.getColumnModel().getColumnCount() > 0) {
            tableProjetoPerguntasProjeto.getColumnModel().getColumn(0).setMinWidth(50);
            tableProjetoPerguntasProjeto.getColumnModel().getColumn(0).setPreferredWidth(10);
            tableProjetoPerguntasProjeto.getColumnModel().getColumn(0).setMaxWidth(50);
            tableProjetoPerguntasProjeto.getColumnModel().getColumn(1).setPreferredWidth(100);
            tableProjetoPerguntasProjeto.getColumnModel().getColumn(2).setPreferredWidth(20);
            tableProjetoPerguntasProjeto.getColumnModel().getColumn(3).setPreferredWidth(20);
            tableProjetoPerguntasProjeto.getColumnModel().getColumn(4).setPreferredWidth(5);
        }

        javax.swing.GroupLayout faseProjetoLayout = new javax.swing.GroupLayout(faseProjeto);
        faseProjeto.setLayout(faseProjetoLayout);
        faseProjetoLayout.setHorizontalGroup(
            faseProjetoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(faseProjetoLayout.createSequentialGroup()
                .addComponent(projetoPerguntasProjeto, javax.swing.GroupLayout.PREFERRED_SIZE, 746, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 2, Short.MAX_VALUE))
        );
        faseProjetoLayout.setVerticalGroup(
            faseProjetoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, faseProjetoLayout.createSequentialGroup()
                .addComponent(projetoPerguntasProjeto, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        abasFasesIteracao.addTab("Projeto", faseProjeto);

        tableDesenvolvimentoPerguntasProjeto.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tableDesenvolvimentoPerguntasProjeto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"01", "Cliente", "15/05/2023", "20/05/2023", "Fechado"},
                {"02", "Desenvolvedor", "15/05/2023", "20/05/2023", "Fechado"},
                {"03", "Arquiteto de Software", "15/05/2023", "15/06/2023", "Aberto"},
                {"04", "Gerente de Projeto", "15/05/2023", "15/06/2023", "Aberto"},
                {"05", "Líder Técnico", "", "", "Rascunho"},
                {"06", "Analista de Qualidade", "", "", "Rascunho"}
            },
            new String [] {
                "#", "Participante", "Data Abertura", "Data Limite", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableDesenvolvimentoPerguntasProjeto.setRowHeight(26);
        tableDesenvolvimentoPerguntasProjeto.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tableDesenvolvimentoPerguntasProjeto.setShowGrid(true);
        tableDesenvolvimentoPerguntasProjeto.setSurrendersFocusOnKeystroke(true);
        desenvolvimentoPerguntasProjeto.setViewportView(tableDesenvolvimentoPerguntasProjeto);
        if (tableDesenvolvimentoPerguntasProjeto.getColumnModel().getColumnCount() > 0) {
            tableDesenvolvimentoPerguntasProjeto.getColumnModel().getColumn(0).setMinWidth(50);
            tableDesenvolvimentoPerguntasProjeto.getColumnModel().getColumn(0).setPreferredWidth(10);
            tableDesenvolvimentoPerguntasProjeto.getColumnModel().getColumn(0).setMaxWidth(50);
            tableDesenvolvimentoPerguntasProjeto.getColumnModel().getColumn(1).setPreferredWidth(100);
            tableDesenvolvimentoPerguntasProjeto.getColumnModel().getColumn(2).setPreferredWidth(20);
            tableDesenvolvimentoPerguntasProjeto.getColumnModel().getColumn(3).setPreferredWidth(20);
            tableDesenvolvimentoPerguntasProjeto.getColumnModel().getColumn(4).setPreferredWidth(5);
        }

        javax.swing.GroupLayout faseDesenvolvimentoLayout = new javax.swing.GroupLayout(faseDesenvolvimento);
        faseDesenvolvimento.setLayout(faseDesenvolvimentoLayout);
        faseDesenvolvimentoLayout.setHorizontalGroup(
            faseDesenvolvimentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(faseDesenvolvimentoLayout.createSequentialGroup()
                .addComponent(desenvolvimentoPerguntasProjeto, javax.swing.GroupLayout.PREFERRED_SIZE, 746, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 2, Short.MAX_VALUE))
        );
        faseDesenvolvimentoLayout.setVerticalGroup(
            faseDesenvolvimentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, faseDesenvolvimentoLayout.createSequentialGroup()
                .addComponent(desenvolvimentoPerguntasProjeto, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        abasFasesIteracao.addTab("Desenvolvimento", faseDesenvolvimento);

        tableTesteVerificacaoPerguntasProjeto.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tableTesteVerificacaoPerguntasProjeto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"01", "Cliente", "15/05/2023", "20/05/2023", "Fechado"},
                {"02", "Desenvolvedor", "15/05/2023", "20/05/2023", "Fechado"},
                {"03", "Arquiteto de Software", "15/05/2023", "15/06/2023", "Aberto"},
                {"04", "Gerente de Projeto", "15/05/2023", "15/06/2023", "Aberto"},
                {"05", "Líder Técnico", "", "", "Rascunho"},
                {"06", "Analista de Qualidade", "", "", "Rascunho"}
            },
            new String [] {
                "#", "Participante", "Data Abertura", "Data Limite", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableTesteVerificacaoPerguntasProjeto.setRowHeight(26);
        tableTesteVerificacaoPerguntasProjeto.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tableTesteVerificacaoPerguntasProjeto.setShowGrid(true);
        tableTesteVerificacaoPerguntasProjeto.setSurrendersFocusOnKeystroke(true);
        testeVerificacaoPerguntasProjeto.setViewportView(tableTesteVerificacaoPerguntasProjeto);
        if (tableTesteVerificacaoPerguntasProjeto.getColumnModel().getColumnCount() > 0) {
            tableTesteVerificacaoPerguntasProjeto.getColumnModel().getColumn(0).setMinWidth(50);
            tableTesteVerificacaoPerguntasProjeto.getColumnModel().getColumn(0).setPreferredWidth(10);
            tableTesteVerificacaoPerguntasProjeto.getColumnModel().getColumn(0).setMaxWidth(50);
            tableTesteVerificacaoPerguntasProjeto.getColumnModel().getColumn(1).setPreferredWidth(100);
            tableTesteVerificacaoPerguntasProjeto.getColumnModel().getColumn(2).setPreferredWidth(20);
            tableTesteVerificacaoPerguntasProjeto.getColumnModel().getColumn(3).setPreferredWidth(20);
            tableTesteVerificacaoPerguntasProjeto.getColumnModel().getColumn(4).setPreferredWidth(5);
        }

        javax.swing.GroupLayout faseTesteVerificacaoLayout = new javax.swing.GroupLayout(faseTesteVerificacao);
        faseTesteVerificacao.setLayout(faseTesteVerificacaoLayout);
        faseTesteVerificacaoLayout.setHorizontalGroup(
            faseTesteVerificacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(faseTesteVerificacaoLayout.createSequentialGroup()
                .addComponent(testeVerificacaoPerguntasProjeto, javax.swing.GroupLayout.PREFERRED_SIZE, 746, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 2, Short.MAX_VALUE))
        );
        faseTesteVerificacaoLayout.setVerticalGroup(
            faseTesteVerificacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(faseTesteVerificacaoLayout.createSequentialGroup()
                .addComponent(testeVerificacaoPerguntasProjeto, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        abasFasesIteracao.addTab("Teste e Verificação", faseTesteVerificacao);

        setJMenuBar(menuBarQuestionarios);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtTituloProjetos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(64, 64, 64)
                                .addComponent(btnAbrirPerguntasQuestionario)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnFechar))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(370, 370, 370)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel2)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(abasFasesIteracao, javax.swing.GroupLayout.PREFERRED_SIZE, 748, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(701, 701, 701)
                        .addComponent(btnPublicarPerguntasFaseProjeto)))
                .addGap(65, 65, 65))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(txtTituloProjetos)
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(15, 15, 15)
                .addComponent(abasFasesIteracao, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnPublicarPerguntasFaseProjeto)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnAbrirPerguntasQuestionario)
                        .addComponent(btnFechar)))
                .addGap(19, 19, 19))
        );

        abasFasesIteracao.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharActionPerformed
        this.dispose();
        ListarProjetosAdminView listarProjetosAdminView = new ListarProjetosAdminView();
        listarProjetosAdminView.setVisible(true);
    }//GEN-LAST:event_btnFecharActionPerformed

    private void btnAbrirPerguntasQuestionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbrirPerguntasQuestionarioActionPerformed
        this.dispose();
        ManterPerguntasFaseProjetoView manterPerguntasFaseProjetoView = new ManterPerguntasFaseProjetoView();
        manterPerguntasFaseProjetoView.setVisible(true);
    }//GEN-LAST:event_btnAbrirPerguntasQuestionarioActionPerformed

    private void btnPublicarPerguntasFaseProjetoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPublicarPerguntasFaseProjetoActionPerformed
        this.dispose();
        AbrirIteracaoProjetoAdminView selecionarFasesProjetoAdminView = new AbrirIteracaoProjetoAdminView();
        selecionarFasesProjetoAdminView.setVisible(true);
    }//GEN-LAST:event_btnPublicarPerguntasFaseProjetoActionPerformed

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
            java.util.logging.Logger.getLogger(ListarPerguntasMembroProjetoFaseIteracaoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListarPerguntasMembroProjetoFaseIteracaoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListarPerguntasMembroProjetoFaseIteracaoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListarPerguntasMembroProjetoFaseIteracaoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new ListarPerguntasMembroProjetoFaseIteracaoView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane abasFasesIteracao;
    private javax.swing.JButton btnAbrirPerguntasQuestionario;
    private javax.swing.JButton btnFechar;
    private javax.swing.JButton btnPublicarPerguntasFaseProjeto;
    private javax.swing.JScrollPane desenvolvimentoPerguntasProjeto;
    private javax.swing.JPanel faseDesenvolvimento;
    private javax.swing.JPanel faseIniciacao;
    private javax.swing.JPanel faseProjeto;
    private javax.swing.JPanel faseRequisitos;
    private javax.swing.JPanel faseTesteVerificacao;
    private javax.swing.JScrollPane iniciacaoPerguntasProjeto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenuBar menuBarQuestionarios;
    private javax.swing.JScrollPane projetoPerguntasProjeto;
    private javax.swing.JScrollPane requisitosPerguntasProjeto;
    private javax.swing.JTable tableDesenvolvimentoPerguntasProjeto;
    private javax.swing.JTable tableIniciacaoPerguntasProjeto;
    private javax.swing.JTable tableProjetoPerguntasProjeto;
    private javax.swing.JTable tableRequisitosPerguntasProjeto;
    private javax.swing.JTable tableTesteVerificacaoPerguntasProjeto;
    private javax.swing.JScrollPane testeVerificacaoPerguntasProjeto;
    private javax.swing.JLabel txtTituloProjetos;
    // End of variables declaration//GEN-END:variables
}