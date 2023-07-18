
package com.gestaoqualidadeprojetos.model;

import java.util.List;

/**
 *
 * @author Note102
 */
public class ResultadoMembroEquipe extends Resultado {
    private Integer quantidadeRespostasSim;
    private Integer quantidadeTotalPerguntas;
    private double percentualRespostasSim;
    private Peso pesoAtribuido;
    private MembroEquipe membro;
    private List<ResultadoEtapaMembroEquipe> resultadosEtapa;
    private Iteracao iteracao;

    public ResultadoMembroEquipe(Integer quantidadeRespostasSim, Integer quantidadeTotalPerguntas, double percentualRespostasSim, Peso pesoAtribuido, Classificacao classificacao, MembroEquipe membro, Iteracao iteracao, List<ResultadoEtapaMembroEquipe> resultadosEtapa) {
        super(classificacao);
        this.quantidadeRespostasSim = quantidadeRespostasSim;
        this.quantidadeTotalPerguntas = quantidadeTotalPerguntas;
        this.percentualRespostasSim = percentualRespostasSim;
        this.pesoAtribuido = pesoAtribuido;
        this.membro = membro;
        this.resultadosEtapa = resultadosEtapa;
        this.iteracao = iteracao;
    }

    public Integer getQuantidadeRespostasSim() {
        return quantidadeRespostasSim;
    }

    public Integer getQuantidadeTotalPerguntas() {
        return quantidadeTotalPerguntas;
    }

    public double getPercentualRespostasSim() {
        return percentualRespostasSim;
    }

    public Peso getPesos() {
        return pesoAtribuido;
    }

    public MembroEquipe getMembro() {
        return membro;
    }

    public Peso getPesoAtribuido() {
        return pesoAtribuido;
    }

    public Iteracao getIteracao() {
        return iteracao;
    }
    
    public List<ResultadoEtapaMembroEquipe> getResultadosEtapa() {
        return resultadosEtapa;
    }

    @Override
    public String toString() {
        return "ResultadoMembroEquipe{" + "quantidadeRespostasSim=" + quantidadeRespostasSim + ", quantidadeTotalPerguntas=" + quantidadeTotalPerguntas + ", percentualRespostasSim=" + percentualRespostasSim + ", pesoAtribuido=" + pesoAtribuido + ", membro=" + membro + ", resultadosEtapa=" + resultadosEtapa + ", iteracao=" + iteracao + '}';
    }
}
