
package com.gestaoqualidadeprojetos.repository;

import com.gestaoqualidadeprojetos.mode.AnexoModel;
import com.gestaoqualidadeprojetos.mode.Evidencia;
import com.gestaoqualidadeprojetos.mode.Justificativa;
import com.gestaoqualidadeprojetos.mode.Resposta;
import java.time.LocalDateTime;
import java.util.ArrayList;

/**
 *
 * @author lucas
 */
public class JustificativaRepository {
    
    private ArrayList<Justificativa> listaJustificativa;
    private AnexoModel anexo;
    public JustificativaRepository(){
        generateAllMock();
    }
    
    
    public  ArrayList<Justificativa> getAll() {
        return listaJustificativa;
    }
    
    private ArrayList<Justificativa> generateAllMock() {
        listaJustificativa = new ArrayList<Justificativa>();
        var justificativa1 = new Justificativa("pq isso e aquilo1"); 
        var justificativa2 = new Justificativa("pq isso e aquilo2"); 
        var justificativa3 = new Justificativa("pq isso e aquilo3"); 

        listaJustificativa.add(justificativa1);
        listaJustificativa.add(justificativa2);
        listaJustificativa.add(justificativa3);
       
        
        return listaJustificativa;
    }
}
