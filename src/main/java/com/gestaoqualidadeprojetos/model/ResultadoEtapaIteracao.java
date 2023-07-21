
package com.gestaoqualidadeprojetos.model;

/**
 *
 * @author Note102
 */
public class ResultadoEtapaIteracao extends ResultadoEtapa {
    private Iteracao iteracao;
    
    public ResultadoEtapaIteracao() {
        super();
    }
    
    public ResultadoEtapaIteracao(Classificacao classificacao, EtapaIteracao etapa, Iteracao iteracao) {
        super(classificacao, etapa);
        this.iteracao = iteracao;
    }

    public Iteracao getIteracao() {
        return iteracao;
    }

    public void setIteracao(Iteracao iteracao) {
        this.iteracao = iteracao;
    }

    public Classificacao getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(Classificacao classificacao) {
        this.classificacao = classificacao;
    }

    public EtapaIteracao getEtapa() {
        return etapa;
    }

    public void setEtapa(EtapaIteracao etapa) {
        this.etapa = etapa;
    }

    @Override
    public String toString() {
        return "ResultadoEtapaIteracao{" + "classificacao=" + classificacao + ", etapa=" + etapa.getDescricao() + '}';
    }
}
