
package com.gestaoqualidadeprojetos.repository;

import com.gestaoqualidadeprojetos.mode.Evidencia;
import com.gestaoqualidadeprojetos.mode.Justificativa;
import com.gestaoqualidadeprojetos.mode.MembroEquipe;
import com.gestaoqualidadeprojetos.mode.Resposta;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author lucas
 */
public class RespostaRepository {
    private Map<String, Resposta> respostas;

    public RespostaRepository() {
        respostas = new HashMap<>();
    }

    public void salvarResposta(Resposta resposta) {
        MembroEquipe membro = resposta.getMembro();
        String chave = membro.getNome() + membro.getSobrenome();
        respostas.put(chave, resposta);
    }

    public Resposta obterRespostaPorMembro(MembroEquipe membro) {
        String chave = membro.getNome() + membro.getSobrenome();
        return respostas.get(chave);
    }
}
