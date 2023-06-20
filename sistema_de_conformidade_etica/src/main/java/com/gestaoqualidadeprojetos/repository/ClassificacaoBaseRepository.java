/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gestaoqualidadeprojetos.repository;

import com.gestaoqualidadeprojetos.model.ClassificacaoBase;
import com.gestaoqualidadeprojetos.model.enums.ClassificacaoEnum;
import java.util.ArrayList;

/**
 *
 * @author Note102
 */
public class ClassificacaoBaseRepository {
    private ArrayList<ClassificacaoBase> listaClassificacaoBase;
    
    public ClassificacaoBase getByFaixa(ClassificacaoEnum faixa) {
        return getMockByFaixa(faixa);
    }
    
    public  ArrayList<ClassificacaoBase> getAll() {
        return generateAllMock();
    }
    
    private ArrayList<ClassificacaoBase> generateAllMock() {
        listaClassificacaoBase = new ArrayList<ClassificacaoBase>();
        var cb1 = new ClassificacaoBase(100.0, 90.0, ClassificacaoEnum.A);
        var cb2 = new ClassificacaoBase(75.0, 89.9, ClassificacaoEnum.B);
        var cb3 = new ClassificacaoBase(60.0, 79.9, ClassificacaoEnum.C);
        var cb4 = new ClassificacaoBase(45.0, 59.9, ClassificacaoEnum.D);
        var cb5 = new ClassificacaoBase( 0.0, 44.9, ClassificacaoEnum.E);
        listaClassificacaoBase.add(cb1);
        listaClassificacaoBase.add(cb2);
        listaClassificacaoBase.add(cb3);
        listaClassificacaoBase.add(cb4);
        listaClassificacaoBase.add(cb5);
        return listaClassificacaoBase;
    }
    
    private ClassificacaoBase getMockByFaixa(ClassificacaoEnum faixa) {
        for(ClassificacaoBase f : listaClassificacaoBase) {
            if(f.getFaixaClassificacao().equals(faixa)) {
                return f;
            }
        }
        return null;
    }
}
