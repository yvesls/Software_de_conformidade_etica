
package com.gestaoqualidadeprojetos.repository;


import com.gestaoqualidadeprojetos.model.QuestionarioEtapaModel;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author lucas
 */
public class QuestionarioEtapaRepository {
   private List<QuestionarioEtapaModel> questionarios;

    public QuestionarioEtapaRepository() {
        questionarios = new ArrayList<>();
    }

    public void salvarQuestionario(QuestionarioEtapaModel questionario) {
        questionarios.add(questionario);
    }

    public List<QuestionarioEtapaModel> obterQuestionarios() {
        return questionarios;
    }
}