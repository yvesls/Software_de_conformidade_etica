
package com.gestaoqualidadeprojetos.repository;


import com.gestaoqualidadeprojetos.mode.QuestionarioEtapa;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author lucas
 */
public class QuestionarioEtapaRepository {
   private List<QuestionarioEtapa> questionarios;

    public QuestionarioEtapaRepository() {
        questionarios = new ArrayList<>();
    }

    public void salvarQuestionario(QuestionarioEtapa questionario) {
        questionarios.add(questionario);
    }

    public List<QuestionarioEtapa> obterQuestionarios() {
        return questionarios;
    }
}
