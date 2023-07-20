
package com.gestaoqualidadeprojetos.model;

import java.util.List;

/**
 *
 * @author Note102
 */
public class ResultadoMembroEquipe extends Resultado {
    private Peso pesoAtribuido;
    private MembroEquipe membro;
    private List<ResultadoEtapaMembroEquipe> resultadosEtapa;
    private Iteracao iteracao;
    
    public ResultadoMembroEquipe (){
    }

    public ResultadoMembroEquipe(Peso pesoAtribuido, MembroEquipe membro, List<ResultadoEtapaMembroEquipe> resultadosEtapa, Iteracao iteracao) {
        this.pesoAtribuido = pesoAtribuido;
        this.membro = membro;
        this.resultadosEtapa = resultadosEtapa;
        this.iteracao = iteracao;
    }

    public ResultadoMembroEquipe(Peso pesoAtribuido, MembroEquipe membro, List<ResultadoEtapaMembroEquipe> resultadosEtapa, Iteracao iteracao, Classificacao classificacao) {
        super(classificacao);
        this.pesoAtribuido = pesoAtribuido;
        this.membro = membro;
        this.resultadosEtapa = resultadosEtapa;
        this.iteracao = iteracao;
    }

    public Peso getPesos() {
        return pesoAtribuido;
    }

    public MembroEquipe getMembro() {
        return membro;
    }

    public Peso getPesoAtribuido() {
        return pesoAtribuido;
    }

    public Iteracao getIteracao() {
        return iteracao;
    }
    
    public List<ResultadoEtapaMembroEquipe> getResultadosEtapa() {
        return resultadosEtapa;
    }

    public void setPesoAtribuido(Peso pesoAtribuido) {
        this.pesoAtribuido = pesoAtribuido;
    }

    public void setMembro(MembroEquipe membro) {
        this.membro = membro;
    }

    public void setResultadosEtapa(List<ResultadoEtapaMembroEquipe> resultadosEtapa) {
        this.resultadosEtapa = resultadosEtapa;
    }

    public void setIteracao(Iteracao iteracao) {
        this.iteracao = iteracao;
    }

    public void setClassificacao(Classificacao classificacao) {
        this.classificacao = classificacao;
    }

    @Override
    public String toString() {
        return "ResultadoMembroEquipe{" + " membro=" + membro.getNome() + ", iteracao=" + iteracao.getDescricao() + '}';
    }
}
