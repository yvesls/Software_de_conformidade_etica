package com.gestaoqualidadeprojetos.repository;
import com.gestaoqualidadeprojetos.model.MembroEquipe;
import java.util.ArrayList;
import java.util.List;

public class MembroEquipeRepository {
    private List<MembroEquipe> membros;

    public MembroEquipeRepository() {
        membros = new ArrayList<>();
        membros.add(new MembroEquipe("João", "Silva", "joao@projeto.com", "123", "CLIENTE", false));
        membros.add(new MembroEquipe("Maria", "Souza", "maria@projeto.com", "456", "GERENTE DE PROJETO", false));
        membros.add(new MembroEquipe("Carlos", "Ferreira", "carlos@projeto.com", "789", "LÍDER DE EQUIPE", false));
        membros.add(new MembroEquipe("Ana", "Santos", "ana@projeto.com", "101112", "ARQUITETO DE SOFTWARE", false));
        membros.add(new MembroEquipe("Pedro", "Gomes", "pedro@projeto.com", "131415", "DESENVOLVEDOR", false));
        membros.add(new MembroEquipe("Mariana", "Lima", "mariana@projeto.com", "161718", "ANALISTA DE QUALIDADE", false));
    }

    public List<MembroEquipe> listarMembros() {
        return membros;
    }

    public void adicionarMembro(MembroEquipe membro) {
        membros.add(membro);
    }
    
}