/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gestaoqualidadeprojetos.model;

/**
 *
 * @author Note102
 */
public class ResultadoEtapaIteracao extends ResultadoEtapa {
    private Iteracao iteracao;
    
    public ResultadoEtapaIteracao(Classificacao classificacao, EtapaIteracao etapa, Iteracao iteracao) {
        super(classificacao, etapa);
        this.iteracao = iteracao;
    }

    @Override
    public String toString() {
        return "ResultadoEtapaIteracao{" + "iteracao=" + iteracao + '}';
    }
}
