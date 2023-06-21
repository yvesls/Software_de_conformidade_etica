
package com.gestaoqualidadeprojetos.model;

import java.time.LocalDateTime;
import java.util.ArrayList;

/**
 *
 * @author lucas
 */
public class QuestionarioEtapaModel extends QuestionarioEtapaBaseModel{
    private LocalDateTime dataConclusao;
    private LocalDateTime previsaoConclusao;
    private String status;
    
    public QuestionarioEtapaModel(String nome, LocalDateTime dataCriacao, ArrayList<PerguntaBaseModel> listaPerguntasBase) {
        super(nome, dataCriacao, listaPerguntasBase);
    }

    public QuestionarioEtapaModel(LocalDateTime dataConclusao, LocalDateTime previsaoConclusao, String status, String nome, LocalDateTime dataCriacao, ArrayList<PerguntaBaseModel> listaPerguntasBase) {
        super(nome, dataCriacao, listaPerguntasBase);
        this.dataConclusao = dataConclusao;
        this.previsaoConclusao = previsaoConclusao;
        this.status = status;
    }

    public LocalDateTime getDataConclusao() {
        return dataConclusao;
    }

    public LocalDateTime getPrevisaoConclusao() {
        return previsaoConclusao;
    }

    public String getStatus() {
        return status;
    }

    public void setDataConclusao(LocalDateTime dataConclusao) {
        this.dataConclusao = dataConclusao;
    }

    public void setPrevisaoConclusao(LocalDateTime previsaoConclusao) {
        this.previsaoConclusao = previsaoConclusao;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    
    
}
