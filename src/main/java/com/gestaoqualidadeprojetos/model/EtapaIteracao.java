package com.gestaoqualidadeprojetos.model;

public class EtapaIteracao extends EtapaIteracaoBase{
    private Iteracao iteracao;
    
    public EtapaIteracao(String descricao, int pesoEsforco, QuestionarioEtapa questionarioEtapa) {
        super(descricao, pesoEsforco, questionarioEtapa);
    }
    
    public EtapaIteracao(String descricao, int pesoEsforco, QuestionarioEtapa questionarioEtapa, Iteracao iteracao) {
        super(descricao, pesoEsforco, questionarioEtapa);
        this.iteracao = iteracao;
    }

    public Iteracao getIteracao() {
        return iteracao;
    }

    @Override
    public String toString() {
        return "EtapaIteracao{" + "descricao=" + this.getDescricao() + '}';
    }
}