
package com.gestaoqualidadeprojetos.model;

/**
 *
 * @author Note102
 */
public abstract class ResultadoEtapa {
    private Classificacao classificacao;
    private EtapaIteracao etapa;
    
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

    @Override
    public String toString() {
        return "ResultadoEtapa{" + "classificacao=" + classificacao + ", etapa=" + etapa + '}';
    }
}
