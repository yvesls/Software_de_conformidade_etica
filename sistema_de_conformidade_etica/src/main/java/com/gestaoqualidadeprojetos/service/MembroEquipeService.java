
package com.gestaoqualidadeprojetos.service;

import com.gestaoqualidadeprojetos.model.MembroEquipe;
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

    public void addMembro(MembroEquipe membro) {
        membroRepository.adicionarMembro(membro);
    }

    public List<MembroEquipe> listarMembros() {
        return membroRepository.listarMembros();
    }
}
