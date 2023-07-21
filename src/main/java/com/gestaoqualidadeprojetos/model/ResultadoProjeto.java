package com.gestaoqualidadeprojetos.model;

import java.time.LocalDateTime;
import java.util.ArrayList;

/**
 *
 * @author Note102
 */
public class ResultadoProjeto extends Resultado {

    private LocalDateTime dataResultado;
    private ArrayList<ResultadoIteracao> resultadosIteracao;
    private Projeto projeto;

    public ResultadoProjeto() {
    }

    public ResultadoProjeto(LocalDateTime dataResultado, ArrayList<ResultadoIteracao> resultadosIteracao, Projeto projeto, Classificacao classificacao) {
        super(classificacao);
        this.dataResultado = dataResultado;
        this.resultadosIteracao = resultadosIteracao;
        this.projeto = projeto;
    }

    public LocalDateTime getDataResultado() {
        return dataResultado;
    }

    public ArrayList<ResultadoIteracao> getResultadosIteracao() {
        return resultadosIteracao;
    }

    public Projeto getProjeto() {
        return projeto;
    }

    public void setDataResultado(LocalDateTime dataResultado) {
        this.dataResultado = dataResultado;
    }

    public void setResultadosIteracao(ArrayList<ResultadoIteracao> resultadosIteracao) {
        this.resultadosIteracao = resultadosIteracao;
    }

    public void setProjeto(Projeto projeto) {
        this.projeto = projeto;
    }

    public void setClassificacao(Classificacao classificacao) {
        this.classificacao = classificacao;
    }

    @Override
    public String toString() {
        return "ResultadoProjeto{" + " dataResultado=" + dataResultado + ", classificacao=" + classificacao.getClassificacaoAtingida() + ", projeto=" + projeto.getNome() + '}';
    }
}
