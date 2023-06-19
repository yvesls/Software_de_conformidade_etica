package com.gestaoqualidadeprojetos.model;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Note102
 */
public class MembroEquipeTeste {
    private String nome;
    private String email;
    private String representante;

    public MembroEquipeTeste(String nome, String email, String representante) {
        this.nome = nome;
        this.email = email;
        this.representante = representante;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getRepresentante() {
        return representante;
    }

    @Override
    public String toString() {
        return "MembroEquipeTeste{" + "nome=" + nome + ", email=" + email + ", representante=" + representante + '}';
    }
}
