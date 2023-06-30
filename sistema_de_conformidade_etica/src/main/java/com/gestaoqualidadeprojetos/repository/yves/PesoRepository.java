/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gestaoqualidadeprojetos.repository.yves;

import com.gestaoqualidadeprojetos.model.yves.MembroEquipeTeste;
import com.gestaoqualidadeprojetos.model.yves.Peso;
import com.gestaoqualidadeprojetos.model.yves.PesoBase;
import java.time.LocalDateTime;
import java.util.ArrayList;

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
    
    private ArrayList<Peso> generateAllMock() {
        listaPesos = new ArrayList<Peso>();
        ArrayList<MembroEquipeTeste> membros = new MembroEquipeTesteRepository().getListaMembros();
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

    public ArrayList<Peso> getListaPesos() {
        return listaPesos;
    }
}
