
package com.gestaoqualidadeprojetos.repository;


import com.gestaoqualidadeprojetos.model.PerguntaBaseModel;
import java.time.LocalDateTime;
import java.util.ArrayList;

/**
 *
 * @author lucas
 */
public class PerguntaBaseRepository {
    private ArrayList<PerguntaBaseModel> listaPerguntasBase;
    LocalDateTime horas = LocalDateTime.now();
    
    public PerguntaBaseRepository(){
        generateAllMock();
    }
    
    
    public  ArrayList<PerguntaBaseModel> getAll() {
        return listaPerguntasBase;
    }
    
    private ArrayList<PerguntaBaseModel> generateAllMock() {
        listaPerguntasBase = new ArrayList<PerguntaBaseModel>();
        var pergunta1 = new PerguntaBaseModel("você está de acordo com...?\n", horas); 
        var pergunta2 = new PerguntaBaseModel("você previu o...?\n", horas);
        var pergunta3 = new PerguntaBaseModel("você concorda em...?\n", horas);
        var pergunta4 = new PerguntaBaseModel("você está disposto a...?\n", horas);
        var pergunta5 = new PerguntaBaseModel("você ...?\n", horas);

        listaPerguntasBase.add(pergunta1);
        listaPerguntasBase.add(pergunta2);
        listaPerguntasBase.add(pergunta3);
        listaPerguntasBase.add(pergunta4);
        listaPerguntasBase.add(pergunta5);
        
        return listaPerguntasBase;
    }
    
 
}
