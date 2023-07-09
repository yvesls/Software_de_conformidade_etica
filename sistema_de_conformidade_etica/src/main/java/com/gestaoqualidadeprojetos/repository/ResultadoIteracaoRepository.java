package com.gestaoqualidadeprojetos.repository;

import com.gestaoqualidadeprojetos.model.Classificacao;
import com.gestaoqualidadeprojetos.model.Peso;
import com.gestaoqualidadeprojetos.model.ResultadoIteracao;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Note102
 */
public class  ResultadoIteracaoRepository {
    private ArrayList<ResultadoIteracao> listaResultadosIteracao;
    
    public ResultadoIteracaoRepository() {
        generateAllMock();
    }
    
    public ResultadoIteracao getByIteracao(String iteracao) {
        return getMockByIteracao(iteracao);
    }
    
    public ArrayList<ResultadoIteracao> getAll() {
          return listaResultadosIteracao;
    }
    
    public void save(ResultadoIteracao resultadoIteracao) {
        listaResultadosIteracao.add(resultadoIteracao);
    }
    
    public void remove(ResultadoIteracao resultadoIteracao) {
        var list = new ArrayList<>(Arrays.asList(listaResultadosIteracao));
        list.removeIf(item -> item.equals(resultadoIteracao));
    }
    
    private ArrayList<ResultadoIteracao> generateAllMock() {
        listaResultadosIteracao = new ArrayList<ResultadoIteracao>();
        ArrayList<Classificacao> classificacoes = new ClassificacaoRepository().getAll();
        var resultadoIteracao1 = new ResultadoIteracao("A iteração não alcançou o esperado", LocalDateTime.now(), classificacoes.get(6), "Iteração 1");
        listaResultadosIteracao.add(resultadoIteracao1);
        return listaResultadosIteracao;
    }
    
    private ResultadoIteracao getMockByIteracao(String iteracao) {
        for(ResultadoIteracao ri : listaResultadosIteracao) {
            if(ri.getIteracao().equals(iteracao)) {
                return ri;
            }
        }
        return null;
    }
}
