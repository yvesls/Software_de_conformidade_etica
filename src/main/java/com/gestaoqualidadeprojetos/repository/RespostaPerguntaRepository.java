/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gestaoqualidadeprojetos.repository;

import com.gestaoqualidadeprojetos.model.EtapaIteracao;
import com.gestaoqualidadeprojetos.model.Evidencia;
import com.gestaoqualidadeprojetos.model.Iteracao;
import com.gestaoqualidadeprojetos.model.Justificativa;
import com.gestaoqualidadeprojetos.model.MembroEquipe;
import com.gestaoqualidadeprojetos.model.Pergunta;
import com.gestaoqualidadeprojetos.model.Projeto;
import com.gestaoqualidadeprojetos.model.QuestionarioEtapa;
import com.gestaoqualidadeprojetos.model.Resposta;
import com.gestaoqualidadeprojetos.model.RespostaPergunta;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Note102
 */
public class RespostaPerguntaRepository {

    private List<RespostaPergunta> respostasPerguntas;

    public RespostaPerguntaRepository() {
    }

    public List<RespostaPergunta> getByQuestionarioEtapa(QuestionarioEtapa questionarioEtapa) {
        this.gerarMock();
        var listRp = new ArrayList<RespostaPergunta>();
        for(RespostaPergunta rp : respostasPerguntas) {
            if(rp.getPergunta().getQuestionario().getNomeQuestionario().equals(questionarioEtapa.getNomeQuestionario())) {

                listRp.add(rp);
            }
        }
        return listRp;
    }

    public void save(RespostaPergunta rp) {
        if (this.respostasPerguntas == null) {
            this.respostasPerguntas = new ArrayList<RespostaPergunta>();
            this.respostasPerguntas.add(rp);
        } else {
            this.respostasPerguntas.add(rp);
        }
    }

    public List<RespostaPergunta> getAll() {
        return this.respostasPerguntas;
    }

