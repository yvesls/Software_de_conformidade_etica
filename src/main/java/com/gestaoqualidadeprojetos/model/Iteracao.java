package com.gestaoqualidadeprojetos.model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;

public class Iteracao {

    private String descricao;
    private LocalDateTime dataInicio;
    private LocalDateTime previsaoConclusao;
    private LocalDateTime dataConclusao;
    private String status;
    private ArrayList<EtapaIteracao> etapas;

    public Iteracao(String descricao, LocalDateTime dataInicio, LocalDateTime previsaoConclusao, String status) {
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

    public LocalDateTime getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(LocalDateTime dataInicio) {
        this.dataInicio = dataInicio;
    }

    public LocalDateTime getPrevisaoConclusao() {
        return previsaoConclusao;
    }

    public void setPrevisaoConclusao(LocalDateTime previsaoConclusao) {
        this.previsaoConclusao = previsaoConclusao;
    }

    public LocalDateTime getDataConclusao() {
        return dataConclusao;
    }

    public void setDataConclusao(LocalDateTime dataConclusao) {
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
