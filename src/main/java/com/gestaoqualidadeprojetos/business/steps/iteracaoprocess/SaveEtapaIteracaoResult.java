/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gestaoqualidadeprojetos.business.steps.iteracaoprocess;

import com.gestaoqualidadeprojetos.business.steps.ProcessStep;
import com.gestaoqualidadeprojetos.model.ResultadoEtapaIteracao;
import com.gestaoqualidadeprojetos.repository.ResultadoEtapaIteracaoRepository;
import com.gestaoqualidadeprojetos.service.DashboardProcessContextService;
import java.util.List;

/**
 *
 * @author Note102
 */
public class SaveEtapaIteracaoResult extends ProcessStep {

    @Override
    public DashboardProcessContextService execute(DashboardProcessContextService context) throws RuntimeException, Exception {
        var resultados = (List<ResultadoEtapaIteracao>) context.get("resultadosEtapasIteracao");
        var repository = new ResultadoEtapaIteracaoRepository();
        for(ResultadoEtapaIteracao resultado : resultados) {
            repository.save(resultado);
        }
        System.out.println("ResultadosEtapasIteracao salvo com sucesso!");
        return next(context, true);
    }
    
}
