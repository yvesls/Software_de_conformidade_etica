
package com.gestaoqualidadeprojetos.model;

import java.time.LocalDateTime;

/**
 *
 * @author Note102
 */
public class Peso {
    private LocalDateTime dataCriacao;
    private MembroEquipe membro;
    private Integer valor;

    public Peso(LocalDateTime dataCriacao, MembroEquipe membro, Integer valor) {
        this.dataCriacao = dataCriacao;
        this.membro = membro;
        this.valor = valor;
    }

    public LocalDateTime getDataCriacao() {
        return dataCriacao;
    }

    public MembroEquipe getMembro() {
        return membro;
    }

    public Integer getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return "Peso{" + "dataCriacao=" + dataCriacao + ", membro=" + membro + ", valor=" + valor + '}';
    }
}
