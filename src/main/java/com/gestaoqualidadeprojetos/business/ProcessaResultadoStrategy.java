
package com.gestaoqualidadeprojetos.business;

import com.gestaoqualidadeprojetos.model.Resultado;
import com.gestaoqualidadeprojetos.model.Iteracao;

/**
 *
 * @author Note102
 */
public interface ProcessaResultadoStrategy {
    Resultado processar(Iteracao iteracao);
}
