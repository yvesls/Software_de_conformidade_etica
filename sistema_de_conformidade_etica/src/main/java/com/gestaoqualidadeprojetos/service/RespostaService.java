
package com.gestaoqualidadeprojetos.service;

import com.gestaoqualidadeprojetos.model.MembroEquipeModel;
import com.gestaoqualidadeprojetos.model.RespostaModel;
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

    public void salvarResposta(MembroEquipeModel membro1, RespostaModel resposta) {
        respostaRepository.salvarResposta(resposta);
    }

    public RespostaModel obterRespostaPorMembro(MembroEquipeModel membro) {
        return respostaRepository.obterRespostaPorMembro(membro);
    }
}
