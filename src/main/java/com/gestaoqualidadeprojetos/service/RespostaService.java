
package com.gestaoqualidadeprojetos.service;

import com.gestaoqualidadeprojetos.model.MembroEquipe;
import com.gestaoqualidadeprojetos.model.Resposta;
import com.gestaoqualidadeprojetos.repository.RespostaRepository;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author lucas
 */
public class RespostaService {
    private RespostaRepository respostaRepository;

    public RespostaService() {
        respostaRepository = new RespostaRepository();
    }

    public void salvarResposta(MembroEquipe membro, Resposta resposta) {
        // Adiciona a resposta ao repositório
        //comentar por enquanto//
        //respostaRepository.salvarResposta(resposta);

        // Obtém a lista de respostas do membro do repositório
        List<Resposta> respostasDoMembro = respostaRepository.obterRespostasPorMembro(membro);

        // Se a lista de respostas do membro for nula, cria uma nova lista
        if (respostasDoMembro == null) {
            respostasDoMembro = new ArrayList<>();
        }

        // Adiciona a resposta à lista de respostas do membro
        respostasDoMembro.add(resposta);

        // Atualiza a lista de respostas do membro no repositório
        respostaRepository.salvarRespostasPorMembro(membro, respostasDoMembro);
    }

    public void obterRespostasPorMembro(MembroEquipe membro) {
        List<Resposta> respostas = respostaRepository.obterRespostasPorMembro(membro);
        int numeroResposta = 0;
        if (respostas != null && !respostas.isEmpty()) {
            //System.out.println("\nMembro: " + membro.getNome());
            for (Resposta resposta : respostas) {
                numeroResposta++;
                if (resposta.getResposta() == true) {
                    System.out.println("\nMembro: " + membro.getNome()+ "\nResposta " +numeroResposta+ ": SIM\nEvidência: " + resposta.getEvidencia());
                    
                } else if (resposta.getResposta() == false){
                    System.out.println("\nMembro: " + membro.getNome()+ "\nResposta " +numeroResposta+ ": NÃO\nJustificativa: " + resposta.getJustificativa());
                    
                }
            }
            
        } else {
            System.out.println("\nNenhuma resposta encontrada para o membro: " + membro.getNome() + "\n");
        }
    }
}
