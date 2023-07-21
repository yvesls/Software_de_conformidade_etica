
package com.gestaoqualidadeprojetos.repository;

import com.gestaoqualidadeprojetos.model.Classificacao;
import com.gestaoqualidadeprojetos.model.Iteracao;
import com.gestaoqualidadeprojetos.model.MembroEquipe;
import com.gestaoqualidadeprojetos.model.Peso;
import com.gestaoqualidadeprojetos.model.ResultadoEtapaMembroEquipe;
import com.gestaoqualidadeprojetos.model.ResultadoMembroEquipe;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Note102
 */
public class ResultadoMembroEquipeRepository {
    private ArrayList<ResultadoMembroEquipe> listaResultadosMembroEquipe;
    
    public ResultadoMembroEquipeRepository() {
        generateAllMock();
    }
     
    public ArrayList<ResultadoMembroEquipe> getByIteracao(Iteracao iteracao) {
        return getMockByIteracao(iteracao.getDescricao());
    }
    
    public ArrayList<ResultadoMembroEquipe> getAll() {
          return listaResultadosMembroEquipe;
    }
    
    public void save(ResultadoMembroEquipe resultadoMembroEquipe) {
        listaResultadosMembroEquipe.add(resultadoMembroEquipe);
    }
    
    private ArrayList<ResultadoMembroEquipe> generateAllMock() {
        listaResultadosMembroEquipe = new ArrayList<ResultadoMembroEquipe>();
        ArrayList<Peso> pesos = new PesoRepository().getAll();
        var etapas = new ArrayList<ResultadoEtapaMembroEquipe>();
        LocalDate dataInicio = LocalDate.of(2023, 7, 1);
        LocalDate dataFim = LocalDate.of(2023, 8, 1);
        Iteracao cascata = new Iteracao("Iteração Única", dataInicio, dataFim, "ABERTA");
        ArrayList<Classificacao> classificacoes = new ClassificacaoRepository().getAll();
        List<MembroEquipe> membros = new MembroEquipeRepository().listarMembros();
        return listaResultadosMembroEquipe;
    }
    
    private ArrayList<ResultadoMembroEquipe> getMockByIteracao(String iteracao) {
        var listaResultados = new ArrayList<ResultadoMembroEquipe>();
        for(ResultadoMembroEquipe rme : listaResultadosMembroEquipe) {
            if(rme.getIteracao().getDescricao().equals(iteracao)) {
                listaResultados.add(rme);
                
            }
        }
        if(listaResultados.isEmpty()) {
            return null;
        }
        return listaResultados;
    }
}
