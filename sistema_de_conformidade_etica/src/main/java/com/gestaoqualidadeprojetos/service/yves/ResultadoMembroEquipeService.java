/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gestaoqualidadeprojetos.service.yves;

import com.gestaoqualidadeprojetos.model.yves.ResultadoMembroEquipe;
import com.gestaoqualidadeprojetos.repository.yves.ResultadoMembroEquipeRepository;
import java.util.ArrayList;
/**
 *
 * @author Note102
 */
public class ResultadoMembroEquipeService {
    private static final ResultadoMembroEquipeRepository resultadoMembroEquipeRepository = new ResultadoMembroEquipeRepository();
    
    public ArrayList<ResultadoMembroEquipe> getByIteracao(String iteracao) throws Exception {
        var resultado = resultadoMembroEquipeRepository.getByIteracao(iteracao);
        if(resultado == null) {
            throw new Exception("Não existe resultado para a iteração atual. Os questionários não foram todos respondidos ainda.");
        }
        return resultado;
    }
}
