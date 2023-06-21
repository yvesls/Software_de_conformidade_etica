/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gestaoqualidadeprojetos.service;

import com.gestaoqualidadeprojetos.model.ResultadoProjeto;
import com.gestaoqualidadeprojetos.repository.ResultadoProjetoRepository;

/**
 *
 * @author Note102
 */
public class ResultadoProjetoService {
    private static final ResultadoProjetoRepository resultadoProjetoRepositoriy = new ResultadoProjetoRepository();
    
    public ResultadoProjeto getByProjeto(String projeto) throws Exception {
        var resultado = resultadoProjetoRepositoriy.getByProjeto(projeto);
        if(resultado == null) {
            throw new Exception("Não existe resultado para o projeto atual. As iterações não foram todas completadas ainda.");
        }
        return resultado;
    }
}
