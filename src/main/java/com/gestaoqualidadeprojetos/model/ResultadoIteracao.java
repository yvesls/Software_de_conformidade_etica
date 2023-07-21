
package com.gestaoqualidadeprojetos.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Note102
 */
public class ResultadoIteracao extends Resultado {
    private LocalDate dataResultado;
    private ArrayList<ResultadoEtapaIteracao> resultadosEtapa;
    private ArrayList<ResultadoMembroEquipe> resultadosMembroEquipe;
    private Iteracao iteracao;
    
    public ResultadoIteracao(){
    }

    public ResultadoIteracao(LocalDate dataResultado, Classificacao classificacao, ArrayList<ResultadoEtapaIteracao> resultadosEtapa, ArrayList<ResultadoMembroEquipe> resultadosMembroEquipe, Iteracao iteracao) {
        super(classificacao);
        this.dataResultado = dataResultado;
        this.resultadosEtapa = resultadosEtapa;
        this.resultadosMembroEquipe = resultadosMembroEquipe;
        this.iteracao = iteracao;
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

    public void setDataResultado(LocalDate dataResultado) {
        this.dataResultado = dataResultado;
    }

    public void setResultadosEtapa(ArrayList<ResultadoEtapaIteracao> resultadosEtapa) {
        this.resultadosEtapa = resultadosEtapa;
    }

    public void setResultadosMembroEquipe(ArrayList<ResultadoMembroEquipe> resultadosMembroEquipe) {
        this.resultadosMembroEquipe = resultadosMembroEquipe;
    }

    public void setIteracao(Iteracao iteracao) {
        this.iteracao = iteracao;
    }

    public void setClassificacao(Classificacao classificacao) {
        this.classificacao = classificacao;
    }

    @Override
    public String toString() {
        return "ResultadoIteracao{" + "dataResultado=" + dataResultado + ", iteracao=" + iteracao.getDescricao() + "classificacao=" + classificacao +  '}';
    }
}
