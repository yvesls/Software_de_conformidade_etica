
package com.gestaoqualidadeprojetos.business;

import com.gestaoqualidadeprojetos.model.Iteracao;

/**
 *
 * @author Note102
 */
public class ProcessaResultadoChain {
    private ProcessaResultadoChain next;
    private ProcessaResultadoStrategy metodo;
    
    public ProcessaResultadoChain(ProcessaResultadoStrategy metodo) {
        this.metodo = metodo;
    }
    
     public ProcessaResultadoChain(ProcessaResultadoStrategy metodo, ProcessaResultadoChain next) {
        this.metodo = metodo;
        this.next = next;
    }

    public void execute(Iteracao iteracao) {
	metodo.processar(iteracao);
        if (next != null)
            next.execute(iteracao);
	else
            return;
    }
}
