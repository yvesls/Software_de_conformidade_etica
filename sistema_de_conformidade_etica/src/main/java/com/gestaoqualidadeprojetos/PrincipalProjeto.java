package com.gestaoqualidadeprojetos;
import com.gestaoqualidadeprojetos.model.EtapaIteracao;
import com.gestaoqualidadeprojetos.model.Iteracao;
import com.gestaoqualidadeprojetos.model.MembroEquipe;
import com.gestaoqualidadeprojetos.model.Projeto;
import com.gestaoqualidadeprojetos.service.ProjetoService;
import java.util.Date;

public class PrincipalProjeto {
    public static void main(String args[]){
        //Service
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
        EtapaIteracao iniciacao =  new EtapaIteracao("Iniciação", 5);
        EtapaIteracao requisitos =  new EtapaIteracao("Requisitos", 20);
        EtapaIteracao projeto =  new EtapaIteracao("Projeto", 10);
        EtapaIteracao desenvolvimento =  new EtapaIteracao("Desenvolvimento", 40);
        EtapaIteracao testeVerificacao =  new EtapaIteracao("Teste e Verificação", 25);
        
        projetoService.criarEtapa(projetoCascata, cascata, iniciacao);
        projetoService.criarEtapa(projetoCascata, cascata, requisitos);
        projetoService.criarEtapa(projetoCascata, cascata, projeto);
        projetoService.criarEtapa(projetoCascata, cascata, desenvolvimento);
        projetoService.criarEtapa(projetoCascata, cascata, testeVerificacao);
        
        //Ver o Projeto
        projetoService.verProjeto(projetoCascata);
    }
}
