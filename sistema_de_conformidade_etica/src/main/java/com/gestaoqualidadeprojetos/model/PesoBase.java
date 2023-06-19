/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gestaoqualidadeprojetos.model;

/**
 *
 * @author Note102
 */
public class PesoBase {
    private Integer valor;
    private MembroEquipeTeste membro;

    public PesoBase(Integer valor, MembroEquipeTeste membro) {
        this.valor = valor;
        this.membro = membro;
    }

    public Integer getValor() {
        return valor;
    }

    public MembroEquipeTeste getMembro() {
        return membro;
    }

    @Override
    public String toString() {
        return "PesoBase{" + "valor=" + valor + ", membro=" + membro + '}';
    }
}
