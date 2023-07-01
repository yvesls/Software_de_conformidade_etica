
package com.gestaoqualidadeprojetos.service;

import com.gestaoqualidadeprojetos.mode.MembroEquipe;
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

    public void salvarMembro(MembroEquipe membro) {
        membroRepository.adicionarMembro(membro);
    }

    public List<MembroEquipe> obterMembros() {
        return membroRepository.listarMembros();
    }
}
