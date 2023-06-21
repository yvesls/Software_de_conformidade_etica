
package com.gestaoqualidadeprojetos.repository;

import com.gestaoqualidadeprojetos.model.MembroEquipeModel;
import java.util.ArrayList;

/**
 *
 * @author lucas
 */
public class MembroEquipeRepository {
    private ArrayList<MembroEquipeModel> listaMembros;
    
    public MembroEquipeRepository(){
        generateAllMock();
    }
    
    public MembroEquipeModel getByName(String nome) {
        return getMockByName(nome);
    }
    
    public ArrayList<MembroEquipeModel> getAll() {
          return listaMembros;
    }
    
    private ArrayList<MembroEquipeModel> generateAllMock() {
        listaMembros = new ArrayList<MembroEquipeModel>();
        var membro1 = new MembroEquipeModel("Jaum","a", "jaum@edu.ufes.br", "Cliente");
        var membro2 = new MembroEquipeModel("Pedro","b", "pedro@edu.ufes.br", "Gerente de projeto");
        var membro3 = new MembroEquipeModel("maria","c", "maria@edu.ufes.br", "Analista de qualidade");
        var membro4 = new MembroEquipeModel("José","d", "jose@edu.ufes.br", "Desenvolvedor");
        var membro5 = new MembroEquipeModel("Giulia","e", "giulia@edu.ufes.br", "Arquiteto de software");
        var membro6 = new MembroEquipeModel("Maurício","f", "mauricio@edu.ufes.br", "Líder de equipe");
        listaMembros.add(membro1);
        listaMembros.add(membro2);
        listaMembros.add(membro3);
        listaMembros.add(membro4);
        listaMembros.add(membro5);
        listaMembros.add(membro6);
        return listaMembros;
    }
    
    private MembroEquipeModel getMockByName(String nome) {
        for(MembroEquipeModel m : listaMembros) {
            if(m.getNome().equals(nome)) {
                return m;
            }
        }
        return null;
    }
    
   

    public ArrayList<MembroEquipeModel> getListaMembros() {
        return listaMembros;
    }
}
