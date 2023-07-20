
package com.gestaoqualidadeprojetos.model;

/**
 *
 * @author Note102
 */
public class ResultadoEtapaMembroEquipe extends ResultadoEtapa {
    private MembroEquipe membro;
    private Iteracao iteracao;
    
    public ResultadoEtapaMembroEquipe () {
    }

    public ResultadoEtapaMembroEquipe(MembroEquipe membro, Iteracao iteracao) {
        this.membro = membro;
        this.iteracao = iteracao;
    }

    public ResultadoEtapaMembroEquipe(MembroEquipe membro, Iteracao iteracao, Classificacao classificacao, EtapaIteracao etapa) {
        super(classificacao, etapa);
        this.membro = membro;
        this.iteracao = iteracao;
    }

    public MembroEquipe getMembro() {
        return membro;
    }

    public Iteracao getIteracao() {
        return iteracao;
    }

    public void setMembro(MembroEquipe membro) {
        this.membro = membro;
    }

    public void setIteracao(Iteracao iteracao) {
        this.iteracao = iteracao;
    }

    @Override
    public String toString() {
        return "ResultadoEtapaMembroEquipe{" + "membro=" + membro.getNome() + ", iteracao=" + iteracao.getDescricao() + ", classificacao=" + classificacao.getClassificacaoAtingida() + ", etapa=" + etapa.getDescricao() + '}';
    }
}
