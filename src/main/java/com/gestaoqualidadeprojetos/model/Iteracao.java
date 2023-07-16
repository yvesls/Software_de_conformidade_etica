package com.gestaoqualidadeprojetos.model;

import java.time.LocalDate;
import java.util.ArrayList;

public class Iteracao {

    private String descricao;
    private LocalDate dataInicio;
    private LocalDate previsaoConclusao;
    private LocalDate dataConclusao;
    private String status;
    private ArrayList<EtapaIteracao> etapas;

    public Iteracao(String descricao, LocalDate dataInicio, LocalDate previsaoConclusao, String status) {
        this.descricao = descricao;
        this.dataInicio = dataInicio;
        this.previsaoConclusao = previsaoConclusao;
        this.status = status;
        this.etapas = new ArrayList();
    }

    public void addEtapa(EtapaIteracao etapa) {
        this.etapas.add(etapa);
    }

    public ArrayList<EtapaIteracao> getEtapas() {
        return etapas;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
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

    public LocalDate getDataConclusao() {
        return dataConclusao;
    }

    public void setDataConclusao(LocalDate dataConclusao) {
        this.dataConclusao = dataConclusao;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    @Override
    public String toString() {
        return "Iteracao{" + "descricao=" + descricao + ", dataInicio=" + dataInicio + ", dataConclusao=" + dataConclusao + ", previsaoConclusao=" + previsaoConclusao + ", status=" + status + '}';
    }

}