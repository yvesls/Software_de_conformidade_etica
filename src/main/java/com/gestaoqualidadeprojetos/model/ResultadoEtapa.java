/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gestaoqualidadeprojetos.model;

/**
 *
 * @author Note102
 */
public abstract class ResultadoEtapa {
    private Classificacao classificacao;
    private EtapaIteracao etapa;
    
    public ResultadoEtapa () {
    }
    
    public ResultadoEtapa (Classificacao classificacao, EtapaIteracao etapa) {
        this.classificacao = classificacao;
        this.etapa = etapa;
    }

    public Classificacao getClassificacao() {
        return classificacao;
    }

    public EtapaIteracao getEtapa() {
        return etapa;
    }

    @Override
    public String toString() {
        return "ResultadoEtapa{" + "classificacao=" + classificacao + ", etapa=" + etapa + '}';
    }
}
