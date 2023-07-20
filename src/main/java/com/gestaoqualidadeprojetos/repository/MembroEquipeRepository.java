package com.gestaoqualidadeprojetos.repository;
import com.gestaoqualidadeprojetos.model.MembroEquipe;
import com.gestaoqualidadeprojetos.model.Projeto;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class MembroEquipeRepository {
    private List<MembroEquipe> membros;

    public MembroEquipeRepository() {
        membros = new ArrayList<>();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate dataInicio = LocalDate.parse("01/07/2023", formatter);
        LocalDate previsaoFim = LocalDate.parse("01/08/2023", formatter);

        //Projeto
        var projetoCascata = new Projeto("Sistema Cascata", dataInicio, previsaoFim, "Em andamento", "CASCATA", 1);
        membros.add(new MembroEquipe("João", "Silva", "joao@projeto.com", "123", "CLIENTE", false, projetoCascata));
        membros.add(new MembroEquipe("Maria", "Souza", "maria@projeto.com", "456", "GERENTE DE PROJETO", false, projetoCascata));
        membros.add(new MembroEquipe("Carlos", "Ferreira", "carlos@projeto.com", "789", "LÍDER DE EQUIPE", false, projetoCascata));
        membros.add(new MembroEquipe("Ana", "Santos", "ana@projeto.com", "101112", "ARQUITETO DE SOFTWARE", false, projetoCascata));
        membros.add(new MembroEquipe("Pedro", "Gomes", "pedro@projeto.com", "131415", "DESENVOLVEDOR", false, projetoCascata));
        membros.add(new MembroEquipe("Mariana", "Lima", "mariana@projeto.com", "161718", "ANALISTA DE QUALIDADE", false, projetoCascata));
    }
    
    public List<MembroEquipe> getByProject(Projeto projeto) {
        var membrosList = new ArrayList<MembroEquipe>();
        for(MembroEquipe membro: membros){
            if(membro.getProjeto().getNome().equals(projeto.getNome())){
                membrosList.add(membro);
            }
        }
        return membrosList;
    }

    public List<MembroEquipe> listarMembros() {
        return membros;
    }

    public void adicionarMembro(MembroEquipe membro) {
        membros.add(membro);
    }
    
}