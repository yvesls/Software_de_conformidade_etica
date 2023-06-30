/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gestaoqualidadeprojetos.model.yves;

import com.gestaoqualidadeprojetos.model.enums.ClassificacaoEnum;

/**
 *
 * @author Note102
 */
public class ClassificacaoBase {
    private Double valorPercentualMaximo;
    private Double valorPercentualMinimo;
    private ClassificacaoEnum faixaClassificacao;

    public ClassificacaoBase(Double valorPercentualMaximo, Double valorPercentualMinimo, ClassificacaoEnum faixaClassificacao) {
        this.valorPercentualMaximo = valorPercentualMaximo;
        this.valorPercentualMinimo = valorPercentualMinimo;
        this.faixaClassificacao = faixaClassificacao;
    }

    public Double getValorPercentualMaximo() {
        return valorPercentualMaximo;
    }

    public Double getValorPercentualMinimo() {
        return valorPercentualMinimo;
    }

    public ClassificacaoEnum getFaixaClassificacao() {
        return faixaClassificacao;
    }

    @Override
    public String toString() {
        return "ClassificacaoBase{" + "valorPercentualMaximo=" + valorPercentualMaximo + ", valorPercentualMinimo=" + valorPercentualMinimo + ", faixaClassificacao=" + faixaClassificacao + '}';
    }
}
