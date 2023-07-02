package com.gestaoqualidadeprojetos;
import com.gestaoqualidadeprojetos.model.EtapaIteracao;
import com.gestaoqualidadeprojetos.model.Iteracao;
import com.gestaoqualidadeprojetos.model.MembroEquipe;
import com.gestaoqualidadeprojetos.model.Projeto;
import com.gestaoqualidadeprojetos.model.PerguntaBase;
import com.gestaoqualidadeprojetos.model.QuestionarioEtapaBase;
import com.gestaoqualidadeprojetos.model.QuestionarioEtapa;
import com.gestaoqualidadeprojetos.model.Resposta;
import com.gestaoqualidadeprojetos.service.ProjetoService;
import com.gestaoqualidadeprojetos.service.MembroEquipeService;
import com.gestaoqualidadeprojetos.service.PerguntaBaseService;
import com.gestaoqualidadeprojetos.service.QuestionarioEtapaBaseService;
import com.gestaoqualidadeprojetos.service.QuestionarioEtapaService;
import com.gestaoqualidadeprojetos.service.RespostaService;
import com.gestaoqualidadeprojetos.service.ResultadoService;
import java.time.LocalDateTime;
import java.util.Date;

public class Principal {

    public static void main(String[] args) throws Exception {
        
        /*PROJETO*/

        System.out.println("\n--------------------------PROJETO--------------------------\n");
        
        //Service de Projeto
        ProjetoService projetoService = new ProjetoService();

        //Projeto
        Projeto projetoCascata = new Projeto("Sistema Cascata", new Date(), new Date(), "Em andamento", "CASCATA", 1, new Date());

        projetoService.criarProjeto(projetoCascata);

        //Equipe
        MembroEquipe cliente = new MembroEquipe("João", "Silva", "joao@projeto.com", "123", "CLIENTE", false);
        MembroEquipe gerenteProjeto = new MembroEquipe("Maria", "Souza", "maria@projeto.com", "456", "GERENTE DE PROJETO", false);
        MembroEquipe liderEquipe = new MembroEquipe("Carlos", "Ferreira", "carlos@projeto.com", "789", "LÍDER DE EQUIPE", false);
        MembroEquipe arquitetoSoftware = new MembroEquipe("Ana", "Santos", "ana@projeto.com", "101112", "ARQUITETO DE SOFTWARE", false);
        MembroEquipe desenvolvedor = new MembroEquipe("Pedro", "Gomes", "pedro@projeto.com", "131415", "DESENVOLVEDOR", false);
        MembroEquipe analistaQualidade = new MembroEquipe("Mariana", "Lima", "mariana@projeto.com", "161718", "ANALISTA DE QUALIDADE", false);

        // Service de Membros de Equipe
        MembroEquipeService membroService = new MembroEquipeService();

        membroService.addMembro(cliente);
        membroService.addMembro(gerenteProjeto);
        membroService.addMembro(liderEquipe);
        membroService.addMembro(arquitetoSoftware);
        membroService.addMembro(desenvolvedor);
        membroService.addMembro(analistaQualidade);

        projetoService.addMembroEquipe(projetoCascata, cliente);
        projetoService.addMembroEquipe(projetoCascata, gerenteProjeto);
        projetoService.addMembroEquipe(projetoCascata, liderEquipe);
        projetoService.addMembroEquipe(projetoCascata, arquitetoSoftware);
        projetoService.addMembroEquipe(projetoCascata, desenvolvedor);
        projetoService.addMembroEquipe(projetoCascata, analistaQualidade);

        //Iteração
        Iteracao cascata = new Iteracao("Iteração Única", new Date(), new Date(), new Date(), "ABERTA");
        projetoService.criarIteracao(projetoCascata, cascata);

        //Etapas
        EtapaIteracao iniciacao = new EtapaIteracao("Iniciação", 5);
        EtapaIteracao requisitos = new EtapaIteracao("Requisitos", 20);
        EtapaIteracao projeto = new EtapaIteracao("Projeto", 10);
        EtapaIteracao desenvolvimento = new EtapaIteracao("Desenvolvimento", 40);
        EtapaIteracao testeVerificacao = new EtapaIteracao("Teste e Verificação", 25);

        projetoService.criarEtapa(projetoCascata, cascata, iniciacao);
        projetoService.criarEtapa(projetoCascata, cascata, requisitos);
        projetoService.criarEtapa(projetoCascata, cascata, projeto);
        projetoService.criarEtapa(projetoCascata, cascata, desenvolvimento);
        projetoService.criarEtapa(projetoCascata, cascata, testeVerificacao);;

        //Ver o Projeto
        projetoService.verProjeto(projetoCascata);
        //projetoService.listarProjeto();

        /*QUESTIONÁRIO*/
        
        System.out.println("\n--------------------------QUESTIONÁRIO--------------------------\n");
        
        // Criando perguntas base
        PerguntaBase perguntaBase1 = new PerguntaBase("Qual é o seu nível de satisfação?", LocalDateTime.now());
        PerguntaBase perguntaBase2 = new PerguntaBase("Você encontrou algum bug no sistema?", LocalDateTime.now());

        // Criando questionários base
        QuestionarioEtapaBase questionarioEtapaBase1 = new QuestionarioEtapaBase("Questionário Etapa Base 1", LocalDateTime.now());
        
        questionarioEtapaBase1.adicionarPerguntaBase(perguntaBase1);
        questionarioEtapaBase1.adicionarPerguntaBase(perguntaBase2);

        // Criando questionários
        QuestionarioEtapa questionarioEtapa1 = new QuestionarioEtapa(questionarioEtapaBase1.getNomeQuestionario(), LocalDateTime.now());

        PerguntaBaseService perguntaBaseService = new PerguntaBaseService();
        
        perguntaBaseService.salvarPerguntaBase(perguntaBase1);
        perguntaBaseService.salvarPerguntaBase(perguntaBase2);

        QuestionarioEtapaBaseService questionarioEtapaBaseService = new QuestionarioEtapaBaseService();
        questionarioEtapaBaseService.salvarQuestionarioEtapaBase(questionarioEtapaBase1);

        QuestionarioEtapaService questionarioEtapaService = new QuestionarioEtapaService();
        questionarioEtapaService.salvarQuestionario(questionarioEtapa1);

        // Obtendo os questionários
        System.out.println("\nQuestionários Etapa:");
        for (QuestionarioEtapa questionarioEtapa : questionarioEtapaService.obterQuestionarios()) {
            System.out.println(questionarioEtapa.getNomeQuestionario());
        }

        // Responder os questionários
        Resposta resposta1 = new Resposta(cliente, true);
        resposta1.setEvidencia("Evidência da resposta positiva");

        Resposta resposta2 = new Resposta(gerenteProjeto, false);
        resposta2.setJustificativa("Justificativa da resposta negativa");
        
        Resposta resposta3 = new Resposta(liderEquipe, true);
        resposta1.setEvidencia("Evidência da resposta positiva");

        Resposta resposta4 = new Resposta(arquitetoSoftware, false);
        resposta2.setJustificativa("Justificativa da resposta negativa");
        
        Resposta resposta5 = new Resposta(desenvolvedor, true);
        resposta1.setEvidencia("Evidência da resposta positiva");

        Resposta resposta6 = new Resposta(analistaQualidade, false);
        resposta2.setJustificativa("Justificativa da resposta negativa");

        RespostaService respostaService = new RespostaService();
        respostaService.salvarResposta(cliente, resposta1);
        respostaService.salvarResposta(gerenteProjeto, resposta2);

        // Obtendo as respostas
        Resposta resposta;
        
        resposta = respostaService.obterRespostaPorMembro(cliente);
        resposta = respostaService.obterRespostaPorMembro(gerenteProjeto);

        /*DASHBOARD*/
        
        System.out.println("\n--------------------------DASHBOARD--------------------------\n");
        
        System.out.println("Visualizar resultado da iteracao vigente selecionada: ");
        var resultadoIteracaoService = new ResultadoService();
        System.out.println(resultadoIteracaoService.getByIteracao("Iteração 1"));

        System.out.println("Visualizar resultado dos membros de equipe da iteração vigente selecionada: ");
        var resultadoMembroEquipeService = new ResultadoService();
        System.out.println(resultadoMembroEquipeService.getByIteracao("Iteração 1"));

        System.out.println("Visualizar resultado do projeto: ");
        var resultadoProjetoService = new ResultadoService();
        System.out.println(resultadoProjetoService.getByProjeto("Projeto 1"));
    }
}
