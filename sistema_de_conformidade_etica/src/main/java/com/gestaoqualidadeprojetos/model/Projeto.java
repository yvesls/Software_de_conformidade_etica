package com.gestaoqualidadeprojetos.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Projeto {

    private String nome;
    private Date dataInicio;
    private Date previsaoConclusao;
    private Date dataConclusao;
    private String status;
    private String tipo;
    private int quantidadeIteracao;
    private List<Iteracao> iteracoes;
    private ArrayList<MembroEquipe> equipe;

    public Projeto(String nome, Date dataInicio, Date previsaoConclusao, String status, String tipo, int quantidadeIteracao) {
        this.nome = nome;
        this.dataInicio = dataInicio;
        this.previsaoConclusao = previsaoConclusao;
        this.status = status;
        this.tipo = tipo;
        this.quantidadeIteracao = quantidadeIteracao;
        this.iteracoes = new ArrayList<Iteracao>();
        this.equipe = new ArrayList<MembroEquipe>();
    }

    public void setDataConclusao(Date dataConclusao) {
        this.dataConclusao = dataConclusao;
    }

    public Date getDataConclusao() {
        return dataConclusao;
    }

    public void addMembroEquipe(MembroEquipe membro) {
        this.equipe.add(membro);
    }

    public ArrayList<MembroEquipe> getEquipe() {
        return equipe;
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

    public Date getPrevisaoConclusao() {
        return previsaoConclusao;
    }

    public void setPrevisaoConclusao(Date previsaoConclusao) {
        this.previsaoConclusao = previsaoConclusao;
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

    @Override
    public String toString() {
        return "Projeto{" + "nome=" + nome + ", dataInicio=" + dataInicio + ", dataConclusao=" + dataConclusao + ", status=" + status + ", tipo=" + tipo + ", quantidadeIteracao=" + quantidadeIteracao + '}';
    }

}
