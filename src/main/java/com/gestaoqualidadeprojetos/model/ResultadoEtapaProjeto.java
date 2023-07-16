/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gestaoqualidadeprojetos.model;

/**
 *
 * @author Note102
 */
public class ResultadoEtapaProjeto extends ResultadoEtapa {
    private Projeto projeto;
    
    public ResultadoEtapaProjeto(Classificacao classificacao, EtapaIteracao etapa, Projeto projeto) {
        super(classificacao, etapa);
        this.projeto = projeto;
    }
}
