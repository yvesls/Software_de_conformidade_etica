package com.gestaoqualidadeprojetos.model;
import java.time.LocalDate;
import java.util.ArrayList;

public class Projeto {

    private String nome;
    private LocalDate dataInicio;
    private LocalDate previsaoConclusao;
    private LocalDate dataConclusao;
    private String status;
    private String tipo;
    private int quantidadeIteracao;
    private ArrayList<Iteracao> iteracoes;
    private ArrayList<MembroEquipe> equipe;

    public Projeto(String nome, LocalDate dataInicio, LocalDate previsaoConclusao, String status, String tipo, int quantidadeIteracao) {
        this.nome = nome;
        this.dataInicio = dataInicio;
        this.previsaoConclusao = previsaoConclusao;
        this.status = status;
        this.tipo = tipo;
        this.quantidadeIteracao = quantidadeIteracao;
        this.iteracoes = new ArrayList<Iteracao>();
        this.equipe = new ArrayList<MembroEquipe>();
    }

    public void setDataConclusao(LocalDate dataConclusao) {
        this.dataConclusao = dataConclusao;
    }

    public LocalDate getDataConclusao() {
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

    public ArrayList<Iteracao> getIteracoes() {
        return iteracoes;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(LocalDate dataInicio) {
        this.dataInicio = dataInicio;
    }

    public LocalDate getPrevisaoConclusao() {
        return previsaoConclusao;
    }

    public void setPrevisaoConclusao(LocalDate previsaoConclusao) {
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
        return "Projeto{" + "nome=" + nome + ", dataInicio=" + dataInicio + ", previsaoConclusao=" + previsaoConclusao + ", dataConclusao=" + dataConclusao + ", status=" + status + ", tipo=" + tipo + ", quantidadeIteracao=" + quantidadeIteracao + '}';
    }

}
