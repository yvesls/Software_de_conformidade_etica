
package com.gestaoqualidadeprojetos.service;

import com.gestaoqualidadeprojetos.model.PerguntaBase;
import com.gestaoqualidadeprojetos.repository.PerguntaBaseRepository;
import java.util.List;

/**
 *
 * @author lucas
 */
public class PerguntaBaseService {
    private PerguntaBaseRepository perguntaBaseRepository;

    public PerguntaBaseService() {
        perguntaBaseRepository = new PerguntaBaseRepository();
    }

    public void salvarPerguntaBase(PerguntaBase perguntaBase) {
        perguntaBaseRepository.salvarPerguntaBase(perguntaBase);
    }

    public List<PerguntaBase> obterPerguntasBase() {
        return perguntaBaseRepository.obterPerguntasBase();
    }
}
