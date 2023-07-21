/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gestaoqualidadeprojetos.business.steps.iteracaoprocess;

import com.gestaoqualidadeprojetos.business.GeraClassificacao;
import com.gestaoqualidadeprojetos.business.steps.ProcessStep;
import com.gestaoqualidadeprojetos.model.Iteracao;
import com.gestaoqualidadeprojetos.model.ResultadoEtapaIteracao;
import com.gestaoqualidadeprojetos.model.ResultadoIteracao;
import com.gestaoqualidadeprojetos.model.ResultadoMembroEquipe;
import com.gestaoqualidadeprojetos.service.DashboardProcessContextService;
import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author Note102
 */
public class CreateIteracaoResult extends ProcessStep {

    @Override
    public DashboardProcessContextService execute(DashboardProcessContextService context) throws RuntimeException, Exception {
        var iteracao = (Iteracao) context.get("iteracao");
        var resultadosIteracaoEtapa = (ArrayList<ResultadoEtapaIteracao>) context.get("resultadosEtapasIteracao");
        var resultadosMembro = (ArrayList<ResultadoMembroEquipe>) context.get("resultadosMembros");
        var resultadoIteracao = new ResultadoIteracao();
        System.out.println("-------------------------------------- Criação do resultado da iteração --------------------------------------");

        var somaPercentuais = 0;
        var totalQuantidade = 0;
        for (ResultadoEtapaIteracao rei : resultadosIteracaoEtapa) {
            somaPercentuais += rei.getClassificacao().getValorPercentualAtingido();
            totalQuantidade++;
        }
        var resultado = new ResultadoIteracao();
        var geraClassificacao = new GeraClassificacao();
        var classificacao = geraClassificacao.gerar(somaPercentuais, totalQuantidade);
        resultado.setClassificacao(classificacao);
        resultado.setResultadosEtapa(resultadosIteracaoEtapa);
        resultado.setIteracao(iteracao);
        resultado.setDataResultado(LocalDate.now());
        resultado.setResultadosMembroEquipe(resultadosMembro);
        resultadoIteracao = resultado;
        System.out.println(resultado);
        context.put("resultadoIteracao", resultadoIteracao);
        return next(context, true);
    }
}
