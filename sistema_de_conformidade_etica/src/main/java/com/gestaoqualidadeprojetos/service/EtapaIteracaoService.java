
package com.gestaoqualidadeprojetos.service;

import com.gestaoqualidadeprojetos.mode.EtapaIteracao;
import com.gestaoqualidadeprojetos.mode.EtapaIteracaoModel;
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
