
package com.gestaoqualidadeprojetos.model;

import java.time.LocalDateTime;
import java.util.ArrayList;

/**
 *
 * @author Note102
 */
public class ResultadoProjeto extends Resultado {
   private String descricao;
   private LocalDateTime dataResultado;
   private ArrayList<ResultadoIteracao> resultadosIteracao;
   private Projeto projeto;

    public ResultadoProjeto(String descricao, LocalDateTime dataResultado, ArrayList<ResultadoIteracao> resultadosIteracao, Projeto projeto, Classificacao classificacao) {
        super(classificacao);
        this.descricao = descricao;
        this.dataResultado = dataResultado;
        this.resultadosIteracao = resultadosIteracao;
        this.projeto = projeto;
    }

    public String getDescricao() {
        return descricao;
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

    @Override
    public String toString() {
        return "ResultadoProjeto{" + "descricao=" + descricao + ", dataResultado=" + dataResultado + ", classificacao=" + classificacao + ", resultadosIteracao=" + resultadosIteracao + ", projeto=" + projeto + '}';
    }
}
