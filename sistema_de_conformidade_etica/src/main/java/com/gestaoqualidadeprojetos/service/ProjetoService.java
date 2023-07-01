package com.gestaoqualidadeprojetos.service;

import com.gestaoqualidadeprojetos.mode.EtapaIteracao;
import com.gestaoqualidadeprojetos.mode.Iteracao;
import com.gestaoqualidadeprojetos.mode.MembroEquipe;
import com.gestaoqualidadeprojetos.mode.Projeto;
import com.gestaoqualidadeprojetos.repository.ProjetoRepository;
import java.util.ArrayList;
import java.util.List;

public class ProjetoService {

    private ProjetoRepository projetosRepository;

    public ProjetoService() {
        projetosRepository = new ProjetoRepository();
    }

    public void criarProjeto(Projeto projeto) {
        this.projetosRepository.adicionarProjeto(projeto);
    }

    public Projeto buscarProjeto(Projeto projeto) {
        return this.projetosRepository.buscarProjeto(projeto);
    }

    public void addMembroEquipe(Projeto projeto, MembroEquipe membro) {
        Projeto projetoBuscado = this.buscarProjeto(projeto);
        projetoBuscado.addMembroEquipe(membro);
    }

    public void criarIteracao(Projeto projeto, Iteracao iteracao) {
        Projeto projetoBuscado = this.buscarProjeto(projeto);
        projetoBuscado.addIteracao(iteracao);
    }

    private Iteracao buscarIteracao(Projeto projeto, Iteracao iteracao) {
        Projeto projetoBuscado = this.buscarProjeto(projeto);
        for (int i = 0; i < projetoBuscado.getIteracoes().size(); i++) {
            if (projetoBuscado.getIteracoes().get(i).getDescricao().equals(iteracao.getDescricao())) {
                return projetoBuscado.getIteracoes().get(i);
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
            System.out.println("Etapa não encontrada na iteração" + iteracao.getDescricao() + "no projeto projeto " + projeto.getNome());
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
        for (Iteracao iteracao : projetoBuscado.getIteracoes()) {
            System.out.println("ITERAÇÃO: " + iteracao.toString());
            for (EtapaIteracao etapa : iteracao.getEtapas()) {
                System.out.println("ETAPAS: " + etapa.toString());
            }
        }
    }

}
