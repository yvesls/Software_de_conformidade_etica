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

    public Projeto buscarProjeto(Projeto projeto){
        for(Projeto projetoNoArray: projetos){
            if(projetoNoArray.getNome().equals(projeto.getNome()));
            return projetoNoArray;
        }
        System.out.println("Projeto " + projeto.getNome() + " não encontrado.");
        return null;
    }
}