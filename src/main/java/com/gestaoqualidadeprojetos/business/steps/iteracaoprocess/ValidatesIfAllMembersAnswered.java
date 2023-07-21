/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gestaoqualidadeprojetos.business.steps.iteracaoprocess;

import com.gestaoqualidadeprojetos.business.steps.ProcessStep;
import com.gestaoqualidadeprojetos.model.EtapaIteracao;
import com.gestaoqualidadeprojetos.model.Iteracao;
import com.gestaoqualidadeprojetos.model.MembroEquipe;
import com.gestaoqualidadeprojetos.model.MembrosNotificacao;
import com.gestaoqualidadeprojetos.model.RespostaPergunta;
import com.gestaoqualidadeprojetos.repository.MembroEquipeRepository;
import com.gestaoqualidadeprojetos.repository.RespostaPerguntaRepository;
import com.gestaoqualidadeprojetos.service.DashboardProcessContextService;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author Note102
 */
public class ValidatesIfAllMembersAnswered extends ProcessStep {

    @Override
    public DashboardProcessContextService execute(DashboardProcessContextService context) throws RuntimeException, Exception {
        var iteracao = (Iteracao) context.get("iteracao");
        var etapas = iteracao.getEtapas();
        var repository = new RespostaPerguntaRepository();
        var reposMembro = new MembroEquipeRepository();
        var membrosRepos = reposMembro.getByProject(iteracao.getProjeto());

        var membrosNotficacao = new ArrayList<MembrosNotificacao>();

        for (EtapaIteracao etapa : etapas) {
            var rps = repository.getByQuestionarioEtapa(etapa.getQuestionarioEtapa());
            if (!etapa.getQuestionarioEtapa().isIsFinalizado()) {
                var qtdResMembro = new HashMap<MembroEquipe, Integer>();
                var qtdTotalRes = etapa.getQuestionarioEtapa().getPerguntas().size();
                for (RespostaPergunta rp : rps) {
                    for (MembroEquipe membro : membrosRepos) {
                        if (membro.getEmail().equals(rp.getResposta().getMembro().getEmail())) {
                            if(qtdResMembro.get(membro) == null){
                                qtdResMembro.put(membro, 1);
                            }else {
                                qtdResMembro.put(membro, qtdResMembro.get(membro)+1);
                            }
                        }else if(qtdResMembro.get(membro) == null) {
                            qtdResMembro.put(membro, 0);
                        }
                    }
                }
                var chaves = qtdResMembro.keySet();
                for (MembroEquipe membro : chaves) {
                    if (qtdResMembro.get(membro) != qtdTotalRes) {
                        membrosNotficacao.add(new MembrosNotificacao(membro, String.format("Responda o questionário"), etapa));
                    }
                }
                
            }
        }
        System.out.println("passou pela validação de todos os questionários respondidos");
        context.put("membrosNotificacao", membrosNotficacao);
        return next(context, true);
    }
}
