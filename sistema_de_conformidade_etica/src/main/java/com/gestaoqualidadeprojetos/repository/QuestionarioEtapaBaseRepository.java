
package com.gestaoqualidadeprojetos.repository;

import com.gestaoqualidadeprojetos.model.PerguntaBaseModel;
import com.gestaoqualidadeprojetos.model.QuestionarioEtapaBaseModel;
import java.time.LocalDateTime;
import java.util.ArrayList;

/**
 *
 * @author lucas
 */
public class QuestionarioEtapaBaseRepository {
     
    private ArrayList<QuestionarioEtapaBaseModel> listaQuestionarioEtapaBase;
    private PerguntaBaseRepository perguntas;
    LocalDateTime horas = LocalDateTime.now();
    
    public QuestionarioEtapaBaseRepository(){
        generateAllMock();
    }
    
    public QuestionarioEtapaBaseModel getByQuestionario(String nome) {
        return getMockByQuestionario(nome);
    }
    
    public  ArrayList<QuestionarioEtapaBaseModel> getAll() {
        return listaQuestionarioEtapaBase;
    }
    
    private ArrayList<QuestionarioEtapaBaseModel> generateAllMock() {
        listaQuestionarioEtapaBase = new ArrayList<QuestionarioEtapaBaseModel>();
        var questionario1 = new QuestionarioEtapaBaseModel("quest1", horas, perguntas.getAll()); //lista de perguntas vindas de Pergunta para montar o quest
        var questionario2 = new QuestionarioEtapaBaseModel("quest2", horas, perguntas.getAll());
        
        listaQuestionarioEtapaBase.add(questionario1);
        listaQuestionarioEtapaBase.add(questionario2);
        
        return listaQuestionarioEtapaBase;
    }
    
    private QuestionarioEtapaBaseModel getMockByQuestionario(String nome) {
        for(QuestionarioEtapaBaseModel q : listaQuestionarioEtapaBase) {
            if(q.getNome().equals(nome)) {
                return q;
            }
        }
        return null;
    }
    
    
    
}
