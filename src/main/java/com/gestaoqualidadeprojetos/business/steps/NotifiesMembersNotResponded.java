/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gestaoqualidadeprojetos.business.steps;

import com.gestaoqualidadeprojetos.model.MembrosNotificacao;
import com.gestaoqualidadeprojetos.service.DashboardProcessContextService;

/**
 *
 * @author Note102
 */
public class NotifiesMembersNotResponded extends ProcessStep {

    @Override
    public DashboardProcessContextService execute(DashboardProcessContextService context) throws Exception {
        var membrosNotificacao = (MembrosNotificacao) context.get("membrosNotificacao");
        if(membrosNotificacao.getMembros().size() != 0) {
            // realiza o processo envio de notificação
        }
        System.out.println("membros necessitam ser notificados:" + membrosNotificacao);
        System.out.println("passou pela envio de notificacao");
        return next(context, false);
    }
    
}
