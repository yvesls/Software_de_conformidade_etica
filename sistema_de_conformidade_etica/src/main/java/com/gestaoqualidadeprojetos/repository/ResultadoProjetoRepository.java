/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gestaoqualidadeprojetos.repository;

import com.gestaoqualidadeprojetos.model.Classificacao;
import com.gestaoqualidadeprojetos.model.ResultadoIteracao;
import com.gestaoqualidadeprojetos.model.ResultadoMembroEquipe;
import com.gestaoqualidadeprojetos.model.ResultadoProjeto;
import java.time.LocalDateTime;
import java.util.ArrayList;

/**
 *
 * @author Note102
 */
public class ResultadoProjetoRepository {
    private ArrayList<ResultadoProjeto> listaResultadosProjeto;
    
    public ResultadoProjeto getByNome(String nome) {
        return getMockByNome(nome);
    }
    
    public ArrayList<ResultadoProjeto> getAll() {
          return generateAllMock();
    }
    
    private ArrayList<ResultadoProjeto> generateAllMock() {
        listaResultadosProjeto = new ArrayList<ResultadoProjeto>();
        return listaResultadosProjeto;
    }
    
    private ResultadoProjeto getMockByNome(String nome) {
        for(ResultadoProjeto rp : listaResultadosProjeto) {
            if(rp.getDescricao().equals(nome)) {
                return rp;
            }
        }
        return null;
    }

    public ArrayList<ResultadoProjeto> getListaResultadosProjeto() {
        return listaResultadosProjeto;
    }
}
