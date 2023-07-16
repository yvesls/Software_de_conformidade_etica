/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gestaoqualidadeprojetos.business;

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
