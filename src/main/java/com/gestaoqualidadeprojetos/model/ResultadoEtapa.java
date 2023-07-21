
package com.gestaoqualidadeprojetos.model;

/**
 *
 * @author Note102
 */
public abstract class ResultadoEtapa {
    protected Classificacao classificacao;
    protected EtapaIteracao etapa;
    
    public ResultadoEtapa () {
    }
    
    public ResultadoEtapa (Classificacao classificacao, EtapaIteracao etapa) {
        this.classificacao = classificacao;
        this.etapa = etapa;
    }

    public Classificacao getClassificacao() {
        return classificacao;
    }

    public EtapaIteracao getEtapa() {
        return etapa;
    }

    public void setClassificacao(Classificacao classificacao) {
        this.classificacao = classificacao;
    }

    public void setEtapa(EtapaIteracao etapa) {
        this.etapa = etapa;
    }
    
    @Override
    public String toString() {
        return "ResultadoEtapa{" + "classificacao=" + classificacao + ", etapa=" + etapa.getDescricao() + '}';
    }
}
