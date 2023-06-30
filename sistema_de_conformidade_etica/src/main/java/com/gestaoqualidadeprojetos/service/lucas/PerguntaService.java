
package com.gestaoqualidadeprojetos.service.lucas;

import com.gestaoqualidadeprojetos.model.lucas.PerguntaModel;
import com.gestaoqualidadeprojetos.repository.lucas.PerguntaRepository;
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
