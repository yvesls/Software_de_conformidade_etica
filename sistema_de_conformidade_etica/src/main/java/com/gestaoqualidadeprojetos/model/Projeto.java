package com.gestaoqualidadeprojetos.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Projeto {

    private String nome;
    private Date dataInicio;
    private Date dataConclusao;
    private String status;
    private String tipo;
    private int quantidadeIteracao;
    //private Date duracaoIteracao;
    private List<Iteracao> iteracoes;
    private ArrayList<MembroEquipe> equipe;

    public Projeto(String nome, Date dataInicio, Date dataConclusao, String status, String tipo, int quantidadeIteracao, Date duracaoIteracao) {
        this.nome = nome;
        this.dataInicio = dataInicio;
        this.dataConclusao = dataConclusao;
        this.status = status;
        this.tipo = tipo;
        this.quantidadeIteracao = quantidadeIteracao;
        //this.duracaoIteracao = duracaoIteracao;
        this.iteracoes = new ArrayList<Iteracao>();
        this.equipe = new ArrayList<MembroEquipe>();
    }

    public void addMembroEquipe(MembroEquipe membro) {
        this.equipe.add(membro);
    }

    public void addIteracao(Iteracao iteracao) {
        this.iteracoes.add(iteracao);
    }

    public List<Iteracao> getIteracoes() {
        return iteracoes;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(Date dataInicio) {
        this.dataInicio = dataInicio;
    }

    public Date getDataConclusao() {
        return dataConclusao;
    }

    public void setDataConclusao(Date dataConclusao) {
        this.dataConclusao = dataConclusao;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getQuantidadeIteracao() {
        return quantidadeIteracao;
    }

    public void setQuantidadeIteracao(int quantidadeIteracao) {
        this.quantidadeIteracao = quantidadeIteracao;
    }

    public void listarEquipe() {
        for (MembroEquipe membro : this.equipe) {
            System.out.println(membro.toString());
        }
    }

    /*public Date getDuracaoIteracao() {
        return duracaoIteracao;
    }

    public void setDuracaoIteracao(Date duracaoIteracao) {
        this.duracaoIteracao = duracaoIteracao;
    }*/
    @Override
    public String toString() {
        return "Projeto{" + "nome=" + nome + ", dataInicio=" + dataInicio + ", dataConclusao=" + dataConclusao + ", status=" + status + ", tipo=" + tipo + ", quantidadeIteracao=" + quantidadeIteracao + '}';
    }

}
