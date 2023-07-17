/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gestaoqualidadeprojetos.repository;

import com.gestaoqualidadeprojetos.model.Classificacao;
import com.gestaoqualidadeprojetos.model.Iteracao;
import com.gestaoqualidadeprojetos.model.MembroEquipe;
import com.gestaoqualidadeprojetos.model.Peso;
import com.gestaoqualidadeprojetos.model.ResultadoEtapaMembroEquipe;
import com.gestaoqualidadeprojetos.model.ResultadoMembroEquipe;
import java.text.ParseException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
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
     
    public ArrayList<ResultadoMembroEquipe> getByIteracao(Iteracao iteracao) {
        return getMockByIteracao(iteracao.getDescricao());
    }
    
    public ArrayList<ResultadoMembroEquipe> getAll() {
          return listaResultadosMembroEquipe;
    }
    
    public void save(ResultadoMembroEquipe resultadoMembroEquipe) {
        listaResultadosMembroEquipe.add(resultadoMembroEquipe);
    }
    
    private ArrayList<ResultadoMembroEquipe> generateAllMock() {
        listaResultadosMembroEquipe = new ArrayList<ResultadoMembroEquipe>();
        ArrayList<Peso> pesos = new PesoRepository().getAll();
        var etapas = new ArrayList<ResultadoEtapaMembroEquipe>();
        LocalDate dataInicio = LocalDate.of(2023, 7, 1);
        LocalDate dataFim = LocalDate.of(2023, 8, 1);
        Iteracao cascata = new Iteracao("Iteração Única", dataInicio, dataFim, "ABERTA");
        ArrayList<Classificacao> classificacoes = new ClassificacaoRepository().getAll();
        List<MembroEquipe> membros = new MembroEquipeRepository().listarMembros();
        var membro1 = new ResultadoMembroEquipe(28, 36, 0.778, pesos.get(0), classificacoes.get(0), membros.get(0),cascata, etapas);
        var membro2 = new ResultadoMembroEquipe(29, 47, 0.617, pesos.get(1), classificacoes.get(1), membros.get(1), cascata, etapas);
        var membro3 = new ResultadoMembroEquipe(24, 41, 0.585, pesos.get(2), classificacoes.get(2), membros.get(2), cascata, etapas);
        var membro4 = new ResultadoMembroEquipe(21, 40, 0.525, pesos.get(3), classificacoes.get(3), membros.get(3), cascata, etapas);
        var membro5 = new ResultadoMembroEquipe(27, 47, 0.574, pesos.get(4), classificacoes.get(4), membros.get(4), cascata, etapas);
        var membro6 = new ResultadoMembroEquipe(33, 58, 0.569, pesos.get(5), classificacoes.get(5), membros.get(5), cascata, etapas); 
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
            if(rme.getIteracao().getDescricao().equals(iteracao)) {
                listaResultados.add(rme);
                
            }
        }
        if(listaResultados.isEmpty()) {
            return null;
        }
        return listaResultados;
    }
}
