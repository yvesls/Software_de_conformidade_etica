
package com.gestaoqualidadeprojetos.repository;

import com.gestaoqualidadeprojetos.model.Projeto;
import com.gestaoqualidadeprojetos.model.ResultadoProjeto;
import java.util.ArrayList;

/**
 *
 * @author Note102
 */
public class ResultadoProjetoRepository {
    private ArrayList<ResultadoProjeto> listaResultadosProjeto;
    
    public ResultadoProjetoRepository() {
        generateAllMock();
    }
    
    public ResultadoProjeto getByProjeto(Projeto projeto) {
        return getMockByNome(projeto);
    }
    
    public ArrayList<ResultadoProjeto> getAll() {
          return listaResultadosProjeto;
    }
    
    public void save(ResultadoProjeto resultadoProjeto) {
        listaResultadosProjeto.add(resultadoProjeto);
    }
    
    private ArrayList<ResultadoProjeto> generateAllMock() {
        listaResultadosProjeto = new ArrayList<ResultadoProjeto>();
        return listaResultadosProjeto;
    }
    
    private ResultadoProjeto getMockByNome(Projeto projeto) {
        for(ResultadoProjeto rp : listaResultadosProjeto) {
            if(rp.getProjeto().equals(projeto)) {
                return rp;
            }
        }
        return null;
    }
}
