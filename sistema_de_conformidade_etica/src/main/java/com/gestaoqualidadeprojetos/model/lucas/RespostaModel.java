
package com.gestaoqualidadeprojetos.model.lucas;

/**
 *
 * @author lucas
 */
public class RespostaModel {
   private MembroEquipeModel membro;
    private boolean resposta;
    private String justificativa;
    private String evidencia;

  

    public RespostaModel(MembroEquipeModel membro, boolean resposta) {
        this.membro = membro;
        this.resposta = resposta;
    }

    public MembroEquipeModel getMembro() {
        return membro;
    }

    public void setMembro(MembroEquipeModel membro) {
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
