/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gestaoqualidadeprojetos.business;

import com.gestaoqualidadeprojetos.model.Classificacao;
import com.gestaoqualidadeprojetos.model.ClassificacaoBase;
import com.gestaoqualidadeprojetos.repository.ClassificacaoBaseRepository;
import java.text.DecimalFormat;
import java.time.LocalDateTime;

/**
 *
 * @author Note102
 */
public class GeraClassificacao {
    
    public Classificacao gerar(Double qtdRespostasSim, Double qtdTotalRespostas) throws RuntimeException, Exception {
        Classificacao classificacao = null;
        var repository = new ClassificacaoBaseRepository();
        var classificacoesBase = repository.getAll();
        DecimalFormat formato = new DecimalFormat("#.0");
        System.out.println("qtdRespostasSim: " + qtdRespostasSim);
        System.out.println("qtdTotalRespostas: " + qtdTotalRespostas);
        String valorPerAtingidoString = formato.format((qtdRespostasSim/qtdTotalRespostas)*100);
        var valorPerAtingido = Double.parseDouble(valorPerAtingidoString.replace(",", "."));
        System.out.println("valorPerAtingido: " + valorPerAtingido);
        
        for(ClassificacaoBase classBase : classificacoesBase) {
            if(classBase.getValorPercentualMinimo() <= valorPerAtingido && valorPerAtingido <= classBase.getValorPercentualMaximo()) {
                classificacao = new Classificacao();
                classificacao.setClassificacaoAtingida(classBase.getFaixaClassificacao());
                classificacao.setDataCriacao(LocalDateTime.now());
                classificacao.setValorPercentualAtingido(valorPerAtingido);
                classificacao.setDescricao(classBase.getDescricao());
                break;
            }
        }
        
        
        System.out.println("Classificacao Atingida: " + classificacao);
        return classificacao;
    }
    
    public Classificacao gerar(Integer qtdRespostasSim, Integer qtdTotalRespostas) throws RuntimeException, Exception {
        Classificacao classificacao = null;
        var repository = new ClassificacaoBaseRepository();
        var classificacoesBase = repository.getAll();
        DecimalFormat formato = new DecimalFormat("#.0");
        String valorPerAtingidoString = formato.format((qtdRespostasSim/qtdTotalRespostas));
        var valorPerAtingido = Double.parseDouble(valorPerAtingidoString.replace(",", "."));
        System.out.println("valorPerAtingido: " + valorPerAtingido);
        
        for(ClassificacaoBase classBase : classificacoesBase) {
            if(classBase.getValorPercentualMinimo() <= valorPerAtingido && valorPerAtingido <= classBase.getValorPercentualMaximo()) {
                classificacao = new Classificacao();
                classificacao.setClassificacaoAtingida(classBase.getFaixaClassificacao());
                classificacao.setDataCriacao(LocalDateTime.now());
                classificacao.setValorPercentualAtingido(valorPerAtingido);
                classificacao.setDescricao(classBase.getDescricao());
                break;
            }
        }
        System.out.println("Classificacao Atingida: " + classificacao);
        return classificacao;
    }
}
