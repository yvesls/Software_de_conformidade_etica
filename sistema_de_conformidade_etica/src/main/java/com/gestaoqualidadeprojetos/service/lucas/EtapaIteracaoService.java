
package com.gestaoqualidadeprojetos.service.lucas;

import com.gestaoqualidadeprojetos.model.lucas.EtapaIteracaoModel;
import com.gestaoqualidadeprojetos.repository.lucas.EtapaIteracaoRepository;
import java.util.List;

/**
 *
 * @author lucas
 */
public class EtapaIteracaoService {
     private EtapaIteracaoRepository etapaRepository;

    public EtapaIteracaoService() {
        etapaRepository = new EtapaIteracaoRepository();
    }

    public void salvarEtapa(EtapaIteracaoModel etapa) {
        etapaRepository.salvarEtapa(etapa);
    }

    public List<EtapaIteracaoModel> obterEtapas() {
        return etapaRepository.obterEtapas();
    }
}
