package com.gestaoqualidadeprojetos.repository;
import com.gestaoqualidadeprojetos.model.Projeto;
import java.util.ArrayList;
import java.util.List;

public class ProjetoRepository {

    private List<Projeto> projetos;

    public ProjetoRepository() {
        projetos = new ArrayList<>();
    }

    public void salvarProjeto(Projeto projeto) {
        Projeto projetoEncontrado = buscarProjeto(projeto.getNome());
        if (projetoEncontrado == null) {
            projetos.add(projeto);
            //System.out.println("Projeto salvo no sistema: " + projeto.getNome());
        } 
        else {
            atualizarProjeto(projeto);
        }
    }

    public void atualizarProjeto(Projeto projeto) {
        Projeto projetoEncontrado = buscarProjeto(projeto.getNome());
        int index = projetos.indexOf(projetoEncontrado);
        //Se for encontrado
        if (index != -1) {
            projetos.set(index, projeto);
            System.out.println("Projeto atualizado: " + projeto.getNome());
        }
        else{
            System.out.println("Projeto " + projeto.getNome() + " não encontrado");
        }
    }

    public Projeto buscarProjeto(String nome) {
        for (Projeto projetoSalvo : projetos) {
            if (projetoSalvo.getNome().equals(nome)) {
                System.out.println("Projeto " + nome + " encontrado");
                return projetoSalvo;
            }
        }
        return null;
    }
    
    public void listarTodosProjetos() {
        System.out.println("Todos os projetos:");
        for (Projeto projeto : projetos) {
            System.out.println("Projeto: " + projeto.getNome());
        }
    }

}
