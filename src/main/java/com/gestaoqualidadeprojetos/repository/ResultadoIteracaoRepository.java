package com.gestaoqualidadeprojetos.repository;

import com.gestaoqualidadeprojetos.model.Classificacao;
import com.gestaoqualidadeprojetos.model.Iteracao;
import com.gestaoqualidadeprojetos.model.ResultadoIteracao;
import java.time.LocalDate;
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
    
    public ResultadoIteracao getByIteracao(Iteracao iteracao) {
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
        LocalDate dataInicio = LocalDate.parse("2023-07-01T12:30:54");
        LocalDate dataFim = LocalDate.parse("2023-08-01T12:30:54");
        Iteracao cascata = new Iteracao("Iteração Única", dataInicio, dataFim, "ABERTA");
        //var resultadoIteracao1 = new ResultadoIteracao("A iteração não alcançou o esperado", LocalDateTime.now(), classificacoes.get(6), cascata));
        //listaResultadosIteracao.add(resultadoIteracao1);
        return listaResultadosIteracao;
    }
    
    private ResultadoIteracao getMockByIteracao(Iteracao iteracao) {
        for(ResultadoIteracao ri : listaResultadosIteracao) {
            if(ri.getIteracao().equals(iteracao)) {
                return ri;
            }
        }
        return null;
    }
}
