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
public class Peso {
    private LocalDateTime dataCriacao;
    private MembroEquipeTeste membro;
    private Integer valor;

    public Peso(LocalDateTime dataCriacao, MembroEquipeTeste membro, Integer valor) {
        this.dataCriacao = dataCriacao;
        this.membro = membro;
        this.valor = valor;
    }

    public LocalDateTime getDataCriacao() {
        return dataCriacao;
    }

    public MembroEquipeTeste getMembro() {
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
