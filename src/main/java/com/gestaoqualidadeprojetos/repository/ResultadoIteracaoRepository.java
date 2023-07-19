package com.gestaoqualidadeprojetos.repository;

import com.gestaoqualidadeprojetos.model.Classificacao;
import com.gestaoqualidadeprojetos.model.Iteracao;
import com.gestaoqualidadeprojetos.model.ResultadoEtapaIteracao;
import com.gestaoqualidadeprojetos.model.ResultadoIteracao;
import com.gestaoqualidadeprojetos.model.ResultadoMembroEquipe;
import java.time.LocalDate;
import java.util.ArrayList;




/**
 *
 * @author Note102
 */
public class  ResultadoIteracaoRepository {
    private ArrayList<ResultadoIteracao> listaResultadosIteracao;
    
    public ResultadoIteracaoRepository() {
        generateAllMock();
    }
    
    public ResultadoIteracao getByIteracao(Iteracao iteracao) {
        return getMockByIteracao(iteracao.getDescricao());
    }
    
    public ArrayList<ResultadoIteracao> getAll() {
          return listaResultadosIteracao;
    }
    
    public void save(ResultadoIteracao resultadoIteracao) {
        listaResultadosIteracao.add(resultadoIteracao);
    }
    
    private ArrayList<ResultadoIteracao> generateAllMock() {
        listaResultadosIteracao = new ArrayList<ResultadoIteracao>();
        ArrayList<Classificacao> classificacoes = new ClassificacaoRepository().getAll();
        var etapas = new ArrayList<ResultadoEtapaIteracao>();
        var resultadoMembros = new ArrayList<ResultadoMembroEquipe>();
        LocalDate dataInicio = LocalDate.of(2023, 7, 1);
        LocalDate dataFim = LocalDate.of(2023, 8, 1);
        Iteracao cascata = new Iteracao("Iteração Única", dataInicio, dataFim, "ABERTA");
 
        var resultadoIteracao1 = new ResultadoIteracao("A iteração não alcançou o esperado", LocalDate.now(), classificacoes.get(6), etapas, resultadoMembros, cascata);
        listaResultadosIteracao.add(resultadoIteracao1);
        return listaResultadosIteracao;
    }
    
    private ResultadoIteracao getMockByIteracao(String iteracao) {
        for(ResultadoIteracao ri : listaResultadosIteracao) {
            if(ri.getIteracao().getDescricao().equals(iteracao)) {
                return ri;
            }
        }
        return null;
    }
}
