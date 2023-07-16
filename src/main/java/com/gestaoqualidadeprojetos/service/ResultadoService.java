/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gestaoqualidadeprojetos.service;

import com.gestaoqualidadeprojetos.model.Iteracao;
import com.gestaoqualidadeprojetos.model.Projeto;
import com.gestaoqualidadeprojetos.model.ResultadoIteracao;
import com.gestaoqualidadeprojetos.model.ResultadoMembroEquipe;
import com.gestaoqualidadeprojetos.model.ResultadoProjeto;
import com.gestaoqualidadeprojetos.repository.ResultadoIteracaoRepository;
import com.gestaoqualidadeprojetos.repository.ResultadoMembroEquipeRepository;
import com.gestaoqualidadeprojetos.repository.ResultadoProjetoRepository;
import java.text.ParseException;
import java.util.ArrayList;

/**
 *
 * @author Note102
 */
public class ResultadoService {
    private ResultadoProjetoRepository resultadoProjetoRepositoriy;
    private ResultadoMembroEquipeRepository resultadoMembroEquipeRepository;
    private ResultadoIteracaoRepository resultadoIteracaoRepositoriy;
    
    public ResultadoService() {
        try{
            this.resultadoProjetoRepositoriy = new ResultadoProjetoRepository();
            this.resultadoMembroEquipeRepository = new ResultadoMembroEquipeRepository();
            this.resultadoIteracaoRepositoriy = new ResultadoIteracaoRepository();
        }catch(Exception e) {
            e.printStackTrace();
        }
    }
    
    public void gerarResultado(ProcessaResultadoService processaResultado, Iteracao iteracao) throws ParseException{
        // chamar chain de processo de resultados
        processaResultado.processar(iteracao);
    }
    
    public ResultadoIteracao getResultadoIteracao(Iteracao iteracao) throws Exception {
        var resultado = resultadoIteracaoRepositoriy.getByIteracao(iteracao);
        if(resultado == null) { // validação será feita em alguma camada inferior
            throw new Exception("Não existe resultado para a iteração atual. Os questionários não foram todos respondidos ainda.");
        }
        return resultado;
    }
    
    public ArrayList<ResultadoMembroEquipe> getResultadoIteracaoMembroEquipe(Iteracao iteracao) throws Exception {
        var resultado = resultadoMembroEquipeRepository.getByIteracao(iteracao);
        if(resultado == null) { // validação será feita em alguma camada inferior
            throw new Exception("Não existe resultado para a iteração atual. Os questionários não foram todos respondidos ainda.");
        }
        return resultado;
    }
    
    public ResultadoProjeto getResultadoProjeto(Projeto projeto) throws Exception {
        var resultado = resultadoProjetoRepositoriy.getByProjeto(projeto);
        if(resultado == null) { // validação será feita em alguma camada inferior
            throw new Exception("Não existe resultado para o projeto atual. As iterações não foram todas completadas ainda.");
        }
        return resultado;
    }
}   
