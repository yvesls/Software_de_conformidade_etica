package com.gestaoqualidadeprojetos;

import com.gestaoqualidadeprojetos.model.MembroEquipe;
import com.gestaoqualidadeprojetos.model.PerguntaBase;
import com.gestaoqualidadeprojetos.model.QuestionarioEtapa;
import com.gestaoqualidadeprojetos.model.QuestionarioEtapaBase;
import com.gestaoqualidadeprojetos.model.Resposta;
import com.gestaoqualidadeprojetos.service.MembroEquipeService;
import com.gestaoqualidadeprojetos.service.PerguntaBaseService;
import com.gestaoqualidadeprojetos.service.QuestionarioEtapaBaseService;
import com.gestaoqualidadeprojetos.service.QuestionarioEtapaService;
import com.gestaoqualidadeprojetos.service.RespostaService;
import java.time.LocalDateTime;

/**
 *
 * @author lucas
 */
public class PrincipalQuestionario {
    public static void main(String args[]){
        // Criando membros da equipe
        MembroEquipe cliente = new MembroEquipe("João", "Silva", "joao@projeto.com", "123", "CLIENTE", false);
        MembroEquipe gerenteProjeto = new MembroEquipe("Maria", "Souza", "maria@projeto.com", "456", "GERENTE DE PROJETO", false);
        MembroEquipe liderEquipe = new MembroEquipe("Carlos", "Ferreira", "carlos@projeto.com", "789", "LÍDER DE EQUIPE", false);
        MembroEquipe arquitetoSoftware = new MembroEquipe("Ana", "Santos", "ana@projeto.com", "101112", "ARQUITETO DE SOFTWARE", false);
        MembroEquipe desenvolvedor = new MembroEquipe("Pedro", "Gomes", "pedro@projeto.com", "131415", "DESENVOLVEDOR", false);
        MembroEquipe analistaQualidade = new MembroEquipe("Mariana", "Lima", "mariana@projeto.com", "161718", "ANALISTA DE QUALIDADE", false);
        // Criando perguntas base
        PerguntaBase perguntaBase1 = new PerguntaBase("Qual é o seu nível de satisfação?", LocalDateTime.now());
        PerguntaBase perguntaBase2 = new PerguntaBase("Você encontrou algum bug no sistema?", LocalDateTime.now());

        // Criando questionários base
        QuestionarioEtapaBase questionarioEtapaBase1 = new QuestionarioEtapaBase("Questionário Etapa Base 1", LocalDateTime.now());
        questionarioEtapaBase1.adicionarPerguntaBase(perguntaBase1);
        questionarioEtapaBase1.adicionarPerguntaBase(perguntaBase2);

        // Criando questionários
        QuestionarioEtapa questionarioEtapa1 = new QuestionarioEtapa(questionarioEtapaBase1.getNomeQuestionario(), LocalDateTime.now());

        // Utilizando os serviços
        MembroEquipeService membroService = new MembroEquipeService();
        membroService.salvarMembro(cliente);
        membroService.salvarMembro(gerenteProjeto);

        PerguntaBaseService perguntaBaseService = new PerguntaBaseService();
        perguntaBaseService.salvarPerguntaBase(perguntaBase1);
        perguntaBaseService.salvarPerguntaBase(perguntaBase2);

        QuestionarioEtapaBaseService questionarioEtapaBaseService = new QuestionarioEtapaBaseService();
        questionarioEtapaBaseService.salvarQuestionarioEtapaBase(questionarioEtapaBase1);

        QuestionarioEtapaService questionarioEtapaService = new QuestionarioEtapaService();
        questionarioEtapaService.salvarQuestionario(questionarioEtapa1);

        

        // Obtendo as perguntas base
        System.out.println("\nPerguntas Base:");
        for (PerguntaBase perguntaBase : perguntaBaseService.obterPerguntasBase()) {
            System.out.println(perguntaBase.getDescricao()+ " " + perguntaBase.getDataCriacao());
        }

       /* // Obtendo os questionários base
        System.out.println("\nQuestionários Etapa Base:");
        for (QuestionarioEtapaBaseModel questionarioEtapaBase : questionarioEtapaBaseService.obterQuestionariosBase()) {
            System.out.println(questionarioEtapaBase.getNomeQuestionario());
        }*/

        // Obtendo os questionários
        System.out.println("\nQuestionários Etapa:");
        for (QuestionarioEtapa questionarioEtapa : questionarioEtapaService.obterQuestionarios()) {
            System.out.println(questionarioEtapa.getNomeQuestionario());
        }
        
        // Criando respostas
        Resposta resposta1 = new Resposta(cliente, true);
        resposta1.setEvidencia("Evidência da resposta positiva");

        Resposta resposta2 = new Resposta(gerenteProjeto, false);
        resposta2.setJustificativa("Justificativa da resposta negativa");
        
        RespostaService respostaService = new RespostaService();
        respostaService.salvarResposta(cliente, resposta1);
        respostaService.salvarResposta(gerenteProjeto, resposta2);
        
        // Obtendo os membros da equipe
        //System.out.println("\nMembros da Equipe:");
        for (MembroEquipe membro : membroService.obterMembros()) {
            //System.out.println(membro.getNome() + " " + membro.getSobrenome());

           // Obtendo as respostas
            System.out.println("\nRespostas:");
       
            Resposta resposta = respostaService.obterRespostaPorMembro(membro);
            System.out.println("Membro: " + membro.getNome());
            System.out.println("Resposta: " + resposta.getResposta());
            if (resposta.getResposta() == true) {
                System.out.println("Evidência: " + resposta.getEvidencia());
            } else {
                System.out.println("Justificativa: " + resposta.getJustificativa());
            }
            System.out.println();
        }
        
       
    }
}
