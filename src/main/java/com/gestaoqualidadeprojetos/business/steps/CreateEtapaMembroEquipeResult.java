/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gestaoqualidadeprojetos.business.steps;

import com.gestaoqualidadeprojetos.business.GeraClassificacao;
import com.gestaoqualidadeprojetos.model.EtapaIteracao;
import com.gestaoqualidadeprojetos.model.Iteracao;
import com.gestaoqualidadeprojetos.model.MembroEquipe;
import com.gestaoqualidadeprojetos.model.Pergunta;
import com.gestaoqualidadeprojetos.model.RespostaPergunta;
import com.gestaoqualidadeprojetos.model.ResultadoEtapaMembroEquipe;
import com.gestaoqualidadeprojetos.repository.MembroEquipeRepository;
import com.gestaoqualidadeprojetos.repository.RespostaPerguntaRepository;
import com.gestaoqualidadeprojetos.service.DashboardProcessContextService;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author Note102
 */
public class CreateEtapaMembroEquipeResult extends ProcessStep {

    @Override
    public DashboardProcessContextService execute(DashboardProcessContextService context) throws RuntimeException, Exception {
        var iteracao = (Iteracao) context.get("iteracao");
        var etapas = iteracao.getEtapas();
        var reposResPer = new RespostaPerguntaRepository();
        var repository = new MembroEquipeRepository();
        var membros = repository.getByProject(iteracao.getProjeto());

        var resultadoEtapaMembros = new ArrayList<ResultadoEtapaMembroEquipe>();

        for (MembroEquipe membro : membros) {
            var mapAcumulado = new HashMap<MembroEquipe, Double>();
            for (EtapaIteracao etapa : etapas) {
                System.out.println("-----------------------------------------" + "Etapa - " + etapa.getDescricao() + "-----------------------------------------");

                var qtdTotalPerguntas = 0.0;
                var rps = reposResPer.getByQuestionarioEtapa(etapa.getQuestionarioEtapa());

                for (RespostaPergunta rp : rps) {
                    if (rp.getResposta().getMembro().getEmail().equals(membro.getEmail())) {
                        if (rp.getResposta().getResposta()) {
                            if (mapAcumulado.get(membro) == null) {
                                mapAcumulado.put(membro, 1.0);
                            } else {
                                mapAcumulado.put(membro, mapAcumulado.get(membro) + 1);
                            }
                        }
                        qtdTotalPerguntas++;
                    }
                }
                var resultado = new ResultadoEtapaMembroEquipe();
                var geraClassificacao = new GeraClassificacao();
                System.out.println("membro: " + membro.getNome());
                var classificacao = geraClassificacao.gerar(mapAcumulado.get(membro), qtdTotalPerguntas);
                resultado.setMembro(membro);
                resultado.setClassificacao(classificacao);
                resultado.setEtapa(etapa);
                resultado.setIteracao(iteracao);
                resultadoEtapaMembros.add(resultado);
                qtdTotalPerguntas = 0.0;
                mapAcumulado.put(membro, 0.0);
            }
        }
        System.out.println(resultadoEtapaMembros);
        context.put("resultadosEtapaMembros", resultadoEtapaMembros);
        return next(context, true);
    }
}
