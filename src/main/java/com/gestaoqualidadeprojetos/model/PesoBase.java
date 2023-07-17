
package com.gestaoqualidadeprojetos.model;

/**
 *
 * @author Note102
 */
public class PesoBase {
    private Integer valor;
    private MembroEquipe membro;

    public PesoBase(Integer valor, MembroEquipe membro) {
        this.valor = valor;
        this.membro = membro;
    }

    public Integer getValor() {
        return valor;
    }

    public MembroEquipe getMembro() {
        return membro;
    }

    @Override
    public String toString() {
        return "PesoBase{" + "valor=" + valor + ", membro=" + membro + '}';
    }
}
