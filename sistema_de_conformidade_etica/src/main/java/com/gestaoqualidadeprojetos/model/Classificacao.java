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
public class Classificacao {
    private String descricao;
    private LocalDateTime dataCriacao;
    private Double valorPercentualAtingido; 
    private ClassificacaoEnum classificacaoAtingida;

    public Classificacao(String descricao, LocalDateTime dataCriacao, Double valorPercentualAtingido, ClassificacaoEnum classificacaoAtingida) {
        this.descricao = descricao;
        this.dataCriacao = dataCriacao;
        this.valorPercentualAtingido = valorPercentualAtingido;
        this.classificacaoAtingida = classificacaoAtingida;
    }
    
    public String getDescricao() {
        return descricao;
    }
    
    public LocalDateTime getDataCriacao() {
        return dataCriacao;
    }

    public Double getValorPercentualAtingido() {
        return valorPercentualAtingido;
    }

    public ClassificacaoEnum getClassificacaoAtingida() {
        return classificacaoAtingida;
    }
}