    private void gerarMock() {
        this.respostasPerguntas = new ArrayList<RespostaPergunta>();
        
        var formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        var dataInicio = LocalDate.parse("01/07/2023", formatter);
        var previsaoFim = LocalDate.parse("01/08/2023", formatter);
        var projetoCascata = new Projeto("Sistema Cascata", dataInicio, previsaoFim, "Em andamento", "CASCATA", 1);
       
        var cliente = new MembroEquipe("João", "Silva", "joao@projeto.com", "123", "CLIENTE", false, projetoCascata);
        var gerenteProjeto = new MembroEquipe("Maria", "Souza", "maria@projeto.com", "456", "GERENTE DE PROJETO", false, projetoCascata);
        var liderEquipe = new MembroEquipe("Carlos", "Ferreira", "carlos@projeto.com", "789", "LÍDER DE EQUIPE", false, projetoCascata);
        var arquitetoSoftware = new MembroEquipe("Ana", "Santos", "ana@projeto.com", "101112", "ARQUITETO DE SOFTWARE", false, projetoCascata);
        var desenvolvedor = new MembroEquipe("Pedro", "Gomes", "pedro@projeto.com", "131415", "DESENVOLVEDOR", false, projetoCascata);
        var analistaQualidade = new MembroEquipe("Mariana", "Lima", "mariana@projeto.com", "161718", "ANALISTA DE QUALIDADE", false, projetoCascata);
       
        var questionarioEtapa1 = new QuestionarioEtapa("Questionário Iniciação", LocalDateTime.now(), null, null, true);
        var questionarioEtapa2 = new QuestionarioEtapa("Questionário requisitos", LocalDateTime.now(), null, null, true);
        var questionarioEtapa3 = new QuestionarioEtapa("Questionário projeto", LocalDateTime.now(), null, null, true);
        var questionarioEtapa4 = new QuestionarioEtapa("Questionário desenvolvimento", LocalDateTime.now(), null, null, true);
        var questionarioEtapa5 = new QuestionarioEtapa("Questionário testes", LocalDateTime.now(), null, null, true);
       
        // resposta pergunta

        var evidencia = new Evidencia("Evidenciado");
        var justificativa = new Justificativa("Justificado");
        // questionário iniciação
        var listPerguntasIniciacao = new ArrayList<Pergunta>();
        var pergunta = new Pergunta("Qual é o seu nível de satisfação?", LocalDateTime.now().withNano(0));
        var respostaPerguntaCliente = new RespostaPergunta(new Resposta(cliente, true, evidencia), pergunta);
        this.respostasPerguntas.add(respostaPerguntaCliente);
        var respostaPerguntaGerenteProjeto = new RespostaPergunta(new Resposta(gerenteProjeto, true, evidencia), pergunta);
        this.respostasPerguntas.add(respostaPerguntaGerenteProjeto);
        var respostaPerguntaLiderEquipe = new RespostaPergunta(new Resposta(liderEquipe, false, justificativa), pergunta);
        this.respostasPerguntas.add(respostaPerguntaLiderEquipe);
        var respostaPerguntaCArquitetoSoftware = new RespostaPergunta(new Resposta(arquitetoSoftware, true, evidencia), pergunta);
        this.respostasPerguntas.add(respostaPerguntaCArquitetoSoftware);
        var respostaPerguntaDesenvolvedor = new RespostaPergunta(new Resposta(desenvolvedor, false, justificativa), pergunta);
        this.respostasPerguntas.add(respostaPerguntaDesenvolvedor);
        var respostaPerguntaAnalistaQualidade = new RespostaPergunta(new Resposta(analistaQualidade, true, evidencia), pergunta);
        this.respostasPerguntas.add(respostaPerguntaAnalistaQualidade);

        pergunta.setQuestionario(questionarioEtapa1);

        var pergunta2 = new Pergunta("Você encontrou algum bug no sistema?", LocalDateTime.now().withNano(0));

        var respostaPerguntaCliente2 = new RespostaPergunta(new Resposta(cliente, false, justificativa), pergunta2);
        this.respostasPerguntas.add(respostaPerguntaCliente2);
        var respostaPerguntaGerenteProjeto2 = new RespostaPergunta(new Resposta(gerenteProjeto, true, evidencia), pergunta2);
        this.respostasPerguntas.add(respostaPerguntaGerenteProjeto2);
        var respostaPerguntaLiderEquipe2 = new RespostaPergunta(new Resposta(liderEquipe, true, evidencia), pergunta2);
        this.respostasPerguntas.add(respostaPerguntaLiderEquipe2);
        var respostaPerguntaCArquitetoSoftware2 = new RespostaPergunta(new Resposta(arquitetoSoftware, true, evidencia), pergunta2);
        this.respostasPerguntas.add(respostaPerguntaCArquitetoSoftware2);
        var respostaPerguntaDesenvolvedor2 = new RespostaPergunta(new Resposta(desenvolvedor, true, evidencia), pergunta2);
        this.respostasPerguntas.add(respostaPerguntaDesenvolvedor2);
        var respostaPerguntaAnalistaQualidade2 = new RespostaPergunta(new Resposta(analistaQualidade, false, justificativa), pergunta2);
        this.respostasPerguntas.add(respostaPerguntaAnalistaQualidade2);

        pergunta2.setQuestionario(questionarioEtapa1);

        listPerguntasIniciacao.add(pergunta);
        listPerguntasIniciacao.add(pergunta2);

        questionarioEtapa1.setPerguntas(listPerguntasIniciacao);

        // questionário requisitos
        var listPerguntasRequisitos = new ArrayList<Pergunta>();
        var pergunta3 = new Pergunta("Você entendeu os objetivos do software?", LocalDateTime.now().withNano(0));

        var respostaPerguntaCliente3 = new RespostaPergunta(new Resposta(cliente, true, evidencia), pergunta3);
        this.respostasPerguntas.add(respostaPerguntaCliente3);
        var respostaPerguntaGerenteProjeto3 = new RespostaPergunta(new Resposta(gerenteProjeto, false, justificativa), pergunta3);
        this.respostasPerguntas.add(respostaPerguntaGerenteProjeto3);
        var respostaPerguntaLiderEquipe3 = new RespostaPergunta(new Resposta(liderEquipe, true, evidencia), pergunta3);
        this.respostasPerguntas.add(respostaPerguntaLiderEquipe3);
        var respostaPerguntaCArquitetoSoftware3 = new RespostaPergunta(new Resposta(arquitetoSoftware, true, evidencia), pergunta3);
        this.respostasPerguntas.add(respostaPerguntaCArquitetoSoftware3);
        var respostaPerguntaDesenvolvedor3 = new RespostaPergunta(new Resposta(desenvolvedor, true, evidencia), pergunta3);
        this.respostasPerguntas.add(respostaPerguntaDesenvolvedor3);
        var respostaPerguntaAnalistaQualidade3 = new RespostaPergunta(new Resposta(analistaQualidade, true, evidencia), pergunta3);
        this.respostasPerguntas.add(respostaPerguntaAnalistaQualidade3);

        pergunta3.setQuestionario(questionarioEtapa2);
        var pergunta4 = new Pergunta("Você está ciente das políticas éticas que a equipe de desenvolvimento seguirá durante todo o projeto?", LocalDateTime.now().withNano(0));

        var respostaPerguntaCliente4 = new RespostaPergunta(new Resposta(cliente, true, evidencia), pergunta4);
        this.respostasPerguntas.add(respostaPerguntaCliente4);
        var respostaPerguntaGerenteProjeto4 = new RespostaPergunta(new Resposta(gerenteProjeto, false, justificativa), pergunta4);
        this.respostasPerguntas.add(respostaPerguntaGerenteProjeto4);
        var respostaPerguntaLiderEquipe4 = new RespostaPergunta(new Resposta(liderEquipe, true, evidencia), pergunta4);
        this.respostasPerguntas.add(respostaPerguntaLiderEquipe4);
        var respostaPerguntaCArquitetoSoftware4 = new RespostaPergunta(new Resposta(arquitetoSoftware, true, evidencia), pergunta4);
        this.respostasPerguntas.add(respostaPerguntaCArquitetoSoftware4);
        var respostaPerguntaDesenvolvedor4 = new RespostaPergunta(new Resposta(desenvolvedor, true, evidencia), pergunta4);
        this.respostasPerguntas.add(respostaPerguntaDesenvolvedor4);
        var respostaPerguntaAnalistaQualidade4 = new RespostaPergunta(new Resposta(analistaQualidade, true, evidencia), pergunta4);
        this.respostasPerguntas.add(respostaPerguntaAnalistaQualidade4);

        pergunta4.setQuestionario(questionarioEtapa2);

        listPerguntasRequisitos.add(pergunta3);
        listPerguntasRequisitos.add(pergunta4);

        questionarioEtapa2.setPerguntas(listPerguntasRequisitos);

        // questionário projeto
        var listPerguntasProjeto = new ArrayList<Pergunta>();
        var pergunta5 = new Pergunta("Você tem alguma preocupação com relação ao desenvolvimento ético do software?", LocalDateTime.now().withNano(0));

        var respostaPerguntaCliente5 = new RespostaPergunta(new Resposta(cliente, true, evidencia), pergunta5);
        this.respostasPerguntas.add(respostaPerguntaCliente5);
        var respostaPerguntaGerenteProjeto5 = new RespostaPergunta(new Resposta(gerenteProjeto, false, justificativa), pergunta5);
        this.respostasPerguntas.add(respostaPerguntaGerenteProjeto5);
        var respostaPerguntaLiderEquipe5 = new RespostaPergunta(new Resposta(liderEquipe, true, evidencia), pergunta5);
        this.respostasPerguntas.add(respostaPerguntaLiderEquipe5);
        var respostaPerguntaCArquitetoSoftware5 = new RespostaPergunta(new Resposta(arquitetoSoftware, true, evidencia), pergunta5);
        this.respostasPerguntas.add(respostaPerguntaCArquitetoSoftware5);
        var respostaPerguntaDesenvolvedor5 = new RespostaPergunta(new Resposta(desenvolvedor, true, evidencia), pergunta5);
        this.respostasPerguntas.add(respostaPerguntaDesenvolvedor5);
        var respostaPerguntaAnalistaQualidade5 = new RespostaPergunta(new Resposta(analistaQualidade, true, evidencia), pergunta5);
        this.respostasPerguntas.add(respostaPerguntaAnalistaQualidade5);

        pergunta5.setQuestionario(questionarioEtapa3);
        var pergunta6 = new Pergunta("Você está disposto a trabalhar em colaboração com a equipe de desenvolvimento para garantir o desenvolvimento ético do software?", LocalDateTime.now().withNano(0));

        var respostaPerguntaCliente6 = new RespostaPergunta(new Resposta(cliente, true, evidencia), pergunta6);
        this.respostasPerguntas.add(respostaPerguntaCliente6);
        var respostaPerguntaGerenteProjeto6 = new RespostaPergunta(new Resposta(gerenteProjeto, false, justificativa), pergunta6);
        this.respostasPerguntas.add(respostaPerguntaGerenteProjeto6);
        var respostaPerguntaLiderEquipe6 = new RespostaPergunta(new Resposta(liderEquipe, true, evidencia), pergunta6);
        this.respostasPerguntas.add(respostaPerguntaLiderEquipe6);
        var respostaPerguntaCArquitetoSoftware6 = new RespostaPergunta(new Resposta(arquitetoSoftware, true, evidencia), pergunta6);
        this.respostasPerguntas.add(respostaPerguntaCArquitetoSoftware6);
        var respostaPerguntaDesenvolvedor6 = new RespostaPergunta(new Resposta(desenvolvedor, true, evidencia), pergunta6);
        this.respostasPerguntas.add(respostaPerguntaDesenvolvedor6);
        var respostaPerguntaAnalistaQualidade6 = new RespostaPergunta(new Resposta(analistaQualidade, true, evidencia), pergunta6);
        this.respostasPerguntas.add(respostaPerguntaAnalistaQualidade6);

        pergunta6.setQuestionario(questionarioEtapa3);

        listPerguntasProjeto.add(pergunta5);
        listPerguntasProjeto.add(pergunta6);

        questionarioEtapa3.setPerguntas(listPerguntasProjeto);

        // questionário desenvolvimento
        var listPerguntasDesenvolvimento = new ArrayList<Pergunta>();
        var pergunta7 = new Pergunta("Você está disposto a fornecer recursos adicionais para garantir que o software seja desenvolvido de maneira ética?", LocalDateTime.now().withNano(0));

        var respostaPerguntaCliente7 = new RespostaPergunta(new Resposta(cliente, true, evidencia), pergunta7);
        this.respostasPerguntas.add(respostaPerguntaCliente7);
        var respostaPerguntaGerenteProjeto7 = new RespostaPergunta(new Resposta(gerenteProjeto, false, justificativa), pergunta7);
        this.respostasPerguntas.add(respostaPerguntaGerenteProjeto7);
        var respostaPerguntaLiderEquipe7 = new RespostaPergunta(new Resposta(liderEquipe, true, evidencia), pergunta7);
        this.respostasPerguntas.add(respostaPerguntaLiderEquipe7);
        var respostaPerguntaCArquitetoSoftware7 = new RespostaPergunta(new Resposta(arquitetoSoftware, true, evidencia), pergunta7);
        this.respostasPerguntas.add(respostaPerguntaCArquitetoSoftware7);
        var respostaPerguntaDesenvolvedor7 = new RespostaPergunta(new Resposta(desenvolvedor, true, evidencia), pergunta7);
        this.respostasPerguntas.add(respostaPerguntaDesenvolvedor7);
        var respostaPerguntaAnalistaQualidade7 = new RespostaPergunta(new Resposta(analistaQualidade, true, evidencia), pergunta7);
        this.respostasPerguntas.add(respostaPerguntaAnalistaQualidade7);

        pergunta7.setQuestionario(questionarioEtapa4);
        var pergunta8 = new Pergunta("Você está garantindo que a equipe esteja ciente dos possíveis conflitos éticos que possam surgir durante o desenvolvimento do software?", LocalDateTime.now().withNano(0));

        var respostaPerguntaCliente8 = new RespostaPergunta(new Resposta(cliente, true, evidencia), pergunta8);
        this.respostasPerguntas.add(respostaPerguntaCliente8);
        var respostaPerguntaGerenteProjeto8 = new RespostaPergunta(new Resposta(gerenteProjeto, false, justificativa), pergunta8);
        this.respostasPerguntas.add(respostaPerguntaGerenteProjeto8);
        var respostaPerguntaLiderEquipe8 = new RespostaPergunta(new Resposta(liderEquipe, true, evidencia), pergunta8);
        this.respostasPerguntas.add(respostaPerguntaLiderEquipe8);
        var respostaPerguntaCArquitetoSoftware8 = new RespostaPergunta(new Resposta(arquitetoSoftware, true, evidencia), pergunta8);
        this.respostasPerguntas.add(respostaPerguntaCArquitetoSoftware8);
        var respostaPerguntaDesenvolvedor8 = new RespostaPergunta(new Resposta(desenvolvedor, true, evidencia), pergunta8);
        this.respostasPerguntas.add(respostaPerguntaDesenvolvedor8);
        var respostaPerguntaAnalistaQualidade8 = new RespostaPergunta(new Resposta(analistaQualidade, true, evidencia), pergunta8);
        this.respostasPerguntas.add(respostaPerguntaAnalistaQualidade8);

        pergunta8.setQuestionario(questionarioEtapa4);

        listPerguntasDesenvolvimento.add(pergunta7);
        listPerguntasDesenvolvimento.add(pergunta8);

        questionarioEtapa4.setPerguntas(listPerguntasDesenvolvimento);

        // questionário testes
        var listPerguntasTestes = new ArrayList<Pergunta>();
        var pergunta9 = new Pergunta("Você está ciente sobre a necessidade de incentivar sua equipe a levantar questões éticas e a discutir possíveis soluções para conflitos éticos?", LocalDateTime.now().withNano(0));

        var respostaPerguntaCliente9 = new RespostaPergunta(new Resposta(cliente, true, evidencia), pergunta9);
        this.respostasPerguntas.add(respostaPerguntaCliente9);
        var respostaPerguntaGerenteProjeto9 = new RespostaPergunta(new Resposta(gerenteProjeto, false, justificativa), pergunta9);
        this.respostasPerguntas.add(respostaPerguntaGerenteProjeto9);
        var respostaPerguntaLiderEquipe9 = new RespostaPergunta(new Resposta(liderEquipe, true, evidencia), pergunta9);
        this.respostasPerguntas.add(respostaPerguntaLiderEquipe9);
        var respostaPerguntaCArquitetoSoftware9 = new RespostaPergunta(new Resposta(arquitetoSoftware, true, evidencia), pergunta9);
        this.respostasPerguntas.add(respostaPerguntaCArquitetoSoftware9);
        var respostaPerguntaDesenvolvedor9 = new RespostaPergunta(new Resposta(desenvolvedor, true, evidencia), pergunta9);
        this.respostasPerguntas.add(respostaPerguntaDesenvolvedor9);
        var respostaPerguntaAnalistaQualidade9 = new RespostaPergunta(new Resposta(analistaQualidade, true, evidencia), pergunta9);
        this.respostasPerguntas.add(respostaPerguntaAnalistaQualidade9);

        pergunta9.setQuestionario(questionarioEtapa5);
        var pergunta10 = new Pergunta("Você entendeu as políticas éticas estabelecidas pelo administrador?", LocalDateTime.now().withNano(0));

        var respostaPerguntaCliente10 = new RespostaPergunta(new Resposta(cliente, true, evidencia), pergunta10);
        this.respostasPerguntas.add(respostaPerguntaCliente10);
        var respostaPerguntaGerenteProjeto10 = new RespostaPergunta(new Resposta(gerenteProjeto, false, justificativa), pergunta10);
        this.respostasPerguntas.add(respostaPerguntaGerenteProjeto10);
        var respostaPerguntaLiderEquipe10 = new RespostaPergunta(new Resposta(liderEquipe, true, evidencia), pergunta10);
        this.respostasPerguntas.add(respostaPerguntaLiderEquipe10);
        var respostaPerguntaCArquitetoSoftware10 = new RespostaPergunta(new Resposta(arquitetoSoftware, true, evidencia), pergunta10);
        this.respostasPerguntas.add(respostaPerguntaCArquitetoSoftware10);
        var respostaPerguntaDesenvolvedor10 = new RespostaPergunta(new Resposta(desenvolvedor, true, evidencia), pergunta10);
        this.respostasPerguntas.add(respostaPerguntaDesenvolvedor10);
        var respostaPerguntaAnalistaQualidade10 = new RespostaPergunta(new Resposta(analistaQualidade, true, evidencia), pergunta10);
        this.respostasPerguntas.add(respostaPerguntaAnalistaQualidade10);

        pergunta10.setQuestionario(questionarioEtapa5);

        listPerguntasTestes.add(pergunta9);
        listPerguntasTestes.add(pergunta10);

        questionarioEtapa5.setPerguntas(listPerguntasTestes);
        
        Iteracao cascata = new Iteracao("Iteração Única", dataInicio, previsaoFim, null, "ABERTA", projetoCascata, null);
        
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
    }
}
