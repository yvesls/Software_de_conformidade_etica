
package com.gestaoqualidadeprojetos.service;

import com.gestaoqualidadeprojetos.mode.QuestionarioEtapa;
import com.gestaoqualidadeprojetos.repository.QuestionarioEtapaRepository;
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

    public void salvarQuestionario(QuestionarioEtapa questionario) {
        questionarioRepository.salvarQuestionario(questionario);
    }

    public List<QuestionarioEtapa> obterQuestionarios() {
        return questionarioRepository.obterQuestionarios();
    }
}
