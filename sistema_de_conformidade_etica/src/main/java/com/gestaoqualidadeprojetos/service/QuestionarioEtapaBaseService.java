
package com.gestaoqualidadeprojetos.service;

import com.gestaoqualidadeprojetos.model.QuestionarioEtapaBaseModel;
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

    public void salvarQuestionarioBase(QuestionarioEtapaBaseModel questionarioBase) {
        questionarioBaseRepository.salvarQuestionarioBase(questionarioBase);
    }

    public List<QuestionarioEtapaBaseModel> obterQuestionariosBase() {
        return questionarioBaseRepository.obterQuestionariosBase();
    }

    public void salvarQuestionarioEtapaBase(QuestionarioEtapaBaseModel questionarioEtapaBase1) {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
