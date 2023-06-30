
package com.gestaoqualidadeprojetos.service;

import com.gestaoqualidadeprojetos.model.MembroEquipeModel;
import com.gestaoqualidadeprojetos.repository.MembroEquipeRepository;
import java.util.List;

/**
 *
 * @author lucas
 */
public class MembroEquipeService {
    private MembroEquipeRepository membroRepository;

    public MembroEquipeService() {
        membroRepository = new MembroEquipeRepository();
    }

    public void salvarMembro(MembroEquipeModel membro) {
        membroRepository.salvarMembro(membro);
    }

    public List<MembroEquipeModel> obterMembros() {
        return membroRepository.obterMembros();
    }
}
