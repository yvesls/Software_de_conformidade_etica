
package com.gestaoqualidadeprojetos.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Note102
 */
public class ResultadoIteracao extends Resultado {
    private String descricao;
    private LocalDate dataResultado;
    private ArrayList<ResultadoEtapaIteracao> resultadosEtapa;
    private ArrayList<ResultadoMembroEquipe> resultadosMembroEquipe;
    private Iteracao iteracao;

    public ResultadoIteracao(String descricao, LocalDate dataResultado, Classificacao classificacao, ArrayList<ResultadoEtapaIteracao> resultadosEtapa, ArrayList<ResultadoMembroEquipe> resultadosMembroEquipe, Iteracao iteracao) {
        super(classificacao);
        this.descricao = descricao;
        this.dataResultado = dataResultado;
        this.resultadosEtapa = resultadosEtapa;
        this.resultadosMembroEquipe = resultadosMembroEquipe;
        this.iteracao = iteracao;
    }

    public String getDescricao() {
        return descricao;
    }

    public LocalDate getDataResultado() {
        return dataResultado;
    }

    public Iteracao getIteracao() {
        return iteracao;
    }

    public ArrayList<ResultadoEtapaIteracao> getResultadosEtapa() {
        return resultadosEtapa;
    }

    public ArrayList<ResultadoMembroEquipe> getResultadosMembroEquipe() {
        return resultadosMembroEquipe;
    }

    public Classificacao getClassificacao() {
        return classificacao;
    }

    @Override
    public String toString() {
        return "ResultadoIteracao{" + "descricao=" + descricao + ", dataResultado=" + dataResultado + ", resultadosEtapa=" + resultadosEtapa + ", resultadosMembroEquipe=" + resultadosMembroEquipe + ", iteracao=" + iteracao + '}';
    }
}
