/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gestaoqualidadeprojetos.business;

import com.gestaoqualidadeprojetos.model.Resultado;
import com.gestaoqualidadeprojetos.model.Iteracao;

/**
 *
 * @author Note102
 */
public interface ProcessaResultadoStrategy {
    void processar(Iteracao iteracao);
    void salvarResultado(Resultado resultado);
}
