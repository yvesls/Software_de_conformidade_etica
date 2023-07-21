/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gestaoqualidadeprojetos.business.steps.iteracaoprocess;

import com.gestaoqualidadeprojetos.business.steps.ProcessStep;
import com.gestaoqualidadeprojetos.model.ResultadoIteracao;
import com.gestaoqualidadeprojetos.repository.ResultadoIteracaoRepository;
import com.gestaoqualidadeprojetos.service.DashboardProcessContextService;

/**
 *
 * @author Note102
 */
public class SaveIteracaoResult extends ProcessStep {

    @Override
    public DashboardProcessContextService execute(DashboardProcessContextService context) throws RuntimeException, Exception {
       var resultado = (ResultadoIteracao) context.get("resultadoIteracao");
        var repository = new ResultadoIteracaoRepository();
        repository.save(resultado);
        return next(context, resultado);
    }
    
}
