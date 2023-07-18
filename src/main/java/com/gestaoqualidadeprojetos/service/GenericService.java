/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gestaoqualidadeprojetos.service;

import com.gestaoqualidadeprojetos.business.steps.ProcessStep;

/**
 *
 * @author Note102
 */
public class GenericService {

    public static Object run(ProcessStep startProcess, DashboardProcessContextService initialContext) {
        try {
            var result = startProcess.execute(initialContext);
            return result.getProcessResult();
        } catch (Exception e) {
            return "Error: " + e.getMessage();
        }
    }
}
