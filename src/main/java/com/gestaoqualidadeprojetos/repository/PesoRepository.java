
package com.gestaoqualidadeprojetos.repository;

import com.gestaoqualidadeprojetos.model.MembroEquipe;
import com.gestaoqualidadeprojetos.model.Peso;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author Note102
 */
public class PesoRepository {
    private ArrayList<Peso> listaPesos;
    
    
    public PesoRepository(){
        generateAllMock();
    }
    
    public Peso getByName(String representante) {
        return getMockByMembroRepresentante(representante);
    }
    
    public ArrayList<Peso> getAll() {
          return listaPesos;
    }
    
    public void save(Peso peso) {
        listaPesos.add(peso);
    }
    
    public void remove(Peso peso, Comparator<? super Peso> comparator) throws Exception {
        if (listaPesos.contains(peso)) {
            listaPesos.remove(peso);
            Collections.sort(listaPesos, comparator);
        } else {
            throw new Exception("O peso não está na lista.");
        }
    }
    
    private ArrayList<Peso> generateAllMock() {
        listaPesos = new ArrayList<Peso>();
        List<MembroEquipe> membros = new MembroEquipeRepository().listarMembros();
        var p1 = new Peso(LocalDateTime.now(), membros.get(0), 3);
        var p2 = new Peso(LocalDateTime.now(), membros.get(1), 2);
        var p3 = new Peso(LocalDateTime.now(), membros.get(2), 3);
        var p4 = new Peso(LocalDateTime.now(), membros.get(3), 1);
        var p5 = new Peso(LocalDateTime.now(), membros.get(4), 1);
        var p6 = new Peso(LocalDateTime.now(), membros.get(5), 2);
        listaPesos.add(p1);
        listaPesos.add(p2);
        listaPesos.add(p3);
        listaPesos.add(p4);
        listaPesos.add(p5);
         listaPesos.add(p6);
        return listaPesos;
    }
    
    private Peso getMockByMembroRepresentante(String representante) {
        for(Peso p : listaPesos) {
            if(p.getMembro().getRepresentante().equals(representante)) {
                return p;
            }
        }
        return null;
    }
}
