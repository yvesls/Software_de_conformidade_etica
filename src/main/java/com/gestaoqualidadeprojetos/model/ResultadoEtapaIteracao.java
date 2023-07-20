
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

    @Override
    public String toString() {
        return "ResultadoEtapaMembroEquipe{" + " iteracao=" + iteracao.getDescricao() + ", classificacao=" + classificacao.getClassificacaoAtingida() + ", etapa=" + etapa.getDescricao() + '}';
    }
}
