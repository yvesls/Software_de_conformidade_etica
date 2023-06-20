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
    private Peso pesoAtribuido;
    private Classificacao classificacao;
    private MembroEquipeTeste membro;
    
    public ResultadoMembroEquipe() {
    }

    public ResultadoMembroEquipe(Integer quantidadeRespostasSim, Integer quantidadeTotalPerguntas, double percentualRespostasSim, Peso pesoAtribuido, Classificacao classificacao, MembroEquipeTeste membro) {
        this.quantidadeRespostasSim = quantidadeRespostasSim;
        this.quantidadeTotalPerguntas = quantidadeTotalPerguntas;
        this.percentualRespostasSim = percentualRespostasSim;
        this.pesoAtribuido = pesoAtribuido;
        this.classificacao = classificacao;
        this.membro = membro;
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

    public Classificacao getClassificacao() {
        return classificacao;
    }

    public MembroEquipeTeste getMembro() {
        return membro;
    }

    @Override
    public String toString() {
        return "ResultadoMembroEquipe{" + "quantidadeRespostasSim=" + quantidadeRespostasSim + ", quantidadeTotalPerguntas=" + quantidadeTotalPerguntas + ", percentualRespostasSim=" + percentualRespostasSim + ", pesoAtribuido=" + pesoAtribuido + ", classificacao=" + classificacao + '}';
    }
}
