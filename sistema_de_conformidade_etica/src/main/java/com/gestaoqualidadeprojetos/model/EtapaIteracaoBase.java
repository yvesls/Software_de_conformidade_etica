package com.gestaoqualidadeprojetos.model;
public class EtapaIteracaoBase {
    private String descricao;
    private int pesoEsforco;
    private QuestionarioEtapa questionarioEtapa;

    public EtapaIteracaoBase(String descricao, int pesoEsforco, QuestionarioEtapa questionarioEtapa) {
        this.descricao = descricao;
        this.pesoEsforco = pesoEsforco;
        this.questionarioEtapa = this.questionarioEtapa;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getPesoEsforco() {
        return pesoEsforco;
    }

    public void setPesoEsforco(int pesoEsforco) {
        this.pesoEsforco = pesoEsforco;
    }

    public QuestionarioEtapa getQuestionarioEtapa() {
        return questionarioEtapa;
    }

    public void setQuestionarioEtapa(QuestionarioEtapa questionarioEtapa) {
        this.questionarioEtapa = questionarioEtapa;
    }
    
    @Override
    public String toString() {
        return "EtapaIteracaoBase{" + "descricao=" + descricao + ", pesoEsforco=" + pesoEsforco + '}';
    }
     
}