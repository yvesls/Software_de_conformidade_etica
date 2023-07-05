package com.gestaoqualidadeprojetos.model;

import java.util.ArrayList;
import java.util.Date;

public class Iteracao {

    private String descricao;
    private Date dataInicio;
    private Date previsaoConclusao;
    private Date dataConclusao;
    private String status;
    private ArrayList<EtapaIteracao> etapas;

    public Iteracao(String descricao, Date dataInicio, Date previsaoConclusao, String status) {
        if (validarDatas(dataInicio, previsaoConclusao)) {
            this.descricao = descricao;
            this.dataInicio = dataInicio;
            this.previsaoConclusao = previsaoConclusao;
            this.status = status;
            this.etapas = new ArrayList();
        }
    }

    public boolean validarDatas(Date dataInicial, Date dataFinal) {
        if (dataInicial.compareTo(dataFinal) < 0) {
            return true;
        }
        System.out.println("A previsão de conclusão da Iteração deve ser maior que a data inicial.");
        return false;
    }

    public void finalizarIteracao(Date dataConclusao) {
        // Converte a data de previsão em tempo (milissegundos) para calcular
        long tempoDataPrevisaoConclusao = previsaoConclusao.getTime() - (long) (previsaoConclusao.getTime() * 0.25);
        Date DataPrevisaoConclusao = new Date(tempoDataPrevisaoConclusao);
        if (this.dataConclusao.compareTo(DataPrevisaoConclusao) >= 0) {
            this.dataConclusao = DataPrevisaoConclusao;
            this.status = "FINALIZADA";
            System.out.println("Iteração finalizada.");
        } else {
            System.out.println("A Iteração só poderá ser finalizada após cumprir 75% da data prevista de conclusão.");
        }
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

    @Override
    public String toString() {
        return "Iteracao{" + "descricao=" + descricao + ", dataInicio=" + dataInicio + ", dataConclusao=" + dataConclusao + ", previsaoConclusao=" + previsaoConclusao + ", status=" + status + '}';
    }

}
