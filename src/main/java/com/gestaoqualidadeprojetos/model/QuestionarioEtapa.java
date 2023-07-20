
package com.gestaoqualidadeprojetos.model;

import java.time.LocalDateTime;
import java.util.ArrayList;

/**
 *
 * @author lucas
 */
public class QuestionarioEtapa extends QuestionarioEtapaBase{
    private LocalDateTime dataConclusao;
    private LocalDateTime dataPrevisaoConclusao;
    private EtapaIteracao etapaIteracao;
    private ArrayList<Pergunta> perguntas;
    private String status;
    private boolean isFinalizado;

    public QuestionarioEtapa(String nomeQuestionario, LocalDateTime dataCriacao) {
        super(nomeQuestionario, dataCriacao);
    }
    
    public QuestionarioEtapa(String nomeQuestionario, LocalDateTime dataCriacao, EtapaIteracao etapaIteracao, ArrayList<Pergunta> perguntas, boolean isFinalizado) {
        super(nomeQuestionario, dataCriacao);
        this.etapaIteracao = etapaIteracao;
        this.perguntas = perguntas;
        this.isFinalizado = isFinalizado;
    }

    public LocalDateTime getDataConclusao() {
        return dataConclusao;
    }

    public void setDataConclusao(LocalDateTime dataConclusao) {
        this.dataConclusao = dataConclusao;
    }

    public LocalDateTime getDataPrevisaoConclusao() {
        return dataPrevisaoConclusao;
    }

    public void setDataPrevisaoConclusao(LocalDateTime dataPrevisaoConclusao) {
        this.dataPrevisaoConclusao = dataPrevisaoConclusao;
    }

    public EtapaIteracao getEtapaIteracao() {
        return etapaIteracao;
    }

    public void setEtapaIteracao(EtapaIteracao etapaIteracao) {
        this.etapaIteracao = etapaIteracao;
    }

    public ArrayList<Pergunta> getPerguntas() {
        return perguntas;
    }

    public void setPerguntas(ArrayList<Pergunta> perguntas) {
        this.perguntas = perguntas;
    }

    public boolean isIsFinalizado() {
        return isFinalizado;
    }

    public void setIsFinalizado(boolean isFinalizado) {
        this.isFinalizado = isFinalizado;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "QuestionarioEtapa{" + "dataConclusao=" + dataConclusao + ", dataPrevisaoConclusao=" + dataPrevisaoConclusao + ", etapaIteracao=" + etapaIteracao + ", perguntas=" + perguntas + ", status=" + status + '}';
    }
}
