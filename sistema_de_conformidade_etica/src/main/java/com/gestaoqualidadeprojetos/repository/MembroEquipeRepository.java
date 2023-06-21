package com.gestaoqualidadeprojetos.repository;
import com.gestaoqualidadeprojetos.model.MembroEquipe;
import java.util.ArrayList;
import java.util.List;

public class MembroEquipeRepository {
    private List<MembroEquipe> membros;

    public MembroEquipeRepository() {
        membros = new ArrayList<>();
        // Adicione dados mockup aqui
        membros.add(new MembroEquipe("João", "Silva", "joao@example.com", "senha123", "CLIENTE", false));
        membros.add(new MembroEquipe("Maria", "Souza", "maria@example.com", "senha456", "GERENTE DE PROJETO", false));
        membros.add(new MembroEquipe("Carlos", "Ferreira", "carlos@example.com", "senha789", "LÍDER DE EQUIPE", false));
        membros.add(new MembroEquipe("Ana", "Santos", "ana@example.com", "senha101112", "ARQUITETO DE SOFTWARE", false));
        membros.add(new MembroEquipe("Pedro", "Gomes", "pedro@example.com", "senha131415", "DESENVOLVEDOR", false));
        membros.add(new MembroEquipe("Mariana", "Lima", "mariana@example.com", "senha161718", "ANALISTA DE QUALIDADE", false));
    }

    public List<MembroEquipe> listarMembros() {
        return membros;
    }

    public void adicionarMembro(MembroEquipe membro) {
        membros.add(membro);
    }
    
}