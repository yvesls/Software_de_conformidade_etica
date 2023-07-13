/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gestaoqualidadeprojetos.service;

import com.gestaoqualidadeprojetos.model.ResultadoIteracao;
import com.gestaoqualidadeprojetos.model.ResultadoMembroEquipe;
import com.gestaoqualidadeprojetos.model.ResultadoProjeto;
import com.gestaoqualidadeprojetos.repository.ResultadoIteracaoRepository;
import com.gestaoqualidadeprojetos.repository.ResultadoMembroEquipeRepository;
import com.gestaoqualidadeprojetos.repository.ResultadoProjetoRepository;
import java.util.ArrayList;

/**
 *
 * @author Note102
 */
public class ResultadoService {
    private static final ResultadoProjetoRepository resultadoProjetoRepositoriy = new ResultadoProjetoRepository();
    private static final ResultadoMembroEquipeRepository resultadoMembroEquipeRepository = new ResultadoMembroEquipeRepository();
    private static final ResultadoIteracaoRepository resultadoIteracaoRepositoriy = new ResultadoIteracaoRepository();
    
    public ResultadoIteracao getByDescricaoIteracao(String iteracao) throws Exception {
        var resultado = resultadoIteracaoRepositoriy.getByIteracao(iteracao);
        if(resultado == null) {
            throw new Exception("Não existe resultado para a iteração atual. Os questionários não foram todos respondidos ainda.");
        }
        return resultado;
    }
    
    
    public ArrayList<ResultadoMembroEquipe> getByIteracao(String iteracao) throws Exception {
        var resultado = resultadoMembroEquipeRepository.getByIteracao(iteracao);
        if(resultado == null) {
            throw new Exception("Não existe resultado para a iteração atual. Os questionários não foram todos respondidos ainda.");
        }
        return resultado;
    }
    
    public ResultadoProjeto getByProjeto(String projeto) throws Exception {
        var resultado = resultadoProjetoRepositoriy.getByProjeto(projeto);
        if(resultado == null) {
            throw new Exception("Não existe resultado para o projeto atual. As iterações não foram todas completadas ainda.");
        }
        return resultado;
    }
}
