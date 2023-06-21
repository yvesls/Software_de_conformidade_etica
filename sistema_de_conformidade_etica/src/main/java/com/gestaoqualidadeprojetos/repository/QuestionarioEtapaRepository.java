
package com.gestaoqualidadeprojetos.repository;


import com.gestaoqualidadeprojetos.model.QuestionarioEtapaModel;
import java.time.LocalDateTime;
import java.util.ArrayList;

/**
 *
 * @author lucas
 */
public class QuestionarioEtapaRepository {
    private ArrayList<QuestionarioEtapaModel> listaQuestionarioEtapa;
    private PerguntaBaseRepository perguntas;
    LocalDateTime horas = LocalDateTime.now();
    
    public QuestionarioEtapaRepository(){
        generateAllMock();
    }
    
    public QuestionarioEtapaModel getByQuestionario(String nome) {
        return getMockByQuestionario(nome);
    }
    
    public  ArrayList<QuestionarioEtapaModel> getAll() {
        return listaQuestionarioEtapa;
    }
    
    private ArrayList<QuestionarioEtapaModel> generateAllMock() {
        listaQuestionarioEtapa = new ArrayList<QuestionarioEtapaModel>();
        var questionario1 = new QuestionarioEtapaModel(horas, horas, "Aberto", "quest1", horas, perguntas.getAll() ); 
       
        
        listaQuestionarioEtapa.add(questionario1);
        
        
        return listaQuestionarioEtapa;
    }
    
    private QuestionarioEtapaModel getMockByQuestionario(String nome) {
        for(QuestionarioEtapaModel q : listaQuestionarioEtapa) {
            if(q.getNome().equals(nome)) {
                return q;
            }
        }
        return null;
    }
}
