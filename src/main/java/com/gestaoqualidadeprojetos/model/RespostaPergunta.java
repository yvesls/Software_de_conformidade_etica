/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gestaoqualidadeprojetos.model;

/**
 *
 * @author Note102
 */
public class RespostaPergunta {
    private Resposta resposta;
    private Pergunta pergunta;

    public RespostaPergunta(Resposta resposta, Pergunta pergunta) {
        this.resposta = resposta;
        this.pergunta = pergunta;
    }

    public Resposta getResposta() {
        return resposta;
    }

    public void setResposta(Resposta resposta) {
        this.resposta = resposta;
    }

    public Pergunta getPergunta() {
        return pergunta;
    }

    public void setPergunta(Pergunta pergunta) {
        this.pergunta = pergunta;
    }

    @Override
    public String toString() {
        return "RespostaPergunta{" + "resposta=" + resposta + ", pergunta=" + pergunta + '}';
    }
}
