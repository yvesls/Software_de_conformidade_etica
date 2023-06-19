/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gestaoqualidadeprojetos.model;

import java.util.ArrayList;

/**
 *
 * @author Note102
 */
public class ResultadoMembroEquipe {
    private Integer quantidadeRespostasSim;
    private Integer quantidadeTotalPerguntas;
    private double percentualRespostasSim;
    private ArrayList<Peso> pesos;  
    private Classificacao classificacao;
    
    public ResultadoMembroEquipe() {
    }

    public ResultadoMembroEquipe(Integer quantidadeRespostasSim, Integer quantidadeTotalPerguntas, double percentualRespostasSim, ArrayList<Peso> pesos, Classificacao classificacao) {
        this.quantidadeRespostasSim = quantidadeRespostasSim;
        this.quantidadeTotalPerguntas = quantidadeTotalPerguntas;
        this.percentualRespostasSim = percentualRespostasSim;
        this.pesos = pesos;
        this.classificacao = classificacao;
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

    public ArrayList<Peso> getPesos() {
        return pesos;
    }

    public Classificacao getClassificacao() {
        return classificacao;
    }

    @Override
    public String toString() {
        return "ResultadoMembroEquipe{" + "quantidadeRespostasSim=" + quantidadeRespostasSim + ", quantidadeTotalPerguntas=" + quantidadeTotalPerguntas + ", percentualRespostasSim=" + percentualRespostasSim + ", pesos=" + pesos + ", classificacao=" + classificacao + '}';
    }
}
