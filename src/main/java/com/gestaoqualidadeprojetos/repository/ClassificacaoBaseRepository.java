
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
    
    public ClassificacaoBaseRepository(){
        generateAllMock();
    }
    
    public ClassificacaoBase getByFaixa(ClassificacaoEnum faixa) {
        return getMockByFaixa(faixa);
    }
    
    public  ArrayList<ClassificacaoBase> getAll() {
        return listaClassificacaoBase;
    }
    
    private ArrayList<ClassificacaoBase> generateAllMock() {
        listaClassificacaoBase = new ArrayList<ClassificacaoBase>();
        var cb1 = new ClassificacaoBase(100.0, 90.0, ClassificacaoEnum.A, "Excelente");
        var cb2 = new ClassificacaoBase(89.9, 75.0, ClassificacaoEnum.B, "Atingiu o mínimo necessário");
        var cb3 = new ClassificacaoBase(79.9, 60.0, ClassificacaoEnum.C, "Não atingiu o mínimo necessário");
        var cb4 = new ClassificacaoBase(59.9, 45.0, ClassificacaoEnum.D, "Pobre");
        var cb5 = new ClassificacaoBase( 44.9, 0.0, ClassificacaoEnum.E, "Ruim");
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
