
package com.gestaoqualidadeprojetos.service;

import com.gestaoqualidadeprojetos.model.PerguntaModel;
import com.gestaoqualidadeprojetos.repository.PerguntaRepository;
import java.util.List;

/**
 *
 * @author lucas
 */
public class PerguntaService {
    private PerguntaRepository perguntaRepository;

    public PerguntaService() {
        perguntaRepository = new PerguntaRepository();
    }

    public void salvarPergunta(PerguntaModel pergunta) {
        perguntaRepository.salvarPergunta(pergunta);
    }

    public List<PerguntaModel> obterPerguntas() {
        return perguntaRepository.obterPerguntas();
    }
}
