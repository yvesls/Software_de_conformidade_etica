/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gestaoqualidadeprojetos.business.steps.projetoprocess;

import com.gestaoqualidadeprojetos.business.steps.ProcessStep;
import com.gestaoqualidadeprojetos.model.Iteracao;
import com.gestaoqualidadeprojetos.model.Projeto;
import com.gestaoqualidadeprojetos.repository.ResultadoIteracaoRepository;
import com.gestaoqualidadeprojetos.service.DashboardProcessContextService;

/**
 *
 * @author Note102
 */
public class ValidatesAllCompletedIterations extends ProcessStep {

    @Override
    public DashboardProcessContextService execute(DashboardProcessContextService context) throws RuntimeException, Exception {
        var projeto = (Projeto) context.get("projeto");
        var iteracoes = projeto.getIteracoes();
        var repository = new ResultadoIteracaoRepository();
        
        for (Iteracao iteracao : iteracoes) {
            var resultadoIteracao = repository.getByIteracao(iteracao);
            if(resultadoIteracao == null) {
                throw new RuntimeException(String.format("Não é possível gerar o resultado pois há iterações não finalizadas ainda!"));
            }
        }
        System.out.println("passou pela validação de todas as iterações finalizadas");
        return next(context, true);
    }
    
}
