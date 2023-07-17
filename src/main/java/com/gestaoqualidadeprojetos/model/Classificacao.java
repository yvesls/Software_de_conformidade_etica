
package com.gestaoqualidadeprojetos.model;

import com.gestaoqualidadeprojetos.model.enums.ClassificacaoEnum;
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

    @Override
    public String toString() {
        return "Classificacao{" + "descricao=" + descricao + ", dataCriacao=" + dataCriacao + ", valorPercentualAtingido=" + valorPercentualAtingido + ", classificacaoAtingida=" + classificacaoAtingida + '}';
    }
}
