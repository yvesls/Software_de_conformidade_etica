/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gestaoqualidadeprojetos.business;

import com.gestaoqualidadeprojetos.model.Classificacao;
import com.gestaoqualidadeprojetos.model.ClassificacaoBase;
import com.gestaoqualidadeprojetos.repository.ClassificacaoBaseRepository;
import java.time.LocalDateTime;

/**
 *
 * @author Note102
 */
public class GeraClassificacao {
    
    public Classificacao gerar(Double qtdRespostasSim, Double qtdTotalRespostas) {
        var classificacao = new Classificacao();
        var repository = new ClassificacaoBaseRepository();
        var classificacoesBase = repository.getAll();
        System.out.println("qtdRespostasSim: " + qtdRespostasSim);
        System.out.println("qtdTotalRespostas: " + qtdTotalRespostas);
        var valorPerAtingido = (qtdRespostasSim/qtdTotalRespostas)*100;
        System.out.println("valorPerAtingido: " + valorPerAtingido);
        
        for(ClassificacaoBase classBase : classificacoesBase) {
            if(classBase.getValorPercentualMinimo() <= valorPerAtingido && valorPerAtingido <= classBase.getValorPercentualMaximo()) {
                classificacao.setClassificacaoAtingida(classBase.getFaixaClassificacao());
                classificacao.setDataCriacao(LocalDateTime.now());
                classificacao.setValorPercentualAtingido(valorPerAtingido);
                classificacao.setDescricao(classBase.getDescricao());
            }
        }
        System.out.println("Classificacao: " + classificacao);
        return classificacao;
    }
}
