
package com.gestaoqualidadeprojetos.repository;

import com.gestaoqualidadeprojetos.model.AnexoModel;
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
public class JustificativaRepository {
    
    private ArrayList<JustificativaModel> listaJustificativa;
    private AnexoModel anexo;
    public JustificativaRepository(){
        generateAllMock();
    }
    
    
    public  ArrayList<JustificativaModel> getAll() {
        return listaJustificativa;
    }
    
    private ArrayList<JustificativaModel> generateAllMock() {
        listaJustificativa = new ArrayList<JustificativaModel>();
        var justificativa1 = new JustificativaModel("pq isso e aquilo1"); 
        var justificativa2 = new JustificativaModel("pq isso e aquilo2"); 
        var justificativa3 = new JustificativaModel("pq isso e aquilo3"); 

        listaJustificativa.add(justificativa1);
        listaJustificativa.add(justificativa2);
        listaJustificativa.add(justificativa3);
       
        
        return listaJustificativa;
    }
}
