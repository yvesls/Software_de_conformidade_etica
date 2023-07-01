
package com.gestaoqualidadeprojetos.repository;

import com.gestaoqualidadeprojetos.mode.AnexoModel;
import com.gestaoqualidadeprojetos.mode.Evidencia;
import java.util.ArrayList;

/**
 *
 * @author lucas
 */
public class EvidenciaRepository {
    private ArrayList<Evidencia> listaEvidencia;
    private AnexoModel anexo;
    public EvidenciaRepository(){
        generateAllMock();
    }
    
    
    public  ArrayList<Evidencia> getAll() {
        return listaEvidencia;
    }
    
    private ArrayList<Evidencia> generateAllMock() {
        listaEvidencia = new ArrayList<Evidencia>();
        var evidencia1 = new Evidencia("pq isso e aquilo1"); 
        var evidencia2 = new Evidencia("pq isso e aquilo2"); 
        var evidencia3 = new Evidencia("pq isso e aquilo3"); 

        listaEvidencia.add(evidencia1);
        listaEvidencia.add(evidencia2);
        listaEvidencia.add(evidencia3);
       
        
        return listaEvidencia;
    }
}
