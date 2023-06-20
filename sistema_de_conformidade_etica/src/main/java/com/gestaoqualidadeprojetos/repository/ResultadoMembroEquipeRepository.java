/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gestaoqualidadeprojetos.repository;

import com.gestaoqualidadeprojetos.model.Classificacao;
import com.gestaoqualidadeprojetos.model.MembroEquipeTeste;
import com.gestaoqualidadeprojetos.model.Peso;
import com.gestaoqualidadeprojetos.model.ResultadoMembroEquipe;
import java.util.ArrayList;

/**
 *
 * @author Note102
 */
public class ResultadoMembroEquipeRepository {
    private ArrayList<ResultadoMembroEquipe> listaResultadosMembroEquipe;
    
    public ResultadoMembroEquipe getByMembroRepresentante(String representante) {
        return getMockByMembroRepresentante(representante);
    }
    
    public ArrayList<ResultadoMembroEquipe> getAll() {
          return generateAllMock();
    }
    
    private ArrayList<ResultadoMembroEquipe> generateAllMock() {
        listaResultadosMembroEquipe = new ArrayList<ResultadoMembroEquipe>();
        ArrayList<Peso> pesos = new PesoRepository().getListaPesos();
        ArrayList<Classificacao> classificacoes = new ClassificacaoRepository().getListaClassificacao();
        ArrayList<MembroEquipeTeste> membros = new MembroEquipeTesteRepository().getListaMembros();
        var membro1 = new ResultadoMembroEquipe(28, 36, 0.778, pesos.get(0), classificacoes.get(0), membros.get(0));
        var membro2 = new ResultadoMembroEquipe(29, 47, 0.617, pesos.get(1), classificacoes.get(1), membros.get(1));
        var membro3 = new ResultadoMembroEquipe(24, 41, 0.585, pesos.get(2), classificacoes.get(2), membros.get(2));
        var membro4 = new ResultadoMembroEquipe(21, 40, 0.525, pesos.get(3), classificacoes.get(3), membros.get(3));
        var membro5 = new ResultadoMembroEquipe(27, 47, 0.574, pesos.get(4), classificacoes.get(4), membros.get(4));
        var membro6 = new ResultadoMembroEquipe(33, 58, 0.569, pesos.get(5), classificacoes.get(5), membros.get(5));
        listaResultadosMembroEquipe.add(membro1);
        listaResultadosMembroEquipe.add(membro2);
        listaResultadosMembroEquipe.add(membro3);
        listaResultadosMembroEquipe.add(membro4);
        listaResultadosMembroEquipe.add(membro5);
        listaResultadosMembroEquipe.add(membro6);
        return listaResultadosMembroEquipe;
    }
    
    private ResultadoMembroEquipe getMockByMembroRepresentante(String representante) {
        for(ResultadoMembroEquipe rme : listaResultadosMembroEquipe) {
            if(rme.getMembro().getRepresentante().equals(representante)) {
                return rme;
            }
        }
        return null;
    }

    public ArrayList<ResultadoMembroEquipe> getListaResultadosMembroEquipe() {
        return listaResultadosMembroEquipe;
    }
}
