/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gestaoqualidadeprojetos.repository;

import com.gestaoqualidadeprojetos.model.Classificacao;
import com.gestaoqualidadeprojetos.model.enums.ClassificacaoEnum;
import java.time.LocalDateTime;
import java.util.ArrayList;

/**
 *
 * @author Note102
 */
public class ClassificacaoRepository {
    private ArrayList<Classificacao> listaClassificacao;
    
    public ClassificacaoRepository(){
        generateAllMock();
    }
    
    public Classificacao getByFaixa(ClassificacaoEnum faixa) {
        return getMockByFaixa(faixa);
    }
    
    public  ArrayList<Classificacao> getAll() {
        return listaClassificacao;
    }
    
    private ArrayList<Classificacao> generateAllMock() {
        listaClassificacao = new ArrayList<Classificacao>();
        // cliente 
        var cb1 = new Classificacao("Atingiu o mínimo requerido!", LocalDateTime.now(), 0.778, ClassificacaoEnum.B);
        // gerente
        var cb2 = new Classificacao("Abaixo do mínimo necessário!", LocalDateTime.now(), 0.617, ClassificacaoEnum.C);
        // analista
        var cb3 = new Classificacao("Bem abaixo do esperado!", LocalDateTime.now(), 0.585, ClassificacaoEnum.D);
        // desenvolvedor
        var cb4 = new Classificacao("Bem abaixo do esperado!", LocalDateTime.now(), 0.525, ClassificacaoEnum.D);
        // arquiteto
        var cb5 = new Classificacao("Bem abaixo do esperado!", LocalDateTime.now(), 0.574, ClassificacaoEnum.D);
        // líder
        var cb6 = new Classificacao("Bem abaixo do esperado!", LocalDateTime.now(), 0.569, ClassificacaoEnum.D);
        // iteração 1
        var cb7 = new Classificacao("Abaixo do mínimo necessário!", LocalDateTime.now(), 0.639, ClassificacaoEnum.C);
        listaClassificacao.add(cb1);
        listaClassificacao.add(cb2);
        listaClassificacao.add(cb3);
        listaClassificacao.add(cb4);
        listaClassificacao.add(cb5);
        listaClassificacao.add(cb6);
        listaClassificacao.add(cb7);
        return listaClassificacao;
    }
    
    private Classificacao getMockByFaixa(ClassificacaoEnum faixa) {
        for(Classificacao f : listaClassificacao) {
            if(f.getClassificacaoAtingida().equals(faixa)) {
                return f;
            }
        }
        return null;
    }

    public ArrayList<Classificacao> getListaClassificacao() {
        return listaClassificacao;
    }
}
