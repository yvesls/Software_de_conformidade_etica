/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gestaoqualidadeprojetos.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Note102
 */
public class ResultadoMembroEquipe extends Resultado {
    private Integer quantidadeRespostasSim;
    private Integer quantidadeTotalPerguntas;
    private double percentualRespostasSim;
    private Peso pesoAtribuido;
    private MembroEquipe membro;
    private List<ResultadoEtapaMembroEquipe> resultadosEtapa;
    private Iteracao iteracao;
    
    public ResultadoMembroEquipe() {
    }

    public ResultadoMembroEquipe(Integer quantidadeRespostasSim, Integer quantidadeTotalPerguntas, double percentualRespostasSim, Peso pesoAtribuido, Classificacao classificacao, MembroEquipe membro, Iteracao iteracao, List<ResultadoEtapaMembroEquipe> resultadosEtapa) {
        this.quantidadeRespostasSim = quantidadeRespostasSim;
        this.quantidadeTotalPerguntas = quantidadeTotalPerguntas;
        this.percentualRespostasSim = percentualRespostasSim;
        this.pesoAtribuido = pesoAtribuido;
        this.classificacao = classificacao;
        this.membro = membro;
        this.iteracao = iteracao;
        this.resultadosEtapa = resultadosEtapa;
    }

    public Integer getQuantidadeRespostasSim() {
        return quantidadeRespostasSim;
    }

    public Integer getQuantidadeTotalPerguntas() {
        return quantidadeTotalPerguntas;
    }

    public double getPercentualRespostasSim() {
        return percentualRespostasSim;
    }

    public Peso getPesos() {
        return pesoAtribuido;
    }

    public MembroEquipe getMembro() {
        return membro;
    }

    public Peso getPesoAtribuido() {
        return pesoAtribuido;
    }

    public Iteracao getIteracao() {
        return iteracao;
    }
    
    public List<ResultadoEtapaMembroEquipe> getResultadosEtapa() {
        return resultadosEtapa;
    }

    @Override
    public String toString() {
        return "ResultadoMembroEquipe{" + "quantidadeRespostasSim=" + quantidadeRespostasSim + ", quantidadeTotalPerguntas=" + quantidadeTotalPerguntas + ", percentualRespostasSim=" + percentualRespostasSim + ", pesoAtribuido=" + pesoAtribuido + ", membro=" + membro + ", resultadosEtapa=" + resultadosEtapa + ", iteracao=" + iteracao + '}';
    }
}
