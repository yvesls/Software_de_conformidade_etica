
package com.gestaoqualidadeprojetos.model;

import java.util.List;

/**
 *
 * @author lucas
 */
public class EtapaIteracaoModel {
    private List<QuestionarioEtapaModel> questionarios;

    

    public EtapaIteracaoModel(List<QuestionarioEtapaModel> questionarios) {
        this.questionarios = questionarios;
    }

    public List<QuestionarioEtapaModel> getQuestionarios() {
        return questionarios;
    }

    public void setQuestionarios(List<QuestionarioEtapaModel> questionarios) {
        this.questionarios = questionarios;
    }
}
