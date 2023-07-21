/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gestaoqualidadeprojetos.business.steps.projetoprocess;

import com.gestaoqualidadeprojetos.business.GeraClassificacao;
import com.gestaoqualidadeprojetos.business.steps.ProcessStep;
import com.gestaoqualidadeprojetos.model.Projeto;
import com.gestaoqualidadeprojetos.model.ResultadoIteracao;
import com.gestaoqualidadeprojetos.model.ResultadoProjeto;
import com.gestaoqualidadeprojetos.repository.ResultadoIteracaoRepository;
import com.gestaoqualidadeprojetos.service.DashboardProcessContextService;
import java.time.LocalDateTime;

/**
 *
 * @author Note102
 */
public class CreateProjetoResult extends ProcessStep {

    @Override
    public DashboardProcessContextService execute(DashboardProcessContextService context) throws RuntimeException, Exception {
        var projeto = (Projeto) context.get("projeto");
        var repository = new ResultadoIteracaoRepository();
        var resultadosIteracoes = repository.getByProjeto(projeto);
        var resultadoProjeto = new ResultadoProjeto();
        System.out.println("-------------------------------------- Criação do resultado do projeto --------------------------------------");

        var somaPercentuais = 0;
        var totalQuantidade = 0;
        for(ResultadoIteracao ri : resultadosIteracoes) {
            somaPercentuais += ri.getClassificacao().getValorPercentualAtingido();
            totalQuantidade++;
        }
        var resultado = new ResultadoProjeto();
        var geraClassificacao = new GeraClassificacao();
        var classificacao = geraClassificacao.gerar(somaPercentuais, totalQuantidade);
        resultado.setClassificacao(classificacao);
        resultado.setResultadosIteracao(resultadosIteracoes);
        resultado.setProjeto(projeto);
        resultado.setDataResultado(LocalDateTime.now());
        resultadoProjeto = resultado;
        System.out.println(resultado);
        context.put("resultadoProjeto", resultadoProjeto);
        return null;
    }
    
}
