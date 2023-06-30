
package com.gestaoqualidadeprojetos.repository.lucas;

import com.gestaoqualidadeprojetos.model.lucas.AnexoModel;
import com.gestaoqualidadeprojetos.model.lucas.EvidenciaModel;
import java.util.ArrayList;

/**
 *
 * @author lucas
 */
public class EvidenciaRepository {
    private ArrayList<EvidenciaModel> listaEvidencia;
    private AnexoModel anexo;
    public EvidenciaRepository(){
        generateAllMock();
    }
    
    
    public  ArrayList<EvidenciaModel> getAll() {
        return listaEvidencia;
    }
    
    private ArrayList<EvidenciaModel> generateAllMock() {
        listaEvidencia = new ArrayList<EvidenciaModel>();
        var evidencia1 = new EvidenciaModel("pq isso e aquilo1"); 
        var evidencia2 = new EvidenciaModel("pq isso e aquilo2"); 
        var evidencia3 = new EvidenciaModel("pq isso e aquilo3"); 

        listaEvidencia.add(evidencia1);
        listaEvidencia.add(evidencia2);
        listaEvidencia.add(evidencia3);
       
        
        return listaEvidencia;
    }
}
