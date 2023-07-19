
package com.gestaoqualidadeprojetos.model;

/**
 *
 * @author lucas
 */
public class Resposta {
   private MembroEquipe membro;
    private boolean resposta;
    private String justificativa;
    private String evidencia;

  

    public Resposta(MembroEquipe membro, boolean resposta) {
        this.membro = membro;
        this.resposta = resposta;
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

    public String getJustificativa() {
        return justificativa;
    }

    public void setJustificativa(String justificativa) {
        this.justificativa = justificativa;
    }

    public String getEvidencia() {
        return evidencia;
    }

    public void setEvidencia(String evidencia) {
        this.evidencia = evidencia;
    }


        
}
