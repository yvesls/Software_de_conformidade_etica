
package com.gestaoqualidadeprojetos.service;

import com.gestaoqualidadeprojetos.model.EtapaIteracao;
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

    public void salvarEtapa(EtapaIteracao etapa) {
        etapaRepository.adicionarEtapa(etapa);
    }

    public List<EtapaIteracao> obterEtapas() {
        return etapaRepository.listarEtapas();
    }
}
