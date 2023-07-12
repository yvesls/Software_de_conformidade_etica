/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gestaoqualidadeprojetos.repository;

import com.gestaoqualidadeprojetos.model.ResultadoProjeto;
import java.util.ArrayList;

/**
 *
 * @author Note102
 */
public class ResultadoProjetoRepository {
    private ArrayList<ResultadoProjeto> listaResultadosProjeto;
    
    public ResultadoProjetoRepository() {
        generateAllMock();
    }
    
    public ResultadoProjeto getByProjeto(String projeto) {
        return getMockByNome(projeto);
    }
    
    public ArrayList<ResultadoProjeto> getAll() {
          return listaResultadosProjeto;
    }
    
    private ArrayList<ResultadoProjeto> generateAllMock() {
        listaResultadosProjeto = new ArrayList<ResultadoProjeto>();
        return listaResultadosProjeto;
    }
    
    private ResultadoProjeto getMockByNome(String projeto) {
        for(ResultadoProjeto rp : listaResultadosProjeto) {
            if(rp.getProjeto().equals(projeto)) {
                return rp;
            }
        }
        return null;
    }

    public ArrayList<ResultadoProjeto> getListaResultadosProjeto() {
        return listaResultadosProjeto;
    }
}
