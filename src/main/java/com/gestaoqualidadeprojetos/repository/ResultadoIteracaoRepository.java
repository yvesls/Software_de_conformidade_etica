package com.gestaoqualidadeprojetos.repository;

import com.gestaoqualidadeprojetos.model.Classificacao;
import com.gestaoqualidadeprojetos.model.Iteracao;
import com.gestaoqualidadeprojetos.model.Projeto;
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
        if(listaResultadosIteracao == null) {
            return null;
        }
        return getMockByIteracao(iteracao.getDescricao());
    }
    
    public ArrayList<ResultadoIteracao> getByProjeto(Projeto projeto) {
        if(listaResultadosIteracao == null) {
            return null;
        }
        var ris = new ArrayList<ResultadoIteracao>();
        for(ResultadoIteracao ri : listaResultadosIteracao) {
            if(ri.getIteracao().getProjeto().getNome().equals(projeto.getNome())) {
               ris.add(ri);
            }
        }
        return ris;
    }
    
    public ArrayList<ResultadoIteracao> getAll() {
          return listaResultadosIteracao;
    }
    
    public void save(ResultadoIteracao resultadoIteracao) {
        if (listaResultadosIteracao == null) {
            listaResultadosIteracao = new ArrayList<ResultadoIteracao>();
            listaResultadosIteracao.add(resultadoIteracao);
        } else {
           listaResultadosIteracao.add(resultadoIteracao);
        }
    }
    
    private ArrayList<ResultadoIteracao> generateAllMock() {
        if(listaResultadosIteracao == null) {
            return null;
        }
        listaResultadosIteracao = new ArrayList<ResultadoIteracao>();
        ArrayList<Classificacao> classificacoes = new ClassificacaoRepository().getAll();;
        var etapas = new ArrayList<ResultadoEtapaIteracao>();
        var resultadoMembros = new ArrayList<ResultadoMembroEquipe>();
        LocalDate dataInicio = LocalDate.of(2023, 7, 1);
        LocalDate dataFim = LocalDate.of(2023, 8, 1);
        Iteracao cascata = new Iteracao("Iteração Única", dataInicio, dataFim, "ABERTA");
 
        var resultadoIteracao1 = new ResultadoIteracao( LocalDate.now(), classificacoes.get(6), etapas, resultadoMembros, cascata);
        listaResultadosIteracao.add(resultadoIteracao1);
        return null;
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
