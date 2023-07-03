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

    public void listarTodosProjetos() {
        System.out.println("Todos os projetos:");
        for (Projeto projeto : projetos) {
            System.out.println("Projeto: " + projeto.getNome());
        }
    }

    public void adicionarProjeto(Projeto projeto) {
        Projeto projetoEncontrado = buscarProjeto(projeto.getNome());
        if (projetoEncontrado == null) {
            projetos.add(projeto);
        } else {
            // Atualiza o projeto existente
            projetoEncontrado = projeto;
            System.out.println("Projeto atualizado: " + projetoEncontrado.getNome());
        }
    }

    public Projeto buscarProjeto(String nome) {
        for (Projeto projetoSalvo : projetos) {
            if (projetoSalvo.getNome().equals(nome)) {
                System.out.println("Projeto " + nome + " encontrado");
                return projetoSalvo;
            }
        }
        System.out.println("Projeto " + nome + " não encontrado.");
        return null;
    }

}
