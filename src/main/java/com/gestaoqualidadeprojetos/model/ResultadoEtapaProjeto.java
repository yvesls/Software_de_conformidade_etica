
package com.gestaoqualidadeprojetos.model;

/**
 *
 * @author Note102
 */
public class ResultadoEtapaProjeto extends ResultadoEtapa {
    private Projeto projeto;
    
    public ResultadoEtapaProjeto () {
    }
    
    public ResultadoEtapaProjeto(Classificacao classificacao, EtapaIteracao etapa, Projeto projeto) {
        super(classificacao, etapa);
        this.projeto = projeto;
    }
}
