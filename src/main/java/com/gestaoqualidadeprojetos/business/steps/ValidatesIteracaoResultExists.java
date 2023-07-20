/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gestaoqualidadeprojetos.business.steps;

import com.gestaoqualidadeprojetos.model.Iteracao;
import com.gestaoqualidadeprojetos.repository.ResultadoIteracaoRepository;
import com.gestaoqualidadeprojetos.service.DashboardProcessContextService;

/**
 *
 * @author Note102
 */
public class ValidatesIteracaoResultExists extends ProcessStep {

    @Override
    public DashboardProcessContextService execute(DashboardProcessContextService context) throws RuntimeException, Exception {
        var iteracao = (Iteracao) context.get("iteracao");
        var repository = new ResultadoIteracaoRepository();
        if(repository.getByIteracao(iteracao) == null) {
            throw new RuntimeException("Não é possível gerar o resultado pois já existe resultado para esta iteração!");
        }
        System.out.println("passou pela validação resultado não gerado para a iteração atual");
        return next(context, true);
    }
    
}
