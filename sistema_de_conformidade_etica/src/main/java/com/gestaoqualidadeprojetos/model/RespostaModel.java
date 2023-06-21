
package com.gestaoqualidadeprojetos.model;

/**
 *
 * @author lucas
 */
public class RespostaModel {
    private Boolean resposta;
    private MembroEquipeModel membroEquipe;
    private EvidenciaModel evidencia;
    private JustificativaModel justificativa;
    
    //com evidencia 
    public RespostaModel(Boolean resposta, MembroEquipeModel membroEquipe, EvidenciaModel evidencia) {
        this.resposta = resposta;
        this.membroEquipe = membroEquipe;
        this.evidencia = evidencia;
    }
    
    //com justificativa
    public RespostaModel(Boolean resposta, MembroEquipeModel membroEquipe, JustificativaModel justificativa) {
        this.resposta = resposta;
        this.membroEquipe = membroEquipe;
        this.justificativa = justificativa;
    }

    public Boolean getResposta() {
        return resposta;
    }

    public MembroEquipeModel getMembroEquipe() {
        return membroEquipe;
    }

    public EvidenciaModel getEvidencia() {
        return evidencia;
    }

    public JustificativaModel getJustificativa() {
        return justificativa;
    }

    public void setResposta(Boolean resposta) {
        this.resposta = resposta;
    }

    public void setMembroEquipe(MembroEquipeModel membroEquipe) {
        this.membroEquipe = membroEquipe;
    }

    public void setEvidencia(EvidenciaModel evidencia) {
        this.evidencia = evidencia;
    }

    public void setJustificativa(JustificativaModel justificativa) {
        this.justificativa = justificativa;
    }
    
    
}
