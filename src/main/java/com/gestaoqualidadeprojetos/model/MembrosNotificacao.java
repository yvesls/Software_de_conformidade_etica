/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gestaoqualidadeprojetos.model;

import java.util.ArrayList;

/**
 *
 * @author Note102
 */
public class MembrosNotificacao {
    private MembroEquipe membros;
    private String mensagem;
    private EtapaIteracao etapa;

    public MembrosNotificacao(MembroEquipe membros, String mensagem, EtapaIteracao etapa) {
        this.membros = membros;
        this.mensagem = mensagem;
        this.etapa = etapa;
    }

    public MembroEquipe getMembros() {
        return membros;
    }

    public EtapaIteracao getEtapa() {
        return etapa;
    }
    
    public String getMensagem() {
        return mensagem;
    }

    @Override
    public String toString() {
        return "MembrosNotificacao{" + "membros=" + membros + ", mensagem=" + mensagem + '}';
    }
}
