/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gestaoqualidadeprojetos.model;

import java.time.LocalDateTime;

/**
 *
 * @author Note102
 */
public class ResultadoIteracao {
    private String descricao;
    private LocalDateTime dataResultado;
    private ResultadoMembroEquipe resultadoMembroEquipe;
    private Classificacao classificacao;
    
    public ResultadoIteracao() {
    }

    public ResultadoIteracao(String descricao, LocalDateTime dataResultado, ResultadoMembroEquipe resultadoMembroEquipe, Classificacao classificacao) {
        this.descricao = descricao;
        this.dataResultado = dataResultado;
        this.resultadoMembroEquipe = resultadoMembroEquipe;
        this.classificacao = classificacao;
    }

    public String getDescricao() {
        return descricao;
    }

    public LocalDateTime getDataResultado() {
        return dataResultado;
    }

    public ResultadoMembroEquipe getResultadoMembroEquipe() {
        return resultadoMembroEquipe;
    }

    public Classificacao getClassificacao() {
        return classificacao;
    }

    @Override
    public String toString() {
        return "ResultadoIteracao{" + "descricao=" + descricao + ", dataResultado=" + dataResultado + ", resultadoMembroEquipe=" + resultadoMembroEquipe + ", classificacao=" + classificacao + '}';
    }
}
