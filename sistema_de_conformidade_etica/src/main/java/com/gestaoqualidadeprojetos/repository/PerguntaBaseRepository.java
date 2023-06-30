
package com.gestaoqualidadeprojetos.repository;


import com.gestaoqualidadeprojetos.model.PerguntaBaseModel;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author lucas
 */
public class PerguntaBaseRepository {
     private List<PerguntaBaseModel> perguntasBase;

    public PerguntaBaseRepository() {
        perguntasBase = new ArrayList<>();
    }

    public void salvarPerguntaBase(PerguntaBaseModel perguntaBase) {
        perguntasBase.add(perguntaBase);
    }

    public List<PerguntaBaseModel> obterPerguntasBase() {
        return perguntasBase;
    }
    
 
}
