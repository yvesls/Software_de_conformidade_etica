
package com.gestaoqualidadeprojetos.service;

import com.gestaoqualidadeprojetos.model.Pergunta;
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

    public void salvarPergunta(Pergunta pergunta) {
        perguntaRepository.salvarPergunta(pergunta);
    }

    public List<Pergunta> obterPerguntas() {
        return perguntaRepository.obterPerguntas();
    }
}
