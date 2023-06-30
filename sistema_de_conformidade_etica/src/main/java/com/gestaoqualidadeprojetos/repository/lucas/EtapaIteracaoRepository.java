
package com.gestaoqualidadeprojetos.repository.lucas;

import com.gestaoqualidadeprojetos.model.lucas.EtapaIteracaoModel;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author lucas
 */
public class EtapaIteracaoRepository {
    private List<EtapaIteracaoModel> etapas;

    public EtapaIteracaoRepository() {
        etapas = new ArrayList<>();
    }

    public void salvarEtapa(EtapaIteracaoModel etapa) {
        etapas.add(etapa);
    }

    public List<EtapaIteracaoModel> obterEtapas() {
        return etapas;
    }
}
