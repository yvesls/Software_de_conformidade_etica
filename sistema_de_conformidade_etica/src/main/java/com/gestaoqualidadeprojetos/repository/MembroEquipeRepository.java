

package com.gestaoqualidadeprojetos.repository;

import com.gestaoqualidadeprojetos.model.MembroEquipeModel;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author lucas
 */
public class MembroEquipeRepository {
    private List<MembroEquipeModel> membros;

    public MembroEquipeRepository() {
        membros = new ArrayList<>();
    }

    public void salvarMembro(MembroEquipeModel membro) {
        membros.add(membro);
    }

    public List<MembroEquipeModel> obterMembros() {
        return membros;
    }
}