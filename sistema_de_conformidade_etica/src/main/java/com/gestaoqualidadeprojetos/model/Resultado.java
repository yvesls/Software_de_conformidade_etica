/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.gestaoqualidadeprojetos.model;

import com.gestaoqualidadeprojetos.model.Classificacao;

/**
 *
 * @author Note102
 */
public abstract class Resultado {
    protected Classificacao classificacao;

    public Classificacao getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(Classificacao classificacao) {
        this.classificacao = classificacao;
    }
}
