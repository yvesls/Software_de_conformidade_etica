
package com.gestaoqualidadeprojetos.repository;


import com.gestaoqualidadeprojetos.model.PerguntaBase;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author lucas
 */
public class PerguntaBaseRepository {
     private List<PerguntaBase> perguntasBase;

    public PerguntaBaseRepository() {
        perguntasBase = new ArrayList<>();
    }

    public void salvarPerguntaBase(PerguntaBase perguntaBase) {
        perguntasBase.add(perguntaBase);
    }

    public List<PerguntaBase> obterPerguntasBase() {
        return perguntasBase;
    }
    
 
}
