/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gestaoqualidadeprojetos.repository;

import com.gestaoqualidadeprojetos.model.Iteracao;
import com.gestaoqualidadeprojetos.model.ResultadoEtapaIteracao;
import java.util.ArrayList;

/**
 *
 * @author Note102
 */
public class ResultadoEtapaIteracaoRepository {
     private ArrayList<ResultadoEtapaIteracao> listaResultadoEtapaIteracao;
    
    public ResultadoEtapaIteracaoRepository() {
    }
     
    public ArrayList<ResultadoEtapaIteracao> getByIteracao(Iteracao iteracao) {
        return null;
    }
    
    public ArrayList<ResultadoEtapaIteracao> getAll() {
          return listaResultadoEtapaIteracao;
    }
    
    public void save(ResultadoEtapaIteracao resultadoEtapaIteracao) {
        listaResultadoEtapaIteracao.add(resultadoEtapaIteracao);
    }
}
