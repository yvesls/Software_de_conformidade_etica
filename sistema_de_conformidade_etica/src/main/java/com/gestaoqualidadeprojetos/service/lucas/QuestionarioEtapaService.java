
package com.gestaoqualidadeprojetos.service.lucas;

import com.gestaoqualidadeprojetos.model.lucas.QuestionarioEtapaModel;
import com.gestaoqualidadeprojetos.repository.lucas.QuestionarioEtapaRepository;
import java.util.List;

/**
 *
 * @author lucas
 */
public class QuestionarioEtapaService {
    private QuestionarioEtapaRepository questionarioRepository;

    public QuestionarioEtapaService() {
        questionarioRepository = new QuestionarioEtapaRepository();
    }

    public void salvarQuestionario(QuestionarioEtapaModel questionario) {
        questionarioRepository.salvarQuestionario(questionario);
    }

    public List<QuestionarioEtapaModel> obterQuestionarios() {
        return questionarioRepository.obterQuestionarios();
    }
}
