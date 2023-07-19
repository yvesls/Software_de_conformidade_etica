
package com.gestaoqualidadeprojetos.model;

import java.time.LocalDateTime;

/**
 *
 * @author lucas
 */
public class Pergunta extends PerguntaBase{
    private Resposta resposta;
    public Pergunta(String descricao, LocalDateTime dataCriacao) {
        super(descricao, dataCriacao);
    }
    
    public Pergunta(String descricao, LocalDateTime dataCriacao, Resposta resposta) {
        super(descricao, dataCriacao);
        this.resposta = resposta;
    }

    public Resposta getResposta() {
        return resposta;
    }
}
