
package com.gestaoqualidadeprojetos.repository;

import com.gestaoqualidadeprojetos.model.EvidenciaModel;
import com.gestaoqualidadeprojetos.model.JustificativaModel;
import com.gestaoqualidadeprojetos.model.MembroEquipeModel;
import com.gestaoqualidadeprojetos.model.RespostaModel;
import java.time.LocalDateTime;
import java.util.ArrayList;

/**
 *
 * @author lucas
 */
public class RespostaRepository {
    private ArrayList<RespostaModel> listaRespostas;
    private MembroEquipeModel membro;
    private EvidenciaModel evidencia;
    private JustificativaModel justificativa;
    LocalDateTime horas = LocalDateTime.now();
    
    public RespostaRepository(){
        generateAllMock();
    }
    
    
    public  ArrayList<RespostaModel> getAll() {
        return listaRespostas;
    }
    
    private ArrayList<RespostaModel> generateAllMock() {
        listaRespostas = new ArrayList<RespostaModel>();
        var resposta1 = new RespostaModel(true, membro, evidencia ); 
        var resposta2 = new RespostaModel(false, membro, justificativa); 
        var resposta3 = new RespostaModel(true, membro, evidencia ); 
        

        listaRespostas.add(resposta1);
        listaRespostas.add(resposta2);
        listaRespostas.add(resposta3);
       
        
        return listaRespostas;
    }
}
