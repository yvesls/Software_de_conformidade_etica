package com.gestaoqualidadeprojetos.model;

public class EtapaIteracaoBase {
    private String descricao;
    private int pesoEsforco;

    public EtapaIteracaoBase(String descricao, int pesoEsforco) {
        this.descricao = descricao;
        this.pesoEsforco = pesoEsforco;
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

    @Override
    public String toString() {
        return "EtapaIteracaoBase{" + "descricao=" + descricao + ", pesoEsforco=" + pesoEsforco + '}';
    }
     
}