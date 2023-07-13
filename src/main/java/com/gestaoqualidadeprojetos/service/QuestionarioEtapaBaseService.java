
package com.gestaoqualidadeprojetos.service;

import com.gestaoqualidadeprojetos.model.QuestionarioEtapaBase;
import com.gestaoqualidadeprojetos.repository.QuestionarioEtapaBaseRepository;
import java.util.List;

/**
 *
 * @author lucas
 */
public class QuestionarioEtapaBaseService {
     private QuestionarioEtapaBaseRepository questionarioBaseRepository;

    public QuestionarioEtapaBaseService() {
        questionarioBaseRepository = new QuestionarioEtapaBaseRepository();
    }

    public void salvarQuestionarioBase(QuestionarioEtapaBase questionarioBase) {
        questionarioBaseRepository.salvarQuestionarioBase(questionarioBase);
    }

    public List<QuestionarioEtapaBase> obterQuestionariosBase() {
        return questionarioBaseRepository.obterQuestionariosBase();
    }

    public void salvarQuestionarioEtapaBase(QuestionarioEtapaBase questionarioEtapaBase1) {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
