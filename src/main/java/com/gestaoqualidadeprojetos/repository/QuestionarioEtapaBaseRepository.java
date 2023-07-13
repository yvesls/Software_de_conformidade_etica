
package com.gestaoqualidadeprojetos.repository;

import com.gestaoqualidadeprojetos.model.QuestionarioEtapaBase;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author lucas
 */
public class QuestionarioEtapaBaseRepository {
     
   private List<QuestionarioEtapaBase> questionariosBase;

    public QuestionarioEtapaBaseRepository() {
        questionariosBase = new ArrayList<>();
    }

    public void salvarQuestionarioBase(QuestionarioEtapaBase questionarioBase) {
        questionariosBase.add(questionarioBase);
    }

    public List<QuestionarioEtapaBase> obterQuestionariosBase() {
        return questionariosBase;
    }
    
    
    
}
