
package com.gestaoqualidadeprojetos.model;

import java.time.LocalDateTime;

/**
 *
 * @author lucas
 */
public class PerguntaModel extends PerguntaBaseModel{
    RespostaModel resposta;
    
    public PerguntaModel(String descricao, LocalDateTime dataCriacao) {
        super(descricao, dataCriacao);
    }

    public PerguntaModel(RespostaModel resposta, String descricao, LocalDateTime dataCriacao) {
        super(descricao, dataCriacao);
        this.resposta = resposta;
    }

    public RespostaModel getResposta() {
        return resposta;
    }
    
    

    
}
