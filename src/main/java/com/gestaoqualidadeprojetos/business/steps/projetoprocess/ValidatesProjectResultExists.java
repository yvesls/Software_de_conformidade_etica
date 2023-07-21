/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gestaoqualidadeprojetos.business.steps.projetoprocess;

import com.gestaoqualidadeprojetos.business.steps.ProcessStep;
import com.gestaoqualidadeprojetos.model.Projeto;
import com.gestaoqualidadeprojetos.repository.ResultadoProjetoRepository;
import com.gestaoqualidadeprojetos.service.DashboardProcessContextService;

/**
 *
 * @author Note102
 */
public class ValidatesProjectResultExists extends ProcessStep {

    @Override
    public DashboardProcessContextService execute(DashboardProcessContextService context) throws RuntimeException, Exception {
        var projeto = (Projeto) context.get("projeto");
        var repository = new ResultadoProjetoRepository();
        if(repository.getByProjeto(projeto) != null) {
            throw new RuntimeException("Não é possível gerar o resultado pois já existe resultado para este projeto!");
        }
        System.out.println("passou pela validação: resultado não gerado para o projeto atual");
        return next(context, true);
    }
}
