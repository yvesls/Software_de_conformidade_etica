
package com.gestaoqualidadeprojetos.repository;

import com.gestaoqualidadeprojetos.model.MembroEquipe;
import com.gestaoqualidadeprojetos.model.Resposta;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author lucas
 */
public class RespostaRepository {
    private Map<String, List<Resposta>> respostas;
    
    public RespostaRepository() {
        respostas = new HashMap<>();
    }
    
    public void salvarResposta(Resposta resposta) {
        MembroEquipe membro = resposta.getMembro();
        String chave = membro.getNome() + membro.getSobrenome();
    
        // Verifica se a chave já existe no mapa
        if (respostas.containsKey(chave)) {
            respostas.get(chave).add(resposta);
        } else {
            List<Resposta> listaRespostas = new ArrayList<>();
            listaRespostas.add(resposta);
            respostas.put(chave, listaRespostas);
        }
    }
    
    public List<Resposta> obterRespostasPorMembro(MembroEquipe membro) {
        String chave = membro.getNome() + membro.getSobrenome();
        return respostas.get(chave);
    }
    
    public void salvarRespostasPorMembro(MembroEquipe membro, List<Resposta> respostasDoMembro) {
        String chave = membro.getNome() + membro.getSobrenome();
        respostas.put(chave, respostasDoMembro);
    }
}
