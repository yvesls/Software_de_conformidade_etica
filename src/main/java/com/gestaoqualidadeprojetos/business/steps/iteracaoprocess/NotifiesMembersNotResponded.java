/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gestaoqualidadeprojetos.business.steps.iteracaoprocess;

import com.gestaoqualidadeprojetos.business.steps.ProcessStep;
import com.gestaoqualidadeprojetos.model.MembrosNotificacao;
import com.gestaoqualidadeprojetos.service.DashboardProcessContextService;
import java.util.ArrayList;

/**
 *
 * @author Note102
 */
public class NotifiesMembersNotResponded extends ProcessStep {

    @Override
    public DashboardProcessContextService execute(DashboardProcessContextService context) throws RuntimeException, Exception {
        var membrosNotificacao = (ArrayList<MembrosNotificacao>) context.get("membrosNotificacao");
        // realiza o processo envio de notificação
        
        System.out.println("passou pela envio de notificacao");
        return next(context, false);
    }
    
}
