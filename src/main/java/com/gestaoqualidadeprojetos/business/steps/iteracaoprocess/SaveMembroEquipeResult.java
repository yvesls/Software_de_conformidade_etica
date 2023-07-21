/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gestaoqualidadeprojetos.business.steps.iteracaoprocess;

import com.gestaoqualidadeprojetos.business.steps.ProcessStep;
import com.gestaoqualidadeprojetos.model.ResultadoMembroEquipe;
import com.gestaoqualidadeprojetos.repository.ResultadoMembroEquipeRepository;
import com.gestaoqualidadeprojetos.service.DashboardProcessContextService;
import java.util.List;

/**
 *
 * @author Note102
 */
public class SaveMembroEquipeResult extends ProcessStep {

    @Override
    public DashboardProcessContextService execute(DashboardProcessContextService context) throws RuntimeException, Exception {
        var resultados = (List<ResultadoMembroEquipe>) context.get("resultadosMembros");
        var repository = new ResultadoMembroEquipeRepository();
        for(ResultadoMembroEquipe resultado : resultados) {
            repository.save(resultado);
        }
        System.out.println("ResultadoMembroEquipe Salvo com sucesso!");
        return next(context, true);
    }
    
}
