package com.gestaoqualidadeprojetos;

import com.gestaoqualidadeprojetos.model.MembroEquipeModel;
import com.gestaoqualidadeprojetos.model.PerguntaBaseModel;
import com.gestaoqualidadeprojetos.model.QuestionarioEtapaBaseModel;
import com.gestaoqualidadeprojetos.model.QuestionarioEtapaModel;
import com.gestaoqualidadeprojetos.model.RespostaModel;
import com.gestaoqualidadeprojetos.service.MembroEquipeService;
import com.gestaoqualidadeprojetos.service.PerguntaBaseService;
import com.gestaoqualidadeprojetos.service.QuestionarioEtapaBaseService;
import com.gestaoqualidadeprojetos.service.QuestionarioEtapaService;
import com.gestaoqualidadeprojetos.service.RespostaService;
import java.time.LocalDateTime;
import java.util.List;
import org.jfree.chart.axis.DateTick;

/**
 *
 * @author lucas
 */
public class PrincipalQuestionario {
    public static void main(String args[]){
        // Criando membros da equipe
        MembroEquipeModel membro1 = new MembroEquipeModel("John", "Doe", "john.doe@example.com", "Desenvolvedor");
        MembroEquipeModel membro2 = new MembroEquipeModel("Jane", "Smith", "jane.smith@example.com", "Analista de Qualidade");

        // Criando perguntas base
        PerguntaBaseModel perguntaBase1 = new PerguntaBaseModel("Qual é o seu nível de satisfação?", LocalDateTime.now());
        PerguntaBaseModel perguntaBase2 = new PerguntaBaseModel("Você encontrou algum bug no sistema?", LocalDateTime.now());

        // Criando questionários base
        QuestionarioEtapaBaseModel questionarioEtapaBase1 = new QuestionarioEtapaBaseModel("Questionário Etapa Base 1", LocalDateTime.now());
        questionarioEtapaBase1.adicionarPerguntaBase(perguntaBase1);
        questionarioEtapaBase1.adicionarPerguntaBase(perguntaBase2);

        // Criando questionários
        QuestionarioEtapaModel questionarioEtapa1 = new QuestionarioEtapaModel(questionarioEtapaBase1.getNomeQuestionario(), LocalDateTime.now());

        // Utilizando os serviços
        MembroEquipeService membroService = new MembroEquipeService();
        membroService.salvarMembro(membro1);
        membroService.salvarMembro(membro2);

        PerguntaBaseService perguntaBaseService = new PerguntaBaseService();
        perguntaBaseService.salvarPerguntaBase(perguntaBase1);
        perguntaBaseService.salvarPerguntaBase(perguntaBase2);

        QuestionarioEtapaBaseService questionarioEtapaBaseService = new QuestionarioEtapaBaseService();
        questionarioEtapaBaseService.salvarQuestionarioEtapaBase(questionarioEtapaBase1);

        QuestionarioEtapaService questionarioEtapaService = new QuestionarioEtapaService();
        questionarioEtapaService.salvarQuestionario(questionarioEtapa1);

        

        // Obtendo as perguntas base
        System.out.println("\nPerguntas Base:");
        for (PerguntaBaseModel perguntaBase : perguntaBaseService.obterPerguntasBase()) {
            System.out.println(perguntaBase.getDescricao()+ " " + perguntaBase.getDataCriacao());
        }

       /* // Obtendo os questionários base
        System.out.println("\nQuestionários Etapa Base:");
        for (QuestionarioEtapaBaseModel questionarioEtapaBase : questionarioEtapaBaseService.obterQuestionariosBase()) {
            System.out.println(questionarioEtapaBase.getNomeQuestionario());
        }*/

        // Obtendo os questionários
        System.out.println("\nQuestionários Etapa:");
        for (QuestionarioEtapaModel questionarioEtapa : questionarioEtapaService.obterQuestionarios()) {
            System.out.println(questionarioEtapa.getNomeQuestionario());
        }
        
        // Criando respostas
        RespostaModel resposta1 = new RespostaModel(membro1, true);
        resposta1.setEvidencia("Evidência da resposta positiva");

        RespostaModel resposta2 = new RespostaModel(membro2, false);
        resposta2.setJustificativa("Justificativa da resposta negativa");
        
        RespostaService respostaService = new RespostaService();
        respostaService.salvarResposta(membro1, resposta1);
        respostaService.salvarResposta(membro2, resposta2);
        
        // Obtendo os membros da equipe
        //System.out.println("\nMembros da Equipe:");
        for (MembroEquipeModel membro : membroService.obterMembros()) {
            //System.out.println(membro.getNome() + " " + membro.getSobrenome());

           // Obtendo as respostas
            System.out.println("\nRespostas:");
       
            RespostaModel resposta = respostaService.obterRespostaPorMembro(membro);
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
