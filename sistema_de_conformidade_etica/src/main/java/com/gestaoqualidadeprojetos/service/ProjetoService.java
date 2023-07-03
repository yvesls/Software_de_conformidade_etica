package com.gestaoqualidadeprojetos.service;

import com.gestaoqualidadeprojetos.model.EtapaIteracao;
import com.gestaoqualidadeprojetos.model.Iteracao;
import com.gestaoqualidadeprojetos.model.MembroEquipe;
import com.gestaoqualidadeprojetos.model.Projeto;
import com.gestaoqualidadeprojetos.repository.ProjetoRepository;
import java.util.List;

public class ProjetoService {

    private ProjetoRepository projetosRepository;
    private Projeto projeto;
    
    public ProjetoService() {
        projetosRepository = new ProjetoRepository();
    }
    
    public void salvarProjeto(Projeto projeto) {
        this.projetosRepository.adicionarProjeto(projeto);
    }

    public Projeto buscarProjeto(Projeto projeto) {
        return this.projetosRepository.buscarProjeto(projeto);
    }

    public void addMembroEquipe(Projeto projeto, MembroEquipe membro) {
        //Projeto projetoBuscado = this.buscarProjeto(projeto);
        //projetoBuscado.addMembroEquipe(membro);
        this.projeto = projeto;
        this.projeto.addMembroEquipe(membro);
    }

    public void criarIteracao(Projeto projeto, Iteracao iteracao) {
        //Projeto projetoBuscado = this.buscarProjeto(projeto);
        //projetoBuscado.addIteracao(iteracao);
        this.projeto = projeto;
        this.projeto.addIteracao(iteracao);
    }

    private Iteracao buscarIteracao(Projeto projeto, Iteracao iteracao) {
        //Projeto projetoBuscado = this.buscarProjeto(projeto);
        this.projeto = projeto;
        for (int i = 0; i < projeto.getIteracoes().size(); i++) {
            if (projeto.getIteracoes().get(i).getDescricao().equals(iteracao.getDescricao())) {
                return projeto.getIteracoes().get(i);
            }
        }
        System.out.println("Iteração não encontrada no projeto " + projeto.getNome());
        return null;
    }

    public void criarEtapa(Projeto projeto, Iteracao iteracao, EtapaIteracao etapa) {
        Iteracao iteracaoBuscada = buscarIteracao(projeto, iteracao);
        if (iteracaoBuscada != null) {
            iteracaoBuscada.addEtapa(etapa);
        } else {
            System.out.println("Etapa não encontrada na iteração" + iteracao.getDescricao() + " do projeto " + projeto.getNome());
        }
    }

    public List<Projeto> listarProjeto() {
        System.out.println("Projetos: " + this.projetosRepository.listarProjetos());
        return this.projetosRepository.listarProjetos();
    }

    public void verProjeto(Projeto projeto){
        Projeto projetoBuscado = this.projetosRepository.buscarProjeto(projeto);
        System.out.println("--------------VER PROJETO--------------");
        System.out.println("PROJETO: " + projetoBuscado.toString());
        System.out.println("EQUIPE:");
        this.projeto.listarEquipe();
        for (Iteracao iteracao : projetoBuscado.getIteracoes()) {
            System.out.println("ITERAÇÃO: " + iteracao.toString());
            for (EtapaIteracao etapa : iteracao.getEtapas()) {
                System.out.println("ETAPAS: " + etapa.toString());
            }
        }
    }

}
