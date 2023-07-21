
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
        return null;
    }
    
    private ResultadoProjeto getMockByNome(Projeto projeto) {
        if(listaResultadosProjeto == null) {
            return null;
        }
        for(ResultadoProjeto rp : listaResultadosProjeto) {
            if(rp.getProjeto().getNome().equals(projeto.getNome())) {
                return rp;
            }
        }
        return null;
    }
}
