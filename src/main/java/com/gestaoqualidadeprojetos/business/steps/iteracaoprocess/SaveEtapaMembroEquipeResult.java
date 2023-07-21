/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gestaoqualidadeprojetos.business.steps.iteracaoprocess;

import com.gestaoqualidadeprojetos.business.steps.ProcessStep;
import com.gestaoqualidadeprojetos.model.ResultadoEtapaMembroEquipe;
import com.gestaoqualidadeprojetos.repository.ResultadoEtapaMembroEquipeRepository;
import com.gestaoqualidadeprojetos.service.DashboardProcessContextService;
import java.util.List;

/**
 *
 * @author Note102
 */
public class SaveEtapaMembroEquipeResult extends ProcessStep {

    @Override
    public DashboardProcessContextService execute(DashboardProcessContextService context) throws RuntimeException, Exception {
        var resultados = (List<ResultadoEtapaMembroEquipe>) context.get("resultadosEtapaMembros");
        var repository = new ResultadoEtapaMembroEquipeRepository();
        for(ResultadoEtapaMembroEquipe resultado : resultados) {
            repository.save(resultado);
        }
        System.out.println("ResultadoEtapaMembroEquipe Salvo com sucesso!");
        return next(context, true);
    }
}
