
package com.gestaoqualidadeprojetos.repository;


import com.gestaoqualidadeprojetos.model.PerguntaModel;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author lucas
 */
public class PerguntaRepository {
    private List<PerguntaModel> perguntas;

    public PerguntaRepository() {
        perguntas = new ArrayList<>();
    }

    public void salvarPergunta(PerguntaModel pergunta) {
        perguntas.add(pergunta);
    }

    public List<PerguntaModel> obterPerguntas() {
        return perguntas;
    }
}
