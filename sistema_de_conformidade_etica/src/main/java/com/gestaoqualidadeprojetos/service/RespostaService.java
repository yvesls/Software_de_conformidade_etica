
package com.gestaoqualidadeprojetos.service;

import com.gestaoqualidadeprojetos.model.MembroEquipe;
import com.gestaoqualidadeprojetos.model.Resposta;
import com.gestaoqualidadeprojetos.repository.RespostaRepository;

/**
 *
 * @author lucas
 */
public class RespostaService {
   private RespostaRepository respostaRepository;

    public RespostaService() {
        respostaRepository = new RespostaRepository();
    }

    public void salvarResposta(MembroEquipe membro1, Resposta resposta) {
        respostaRepository.salvarResposta(resposta);
    }

    public Resposta obterRespostaPorMembro(MembroEquipe membro) {
        return respostaRepository.obterRespostaPorMembro(membro);
    }
}
