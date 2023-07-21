/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gestaoqualidadeprojetos.business.steps.iteracaoprocess;

import com.gestaoqualidadeprojetos.business.steps.ProcessStep;
import com.gestaoqualidadeprojetos.model.Iteracao;
import com.gestaoqualidadeprojetos.service.DashboardProcessContextService;

/**
 *
 * @author Note102
 */
public class ValidatesDateCurrentIteracao extends ProcessStep {

    @Override
    public DashboardProcessContextService execute(DashboardProcessContextService context) throws RuntimeException, Exception {
        var iteracao = (Iteracao) context.get("iteracao");
        if (iteracao.getDataConclusao()!= null) {
            throw new RuntimeException(String.format("Não é possível gerar o resultado pois a data de conclusão já existe!"));
        }
        System.out.println("passou pela validação de data");
        return next(context, true);
    }

}
