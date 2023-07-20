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
import com.gestaoqualidadeprojetos.model.ResultadoEtapaMembroEquipe;
import com.gestaoqualidadeprojetos.repository.MembroEquipeRepository;
import com.gestaoqualidadeprojetos.service.DashboardProcessContextService;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author Note102
 */
public class CreateEtapaMembroEquipeResult extends ProcessStep {

    @Override
    public DashboardProcessContextService execute(DashboardProcessContextService context) throws Exception {
        var iteracao = (Iteracao) context.get("iteracao");
        var etapas = iteracao.getEtapas();
        var repository = new MembroEquipeRepository();
        var membros = repository.getByProject(iteracao.getProjeto());
        var resultadoEtapaMembros = new ArrayList<ResultadoEtapaMembroEquipe>();
        
        
        for(MembroEquipe membro : membros) {
            var mapAcumulado = new HashMap<MembroEquipe, Double>();
            var resultado = new ResultadoEtapaMembroEquipe();
            var qtdPerguntas = 0.0;
            
            for (EtapaIteracao etapa : etapas) {
                System.out.println("etapa: " + etapa);
                var perguntas = etapa.getQuestionarioEtapa().getPerguntas();
                for (Pergunta pergunta : perguntas) {
                    qtdPerguntas++;
                    /*if (pergunta.getResposta().getMembro().getNome().equals(membro.getNome())) {;
                        if (pergunta.getResposta().getResposta()) {
                            if (!mapAcumulado.containsKey(membro)) {
                                mapAcumulado.put(membro, 1.0);
                            }
                            mapAcumulado.put(membro, mapAcumulado.get(membro) + 1);
                        }
                    }*/
                }
                var geraClassificacao = new GeraClassificacao();
                var classificacao = geraClassificacao.gerar(mapAcumulado.get(membro), qtdPerguntas);
                
                resultado.setMembro(membro);
                resultado.setClassificacao(classificacao);
                resultado.setEtapa(etapa);
                resultado.setIteracao(iteracao);
                resultadoEtapaMembros.add(resultado);
                //System.out.println(resultadoEtapaMembros);
            }
        }
        context.put("resultadosEtapaMembros", resultadoEtapaMembros);
        return next(context, true);
    }
}
