
package com.gestaoqualidadeprojetos.repository;

import com.gestaoqualidadeprojetos.model.EvidenciaModel;
import com.gestaoqualidadeprojetos.model.JustificativaModel;
import com.gestaoqualidadeprojetos.model.MembroEquipeModel;
import com.gestaoqualidadeprojetos.model.RespostaModel;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author lucas
 */
public class RespostaRepository {
    private Map<String, RespostaModel> respostas;

    public RespostaRepository() {
        respostas = new HashMap<>();
    }

    public void salvarResposta(RespostaModel resposta) {
        MembroEquipeModel membro = resposta.getMembro();
        String chave = membro.getNome() + membro.getSobrenome();
        respostas.put(chave, resposta);
    }

    public RespostaModel obterRespostaPorMembro(MembroEquipeModel membro) {
        String chave = membro.getNome() + membro.getSobrenome();
        return respostas.get(chave);
    }
}
