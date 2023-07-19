/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gestaoqualidadeprojetos.repository;

import com.gestaoqualidadeprojetos.model.Iteracao;
import com.gestaoqualidadeprojetos.model.ResultadoEtapaProjeto;
import com.gestaoqualidadeprojetos.model.ResultadoMembroEquipe;
import java.util.ArrayList;

/**
 *
 * @author Note102
 */
public class ResultadoEtapaProjetoRepository {
    private ArrayList<ResultadoEtapaProjeto> listaResultadosEtapaProjeto;
    
    public ResultadoEtapaProjetoRepository() {
    }
     
    public ArrayList<ResultadoMembroEquipe> getByIteracao(Iteracao iteracao) {
        return null;
    }
    
    public ArrayList<ResultadoEtapaProjeto> getAll() {
          return listaResultadosEtapaProjeto;
    }
    
    public void save(ResultadoEtapaProjeto resultadoEtapaProjeto) {
        listaResultadosEtapaProjeto.add(resultadoEtapaProjeto);
    }
}
