/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gestaoqualidadeprojetos.business.steps;

import com.gestaoqualidadeprojetos.model.Iteracao;
import com.gestaoqualidadeprojetos.model.ResultadoEtapaMembroEquipe;
import com.gestaoqualidadeprojetos.service.DashboardProcessContextService;
import java.util.List;

/**
 *
 * @author Note102
 */
public class CreateEtapaIteracaoResult extends ProcessStep {

    @Override
    public DashboardProcessContextService execute(DashboardProcessContextService context) throws RuntimeException, Exception {
        var iteracao = (Iteracao) context.get("iteracao");
        var resultadosMembroEtapa = (List<ResultadoEtapaMembroEquipe>) context.get("resultadosEtapaMembros");
        
        for (ResultadoEtapaMembroEquipe reme : resultadosMembroEtapa) {
            System.out.println(reme);
        }
        
        return null;
    }
    
}
