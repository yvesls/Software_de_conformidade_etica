
package com.gestaoqualidadeprojetos.repository;


import com.gestaoqualidadeprojetos.mode.PerguntaBase;
import java.time.LocalDateTime;
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
