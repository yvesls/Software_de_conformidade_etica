
package com.gestaoqualidadeprojetos.service;

import com.gestaoqualidadeprojetos.model.EtapaIteracaoModel;
import com.gestaoqualidadeprojetos.repository.EtapaIteracaoRepository;
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
