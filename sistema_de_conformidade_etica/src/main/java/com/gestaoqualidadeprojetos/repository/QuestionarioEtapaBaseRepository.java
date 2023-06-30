
package com.gestaoqualidadeprojetos.repository;

import com.gestaoqualidadeprojetos.model.PerguntaBaseModel;
import com.gestaoqualidadeprojetos.model.QuestionarioEtapaBaseModel;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author lucas
 */
public class QuestionarioEtapaBaseRepository {
     
   private List<QuestionarioEtapaBaseModel> questionariosBase;

    public QuestionarioEtapaBaseRepository() {
        questionariosBase = new ArrayList<>();
    }

    public void salvarQuestionarioBase(QuestionarioEtapaBaseModel questionarioBase) {
        questionariosBase.add(questionarioBase);
    }

    public List<QuestionarioEtapaBaseModel> obterQuestionariosBase() {
        return questionariosBase;
    }
    
    
    
}
