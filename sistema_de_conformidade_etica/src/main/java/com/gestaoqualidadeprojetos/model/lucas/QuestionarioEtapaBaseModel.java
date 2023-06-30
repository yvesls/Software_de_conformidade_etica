
package com.gestaoqualidadeprojetos.model.lucas;

import java.time.LocalDateTime;
import java.util.ArrayList;

/**
 *
 * @author lucas
 */
public class QuestionarioEtapaBaseModel {
     private String nomeQuestionario;
    private LocalDateTime dataCriacao;

    

    public QuestionarioEtapaBaseModel(String nomeQuestionario, LocalDateTime dataCriacao) {
        this.nomeQuestionario = nomeQuestionario;
        this.dataCriacao = dataCriacao;
    }

    public String getNomeQuestionario() {
        return nomeQuestionario;
    }

    public void setNomeQuestionario(String nomeQuestionario) {
        this.nomeQuestionario = nomeQuestionario;
    }

    public LocalDateTime getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(LocalDateTime dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public void adicionarPerguntaBase(PerguntaBaseModel perguntaBase2) {
       // throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
