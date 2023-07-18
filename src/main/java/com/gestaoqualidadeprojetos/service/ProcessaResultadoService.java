
package com.gestaoqualidadeprojetos.service;

import com.gestaoqualidadeprojetos.business.ProcessaResultadoChain;
import com.gestaoqualidadeprojetos.business.ProcessaResultadoIteracao;
import com.gestaoqualidadeprojetos.business.ProcessaResultadoMembroEquipe;
import com.gestaoqualidadeprojetos.business.ProcessaResultadoProjeto;
import com.gestaoqualidadeprojetos.model.Iteracao;
import java.text.ParseException;

/**
 *
 * @author Note102
 */
public class ProcessaResultadoService {

    private ProcessaResultadoChain chain;

    public ProcessaResultadoService() {
        chain = new ProcessaResultadoChain(new ProcessaResultadoIteracao(),
                new ProcessaResultadoChain(new ProcessaResultadoMembroEquipe(),
                new ProcessaResultadoChain(new ProcessaResultadoProjeto(), null)));
    }

    public void processar(Iteracao iteracao) throws ParseException {
        chain.execute(iteracao);
    }
}
