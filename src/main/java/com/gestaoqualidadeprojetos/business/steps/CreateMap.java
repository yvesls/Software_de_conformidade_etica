/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gestaoqualidadeprojetos.business.steps;

import com.gestaoqualidadeprojetos.service.DashboardProcessContextService;

/**
 *
 * @author Note102
 */
public class CreateMap extends ProcessStep {

    public CreateMap(Object... args) {
        super(args);
    }

    @Override
    public DashboardProcessContextService execute(DashboardProcessContextService context) throws RuntimeException, Exception {
        context.encapsulate((String) args[0]);
        return next(context, true);
    }

}
