/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gestaoqualidadeprojetos.business.steps.iteracaoprocess;

import com.gestaoqualidadeprojetos.business.GeraClassificacao;
import com.gestaoqualidadeprojetos.business.steps.ProcessStep;
import com.gestaoqualidadeprojetos.model.Iteracao;
import com.gestaoqualidadeprojetos.model.MembroEquipe;
import com.gestaoqualidadeprojetos.model.ResultadoEtapaMembroEquipe;
import com.gestaoqualidadeprojetos.model.ResultadoMembroEquipe;
import com.gestaoqualidadeprojetos.repository.MembroEquipeRepository;
import com.gestaoqualidadeprojetos.service.DashboardProcessContextService;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Note102
 */
public class CreateMembroEquipeResult extends ProcessStep {

    @Override
    public DashboardProcessContextService execute(DashboardProcessContextService context) throws RuntimeException, Exception {
        var iteracao = (Iteracao) context.get("iteracao");
        var resultadosMembroEtapa = (List<ResultadoEtapaMembroEquipe>) context.get("resultadosEtapaMembros");
        var repository = new MembroEquipeRepository();
        var membros = repository.getByProject(iteracao.getProjeto());
        var resultadosMembro = new ArrayList<ResultadoMembroEquipe>();
        System.out.println("-------------------------------------- Criação do resultado por membro de equipe --------------------------------------");

        for (MembroEquipe membro : membros) {
            var somaPercentuais = 0;
            var totalQuantidade = 0;
            var listResultadosEtapa = new ArrayList<ResultadoEtapaMembroEquipe>();
            for (ResultadoEtapaMembroEquipe reme : resultadosMembroEtapa) {
                if (reme.getMembro().getEmail().equals(membro.getEmail())) {
                    somaPercentuais += reme.getClassificacao().getValorPercentualAtingido();
                    listResultadosEtapa.add(reme);
                    totalQuantidade++;
                }
            }
            var resultado = new ResultadoMembroEquipe();
            var geraClassificacao = new GeraClassificacao();
            var classificacao = geraClassificacao.gerar(somaPercentuais, totalQuantidade);
            resultado.setMembro(membro);
            resultado.setClassificacao(classificacao);
            resultado.setResultadosEtapa(listResultadosEtapa);
            resultado.setIteracao(iteracao);
            resultadosMembro.add(resultado);
            somaPercentuais = 0;
            totalQuantidade = 0;
        }
        context.put("resultadosMembros", resultadosMembro);
        return next(context, true);
    }

}
