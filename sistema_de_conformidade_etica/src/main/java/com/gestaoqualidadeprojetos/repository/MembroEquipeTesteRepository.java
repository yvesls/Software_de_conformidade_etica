/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gestaoqualidadeprojetos.repository;

import com.gestaoqualidadeprojetos.model.ClassificacaoBase;
import com.gestaoqualidadeprojetos.model.ClassificacaoEnum;
import com.gestaoqualidadeprojetos.model.MembroEquipeTeste;
import java.util.ArrayList;

/**
 *
 * @author Note102
 */
public class MembroEquipeTesteRepository {
    private ArrayList<MembroEquipeTeste> listaMembros;
    
    public MembroEquipeTeste getByName(String nome) {
        return getMockByName(nome);
    }
    
    public ArrayList<MembroEquipeTeste> getAll() {
          return generateAllMock();
    }
    
    private ArrayList<MembroEquipeTeste> generateAllMock() {
        listaMembros = new ArrayList<MembroEquipeTeste>();
        var membro1 = new MembroEquipeTeste("Jaum", "jaum@edu.ufes.br", "Cliente");
        var membro2 = new MembroEquipeTeste("Pedro", "pedro@edu.ufes.br", "Gerente de projeto");
        var membro3 = new MembroEquipeTeste("maria", "maria@edu.ufes.br", "Analista de qualidade");
        var membro4 = new MembroEquipeTeste("José", "jose@edu.ufes.br", "Desenvolvedor");
        listaMembros.add(membro1);
        listaMembros.add(membro2);
        listaMembros.add(membro3);
        listaMembros.add(membro4);
        return listaMembros;
    }
    
    private MembroEquipeTeste getMockByName(String nome) {
        for(MembroEquipeTeste m : listaMembros) {
            if(m.getNome().equals(nome)) {
                return m;
            }
        }
        return null;
    }
}