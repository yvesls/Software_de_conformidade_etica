
package com.gestaoqualidadeprojetos.mode;

import java.util.List;

/**
 *
 * @author lucas
 */
public class EtapaIteracaoModel {
    private List<QuestionarioEtapa> questionarios;

    

    public EtapaIteracaoModel(List<QuestionarioEtapa> questionarios) {
        this.questionarios = questionarios;
    }

    public List<QuestionarioEtapa> getQuestionarios() {
        return questionarios;
    }

    public void setQuestionarios(List<QuestionarioEtapa> questionarios) {
        this.questionarios = questionarios;
    }
}
