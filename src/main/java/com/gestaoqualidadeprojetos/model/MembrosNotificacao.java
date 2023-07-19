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
    private ArrayList<MembroEquipe> membros;
    private String mensagem;

    public MembrosNotificacao(ArrayList<MembroEquipe> membros) {
        this.membros = membros;
    }

    public MembrosNotificacao(ArrayList<MembroEquipe> membros, String mensagem) {
        this.membros = membros;
        this.mensagem = mensagem;
    }

    public ArrayList<MembroEquipe> getMembros() {
        return membros;
    }

    public String getMensagem() {
        return mensagem;
    }
}
