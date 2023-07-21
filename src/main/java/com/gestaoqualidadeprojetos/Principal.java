package com.gestaoqualidadeprojetos;

import com.gestaoqualidadeprojetos.model.EtapaIteracao;
import com.gestaoqualidadeprojetos.model.Evidencia;
import com.gestaoqualidadeprojetos.model.Iteracao;
import com.gestaoqualidadeprojetos.model.Justificativa;
import com.gestaoqualidadeprojetos.model.MembroEquipe;
import com.gestaoqualidadeprojetos.model.Pergunta;
import com.gestaoqualidadeprojetos.model.Projeto;
import com.gestaoqualidadeprojetos.model.PerguntaBase;
import com.gestaoqualidadeprojetos.model.QuestionarioEtapaBase;
import com.gestaoqualidadeprojetos.model.QuestionarioEtapa;
import com.gestaoqualidadeprojetos.model.Resposta;
import com.gestaoqualidadeprojetos.model.RespostaPergunta;
import com.gestaoqualidadeprojetos.repository.RespostaPerguntaRepository;
import com.gestaoqualidadeprojetos.repository.ResultadoEtapaMembroEquipeRepository;
import com.gestaoqualidadeprojetos.service.ProjetoService;
import com.gestaoqualidadeprojetos.service.PerguntaBaseService;
import com.gestaoqualidadeprojetos.service.QuestionarioEtapaBaseService;
import com.gestaoqualidadeprojetos.service.QuestionarioEtapaService;
import com.gestaoqualidadeprojetos.service.RespostaService;
import com.gestaoqualidadeprojetos.service.ResultadoService;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Principal {

    public static void main(String[] args) {

        try {
            
            /*PROJETO*/
            //Service de Projeto
            ProjetoService projetoService = new ProjetoService();
            
            //Criando as datas
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDate dataInicio = LocalDate.parse("01/07/2023", formatter);
            LocalDate previsaoFim = LocalDate.parse("01/08/2023", formatter);
            
            //Projeto
            Projeto projetoCascata = projetoService.criarProjeto("Sistema Cascata", dataInicio, previsaoFim, "Em andamento", "CASCATA", 1);
            
            //Equipe
            MembroEquipe cliente = new MembroEquipe("João", "Silva", "joao@projeto.com", "123", "CLIENTE", false, projetoCascata);
            MembroEquipe gerenteProjeto = new MembroEquipe("Maria", "Souza", "maria@projeto.com", "456", "GERENTE DE PROJETO", false, projetoCascata);
            MembroEquipe liderEquipe = new MembroEquipe("Carlos", "Ferreira", "carlos@projeto.com", "789", "LÍDER DE EQUIPE", false, projetoCascata);
            MembroEquipe arquitetoSoftware = new MembroEquipe("Ana", "Santos", "ana@projeto.com", "101112", "ARQUITETO DE SOFTWARE", false, projetoCascata);
            MembroEquipe desenvolvedor = new MembroEquipe("Pedro", "Gomes", "pedro@projeto.com", "131415", "DESENVOLVEDOR", false, projetoCascata);
            MembroEquipe analistaQualidade = new MembroEquipe("Mariana", "Lima", "mariana@projeto.com", "161718", "ANALISTA DE QUALIDADE", false, projetoCascata);
            
            /*QUESTIONÁRIO*/
            // Criando questionários
            QuestionarioEtapa questionarioEtapa1 = new QuestionarioEtapa("Questionário Iniciação", LocalDateTime.now(),  null, null, true);
            QuestionarioEtapa questionarioEtapa2 = new QuestionarioEtapa("Questionário requisitos", LocalDateTime.now(),  null, null, true);
            QuestionarioEtapa questionarioEtapa3 = new QuestionarioEtapa("Questionário projeto", LocalDateTime.now(),  null, null, true);
            QuestionarioEtapa questionarioEtapa4 = new QuestionarioEtapa("Questionário desenvolvimento", LocalDateTime.now(),  null, null, false);
            QuestionarioEtapa questionarioEtapa5 = new QuestionarioEtapa("Questionário testes", LocalDateTime.now(),  null, null, false);
            
            // resposta pergunta
            
            // Criando perguntas
            var rpRepo = new RespostaPerguntaRepository();
            var evidencia = new Evidencia("Evidenciado");
            var justificativa = new Justificativa("Justificado");
            // questionário iniciação
            var listPerguntasIniciacao = new ArrayList<Pergunta>();
            var pergunta = new Pergunta("Qual é o seu nível de satisfação?", LocalDateTime.now().withNano(0));
            
            var respostaPerguntaCliente = new RespostaPergunta(new Resposta(cliente, true, evidencia), pergunta);
            rpRepo.save(respostaPerguntaCliente);
            var respostaPerguntaGerenteProjeto = new RespostaPergunta(new Resposta(gerenteProjeto, true, evidencia), pergunta);
            rpRepo.save(respostaPerguntaGerenteProjeto);
            var respostaPerguntaLiderEquipe = new RespostaPergunta(new Resposta(liderEquipe, false, justificativa), pergunta);
            rpRepo.save(respostaPerguntaLiderEquipe);
            var respostaPerguntaCArquitetoSoftware = new RespostaPergunta(new Resposta(arquitetoSoftware, true, evidencia), pergunta);
            rpRepo.save(respostaPerguntaCArquitetoSoftware);
            var respostaPerguntaDesenvolvedor = new RespostaPergunta(new Resposta(desenvolvedor, false, justificativa), pergunta);
            rpRepo.save(respostaPerguntaDesenvolvedor);
            var respostaPerguntaAnalistaQualidade = new RespostaPergunta(new Resposta(analistaQualidade, true, evidencia), pergunta);
            rpRepo.save(respostaPerguntaAnalistaQualidade);
            
            pergunta.setQuestionario(questionarioEtapa1);
            
            var pergunta2 = new Pergunta("Você encontrou algum bug no sistema?", LocalDateTime.now().withNano(0));
            
            var respostaPerguntaCliente2 = new RespostaPergunta(new Resposta(cliente, false, justificativa), pergunta2);
            rpRepo.save(respostaPerguntaCliente2);
            var respostaPerguntaGerenteProjeto2 = new RespostaPergunta(new Resposta(gerenteProjeto, true, evidencia), pergunta2);
            rpRepo.save(respostaPerguntaGerenteProjeto2);
            var respostaPerguntaLiderEquipe2 = new RespostaPergunta(new Resposta(liderEquipe, true, evidencia), pergunta2);
            rpRepo.save(respostaPerguntaLiderEquipe2);
            var respostaPerguntaCArquitetoSoftware2 = new RespostaPergunta(new Resposta(arquitetoSoftware, true, evidencia), pergunta2);
            rpRepo.save(respostaPerguntaCArquitetoSoftware2);
            var respostaPerguntaDesenvolvedor2 = new RespostaPergunta(new Resposta(desenvolvedor, true, evidencia), pergunta2);
            rpRepo.save(respostaPerguntaDesenvolvedor2);
            var respostaPerguntaAnalistaQualidade2 = new RespostaPergunta(new Resposta(analistaQualidade, false, justificativa), pergunta2);
            rpRepo.save(respostaPerguntaAnalistaQualidade2);
            
            pergunta2.setQuestionario(questionarioEtapa1);
            
            listPerguntasIniciacao.add(pergunta);
            listPerguntasIniciacao.add(pergunta2);
            
            questionarioEtapa1.setPerguntas(listPerguntasIniciacao);
            
            // questionário requisitos
            var listPerguntasRequisitos = new ArrayList<Pergunta>();
            var pergunta3 = new Pergunta("Você entendeu os objetivos do software?", LocalDateTime.now().withNano(0));
            
            var respostaPerguntaCliente3 = new RespostaPergunta(new Resposta(cliente, true, evidencia), pergunta3);
            rpRepo.save(respostaPerguntaCliente3);
            var respostaPerguntaGerenteProjeto3 = new RespostaPergunta(new Resposta(gerenteProjeto, false, justificativa), pergunta3);
            rpRepo.save(respostaPerguntaGerenteProjeto3);
            var respostaPerguntaLiderEquipe3 = new RespostaPergunta(new Resposta(liderEquipe, true, evidencia), pergunta3);
            rpRepo.save(respostaPerguntaLiderEquipe3);
            var respostaPerguntaCArquitetoSoftware3 = new RespostaPergunta(new Resposta(arquitetoSoftware, true, evidencia), pergunta3);
            rpRepo.save(respostaPerguntaCArquitetoSoftware3);
            var respostaPerguntaDesenvolvedor3 = new RespostaPergunta(new Resposta(desenvolvedor, true, evidencia), pergunta3);
            rpRepo.save(respostaPerguntaDesenvolvedor3);
            var respostaPerguntaAnalistaQualidade3 = new RespostaPergunta(new Resposta(analistaQualidade, true, evidencia), pergunta3);
            rpRepo.save(respostaPerguntaAnalistaQualidade3);
            
            pergunta3.setQuestionario(questionarioEtapa2);
            var pergunta4 = new Pergunta("Você está ciente das políticas éticas que a equipe de desenvolvimento seguirá durante todo o projeto?", LocalDateTime.now().withNano(0));
            
            var respostaPerguntaCliente4 = new RespostaPergunta(new Resposta(cliente, true, evidencia), pergunta4);
            rpRepo.save(respostaPerguntaCliente4);
            var respostaPerguntaGerenteProjeto4 = new RespostaPergunta(new Resposta(gerenteProjeto, false, justificativa), pergunta4);
            rpRepo.save(respostaPerguntaGerenteProjeto4);
            var respostaPerguntaLiderEquipe4 = new RespostaPergunta(new Resposta(liderEquipe, true, evidencia), pergunta4);
            rpRepo.save(respostaPerguntaLiderEquipe4);
            var respostaPerguntaCArquitetoSoftware4 = new RespostaPergunta(new Resposta(arquitetoSoftware, true, evidencia), pergunta4);
            rpRepo.save(respostaPerguntaCArquitetoSoftware4);
            var respostaPerguntaDesenvolvedor4 = new RespostaPergunta(new Resposta(desenvolvedor, true, evidencia), pergunta4);
            rpRepo.save(respostaPerguntaDesenvolvedor4);
            var respostaPerguntaAnalistaQualidade4 = new RespostaPergunta(new Resposta(analistaQualidade, true, evidencia), pergunta4);
            rpRepo.save(respostaPerguntaAnalistaQualidade4);
            
            pergunta4.setQuestionario(questionarioEtapa2);
            
            listPerguntasRequisitos.add(pergunta3);
            listPerguntasRequisitos.add(pergunta4);
            
            questionarioEtapa2.setPerguntas(listPerguntasRequisitos);
            
            // questionário projeto
            var listPerguntasProjeto = new ArrayList<Pergunta>();
            var pergunta5 = new Pergunta("Você tem alguma preocupação com relação ao desenvolvimento ético do software?", LocalDateTime.now().withNano(0));
            
            var respostaPerguntaCliente5 = new RespostaPergunta(new Resposta(cliente, true, evidencia), pergunta5);
            rpRepo.save(respostaPerguntaCliente5);
            var respostaPerguntaGerenteProjeto5 = new RespostaPergunta(new Resposta(gerenteProjeto, false, justificativa), pergunta5);
            rpRepo.save(respostaPerguntaGerenteProjeto5);
            var respostaPerguntaLiderEquipe5 = new RespostaPergunta(new Resposta(liderEquipe, true, evidencia), pergunta5);
            rpRepo.save(respostaPerguntaLiderEquipe5);
            var respostaPerguntaCArquitetoSoftware5 = new RespostaPergunta(new Resposta(arquitetoSoftware, true, evidencia), pergunta5);
            rpRepo.save(respostaPerguntaCArquitetoSoftware5);
            var respostaPerguntaDesenvolvedor5 = new RespostaPergunta(new Resposta(desenvolvedor, true, evidencia), pergunta5);
            rpRepo.save(respostaPerguntaDesenvolvedor5);
            var respostaPerguntaAnalistaQualidade5 = new RespostaPergunta(new Resposta(analistaQualidade, true, evidencia), pergunta5);
            rpRepo.save(respostaPerguntaAnalistaQualidade5);
            
            pergunta5.setQuestionario(questionarioEtapa3);
            var pergunta6 = new Pergunta("Você está disposto a trabalhar em colaboração com a equipe de desenvolvimento para garantir o desenvolvimento ético do software?", LocalDateTime.now().withNano(0));
            
            var respostaPerguntaCliente6 = new RespostaPergunta(new Resposta(cliente, true, evidencia), pergunta6);
            rpRepo.save(respostaPerguntaCliente6);
            var respostaPerguntaGerenteProjeto6 = new RespostaPergunta(new Resposta(gerenteProjeto, false, justificativa), pergunta6);
            rpRepo.save(respostaPerguntaGerenteProjeto6);
            var respostaPerguntaLiderEquipe6 = new RespostaPergunta(new Resposta(liderEquipe, true, evidencia), pergunta6);
            rpRepo.save(respostaPerguntaLiderEquipe6);
            var respostaPerguntaCArquitetoSoftware6 = new RespostaPergunta(new Resposta(arquitetoSoftware, true, evidencia), pergunta6);
            rpRepo.save(respostaPerguntaCArquitetoSoftware6);
            var respostaPerguntaDesenvolvedor6 = new RespostaPergunta(new Resposta(desenvolvedor, true, evidencia), pergunta6);
            rpRepo.save(respostaPerguntaDesenvolvedor6);
            var respostaPerguntaAnalistaQualidade6 = new RespostaPergunta(new Resposta(analistaQualidade, true, evidencia), pergunta6);
            rpRepo.save(respostaPerguntaAnalistaQualidade6);
            
            pergunta6.setQuestionario(questionarioEtapa3);
            
            listPerguntasProjeto.add(pergunta5);
            listPerguntasProjeto.add(pergunta6);
            
            questionarioEtapa3.setPerguntas(listPerguntasProjeto);
            
            // questionário desenvolvimento
            var listPerguntasDesenvolvimento = new ArrayList<Pergunta>();
            var pergunta7 = new Pergunta("Você está disposto a fornecer recursos adicionais para garantir que o software seja desenvolvido de maneira ética?", LocalDateTime.now().withNano(0));
            
            var respostaPerguntaCliente7 = new RespostaPergunta(new Resposta(cliente, true, evidencia), pergunta7);
            rpRepo.save(respostaPerguntaCliente7);
            var respostaPerguntaGerenteProjeto7 = new RespostaPergunta(new Resposta(gerenteProjeto, false, justificativa), pergunta7);
            rpRepo.save(respostaPerguntaGerenteProjeto7);
            var respostaPerguntaLiderEquipe7 = new RespostaPergunta(new Resposta(liderEquipe, true, evidencia), pergunta7);
            rpRepo.save(respostaPerguntaLiderEquipe7);
            var respostaPerguntaCArquitetoSoftware7 = new RespostaPergunta(new Resposta(arquitetoSoftware, true, evidencia), pergunta7);
            rpRepo.save(respostaPerguntaCArquitetoSoftware7);
            var respostaPerguntaDesenvolvedor7 = new RespostaPergunta(new Resposta(desenvolvedor, true, evidencia), pergunta7);
            rpRepo.save(respostaPerguntaDesenvolvedor7);
            var respostaPerguntaAnalistaQualidade7 = new RespostaPergunta(new Resposta(analistaQualidade, true, evidencia), pergunta7);
            rpRepo.save(respostaPerguntaAnalistaQualidade7);
            
            pergunta7.setQuestionario(questionarioEtapa4);
            var pergunta8 = new Pergunta("Você está garantindo que a equipe esteja ciente dos possíveis conflitos éticos que possam surgir durante o desenvolvimento do software?", LocalDateTime.now().withNano(0));
            
            var respostaPerguntaCliente8 = new RespostaPergunta(new Resposta(cliente, true, evidencia), pergunta8);
            rpRepo.save(respostaPerguntaCliente8);
            var respostaPerguntaGerenteProjeto8 = new RespostaPergunta(new Resposta(gerenteProjeto, false, justificativa), pergunta8);
            rpRepo.save(respostaPerguntaGerenteProjeto8);
            var respostaPerguntaLiderEquipe8 = new RespostaPergunta(new Resposta(liderEquipe, true, evidencia), pergunta8);
            rpRepo.save(respostaPerguntaLiderEquipe8);
            var respostaPerguntaCArquitetoSoftware8 = new RespostaPergunta(new Resposta(arquitetoSoftware, true, evidencia), pergunta8);
            rpRepo.save(respostaPerguntaCArquitetoSoftware8);
            var respostaPerguntaDesenvolvedor8 = new RespostaPergunta(new Resposta(desenvolvedor, true, evidencia), pergunta8);
            rpRepo.save(respostaPerguntaDesenvolvedor8);
            var respostaPerguntaAnalistaQualidade8 = new RespostaPergunta(new Resposta(analistaQualidade, true, evidencia), pergunta8);
            rpRepo.save(respostaPerguntaAnalistaQualidade8);
            
            pergunta8.setQuestionario(questionarioEtapa4);
            
            listPerguntasDesenvolvimento.add(pergunta7);
            listPerguntasDesenvolvimento.add(pergunta8);
            
            questionarioEtapa4.setPerguntas(listPerguntasDesenvolvimento);
            
            // questionário testes
            var listPerguntasTestes = new ArrayList<Pergunta>();
            var pergunta9 = new Pergunta("Você está ciente sobre a necessidade de incentivar sua equipe a levantar questões éticas e a discutir possíveis soluções para conflitos éticos?", LocalDateTime.now().withNano(0));
            
            var respostaPerguntaCliente9 = new RespostaPergunta(new Resposta(cliente, true, evidencia), pergunta9);
            rpRepo.save(respostaPerguntaCliente9);
            var respostaPerguntaGerenteProjeto9 = new RespostaPergunta(new Resposta(gerenteProjeto, false, justificativa), pergunta9);
            rpRepo.save(respostaPerguntaGerenteProjeto9);
            var respostaPerguntaLiderEquipe9 = new RespostaPergunta(new Resposta(liderEquipe, true, evidencia), pergunta9);
            rpRepo.save(respostaPerguntaLiderEquipe9);
            var respostaPerguntaCArquitetoSoftware9 = new RespostaPergunta(new Resposta(arquitetoSoftware, true, evidencia), pergunta9);
            rpRepo.save(respostaPerguntaCArquitetoSoftware9);
            var respostaPerguntaDesenvolvedor9 = new RespostaPergunta(new Resposta(desenvolvedor, true, evidencia), pergunta9);
            rpRepo.save(respostaPerguntaDesenvolvedor9);
            var respostaPerguntaAnalistaQualidade9 = new RespostaPergunta(new Resposta(analistaQualidade, true, evidencia), pergunta9);
            rpRepo.save(respostaPerguntaAnalistaQualidade9);
            
            pergunta9.setQuestionario(questionarioEtapa5);
            var pergunta10 = new Pergunta("Você entendeu as políticas éticas estabelecidas pelo administrador?", LocalDateTime.now().withNano(0));
            
            var respostaPerguntaCliente10 = new RespostaPergunta(new Resposta(cliente, true, evidencia), pergunta10);
            rpRepo.save(respostaPerguntaCliente10);
            var respostaPerguntaGerenteProjeto10 = new RespostaPergunta(new Resposta(gerenteProjeto, false, justificativa), pergunta10);
            rpRepo.save(respostaPerguntaGerenteProjeto10);
            var respostaPerguntaLiderEquipe10 = new RespostaPergunta(new Resposta(liderEquipe, true, evidencia), pergunta10);
            rpRepo.save(respostaPerguntaLiderEquipe10);
            var respostaPerguntaCArquitetoSoftware10 = new RespostaPergunta(new Resposta(arquitetoSoftware, true, evidencia), pergunta10);
            rpRepo.save(respostaPerguntaCArquitetoSoftware10);
            var respostaPerguntaDesenvolvedor10 = new RespostaPergunta(new Resposta(desenvolvedor, true, evidencia), pergunta10);
            rpRepo.save(respostaPerguntaDesenvolvedor10);
            var respostaPerguntaAnalistaQualidade10 = new RespostaPergunta(new Resposta(analistaQualidade, true, evidencia), pergunta10);
            rpRepo.save(respostaPerguntaAnalistaQualidade10);
            
            System.out.println("RESPOSTAS E PERGUNTAS");
            System.out.println(rpRepo.getAll());
            
            pergunta10.setQuestionario(questionarioEtapa5);
            
            listPerguntasTestes.add(pergunta9);
            listPerguntasTestes.add(pergunta10);
            
            questionarioEtapa5.setPerguntas(listPerguntasTestes);
            
            // Criando questionários
            /*QuestionarioEtapaBase questionarioEtapaBase1 = new QuestionarioEtapaBase("Questionário Base Etapa", LocalDateTime.now());
            
            questionarioEtapaBase1.adicionarPerguntaBase(pergunta);
            questionarioEtapaBase1.adicionarPerguntaBase(pergunta2);*/
            
            // Criando perguntas base
            /*PerguntaBase perguntaBase1 = new PerguntaBase("Você entendeu os objetivos do software?", LocalDateTime.now().withNano(0));
            PerguntaBase perguntaBase2 = new PerguntaBase("Você está ciente das políticas éticas que a equipe de desenvolvimento seguirá durante todo o projeto?", LocalDateTime.now().withNano(0));
            PerguntaBase perguntaBase3 = new PerguntaBase("Você está disposto a fornecer feedback para a equipe de desenvolvimento durante todo o processo?", LocalDateTime.now().withNano(0));
            PerguntaBase perguntaBase4 = new PerguntaBase("Você tem alguma preocupação com relação ao desenvolvimento ético do software?", LocalDateTime.now().withNano(0));
            PerguntaBase perguntaBase5 = new PerguntaBase("Você está ciente de quaisquer requisitos legais ou regulatórios relacionados ao desenvolvimento do software?", LocalDateTime.now().withNano(0));
            PerguntaBase perguntaBase6 = new PerguntaBase("Foi determinado quem toma as decisões em nome da sua empresa?", LocalDateTime.now().withNano(0));
            PerguntaBase perguntaBase7 = new PerguntaBase("Foi determinado quem aprova a flexibilidade orçamentária para o gerenciamento projeto?", LocalDateTime.now().withNano(0));
            
            // Criando questionários base
            QuestionarioEtapaBase questionarioEtapaBase1 = new QuestionarioEtapaBase("Cascata", LocalDateTime.now());
            
            questionarioEtapaBase1.adicionarPerguntaBase(perguntaBase1);
            questionarioEtapaBase1.adicionarPerguntaBase(perguntaBase2);
            questionarioEtapaBase1.adicionarPerguntaBase(perguntaBase3);
            questionarioEtapaBase1.adicionarPerguntaBase(perguntaBase4);
            questionarioEtapaBase1.adicionarPerguntaBase(perguntaBase5);
            questionarioEtapaBase1.adicionarPerguntaBase(perguntaBase6);
            questionarioEtapaBase1.adicionarPerguntaBase(perguntaBase7);*/
            
            // Criando questionários
            /* QuestionarioEtapa questionarioEtapa1 = new QuestionarioEtapa(questionarioEtapaBase1.getNomeQuestionario(), LocalDateTime.now());
            
            // pergunta base
            PerguntaBaseService perguntaBaseService = new PerguntaBaseService();
            
            perguntaBaseService.salvarPerguntaBase(pergunta);
            perguntaBaseService.salvarPerguntaBase(pergunta2);
            
            perguntaBaseService.salvarPerguntaBase(perguntaBase1);
            perguntaBaseService.salvarPerguntaBase(perguntaBase2);
            perguntaBaseService.salvarPerguntaBase(perguntaBase3);
            perguntaBaseService.salvarPerguntaBase(perguntaBase4);
            perguntaBaseService.salvarPerguntaBase(perguntaBase5);
            perguntaBaseService.salvarPerguntaBase(perguntaBase6);
            perguntaBaseService.salvarPerguntaBase(perguntaBase7);*/
            
            QuestionarioEtapaBaseService questionarioEtapaBaseService = new QuestionarioEtapaBaseService();
            //questionarioEtapaBaseService.salvarQuestionarioEtapaBase(questionarioEtapaBase1);
            
            QuestionarioEtapaService questionarioEtapaService = new QuestionarioEtapaService();
            /*questionarioEtapaService.salvarQuestionario(questionarioEtapa1);*/
            
            /*PROJETO*/
            
            projetoService.addMembroEquipe(projetoCascata, cliente);
            projetoService.addMembroEquipe(projetoCascata, gerenteProjeto);
            projetoService.addMembroEquipe(projetoCascata, liderEquipe);
            projetoService.addMembroEquipe(projetoCascata, arquitetoSoftware);
            projetoService.addMembroEquipe(projetoCascata, desenvolvedor);
            projetoService.addMembroEquipe(projetoCascata, analistaQualidade);
            
            //Iteração
            Iteracao cascata = new Iteracao("Iteração Única", dataInicio, previsaoFim, null, "ABERTA", projetoCascata, null);
            projetoService.addIteracao(projetoCascata, cascata);
            
            //Etapas
            var listEtapas = new ArrayList<EtapaIteracao>();
            EtapaIteracao iniciacao = new EtapaIteracao("Iniciação", 5, questionarioEtapa1, cascata);
            questionarioEtapa1.setEtapaIteracao(iniciacao);
            listEtapas.add(iniciacao);
            EtapaIteracao requisitos = new EtapaIteracao("Requisitos", 20, questionarioEtapa2, cascata);
            questionarioEtapa2.setEtapaIteracao(requisitos);
            listEtapas.add(requisitos);
            EtapaIteracao projeto = new EtapaIteracao("Projeto", 10, questionarioEtapa3, cascata);
            questionarioEtapa3.setEtapaIteracao(projeto);
            listEtapas.add(projeto);
            EtapaIteracao desenvolvimento = new EtapaIteracao("Desenvolvimento", 40, questionarioEtapa4, cascata);
            questionarioEtapa4.setEtapaIteracao(desenvolvimento);
            listEtapas.add(desenvolvimento);
            EtapaIteracao testeVerificacao = new EtapaIteracao("Teste e Verificação", 25, questionarioEtapa5, cascata);
            questionarioEtapa5.setEtapaIteracao(testeVerificacao);
            listEtapas.add(testeVerificacao);
            
            // seta etapas da iteracao
            cascata.setEtapas(listEtapas);
            
            /*projetoService.addEtapa(projetoCascata, "Iteração Única", iniciacao);
            projetoService.addEtapa(projetoCascata, "Iteração Única", requisitos);
            projetoService.addEtapa(projetoCascata, "Iteração Única", projeto);
            projetoService.addEtapa(projetoCascata, "Iteração Única", desenvolvimento);
            projetoService.addEtapa(projetoCascata, "Iteração Única", testeVerificacao);*/
            
            //Salva o Projeto
            //projetoCascata = projetoService.finalizarIteracao(projetoCascata, "Iteração Única", previsaoFim);
            //projetoCascata = projetoService.finalizarProjeto(projetoCascata, previsaoFim);
            //projetoService.salvar(projetoCascata);
            
            /*IMPRIMIR NO CONSOLE*/
            //Ver Projeto
            System.out.println("\n--------------------------PROJETO--------------------------\n");
            //projetoService.verProjeto("Sistema Cascata");
            
            //Ver Questionário e Respostas
            System.out.println("\n--------------------------QUESTIONÁRIO--------------------------\n");
            
            // Obtendo os questionários
            System.out.println("\nQuestionários Etapa:");
            for (QuestionarioEtapa questionarioEtapa : questionarioEtapaService.obterQuestionarios()) {
                System.out.println(questionarioEtapa.getNomeQuestionario());
            }
            
            // Responder os questionários CLIENTE
            /*Resposta resposta1ClienteCascata = new Resposta(cliente, true);
            resposta1ClienteCascata.setEvidencia("Evidência da resposta 1 positiva\n");
            
            RespostaService respostaService = new RespostaService();
            
            Resposta resposta2ClienteCascata = new Resposta(cliente, false);
            resposta2ClienteCascata.setJustificativa("Justificativa da resposta 2 negativa\n");
            
            Resposta resposta3ClienteCascata = new Resposta(cliente, true);
            resposta3ClienteCascata.setEvidencia("Evidência da resposta 3 positiva\n");
            
            Resposta resposta4ClienteCascata = new Resposta(cliente, false);
            resposta4ClienteCascata.setJustificativa("Justificativa da resposta 4 negativa\n");
            
            Resposta resposta5ClienteCascata = new Resposta(cliente, false);
            resposta5ClienteCascata.setJustificativa("Evidência da resposta 5 negativa\n");
            
            Resposta resposta6ClienteCascata = new Resposta(cliente, true);
            resposta6ClienteCascata.setEvidencia("Justificativa da resposta 6 positiva\n");
            
            Resposta resposta7ClienteCascata = new Resposta(cliente, true);
            resposta7ClienteCascata.setEvidencia("Justificativa da resposta 7 positiva\n");
            
            RespostaService respostaClienteCascata = new RespostaService();
            respostaClienteCascata.salvarResposta(cliente, resposta1ClienteCascata);
            respostaClienteCascata.salvarResposta(cliente, resposta2ClienteCascata);
            respostaClienteCascata.salvarResposta(cliente, resposta3ClienteCascata);
            respostaClienteCascata.salvarResposta(cliente, resposta4ClienteCascata);
            respostaClienteCascata.salvarResposta(cliente, resposta5ClienteCascata);
            respostaClienteCascata.salvarResposta(cliente, resposta6ClienteCascata);
            respostaClienteCascata.salvarResposta(cliente, resposta7ClienteCascata);
            
            *******************************************************************/
            
            // Responder os questionários GERENTE PROJ.
            /*Resposta resposta1GerenteCascata = new Resposta(gerenteProjeto, true);
            resposta1GerenteCascata.setEvidencia("Evidência da resposta 1 positiva\n");
            
            Resposta resposta2GerenteCascata = new Resposta(gerenteProjeto, true);
            resposta2GerenteCascata.setEvidencia("Justificativa da resposta 2 positiva\n");
            
            Resposta resposta3GerenteCascata = new Resposta(gerenteProjeto, true);
            resposta3GerenteCascata.setEvidencia("Evidência da resposta 3 positiva\n");
            
            Resposta resposta4GerenteCascata = new Resposta(gerenteProjeto, true);
            resposta4GerenteCascata.setEvidencia("Justificativa da resposta 4 positiva\n");
            
            Resposta resposta5GerenteCascata = new Resposta(gerenteProjeto, false);
            resposta5GerenteCascata.setJustificativa("Evidência da resposta 5 negativa\n");
            
            Resposta resposta6GerenteCascata = new Resposta(gerenteProjeto, true);
            resposta6GerenteCascata.setEvidencia("Justificativa da resposta 6 positiva\n");
            
            Resposta resposta7GerenteCascata = new Resposta(gerenteProjeto, false);
            resposta7GerenteCascata.setJustificativa("Justificativa da resposta 7 negativa\n");
            
            RespostaService respostaGerenteCascata = new RespostaService();
            respostaGerenteCascata.salvarResposta(gerenteProjeto, resposta1GerenteCascata);
            respostaGerenteCascata.salvarResposta(gerenteProjeto, resposta2GerenteCascata);
            respostaGerenteCascata.salvarResposta(gerenteProjeto, resposta3GerenteCascata);
            respostaGerenteCascata.salvarResposta(gerenteProjeto, resposta4GerenteCascata);
            respostaGerenteCascata.salvarResposta(gerenteProjeto, resposta5GerenteCascata);
            respostaGerenteCascata.salvarResposta(gerenteProjeto, resposta6GerenteCascata);
            respostaGerenteCascata.salvarResposta(gerenteProjeto, resposta7GerenteCascata);*/
            
            /********************************************************************/
            
            // Obtendo as perguntas base
            /*int numeroPergunta = 0;
            for (PerguntaBase perguntaBase : perguntaBaseService.obterPerguntasBase()) {

        /*PROJETO*/
        //Service de Projeto
        ProjetoService projetoService = new ProjetoService();

        //Criando as datas
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate dataInicio = LocalDate.parse("01/07/2023", formatter);
        LocalDate previsaoFim = LocalDate.parse("01/08/2023", formatter);

        //Projeto
        Projeto projetoCascata = projetoService.criarProjeto("Sistema Cascata", dataInicio, previsaoFim, "Em andamento", "CASCATA", 1);

        //Equipe
        MembroEquipe cliente = new MembroEquipe("João", "Silva", "joao@projeto.com", "123", "CLIENTE", false, projetoCascata);
        MembroEquipe gerenteProjeto = new MembroEquipe("Maria", "Souza", "maria@projeto.com", "456", "GERENTE DE PROJETO", false, projetoCascata);
        MembroEquipe liderEquipe = new MembroEquipe("Carlos", "Ferreira", "carlos@projeto.com", "789", "LÍDER DE EQUIPE", false, projetoCascata);
        MembroEquipe arquitetoSoftware = new MembroEquipe("Ana", "Santos", "ana@projeto.com", "101112", "ARQUITETO DE SOFTWARE", false, projetoCascata);
        MembroEquipe desenvolvedor = new MembroEquipe("Pedro", "Gomes", "pedro@projeto.com", "131415", "DESENVOLVEDOR", false, projetoCascata);
        MembroEquipe analistaQualidade = new MembroEquipe("Mariana", "Lima", "mariana@projeto.com", "161718", "ANALISTA DE QUALIDADE", false, projetoCascata);

        /*QUESTIONÁRIO*/
        // Criando questionários
        QuestionarioEtapa questionarioEtapa1 = new QuestionarioEtapa("Questionário Iniciação", LocalDateTime.now(),  null, null, true);
        QuestionarioEtapa questionarioEtapa2 = new QuestionarioEtapa("Questionário requisitos", LocalDateTime.now(),  null, null, true);
        QuestionarioEtapa questionarioEtapa3 = new QuestionarioEtapa("Questionário projeto", LocalDateTime.now(),  null, null, true);
        QuestionarioEtapa questionarioEtapa4 = new QuestionarioEtapa("Questionário desenvolvimento", LocalDateTime.now(),  null, null, true);
        QuestionarioEtapa questionarioEtapa5 = new QuestionarioEtapa("Questionário testes", LocalDateTime.now(),  null, null, true);
        
        // resposta pergunta
        
        // Criando perguntas
        var rpRepo = new RespostaPerguntaRepository();
        var evidencia = new Evidencia("Evidenciado");
        var justificativa = new Justificativa("Justificado");
        // questionário iniciação
        var listPerguntasIniciacao = new ArrayList<Pergunta>();
        var pergunta = new Pergunta("Qual é o seu nível de satisfação?", LocalDateTime.now().withNano(0));
        
        var respostaPerguntaCliente = new RespostaPergunta(new Resposta(cliente, true, evidencia), pergunta);
        rpRepo.save(respostaPerguntaCliente);
        var respostaPerguntaGerenteProjeto = new RespostaPergunta(new Resposta(gerenteProjeto, true, evidencia), pergunta);
        rpRepo.save(respostaPerguntaGerenteProjeto);
        var respostaPerguntaLiderEquipe = new RespostaPergunta(new Resposta(liderEquipe, false, justificativa), pergunta);
        rpRepo.save(respostaPerguntaLiderEquipe);
        var respostaPerguntaCArquitetoSoftware = new RespostaPergunta(new Resposta(arquitetoSoftware, true, evidencia), pergunta);
        rpRepo.save(respostaPerguntaCArquitetoSoftware);
        var respostaPerguntaDesenvolvedor = new RespostaPergunta(new Resposta(desenvolvedor, false, justificativa), pergunta);
        rpRepo.save(respostaPerguntaDesenvolvedor);
        var respostaPerguntaAnalistaQualidade = new RespostaPergunta(new Resposta(analistaQualidade, true, evidencia), pergunta);
        rpRepo.save(respostaPerguntaAnalistaQualidade);
        
        pergunta.setQuestionario(questionarioEtapa1);
        
        var pergunta2 = new Pergunta("Você encontrou algum bug no sistema?", LocalDateTime.now().withNano(0));
        
        var respostaPerguntaCliente2 = new RespostaPergunta(new Resposta(cliente, false, justificativa), pergunta2);
        rpRepo.save(respostaPerguntaCliente2);
        var respostaPerguntaGerenteProjeto2 = new RespostaPergunta(new Resposta(gerenteProjeto, true, evidencia), pergunta2);
        rpRepo.save(respostaPerguntaGerenteProjeto2);
        var respostaPerguntaLiderEquipe2 = new RespostaPergunta(new Resposta(liderEquipe, true, evidencia), pergunta2);
        rpRepo.save(respostaPerguntaLiderEquipe2);
        var respostaPerguntaCArquitetoSoftware2 = new RespostaPergunta(new Resposta(arquitetoSoftware, true, evidencia), pergunta2);
        rpRepo.save(respostaPerguntaCArquitetoSoftware2);
        var respostaPerguntaDesenvolvedor2 = new RespostaPergunta(new Resposta(desenvolvedor, true, evidencia), pergunta2);
        rpRepo.save(respostaPerguntaDesenvolvedor2);
        var respostaPerguntaAnalistaQualidade2 = new RespostaPergunta(new Resposta(analistaQualidade, false, justificativa), pergunta2);
        rpRepo.save(respostaPerguntaAnalistaQualidade2);
        
        pergunta2.setQuestionario(questionarioEtapa1);
        
        listPerguntasIniciacao.add(pergunta);
        listPerguntasIniciacao.add(pergunta2);
        
        questionarioEtapa1.setPerguntas(listPerguntasIniciacao);
        
        // questionário requisitos
        var listPerguntasRequisitos = new ArrayList<Pergunta>();
        var pergunta3 = new Pergunta("Você entendeu os objetivos do software?", LocalDateTime.now().withNano(0));
        
        var respostaPerguntaCliente3 = new RespostaPergunta(new Resposta(cliente, true, evidencia), pergunta3);
        rpRepo.save(respostaPerguntaCliente3);
        var respostaPerguntaGerenteProjeto3 = new RespostaPergunta(new Resposta(gerenteProjeto, false, justificativa), pergunta3);
        rpRepo.save(respostaPerguntaGerenteProjeto3);
        var respostaPerguntaLiderEquipe3 = new RespostaPergunta(new Resposta(liderEquipe, true, evidencia), pergunta3);
        rpRepo.save(respostaPerguntaLiderEquipe3);
        var respostaPerguntaCArquitetoSoftware3 = new RespostaPergunta(new Resposta(arquitetoSoftware, true, evidencia), pergunta3);
        rpRepo.save(respostaPerguntaCArquitetoSoftware3);
        var respostaPerguntaDesenvolvedor3 = new RespostaPergunta(new Resposta(desenvolvedor, true, evidencia), pergunta3);
        rpRepo.save(respostaPerguntaDesenvolvedor3);
        var respostaPerguntaAnalistaQualidade3 = new RespostaPergunta(new Resposta(analistaQualidade, true, evidencia), pergunta3);
        rpRepo.save(respostaPerguntaAnalistaQualidade3);
        
        pergunta3.setQuestionario(questionarioEtapa2);
        var pergunta4 = new Pergunta("Você está ciente das políticas éticas que a equipe de desenvolvimento seguirá durante todo o projeto?", LocalDateTime.now().withNano(0));
        
        var respostaPerguntaCliente4 = new RespostaPergunta(new Resposta(cliente, true, evidencia), pergunta4);
        rpRepo.save(respostaPerguntaCliente4);
        var respostaPerguntaGerenteProjeto4 = new RespostaPergunta(new Resposta(gerenteProjeto, false, justificativa), pergunta4);
        rpRepo.save(respostaPerguntaGerenteProjeto4);
        var respostaPerguntaLiderEquipe4 = new RespostaPergunta(new Resposta(liderEquipe, true, evidencia), pergunta4);
        rpRepo.save(respostaPerguntaLiderEquipe4);
        var respostaPerguntaCArquitetoSoftware4 = new RespostaPergunta(new Resposta(arquitetoSoftware, true, evidencia), pergunta4);
        rpRepo.save(respostaPerguntaCArquitetoSoftware4);
        var respostaPerguntaDesenvolvedor4 = new RespostaPergunta(new Resposta(desenvolvedor, true, evidencia), pergunta4);
        rpRepo.save(respostaPerguntaDesenvolvedor4);
        var respostaPerguntaAnalistaQualidade4 = new RespostaPergunta(new Resposta(analistaQualidade, true, evidencia), pergunta4);
        rpRepo.save(respostaPerguntaAnalistaQualidade4);
        
        pergunta4.setQuestionario(questionarioEtapa2);
        
        listPerguntasRequisitos.add(pergunta3);
        listPerguntasRequisitos.add(pergunta4);
        
        questionarioEtapa2.setPerguntas(listPerguntasRequisitos);
        
        // questionário projeto
        var listPerguntasProjeto = new ArrayList<Pergunta>();
        var pergunta5 = new Pergunta("Você tem alguma preocupação com relação ao desenvolvimento ético do software?", LocalDateTime.now().withNano(0));
        
        var respostaPerguntaCliente5 = new RespostaPergunta(new Resposta(cliente, true, evidencia), pergunta5);
        rpRepo.save(respostaPerguntaCliente5);
        var respostaPerguntaGerenteProjeto5 = new RespostaPergunta(new Resposta(gerenteProjeto, false, justificativa), pergunta5);
        rpRepo.save(respostaPerguntaGerenteProjeto5);
        var respostaPerguntaLiderEquipe5 = new RespostaPergunta(new Resposta(liderEquipe, true, evidencia), pergunta5);
        rpRepo.save(respostaPerguntaLiderEquipe5);
        var respostaPerguntaCArquitetoSoftware5 = new RespostaPergunta(new Resposta(arquitetoSoftware, true, evidencia), pergunta5);
        rpRepo.save(respostaPerguntaCArquitetoSoftware5);
        var respostaPerguntaDesenvolvedor5 = new RespostaPergunta(new Resposta(desenvolvedor, true, evidencia), pergunta5);
        rpRepo.save(respostaPerguntaDesenvolvedor5);
        var respostaPerguntaAnalistaQualidade5 = new RespostaPergunta(new Resposta(analistaQualidade, true, evidencia), pergunta5);
        rpRepo.save(respostaPerguntaAnalistaQualidade5);
        
        pergunta5.setQuestionario(questionarioEtapa3);
        var pergunta6 = new Pergunta("Você está disposto a trabalhar em colaboração com a equipe de desenvolvimento para garantir o desenvolvimento ético do software?", LocalDateTime.now().withNano(0));
        
        var respostaPerguntaCliente6 = new RespostaPergunta(new Resposta(cliente, true, evidencia), pergunta6);
        rpRepo.save(respostaPerguntaCliente6);
        var respostaPerguntaGerenteProjeto6 = new RespostaPergunta(new Resposta(gerenteProjeto, false, justificativa), pergunta6);
        rpRepo.save(respostaPerguntaGerenteProjeto6);
        var respostaPerguntaLiderEquipe6 = new RespostaPergunta(new Resposta(liderEquipe, true, evidencia), pergunta6);
        rpRepo.save(respostaPerguntaLiderEquipe6);
        var respostaPerguntaCArquitetoSoftware6 = new RespostaPergunta(new Resposta(arquitetoSoftware, true, evidencia), pergunta6);
        rpRepo.save(respostaPerguntaCArquitetoSoftware6);
        var respostaPerguntaDesenvolvedor6 = new RespostaPergunta(new Resposta(desenvolvedor, true, evidencia), pergunta6);
        rpRepo.save(respostaPerguntaDesenvolvedor6);
        var respostaPerguntaAnalistaQualidade6 = new RespostaPergunta(new Resposta(analistaQualidade, true, evidencia), pergunta6);
        rpRepo.save(respostaPerguntaAnalistaQualidade6);
        
        pergunta6.setQuestionario(questionarioEtapa3);
        
        listPerguntasProjeto.add(pergunta5);
        listPerguntasProjeto.add(pergunta6);
        
        questionarioEtapa3.setPerguntas(listPerguntasProjeto);
        
        // questionário desenvolvimento
        var listPerguntasDesenvolvimento = new ArrayList<Pergunta>();
        var pergunta7 = new Pergunta("Você está disposto a fornecer recursos adicionais para garantir que o software seja desenvolvido de maneira ética?", LocalDateTime.now().withNano(0));
        
        var respostaPerguntaCliente7 = new RespostaPergunta(new Resposta(cliente, true, evidencia), pergunta7);
        rpRepo.save(respostaPerguntaCliente7);
        var respostaPerguntaGerenteProjeto7 = new RespostaPergunta(new Resposta(gerenteProjeto, false, justificativa), pergunta7);
        rpRepo.save(respostaPerguntaGerenteProjeto7);
        var respostaPerguntaLiderEquipe7 = new RespostaPergunta(new Resposta(liderEquipe, true, evidencia), pergunta7);
        rpRepo.save(respostaPerguntaLiderEquipe7);
        var respostaPerguntaCArquitetoSoftware7 = new RespostaPergunta(new Resposta(arquitetoSoftware, true, evidencia), pergunta7);
        rpRepo.save(respostaPerguntaCArquitetoSoftware7);
        var respostaPerguntaDesenvolvedor7 = new RespostaPergunta(new Resposta(desenvolvedor, true, evidencia), pergunta7);
        rpRepo.save(respostaPerguntaDesenvolvedor7);
        var respostaPerguntaAnalistaQualidade7 = new RespostaPergunta(new Resposta(analistaQualidade, true, evidencia), pergunta7);
        rpRepo.save(respostaPerguntaAnalistaQualidade7);
        
        pergunta7.setQuestionario(questionarioEtapa4);
        var pergunta8 = new Pergunta("Você está garantindo que a equipe esteja ciente dos possíveis conflitos éticos que possam surgir durante o desenvolvimento do software?", LocalDateTime.now().withNano(0));
        
        var respostaPerguntaCliente8 = new RespostaPergunta(new Resposta(cliente, true, evidencia), pergunta8);
        rpRepo.save(respostaPerguntaCliente8);
        var respostaPerguntaGerenteProjeto8 = new RespostaPergunta(new Resposta(gerenteProjeto, false, justificativa), pergunta8);
        rpRepo.save(respostaPerguntaGerenteProjeto8);
        var respostaPerguntaLiderEquipe8 = new RespostaPergunta(new Resposta(liderEquipe, true, evidencia), pergunta8);
        rpRepo.save(respostaPerguntaLiderEquipe8);
        var respostaPerguntaCArquitetoSoftware8 = new RespostaPergunta(new Resposta(arquitetoSoftware, true, evidencia), pergunta8);
        rpRepo.save(respostaPerguntaCArquitetoSoftware8);
        var respostaPerguntaDesenvolvedor8 = new RespostaPergunta(new Resposta(desenvolvedor, true, evidencia), pergunta8);
        rpRepo.save(respostaPerguntaDesenvolvedor8);
        var respostaPerguntaAnalistaQualidade8 = new RespostaPergunta(new Resposta(analistaQualidade, true, evidencia), pergunta8);
        rpRepo.save(respostaPerguntaAnalistaQualidade8);
        
        pergunta8.setQuestionario(questionarioEtapa4);
        
        listPerguntasDesenvolvimento.add(pergunta7);
        listPerguntasDesenvolvimento.add(pergunta8);
        
        questionarioEtapa4.setPerguntas(listPerguntasDesenvolvimento);
        
        // questionário testes
        var listPerguntasTestes = new ArrayList<Pergunta>();
        var pergunta9 = new Pergunta("Você está ciente sobre a necessidade de incentivar sua equipe a levantar questões éticas e a discutir possíveis soluções para conflitos éticos?", LocalDateTime.now().withNano(0));
        
        var respostaPerguntaCliente9 = new RespostaPergunta(new Resposta(cliente, true, evidencia), pergunta9);
        rpRepo.save(respostaPerguntaCliente9);
        var respostaPerguntaGerenteProjeto9 = new RespostaPergunta(new Resposta(gerenteProjeto, false, justificativa), pergunta9);
        rpRepo.save(respostaPerguntaGerenteProjeto9);
        var respostaPerguntaLiderEquipe9 = new RespostaPergunta(new Resposta(liderEquipe, true, evidencia), pergunta9);
        rpRepo.save(respostaPerguntaLiderEquipe9);
        var respostaPerguntaCArquitetoSoftware9 = new RespostaPergunta(new Resposta(arquitetoSoftware, true, evidencia), pergunta9);
        rpRepo.save(respostaPerguntaCArquitetoSoftware9);
        var respostaPerguntaDesenvolvedor9 = new RespostaPergunta(new Resposta(desenvolvedor, true, evidencia), pergunta9);
        rpRepo.save(respostaPerguntaDesenvolvedor9);
        var respostaPerguntaAnalistaQualidade9 = new RespostaPergunta(new Resposta(analistaQualidade, true, evidencia), pergunta9);
        rpRepo.save(respostaPerguntaAnalistaQualidade9);
        
        pergunta9.setQuestionario(questionarioEtapa5);
        var pergunta10 = new Pergunta("Você entendeu as políticas éticas estabelecidas pelo administrador?                                                                                                                                                                                                ", LocalDateTime.now().withNano(0));
        
        var respostaPerguntaCliente10 = new RespostaPergunta(new Resposta(cliente, true, evidencia), pergunta10);
        rpRepo.save(respostaPerguntaCliente10);
        var respostaPerguntaGerenteProjeto10 = new RespostaPergunta(new Resposta(gerenteProjeto, false, justificativa), pergunta10);
        rpRepo.save(respostaPerguntaGerenteProjeto10);
        var respostaPerguntaLiderEquipe10 = new RespostaPergunta(new Resposta(liderEquipe, true, evidencia), pergunta10);
        rpRepo.save(respostaPerguntaLiderEquipe10);
        var respostaPerguntaCArquitetoSoftware10 = new RespostaPergunta(new Resposta(arquitetoSoftware, true, evidencia), pergunta10);
        rpRepo.save(respostaPerguntaCArquitetoSoftware10);
        var respostaPerguntaDesenvolvedor10 = new RespostaPergunta(new Resposta(desenvolvedor, true, evidencia), pergunta10);
        rpRepo.save(respostaPerguntaDesenvolvedor10);
        var respostaPerguntaAnalistaQualidade10 = new RespostaPergunta(new Resposta(analistaQualidade, true, evidencia), pergunta10);
        rpRepo.save(respostaPerguntaAnalistaQualidade10);
        
        //System.out.println("RESPOSTAS E PERGUNTAS");
        //System.out.println(rpRepo.getAll());
        
        pergunta10.setQuestionario(questionarioEtapa5);
        
        listPerguntasTestes.add(pergunta9);
        listPerguntasTestes.add(pergunta10);
        
        questionarioEtapa5.setPerguntas(listPerguntasTestes);
        
        // Criando questionários
        /*QuestionarioEtapaBase questionarioEtapaBase1 = new QuestionarioEtapaBase("Questionário Base Etapa", LocalDateTime.now());

        questionarioEtapaBase1.adicionarPerguntaBase(pergunta);
        questionarioEtapaBase1.adicionarPerguntaBase(pergunta2);*/

        // Criando perguntas base
        /*PerguntaBase perguntaBase1 = new PerguntaBase("Você entendeu os objetivos do software?", LocalDateTime.now().withNano(0));
        PerguntaBase perguntaBase2 = new PerguntaBase("Você está ciente das políticas éticas que a equipe de desenvolvimento seguirá durante todo o projeto?", LocalDateTime.now().withNano(0));
        PerguntaBase perguntaBase3 = new PerguntaBase("Você está disposto a fornecer feedback para a equipe de desenvolvimento durante todo o processo?", LocalDateTime.now().withNano(0));
        PerguntaBase perguntaBase4 = new PerguntaBase("Você tem alguma preocupação com relação ao desenvolvimento ético do software?", LocalDateTime.now().withNano(0));
        PerguntaBase perguntaBase5 = new PerguntaBase("Você está ciente de quaisquer requisitos legais ou regulatórios relacionados ao desenvolvimento do software?", LocalDateTime.now().withNano(0));
        PerguntaBase perguntaBase6 = new PerguntaBase("Foi determinado quem toma as decisões em nome da sua empresa?", LocalDateTime.now().withNano(0));
        PerguntaBase perguntaBase7 = new PerguntaBase("Foi determinado quem aprova a flexibilidade orçamentária para o gerenciamento projeto?", LocalDateTime.now().withNano(0));
        
        // Criando questionários base
        QuestionarioEtapaBase questionarioEtapaBase1 = new QuestionarioEtapaBase("Cascata", LocalDateTime.now());

        questionarioEtapaBase1.adicionarPerguntaBase(perguntaBase1);
        questionarioEtapaBase1.adicionarPerguntaBase(perguntaBase2);
        questionarioEtapaBase1.adicionarPerguntaBase(perguntaBase3);
        questionarioEtapaBase1.adicionarPerguntaBase(perguntaBase4);
        questionarioEtapaBase1.adicionarPerguntaBase(perguntaBase5);
        questionarioEtapaBase1.adicionarPerguntaBase(perguntaBase6);
        questionarioEtapaBase1.adicionarPerguntaBase(perguntaBase7);*/
        
        // Criando questionários
        /* QuestionarioEtapa questionarioEtapa1 = new QuestionarioEtapa(questionarioEtapaBase1.getNomeQuestionario(), LocalDateTime.now());

        // pergunta base
        PerguntaBaseService perguntaBaseService = new PerguntaBaseService();

        perguntaBaseService.salvarPerguntaBase(pergunta);
        perguntaBaseService.salvarPerguntaBase(pergunta2);

        perguntaBaseService.salvarPerguntaBase(perguntaBase1);
        perguntaBaseService.salvarPerguntaBase(perguntaBase2);
        perguntaBaseService.salvarPerguntaBase(perguntaBase3);
        perguntaBaseService.salvarPerguntaBase(perguntaBase4);
        perguntaBaseService.salvarPerguntaBase(perguntaBase5);
        perguntaBaseService.salvarPerguntaBase(perguntaBase6);
        perguntaBaseService.salvarPerguntaBase(perguntaBase7);*/

        QuestionarioEtapaBaseService questionarioEtapaBaseService = new QuestionarioEtapaBaseService();
        //questionarioEtapaBaseService.salvarQuestionarioEtapaBase(questionarioEtapaBase1);

        QuestionarioEtapaService questionarioEtapaService = new QuestionarioEtapaService();
        /*questionarioEtapaService.salvarQuestionario(questionarioEtapa1);*/

        /*PROJETO*/
        
        projetoService.addMembroEquipe(projetoCascata, cliente);
        projetoService.addMembroEquipe(projetoCascata, gerenteProjeto);
        projetoService.addMembroEquipe(projetoCascata, liderEquipe);
        projetoService.addMembroEquipe(projetoCascata, arquitetoSoftware);
        projetoService.addMembroEquipe(projetoCascata, desenvolvedor);
        projetoService.addMembroEquipe(projetoCascata, analistaQualidade);

        //Iteração
        Iteracao cascata = new Iteracao("Iteração Única", dataInicio, previsaoFim, null, "ABERTA", projetoCascata, null);
        projetoService.addIteracao(projetoCascata, cascata);
        
        //Etapas
        var listEtapas = new ArrayList<EtapaIteracao>();
        EtapaIteracao iniciacao = new EtapaIteracao("Iniciação", 5, questionarioEtapa1, cascata);
        questionarioEtapa1.setEtapaIteracao(iniciacao);
        listEtapas.add(iniciacao);
        EtapaIteracao requisitos = new EtapaIteracao("Requisitos", 20, questionarioEtapa2, cascata);
        questionarioEtapa2.setEtapaIteracao(requisitos);
        listEtapas.add(requisitos);
        EtapaIteracao projeto = new EtapaIteracao("Projeto", 10, questionarioEtapa3, cascata);
        questionarioEtapa3.setEtapaIteracao(projeto);
        listEtapas.add(projeto);
        EtapaIteracao desenvolvimento = new EtapaIteracao("Desenvolvimento", 40, questionarioEtapa4, cascata);
        questionarioEtapa4.setEtapaIteracao(desenvolvimento);
        listEtapas.add(desenvolvimento);
        EtapaIteracao testeVerificacao = new EtapaIteracao("Teste e Verificação", 25, questionarioEtapa5, cascata);
        questionarioEtapa5.setEtapaIteracao(testeVerificacao);
        listEtapas.add(testeVerificacao);
        
        // seta etapas da iteracao
        cascata.setEtapas(listEtapas);

        /*projetoService.addEtapa(projetoCascata, "Iteração Única", iniciacao);
        projetoService.addEtapa(projetoCascata, "Iteração Única", requisitos);
        projetoService.addEtapa(projetoCascata, "Iteração Única", projeto);
        projetoService.addEtapa(projetoCascata, "Iteração Única", desenvolvimento);
        projetoService.addEtapa(projetoCascata, "Iteração Única", testeVerificacao);*/
        questionarioEtapa1.setEtapaIteracao(iniciacao);
        questionarioEtapa2.setEtapaIteracao(requisitos);
        questionarioEtapa3.setEtapaIteracao(projeto);
        questionarioEtapa4.setEtapaIteracao(desenvolvimento);
        questionarioEtapa5.setEtapaIteracao(testeVerificacao);

        //Salva o Projeto
        //projetoCascata = projetoService.finalizarIteracao(projetoCascata, "Iteração Única", previsaoFim);
        //projetoCascata = projetoService.finalizarProjeto(projetoCascata, previsaoFim);
        //projetoService.salvar(projetoCascata);

        /*IMPRIMIR NO CONSOLE*/
        //Ver Projeto
        System.out.println("\n--------------------------PROJETO--------------------------\n");
        //projetoService.verProjeto("Sistema Cascata");

        //Ver Questionário e Respostas
        System.out.println("\n--------------------------QUESTIONÁRIO--------------------------\n");

        // Obtendo os questionários
        //System.out.println("\nQuestionários Etapa:");
        /*for (QuestionarioEtapa questionarioEtapa : questionarioEtapaService.obterQuestionarios()) {
            System.out.println(questionarioEtapa.getNomeQuestionario());
        }*/

        // Responder os questionários CLIENTE
        /*Resposta resposta1ClienteCascata = new Resposta(cliente, true);
        resposta1ClienteCascata.setEvidencia("Evidência da resposta 1 positiva\n");

        RespostaService respostaService = new RespostaService();

        Resposta resposta2ClienteCascata = new Resposta(cliente, false);
        resposta2ClienteCascata.setJustificativa("Justificativa da resposta 2 negativa\n");

        Resposta resposta3ClienteCascata = new Resposta(cliente, true);
        resposta3ClienteCascata.setEvidencia("Evidência da resposta 3 positiva\n");

        Resposta resposta4ClienteCascata = new Resposta(cliente, false);
        resposta4ClienteCascata.setJustificativa("Justificativa da resposta 4 negativa\n");

        Resposta resposta5ClienteCascata = new Resposta(cliente, false);
        resposta5ClienteCascata.setJustificativa("Evidência da resposta 5 negativa\n");

        Resposta resposta6ClienteCascata = new Resposta(cliente, true);
        resposta6ClienteCascata.setEvidencia("Justificativa da resposta 6 positiva\n");
        
        Resposta resposta7ClienteCascata = new Resposta(cliente, true);
        resposta7ClienteCascata.setEvidencia("Justificativa da resposta 7 positiva\n");
        
        RespostaService respostaClienteCascata = new RespostaService();
        respostaClienteCascata.salvarResposta(cliente, resposta1ClienteCascata);
        respostaClienteCascata.salvarResposta(cliente, resposta2ClienteCascata);
        respostaClienteCascata.salvarResposta(cliente, resposta3ClienteCascata);
        respostaClienteCascata.salvarResposta(cliente, resposta4ClienteCascata);
        respostaClienteCascata.salvarResposta(cliente, resposta5ClienteCascata);
        respostaClienteCascata.salvarResposta(cliente, resposta6ClienteCascata);
        respostaClienteCascata.salvarResposta(cliente, resposta7ClienteCascata);
        
        *******************************************************************/
        
        // Responder os questionários GERENTE PROJ.
        /*Resposta resposta1GerenteCascata = new Resposta(gerenteProjeto, true);
        resposta1GerenteCascata.setEvidencia("Evidência da resposta 1 positiva\n");

        Resposta resposta2GerenteCascata = new Resposta(gerenteProjeto, true);
        resposta2GerenteCascata.setEvidencia("Justificativa da resposta 2 positiva\n");

        Resposta resposta3GerenteCascata = new Resposta(gerenteProjeto, true);
        resposta3GerenteCascata.setEvidencia("Evidência da resposta 3 positiva\n");

        Resposta resposta4GerenteCascata = new Resposta(gerenteProjeto, true);
        resposta4GerenteCascata.setEvidencia("Justificativa da resposta 4 positiva\n");

        Resposta resposta5GerenteCascata = new Resposta(gerenteProjeto, false);
        resposta5GerenteCascata.setJustificativa("Evidência da resposta 5 negativa\n");

        Resposta resposta6GerenteCascata = new Resposta(gerenteProjeto, true);
        resposta6GerenteCascata.setEvidencia("Justificativa da resposta 6 positiva\n");
        
        Resposta resposta7GerenteCascata = new Resposta(gerenteProjeto, false);
        resposta7GerenteCascata.setJustificativa("Justificativa da resposta 7 negativa\n");
        
        RespostaService respostaGerenteCascata = new RespostaService();
        respostaGerenteCascata.salvarResposta(gerenteProjeto, resposta1GerenteCascata);
        respostaGerenteCascata.salvarResposta(gerenteProjeto, resposta2GerenteCascata);
        respostaGerenteCascata.salvarResposta(gerenteProjeto, resposta3GerenteCascata);
        respostaGerenteCascata.salvarResposta(gerenteProjeto, resposta4GerenteCascata);
        respostaGerenteCascata.salvarResposta(gerenteProjeto, resposta5GerenteCascata);
        respostaGerenteCascata.salvarResposta(gerenteProjeto, resposta6GerenteCascata);
        respostaGerenteCascata.salvarResposta(gerenteProjeto, resposta7GerenteCascata);*/

        /********************************************************************/
     /*   System.out.println("\n\nQuestionários Etapa 1:");
        // Obtendo as perguntas base
        int numeroPergunta = 0;
        for (Pergunta perguntaB : pergunta.getQuestionario().getPerguntas()) {
            numeroPergunta++;
            System.out.println("\nPergunta Base " + numeroPergunta + ":");
            System.out.println(perguntaB.getDescricao() + " " + perguntaB.getDataCriacao());
            
            //respostaService.obterRespostasPorMembro(cliente);
            }
            
            // Obtendo respostas do CLIENTE
            respostaClienteCascata.obterRespostasPorMembro(cliente);
            System.out.println("*********************************************");
            // Obtendo respostas do GERENTE DE PROJ.
            respostaGerenteCascata.obterRespostasPorMembro(gerenteProjeto);*/
            
            /*DASHBOARD*/
            System.out.println("\n--------------------------DASHBOARD--------------------------\n");
            System.out.println("\n--------------------------GERAR RESULTADO DA ITERAÇÃO--------------------------\n");
            System.out.println("Gerar resultado para iteração: ");
            var resultadoService = new ResultadoService();
            resultadoService.gerarResultadoIteracao(projetoCascata.getIteracoes().get(0));
            System.out.println("\n--------------------------GERAR RESULTADO DO PROJETO--------------------------\n");
            resultadoService.gerarResultadoProjeto(projetoCascata);
        } catch (RuntimeException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        System.out.println("\n\nQuestionários Etapa 2:");
        numeroPergunta =0;
        for (Pergunta perguntaB : pergunta3.getQuestionario().getPerguntas()) {
            numeroPergunta++;
            System.out.println("\nPergunta Base " + numeroPergunta + ":");
            System.out.println(perguntaB.getDescricao() + " " + perguntaB.getDataCriacao());
            
            //respostaService.obterRespostasPorMembro(cliente);
        }*/
     
        // Obtendo perguntas e respostas de todos por etapa INICIAÇÃO
        List<RespostaPergunta> respostasEtapa1 = rpRepo.getByQuestionarioEtapa(questionarioEtapa1);
        for (RespostaPergunta rp : respostasEtapa1) {
            System.out.println(questionarioEtapa1.getNomeQuestionario() + "\nPergunta: " + rp.getPergunta().getDescricao() );
            System.out.println(rp.getResposta());
            System.out.println("--------\n");
            
        }
        
        // Obtendo perguntas e respostas de todos por etapa REQUISITOS
        List<RespostaPergunta> respostasEtapa2 = rpRepo.getByQuestionarioEtapa(questionarioEtapa2);
        for (RespostaPergunta rp : respostasEtapa2) {
            System.out.println(questionarioEtapa2.getNomeQuestionario() + "\nPergunta: " + rp.getPergunta().getDescricao() );
            System.out.println(rp.getResposta());
            System.out.println("--------\n");
            
        }
        
        
        
        
        
        // Obtendo respostas do CLIENTE
        //rpRepo.getByQuestionarioEtapa(questionarioEtapa1);
        
        System.out.println("*********************************************");
        // Obtendo respostas do GERENTE DE PROJ.
        //respostaGerenteCascata.obterRespostasPorMembro(gerenteProjeto);
        
        /*DASHBOARD*/
        System.out.println("\n--------------------------DASHBOARD--------------------------\n");

        System.out.println("Visualizar resultado da iteracao vigente selecionada: ");
        var resultadoService = new ResultadoService();
        System.out.println(resultadoService.getResultadoIteracao(cascata));

        System.out.println("Visualizar resultado dos membros de equipe da iteração vigente selecionada: ");
        System.out.println(resultadoService.getResultadoIteracaoMembroEquipe(cascata));

        System.out.println("Visualizar resultado do projeto: ");
        //System.out.println(resultadoProjetoService.getResultadoProjeto(projetoCascata));

        System.out.println("----------------------------------------------------");
        System.out.println("----------------------------------------------------");
        System.out.println("----------------------------------------------------");
        resultadoService.gerarResultadoIteracao(projetoCascata.getIteracoes().get(0));
        var rEMembroRepository = new ResultadoEtapaMembroEquipeRepository();
        System.out.println(rEMembroRepository.getAll());

    }
}
