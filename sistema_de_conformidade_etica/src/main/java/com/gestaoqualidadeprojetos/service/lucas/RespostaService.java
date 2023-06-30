
package com.gestaoqualidadeprojetos.service.lucas;

import com.gestaoqualidadeprojetos.model.lucas.MembroEquipeModel;
import com.gestaoqualidadeprojetos.model.lucas.RespostaModel;
import com.gestaoqualidadeprojetos.repository.lucas.RespostaRepository;

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
