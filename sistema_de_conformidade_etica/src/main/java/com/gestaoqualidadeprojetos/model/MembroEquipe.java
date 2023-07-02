package com.gestaoqualidadeprojetos.model;

public class MembroEquipe {
    private String nome;
    private String sobrenome;
    private String email;
    private String senha;
    private String representante;
    private boolean primeiroAcesso;

    public MembroEquipe(String nome, String sobrenome, String email, String senha, String representante, boolean primeiroAcesso) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.email = email;
        this.senha = senha;
        this.representante = representante;
        this.primeiroAcesso = primeiroAcesso;
    }
    
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getRepresentante() {
        return representante;
    }

    public void setRepresentante(String representante) {
        this.representante = representante;
    }

    public boolean isPrimeiroAcesso() {
        return primeiroAcesso;
    }

    public void setPrimeiroAcesso(boolean primeiroAcesso) {
        this.primeiroAcesso = primeiroAcesso;
    }

    @Override
    public String toString() {
        return "MembroEquipe{" + "nome=" + nome + ", sobrenome=" + sobrenome + ", email=" + email + ", representante=" + representante + '}';
    }
    
}