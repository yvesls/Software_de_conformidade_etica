package com.gestaoqualidadeprojetos.repository;
import com.gestaoqualidadeprojetos.model.Iteracao;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class IteracaoRepository {
    private List<Iteracao> iteracoes;

    public IteracaoRepository() {
        iteracoes = new ArrayList<>();
        /*iteracoes.add(new Iteracao("Iteração 1", new Date(), new Date(), new Date(), "FINALIZADA"));
        iteracoes.add(new Iteracao("Iteração 2", new Date(), new Date(), new Date(), "FINALIZADA"));
        iteracoes.add(new Iteracao("Iteração 3", new Date(), new Date(), new Date(), "FINALIZADA"));
        iteracoes.add(new Iteracao("Iteração 4", new Date(), new Date(), new Date(), "FINALIZADA"));
        iteracoes.add(new Iteracao("Iteração 5", new Date(), new Date(), new Date(), "ABERTA"));
        iteracoes.add(new Iteracao("Iteração 6", new Date(), new Date(), new Date(), "ABERTA"));*/
    }

    public List<Iteracao> listarIteracoes() {
        return iteracoes;
    }

    public void adicionarIteracao(Iteracao iteracao) {
        iteracoes.add(iteracao);
    }

}