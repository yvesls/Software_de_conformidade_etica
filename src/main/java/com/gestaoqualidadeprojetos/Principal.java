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
import com.gestaoqualidadeprojetos.service.PerguntaBaseService;
import com.gestaoqualidadeprojetos.service.QuestionarioEtapaBaseService;
import com.gestaoqualidadeprojetos.service.QuestionarioEtapaService;
import com.gestaoqualidadeprojetos.service.RespostaService;
import com.gestaoqualidadeprojetos.service.ResultadoService;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Principal {

    public static void main(String[] args) throws Exception {

        /*PROJETO*/
        //Service de Projeto
        ProjetoService projetoService = new ProjetoService();

        //Criando as datas
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate dataInicio = LocalDate.parse("01/07/2023", formatter);
        LocalDate previsaoFim = LocalDate.parse("01/08/2023", formatter);

        //Projeto
        Projeto projetoCascata = projetoService.criarProjeto("Sistema Cascata", dataInicio, previsaoFim, "Em andamento", "CASCATA", 1);

        /*QUESTIONÁRIO*/
        // Criando perguntas base
        PerguntaBase perguntaBase1 = new PerguntaBase("Você entendeu os objetivos do software?", LocalDateTime.now().withNano(0));
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
        questionarioEtapaBase1.adicionarPerguntaBase(perguntaBase7);
        
        // Criando questionários
        QuestionarioEtapa questionarioEtapa1 = new QuestionarioEtapa(questionarioEtapaBase1.getNomeQuestionario(), LocalDateTime.now());

        PerguntaBaseService perguntaBaseService = new PerguntaBaseService();

        perguntaBaseService.salvarPerguntaBase(perguntaBase1);
        perguntaBaseService.salvarPerguntaBase(perguntaBase2);
        perguntaBaseService.salvarPerguntaBase(perguntaBase3);
        perguntaBaseService.salvarPerguntaBase(perguntaBase4);
        perguntaBaseService.salvarPerguntaBase(perguntaBase5);
        perguntaBaseService.salvarPerguntaBase(perguntaBase6);
        perguntaBaseService.salvarPerguntaBase(perguntaBase7);
        
        QuestionarioEtapaBaseService questionarioEtapaBaseService = new QuestionarioEtapaBaseService();
        questionarioEtapaBaseService.salvarQuestionarioEtapaBase(questionarioEtapaBase1);

        QuestionarioEtapaService questionarioEtapaService = new QuestionarioEtapaService();
        questionarioEtapaService.salvarQuestionario(questionarioEtapa1);

        /*PROJETO*/
        //Equipe
        MembroEquipe cliente = new MembroEquipe("João", "Silva", "joao@projeto.com", "123", "CLIENTE", false);
        MembroEquipe gerenteProjeto = new MembroEquipe("Maria", "Souza", "maria@projeto.com", "456", "GERENTE DE PROJETO", false);
        MembroEquipe liderEquipe = new MembroEquipe("Carlos", "Ferreira", "carlos@projeto.com", "789", "LÍDER DE EQUIPE", false);
        MembroEquipe arquitetoSoftware = new MembroEquipe("Ana", "Santos", "ana@projeto.com", "101112", "ARQUITETO DE SOFTWARE", false);
        MembroEquipe desenvolvedor = new MembroEquipe("Pedro", "Gomes", "pedro@projeto.com", "131415", "DESENVOLVEDOR", false);
        MembroEquipe analistaQualidade = new MembroEquipe("Mariana", "Lima", "mariana@projeto.com", "161718", "ANALISTA DE QUALIDADE", false);

        projetoService.addMembroEquipe(projetoCascata, cliente);
        projetoService.addMembroEquipe(projetoCascata, gerenteProjeto);
        projetoService.addMembroEquipe(projetoCascata, liderEquipe);
        projetoService.addMembroEquipe(projetoCascata, arquitetoSoftware);
        projetoService.addMembroEquipe(projetoCascata, desenvolvedor);
        projetoService.addMembroEquipe(projetoCascata, analistaQualidade);

        //Iteração
        Iteracao cascata = new Iteracao("Iteração Única", dataInicio, previsaoFim, "ABERTA");
        projetoService.addIteracao(projetoCascata, cascata);
        
        //Etapas
        EtapaIteracao iniciacao = new EtapaIteracao("Iniciação", 5, questionarioEtapa1);
        EtapaIteracao requisitos = new EtapaIteracao("Requisitos", 20, questionarioEtapa1);
        EtapaIteracao projeto = new EtapaIteracao("Projeto", 10, questionarioEtapa1);
        EtapaIteracao desenvolvimento = new EtapaIteracao("Desenvolvimento", 40, questionarioEtapa1);
        EtapaIteracao testeVerificacao = new EtapaIteracao("Teste e Verificação", 25, questionarioEtapa1);

        projetoService.addEtapa(projetoCascata, "Iteração Única", iniciacao);
        projetoService.addEtapa(projetoCascata, "Iteração Única", requisitos);
        projetoService.addEtapa(projetoCascata, "Iteração Única", projeto);
        projetoService.addEtapa(projetoCascata, "Iteração Única", desenvolvimento);
        projetoService.addEtapa(projetoCascata, "Iteração Única", testeVerificacao);

        //Salva o Projeto
        projetoCascata = projetoService.finalizarIteracao(projetoCascata, "Iteração Única", previsaoFim);
        //projetoCascata = projetoService.finalizarProjeto(projetoCascata, previsaoFim);
        projetoService.salvar(projetoCascata);

        /*IMPRIMIR NO CONSOLE*/
        //Ver Projeto
        System.out.println("\n--------------------------PROJETO--------------------------\n");
        projetoService.verProjeto("Sistema Cascata");

        //Ver Questionário e Respostas
        System.out.println("\n--------------------------QUESTIONÁRIO--------------------------\n");

        // Obtendo os questionários
        System.out.println("\nQuestionários Etapa:");
        for (QuestionarioEtapa questionarioEtapa : questionarioEtapaService.obterQuestionarios()) {
            System.out.println(questionarioEtapa.getNomeQuestionario());
        }

        // Responder os questionários CLIENTE
        Resposta resposta1ClienteCascata = new Resposta(cliente, true);
        resposta1ClienteCascata.setEvidencia("Evidência da resposta 1 positiva\n");

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
        
        /********************************************************************/
        
        // Responder os questionários GERENTE PROJ.
        Resposta resposta1GerenteCascata = new Resposta(gerenteProjeto, true);
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
        respostaGerenteCascata.salvarResposta(gerenteProjeto, resposta7GerenteCascata);

        /********************************************************************/
        
        // Obtendo as perguntas base
        int numeroPergunta = 0;
        for (PerguntaBase perguntaBase : perguntaBaseService.obterPerguntasBase()) {
            numeroPergunta++;
            System.out.println("\nPergunta Base " + numeroPergunta + ":");
            System.out.println(perguntaBase.getDescricao() + " " + perguntaBase.getDataCriacao());
            
            //respostaService.obterRespostasPorMembro(cliente);
        }
        
        // Obtendo respostas do CLIENTE
        respostaClienteCascata.obterRespostasPorMembro(cliente);
        System.out.println("*********************************************");
        // Obtendo respostas do GERENTE DE PROJ.
        respostaGerenteCascata.obterRespostasPorMembro(gerenteProjeto);
        
        
        /*DASHBOARD*/
        System.out.println("\n--------------------------DASHBOARD--------------------------\n");

        System.out.println("Visualizar resultado da iteracao vigente selecionada: ");
        var resultadoIteracaoService = new ResultadoService();
        System.out.println(resultadoIteracaoService.getResultadoIteracao(cascata));

        System.out.println("Visualizar resultado dos membros de equipe da iteração vigente selecionada: ");
        var resultadoMembroEquipeService = new ResultadoService();
        System.out.println(resultadoMembroEquipeService.getResultadoIteracaoMembroEquipe(cascata));

        System.out.println("Visualizar resultado do projeto: ");
        var resultadoProjetoService = new ResultadoService();
        //System.out.println(resultadoProjetoService.getResultadoProjeto(projetoCascata));
    }
}
