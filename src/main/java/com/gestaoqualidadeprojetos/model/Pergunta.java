
package com.gestaoqualidadeprojetos.model;

import java.time.LocalDateTime;

/**
 *
 * @author lucas
 */
public class Pergunta extends PerguntaBase{
    private QuestionarioEtapa questionario;
    
    public Pergunta(String descricao, LocalDateTime dataCriacao) {
        super(descricao, dataCriacao);
    }

    public Pergunta(QuestionarioEtapa questionario, String descricao, LocalDateTime dataCriacao) {
        super(descricao, dataCriacao);
        this.questionario = questionario;
    }

    public QuestionarioEtapa getQuestionario() {
        return questionario;
    }
   
    public void setQuestionario(QuestionarioEtapa questionario) {
        this.questionario = questionario;
    }
}
