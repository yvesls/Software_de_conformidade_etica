package com.gestaoqualidadeprojetos.repository;
import com.gestaoqualidadeprojetos.model.Projeto;
import java.util.ArrayList;
import java.util.List;

public class ProjetoRepository {
    private List<Projeto> projetos;

    public ProjetoRepository() {
        projetos = new ArrayList<>();
        //projetos.add(new Projeto("Sistema Cascata", new Date(), new Date(), "Em andamento", "CASCATA", 1, new Date()));
        //projetos.add(new Projeto("Sistema Iterativo", new Date(), new Date(), "Em andamento", "ITERATIVO", 5, new Date()));
    }

    public List<Projeto> listarProjetos() {
        return projetos;
    }

    public void adicionarProjeto(Projeto projeto) {
        projetos.add(projeto);
    }

    public Projeto buscarProjeto(String nome){
        for(Projeto projetosSalvos: projetos){
            if(projetosSalvos.getNome().equals(nome));
            System.out.println("Projeto " + nome + " encontrado");
            return projetosSalvos;
        }
        System.out.println("Projeto " + nome + " não encontrado.");
        return null;
    }
}