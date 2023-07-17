
package com.gestaoqualidadeprojetos.repository;

import com.gestaoqualidadeprojetos.model.MembroEquipe;
import com.gestaoqualidadeprojetos.model.PesoBase;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Note102
 */
public class PesoBaseRepository {
    private ArrayList<PesoBase> listaPesosBase;
    
    public PesoBaseRepository(){
        generateAllMock();
    }
    
    public PesoBase getByName(String representante) {
        return getMockByMembroRepresentante(representante);
    }
    
    public ArrayList<PesoBase> getAll() {
          return listaPesosBase;
    }
    
    private ArrayList<PesoBase> generateAllMock() {
        listaPesosBase = new ArrayList<PesoBase>();
        List<MembroEquipe> membros = new MembroEquipeRepository().listarMembros();
        var pb1 = new PesoBase(1, membros.get(0));
        var pb2 = new PesoBase(1, membros.get(1));
        var pb3 = new PesoBase(1, membros.get(2));
        var pb4 = new PesoBase(1, membros.get(3));
        var pb5 = new PesoBase(1,membros.get(4));
        var pb6 = new PesoBase(1,membros.get(5));
        listaPesosBase.add(pb1);
        listaPesosBase.add(pb2);
        listaPesosBase.add(pb3);
        listaPesosBase.add(pb4);
        listaPesosBase.add(pb5);
        listaPesosBase.add(pb6);
        return listaPesosBase;
    }
    
    private PesoBase getMockByMembroRepresentante(String representante) {
        for(PesoBase pb : listaPesosBase) {
            if(pb.getMembro().getRepresentante().equals(representante)) {
                return pb;
            }
        }
        return null;
    }
}
