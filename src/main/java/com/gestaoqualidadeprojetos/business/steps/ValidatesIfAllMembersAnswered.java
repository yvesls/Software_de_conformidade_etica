/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gestaoqualidadeprojetos.business.steps;

import com.gestaoqualidadeprojetos.model.EtapaIteracao;
import com.gestaoqualidadeprojetos.model.Iteracao;
import com.gestaoqualidadeprojetos.model.MembroEquipe;
import com.gestaoqualidadeprojetos.model.MembrosNotificacao;
import com.gestaoqualidadeprojetos.model.Pergunta;
import com.gestaoqualidadeprojetos.service.DashboardProcessContextService;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Note102
 */
public class ValidatesIfAllMembersAnswered extends ProcessStep {

    @Override
    public DashboardProcessContextService execute(DashboardProcessContextService context) throws Exception {
        var iteracao = (Iteracao) context.get("iteracao");
        var etapas = iteracao.getEtapas();
        ArrayList<MembroEquipe> membros = new ArrayList<>();
        for (EtapaIteracao etapa : etapas) {
            var perguntas = etapa.getQuestionarioEtapa().getPerguntas();
            for (Pergunta pergunta : perguntas) {
                if (pergunta.getResposta() == null) {
                    if(membros.size() == 0) {
                        membros.add(pergunta.getResposta().getMembro());
                    }
                    for (MembroEquipe membro : membros) {
                        if (membro.getEmail() != pergunta.getResposta().getMembro().getEmail()) {
                            membros.add(pergunta.getResposta().getMembro());
                        }
                    }
                }
            }
        }
        var membrosNotificacao = new MembrosNotificacao(membros, String.format("Responda o questionário até: %s", iteracao.getPrevisaoConclusao()));
        context.put("membrosNotificacao", membrosNotificacao);
        return next(context, membros);
    }
}
