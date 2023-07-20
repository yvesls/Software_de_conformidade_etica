
package com.gestaoqualidadeprojetos.model;

import com.gestaoqualidadeprojetos.model.enums.ClassificacaoEnum;

/**
 *
 * @author Note102
 */
public class ClassificacaoBase {
    private Double valorPercentualMaximo;
    private Double valorPercentualMinimo;
    private ClassificacaoEnum faixaClassificacao;
    private String descricao;

    public ClassificacaoBase(Double valorPercentualMaximo, Double valorPercentualMinimo, ClassificacaoEnum faixaClassificacao, String descricao) {
        this.valorPercentualMaximo = valorPercentualMaximo;
        this.valorPercentualMinimo = valorPercentualMinimo;
        this.faixaClassificacao = faixaClassificacao;
        this.descricao = descricao;
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
    
     public String getDescricao() {
        return descricao;
    }

    @Override
    public String toString() {
        return "ClassificacaoBase{" + "valorPercentualMaximo=" + valorPercentualMaximo + ", valorPercentualMinimo=" + valorPercentualMinimo + ", faixaClassificacao=" + faixaClassificacao + '}';
    }
}
