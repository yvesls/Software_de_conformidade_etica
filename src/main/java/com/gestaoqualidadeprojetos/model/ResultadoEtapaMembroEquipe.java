
package com.gestaoqualidadeprojetos.model;

/**
 *
 * @author Note102
 */
public class ResultadoEtapaMembroEquipe extends ResultadoEtapa {
    private MembroEquipe membro;
    
    public ResultadoEtapaMembroEquipe () {
    }
    
    public ResultadoEtapaMembroEquipe(Classificacao classificacao, EtapaIteracao etapa, MembroEquipe membro) {
        super(classificacao, etapa);
        this.membro = membro;
    }

    @Override
    public String toString() {
        return "ResultadoEtapaMembroEquipe{" + "membro=" + membro + '}';
    }
}
