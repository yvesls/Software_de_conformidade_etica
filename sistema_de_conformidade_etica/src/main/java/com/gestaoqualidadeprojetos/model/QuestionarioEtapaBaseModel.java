
package com.gestaoqualidadeprojetos.model;

import java.time.LocalDateTime;
import java.util.ArrayList;

/**
 *
 * @author lucas
 */
public class QuestionarioEtapaBaseModel {
     
     private String nome;
     private LocalDateTime dataCriacao;
     private ArrayList<PerguntaBaseModel> listaPerguntasBase;

    public QuestionarioEtapaBaseModel(String nome, LocalDateTime dataCriacao, ArrayList<PerguntaBaseModel> listaPerguntasBase) {
        this.nome = nome;
        this.dataCriacao = dataCriacao;
        this.listaPerguntasBase = listaPerguntasBase;
    }

    public String getNome() {
        return nome;
    }

    public LocalDateTime getDataCriacao() {
        return dataCriacao;
    }

    public ArrayList<PerguntaBaseModel> getListaPerguntasBase() {
        return listaPerguntasBase;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDataCriacao(LocalDateTime dataCriacao) {
        this.dataCriacao = dataCriacao;
    }
     
    
}
