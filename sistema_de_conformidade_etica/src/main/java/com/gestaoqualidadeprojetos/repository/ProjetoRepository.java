package com.gestaoqualidadeprojetos.repository;

import com.gestaoqualidadeprojetos.model.EtapaIteracao;
import com.gestaoqualidadeprojetos.model.Iteracao;
import com.gestaoqualidadeprojetos.model.MembroEquipe;
import com.gestaoqualidadeprojetos.model.Projeto;
import com.gestaoqualidadeprojetos.service.MembroEquipeService;
import com.gestaoqualidadeprojetos.service.ProjetoService;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ProjetoRepository {

    private List<Projeto> projetos;

    public ProjetoRepository() {
        projetos = new ArrayList<>();
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
        } 
        else {
            int index = projetos.indexOf(projetoEncontrado);
            //Se for encontrado
            if (index != -1) {
                projetos.set(index, projeto);
                //System.out.println("Projeto atualizado: " + projeto.getNome());
            }
        }
    }

    public Projeto buscarProjeto(String nome) {
        for (Projeto projetoSalvo : projetos) {
            if (projetoSalvo.getNome().equals(nome)) {
                //System.out.println("Projeto " + nome + " encontrado");
                return projetoSalvo;
            }
            /*else{
                System.out.println("Projeto " + nome + " não encontrado.");
            }
             */
        }

        return null;
    }

}
