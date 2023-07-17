/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gestaoqualidadeprojetos.model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

/**
 *
 * @author Note102
 */
public class ResultadoIteracao extends Resultado {
    private String descricao;
    private LocalDate dataResultado;
    private List<ResultadoEtapaIteracao> resultadosEtapa;
    private Iteracao iteracao;
    
    public ResultadoIteracao(String descricao, LocalDate dataResultado, Classificacao classificacao, Iteracao iteracao, List<ResultadoEtapaIteracao> resultadosEtapa) {
        this.descricao = descricao;
        this.dataResultado = dataResultado;
        this.classificacao = classificacao;
        this.iteracao = iteracao;
        this.resultadosEtapa = resultadosEtapa;
    }

    public String getDescricao() {
        return descricao;
    }

    public LocalDate getDataResultado() {
        return dataResultado;
    }

    public Iteracao getIteracao() {
        return iteracao;
    }

    public List<ResultadoEtapaIteracao> getResultadosEtapa() {
        return resultadosEtapa;
    }

    @Override
    public String toString() {
        return "ResultadoIteracao{" + "descricao=" + descricao + ", dataResultado=" + dataResultado + ", resultadoEtapa=" + resultadosEtapa + ", iteracao=" + iteracao + '}';
    }
}
