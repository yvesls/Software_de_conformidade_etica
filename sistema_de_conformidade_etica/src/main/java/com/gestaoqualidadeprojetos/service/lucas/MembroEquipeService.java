
package com.gestaoqualidadeprojetos.service.lucas;

import com.gestaoqualidadeprojetos.model.lucas.MembroEquipeModel;
import com.gestaoqualidadeprojetos.repository.lucas.MembroEquipeRepository;
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
