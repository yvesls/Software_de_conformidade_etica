/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gestaoqualidadeprojetos.business.steps;

import com.gestaoqualidadeprojetos.service.DashboardProcessContextService;
import java.time.LocalDate;

/**
 *
 * @author Note102
 */
public class ValidatesDateCurrent extends ProcessStep {

    @Override
    public DashboardProcessContextService execute(DashboardProcessContextService context) throws Exception {
        var dataFinalizacaoProcesso = (LocalDate) context.get((String) args[0]);
        if (dataFinalizacaoProcesso != null) {
            throw new Exception(String.format("Não é possível gerar o resultado pois a %s já existe!", args[0]));
        }
        return next(context, true);
    }

}
