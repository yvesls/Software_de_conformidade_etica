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
public abstract class ProcessStep {
    
    protected ProcessStep nextStep;
    protected Object[] args;

    public ProcessStep(Object... args) {
        this.args = args;
    }

    public abstract DashboardProcessContextService execute(DashboardProcessContextService context) throws RuntimeException, Exception;

    public void setNextStep(ProcessStep next) {
        this.nextStep = next;
    }

    protected DashboardProcessContextService next(DashboardProcessContextService context, Object actualResult) throws RuntimeException, Exception {
        context.addProcessResult(actualResult);
        return this.nextStep != null ? nextStep.execute(context) : context;
    }
}
