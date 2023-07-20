/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gestaoqualidadeprojetos.business.steps;

import com.gestaoqualidadeprojetos.model.Iteracao;
import com.gestaoqualidadeprojetos.service.DashboardProcessContextService;

/**
 *
 * @author Note102
 */
public class ValidatesDateCurrent extends ProcessStep {

    @Override
    public DashboardProcessContextService execute(DashboardProcessContextService context) throws Exception {
        var dataFinalizacaoProcesso = (Iteracao) context.get("iteracao");
        if (dataFinalizacaoProcesso.getDataConclusao()!= null) {
            throw new Exception(String.format("Não é possível gerar o resultado pois a data de conclusão já existe!"));
        }
        System.out.println("passou pela validação de data");
        return next(context, true);
    }

}
