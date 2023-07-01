/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gestaoqualidadeprojetos.mode;

import java.time.LocalDateTime;

/**
 *
 * @author Note102
 */
public class ResultadoIteracao {
    private String descricao;
    private LocalDateTime dataResultado;
    private Classificacao classificacao;
    private String iteracao;
    
    public ResultadoIteracao() {
    }

    public ResultadoIteracao(String descricao, LocalDateTime dataResultado, Classificacao classificacao, String iteracao) {
        this.descricao = descricao;
        this.dataResultado = dataResultado;
        this.classificacao = classificacao;
        this.iteracao = iteracao;
    }

    public String getDescricao() {
        return descricao;
    }

    public LocalDateTime getDataResultado() {
        return dataResultado;
    }

    public Classificacao getClassificacao() {
        return classificacao;
    }

    public String getIteracao() {
        return iteracao;
    }

    @Override
    public String toString() {
        return "ResultadoIteracao{" + "descricao=" + descricao + ", dataResultado=" + dataResultado + ", classificacao=" + classificacao + ", iteracao=" + iteracao + '}';
    }
}
