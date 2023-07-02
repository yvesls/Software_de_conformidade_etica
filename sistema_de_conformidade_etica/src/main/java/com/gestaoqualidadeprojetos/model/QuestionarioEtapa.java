
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
    private String status;

    

    public QuestionarioEtapa(String nomeQuestionario, LocalDateTime dataCriacao) {
        super(nomeQuestionario, dataCriacao);
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    
}
