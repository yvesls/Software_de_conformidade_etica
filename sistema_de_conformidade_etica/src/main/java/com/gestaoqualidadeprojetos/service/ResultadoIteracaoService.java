/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gestaoqualidadeprojetos.service;

import com.gestaoqualidadeprojetos.model.ResultadoIteracao;
import com.gestaoqualidadeprojetos.repository.ResultadoIteracaoRepository;

/**
 *
 * @author Note102
 */
public class ResultadoIteracaoService {
    private static final ResultadoIteracaoRepository resultadoIteracaoRepositoriy = new ResultadoIteracaoRepository();
    
    public ResultadoIteracao getByIteracao(String iteracao) throws Exception {
        var resultado = resultadoIteracaoRepositoriy.getByIteracao(iteracao);
        if(resultado == null) {
            throw new Exception("Não existe resultado para a iteração atual. Os questionários não foram todos respondidos ainda.");
        }
        return resultado;
    }
}
