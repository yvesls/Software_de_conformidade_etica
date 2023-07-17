/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gestaoqualidadeprojetos.model;

/**
 *
 * @author Note102
 */
public class ResultadoEtapaMembroEquipe extends ResultadoEtapa {
    private MembroEquipe membro;
    
    public ResultadoEtapaMembroEquipe () {
    }
    
    public ResultadoEtapaMembroEquipe(Classificacao classificacao, EtapaIteracao etapa, MembroEquipe membro) {
        super(classificacao, etapa);
        this.membro = membro;
    }

    @Override
    public String toString() {
        return "ResultadoEtapaMembroEquipe{" + "membro=" + membro + '}';
    }
}
