/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gestaoqualidadeprojetos.business.steps.iteracaoprocess;

import com.gestaoqualidadeprojetos.business.GeraClassificacao;
import com.gestaoqualidadeprojetos.business.steps.ProcessStep;
import com.gestaoqualidadeprojetos.model.EtapaIteracao;
import com.gestaoqualidadeprojetos.model.Iteracao;
import com.gestaoqualidadeprojetos.model.ResultadoEtapaIteracao;
import com.gestaoqualidadeprojetos.model.ResultadoEtapaMembroEquipe;
import com.gestaoqualidadeprojetos.service.DashboardProcessContextService;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Note102
 */
public class CreateEtapaIteracaoResult extends ProcessStep {

    @Override
    public DashboardProcessContextService execute(DashboardProcessContextService context) throws RuntimeException, Exception {
        var iteracao = (Iteracao) context.get("iteracao");
        var resultadosMembroEtapa = (List<ResultadoEtapaMembroEquipe>) context.get("resultadosEtapaMembros");
        var etapas = iteracao.getEtapas();
        var resultadosEtapas = new ArrayList<ResultadoEtapaIteracao>();
        System.out.println("-------------------------------------- Criação do resultado da etapa para iteração --------------------------------------");
        for (EtapaIteracao etapa : etapas) {
            System.out.println("----------------------------------------- " + "Etapa - " + etapa.getDescricao() + " -----------------------------------------");
            var somaPercentuais = 0;
            var totalQuantidade = 0;
            for (ResultadoEtapaMembroEquipe reme : resultadosMembroEtapa) {
                if (reme.getEtapa().getDescricao().equals(etapa.getDescricao())) {
                    somaPercentuais += reme.getClassificacao().getValorPercentualAtingido();
                    totalQuantidade++;
                }
            }
            var resultado = new ResultadoEtapaIteracao();
            var geraClassificacao = new GeraClassificacao();
            var classificacao = geraClassificacao.gerar(somaPercentuais, totalQuantidade);
            resultado.setClassificacao(classificacao);
            resultado.setEtapa(etapa);
            resultado.setIteracao(iteracao);
            resultadosEtapas.add(resultado);
            System.out.println(resultado);
            somaPercentuais = 0;
            totalQuantidade = 0;
        }
        context.put("resultadosEtapasIteracao", resultadosEtapas);
        return next(context, true);
    }

}
