/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gestaoqualidadeprojetos.business.steps.projetoprocess;

import com.gestaoqualidadeprojetos.business.steps.ProcessStep;
import com.gestaoqualidadeprojetos.model.Projeto;
import com.gestaoqualidadeprojetos.service.DashboardProcessContextService;

/**
 *
 * @author Note102
 */
public class ValidatesDataCurrentProject extends ProcessStep {

    @Override
    public DashboardProcessContextService execute(DashboardProcessContextService context) throws RuntimeException, Exception {
        var projeto = (Projeto) context.get("projeto");
        if (projeto.getDataConclusao() != null) {
            throw new RuntimeException(String.format("Não é possível gerar o resultado pois a data de conclusão já existe!"));
        }
        System.out.println("passou pela validação de data");
        return next(context, true);
    }
}
