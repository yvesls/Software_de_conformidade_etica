
package com.gestaoqualidadeprojetos.repository;


import com.gestaoqualidadeprojetos.model.Pergunta;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author lucas
 */
public class PerguntaRepository {
    private List<Pergunta> perguntas;

    public PerguntaRepository() {
        perguntas = new ArrayList<>();
    }

    public void salvarPergunta(Pergunta pergunta) {
        perguntas.add(pergunta);
    }

    public List<Pergunta> obterPerguntas() {
        return perguntas;
    }
}
