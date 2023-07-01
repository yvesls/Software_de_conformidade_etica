/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gestaoqualidadeprojetos.repository;

import com.gestaoqualidadeprojetos.mode.Classificacao;
import com.gestaoqualidadeprojetos.mode.MembroEquipe;
import com.gestaoqualidadeprojetos.mode.Peso;
import com.gestaoqualidadeprojetos.mode.ResultadoMembroEquipe;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Note102
 */
public class ResultadoMembroEquipeRepository {
    private ArrayList<ResultadoMembroEquipe> listaResultadosMembroEquipe;
    
    public ResultadoMembroEquipeRepository() {
        generateAllMock();
    }
     
    public ArrayList<ResultadoMembroEquipe> getByIteracao(String iteracao) {
        return getMockByIteracao(iteracao);
    }
    
    public ArrayList<ResultadoMembroEquipe> getAll() {
          return listaResultadosMembroEquipe;
    }
    
    private ArrayList<ResultadoMembroEquipe> generateAllMock() {
        listaResultadosMembroEquipe = new ArrayList<ResultadoMembroEquipe>();
        ArrayList<Peso> pesos = new PesoRepository().getListaPesos();
        ArrayList<Classificacao> classificacoes = new ClassificacaoRepository().getListaClassificacao();
        List<MembroEquipe> membros = new MembroEquipeRepository().listarMembros();
        var membro1 = new ResultadoMembroEquipe(28, 36, 0.778, pesos.get(0), classificacoes.get(0), membros.get(0), "Iteração 1");
        var membro2 = new ResultadoMembroEquipe(29, 47, 0.617, pesos.get(1), classificacoes.get(1), membros.get(1), "Iteração 1");
        var membro3 = new ResultadoMembroEquipe(24, 41, 0.585, pesos.get(2), classificacoes.get(2), membros.get(2), "Iteração 1");
        var membro4 = new ResultadoMembroEquipe(21, 40, 0.525, pesos.get(3), classificacoes.get(3), membros.get(3), "Iteração 1");
        var membro5 = new ResultadoMembroEquipe(27, 47, 0.574, pesos.get(4), classificacoes.get(4), membros.get(4), "Iteração 1");
        var membro6 = new ResultadoMembroEquipe(33, 58, 0.569, pesos.get(5), classificacoes.get(5), membros.get(5), "Iteração 1");
        listaResultadosMembroEquipe.add(membro1);
        listaResultadosMembroEquipe.add(membro2);
        listaResultadosMembroEquipe.add(membro3);
        listaResultadosMembroEquipe.add(membro4);
        listaResultadosMembroEquipe.add(membro5);
        listaResultadosMembroEquipe.add(membro6);
        return listaResultadosMembroEquipe;
    }
    
    private ArrayList<ResultadoMembroEquipe> getMockByIteracao(String iteracao) {
        var listaResultados = new ArrayList<ResultadoMembroEquipe>();
        for(ResultadoMembroEquipe rme : listaResultadosMembroEquipe) {
            if(rme.getIteracao().equals(iteracao)) {
                listaResultados.add(rme);
                
            }
        }
        if(listaResultados.isEmpty()){
            return null;
        }
        return listaResultados;
    }

    public ArrayList<ResultadoMembroEquipe> getListaResultadosMembroEquipe() {
        return listaResultadosMembroEquipe;
    }
}
