/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gestaoqualidadeprojetos.repository;

import com.gestaoqualidadeprojetos.model.Iteracao;
import com.gestaoqualidadeprojetos.model.ResultadoEtapaMembroEquipe;
import java.util.ArrayList;

/**
 *
 * @author Note102
 */
public class ResultadoEtapaMembroEquipeRepository {
    private ArrayList<ResultadoEtapaMembroEquipe> listaResultadoEtapaMembroEquipe;
    
    public ResultadoEtapaMembroEquipeRepository() {
    }
     
    public ArrayList<ResultadoEtapaMembroEquipe> getByIteracao(Iteracao iteracao) {
        return null;
    }
    
    public ArrayList<ResultadoEtapaMembroEquipe> getAll() {
          return listaResultadoEtapaMembroEquipe;
    }
    
    public void save(ResultadoEtapaMembroEquipe resultadoEtapaMembroEquipe) {
        listaResultadoEtapaMembroEquipe.add(resultadoEtapaMembroEquipe);
    }
}
