
package com.gestaoqualidadeprojetos.service;

import com.gestaoqualidadeprojetos.model.PerguntaBaseModel;
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

    public void salvarPerguntaBase(PerguntaBaseModel perguntaBase) {
        perguntaBaseRepository.salvarPerguntaBase(perguntaBase);
    }

    public List<PerguntaBaseModel> obterPerguntasBase() {
        return perguntaBaseRepository.obterPerguntasBase();
    }
}
