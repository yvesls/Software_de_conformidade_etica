package com.gestaoqualidadeprojetos.model.gabriel;
import java.util.ArrayList;
import java.util.Date;

public class Iteracao {
    private String descricao;
    private Date dataInicio;
    private Date dataConclusao;
    private Date previsaoConclusao;
    private String status;
    private ArrayList<EtapaIteracao> etapas;

    public Iteracao(String descricao, Date dataInicio, Date dataConclusao, Date previsaoConclusao, String status) {
        this.descricao = descricao;
        this.dataInicio = dataInicio;
        this.dataConclusao = dataConclusao;
        this.previsaoConclusao = previsaoConclusao;
        this.status = status;
        this.etapas = new ArrayList();
    }

    public void addEtapa(EtapaIteracao etapa){
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

    @Override
    public String toString() {
        return "Iteracao{" + "descricao=" + descricao + ", dataInicio=" + dataInicio + ", dataConclusao=" + dataConclusao + ", previsaoConclusao=" + previsaoConclusao + ", status=" + status + '}';
    }
    
}