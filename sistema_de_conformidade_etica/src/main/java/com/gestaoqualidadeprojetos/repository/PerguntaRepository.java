
package com.gestaoqualidadeprojetos.repository;


import com.gestaoqualidadeprojetos.model.PerguntaModel;
import java.time.LocalDateTime;
import java.util.ArrayList;

/**
 *
 * @author lucas
 */
public class PerguntaRepository {
    private ArrayList<PerguntaModel> listaPerguntas;
    private RespostaRepository resposta;
    LocalDateTime horas = LocalDateTime.now();
    
    public PerguntaRepository(){
        generateAllMock();
    }
    
    
    public  ArrayList<PerguntaModel> getAll() {
        return listaPerguntas;
    }
    
    private ArrayList<PerguntaModel> generateAllMock() {
        listaPerguntas = new ArrayList<PerguntaModel>();
        var pergunta1 = new PerguntaModel("você é...?\n", horas); 
        var pergunta2 = new PerguntaModel("você quer...?\n", horas);
        var pergunta3 = new PerguntaModel("você tem...?\n", horas);
        

        listaPerguntas.add(pergunta1);
        listaPerguntas.add(pergunta2);
        listaPerguntas.add(pergunta3);
       
        
        return listaPerguntas;
    }
}
