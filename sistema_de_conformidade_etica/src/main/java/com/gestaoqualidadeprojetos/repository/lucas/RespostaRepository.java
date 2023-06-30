
package com.gestaoqualidadeprojetos.repository.lucas;

import com.gestaoqualidadeprojetos.model.lucas.EvidenciaModel;
import com.gestaoqualidadeprojetos.model.lucas.JustificativaModel;
import com.gestaoqualidadeprojetos.model.lucas.MembroEquipeModel;
import com.gestaoqualidadeprojetos.model.lucas.RespostaModel;
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
