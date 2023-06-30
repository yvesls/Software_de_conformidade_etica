
package com.gestaoqualidadeprojetos.repository.lucas;

import com.gestaoqualidadeprojetos.model.lucas.AnexoModel;
import com.gestaoqualidadeprojetos.model.lucas.EvidenciaModel;
import com.gestaoqualidadeprojetos.model.lucas.JustificativaModel;
import com.gestaoqualidadeprojetos.model.lucas.MembroEquipeModel;
import com.gestaoqualidadeprojetos.model.lucas.RespostaModel;
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
