
package com.gestaoqualidadeprojetos.model;

/**
 *
 * @author lucas
 */
public class Resposta {
    private MembroEquipe membro;
    private boolean resposta;
    private Justificativa justificativa;
    private Evidencia evidencia;

  

    public Resposta(MembroEquipe membro, boolean resposta) {
        this.membro = membro;
        this.resposta = resposta;
    }

    public Resposta(MembroEquipe membro, boolean resposta, Justificativa justificativa) {
        this.membro = membro;
        this.resposta = resposta;
        this.justificativa = justificativa;
    }

    public Resposta(MembroEquipe membro, boolean resposta, Evidencia evidencia) {
        this.membro = membro;
        this.resposta = resposta;
        this.evidencia = evidencia;
    }

    public MembroEquipe getMembro() {
        return membro;
    }

    public void setMembro(MembroEquipe membro) {
        this.membro = membro;
    }

    public boolean getResposta() {
        return resposta;
    }

    public void setResposta(boolean resposta) {
        this.resposta = resposta;
    }

    public Justificativa getJustificativa() {
        return justificativa;
    }

    public void setJustificativa(Justificativa justificativa) {
        this.justificativa = justificativa;
    }

    public Evidencia getEvidencia() {
        return evidencia;
    }

    public void setEvidencia(Evidencia evidencia) {
        this.evidencia = evidencia;
    }

    @Override
    public String toString() {
        return "Resposta: " + resposta + "\nJustificativa: " + justificativa + "\nEvidencia: " + evidencia + "\nMembro: " + membro.getNome() + " "+ membro.getSobrenome();
    }

}
