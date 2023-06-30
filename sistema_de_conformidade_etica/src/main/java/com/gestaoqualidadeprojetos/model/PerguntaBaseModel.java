
package com.gestaoqualidadeprojetos.model;

import java.time.LocalDateTime;

/**
 *
 * @author lucas
 */
public class PerguntaBaseModel {
   private String descricao;
    private LocalDateTime dataCriacao;

    

    public PerguntaBaseModel(String descricao, LocalDateTime dataCriacao) {
        this.descricao = descricao;
        this.dataCriacao = dataCriacao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDateTime getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(LocalDateTime dataCriacao) {
        this.dataCriacao = dataCriacao;
    }
}
