package com.gestaoqualidadeprojetos.service;

import com.gestaoqualidadeprojetos.model.Iteracao;
import com.gestaoqualidadeprojetos.model.Projeto;
import java.util.Date;
import java.util.List;

public class IteracaoService extends ValidarDatasService {

    public IteracaoService() {

    }

    public Iteracao criarIteracao(String descricao, Date dataInicio, Date previsaoConclusao, String status) {
        if(validarDatas(dataInicio, previsaoConclusao)){
            return new Iteracao(descricao, dataInicio, previsaoConclusao, status);
        }
        return null;
    }
    
    public void addIteracao(Projeto projeto, Iteracao iteracao) {
        if (validarDatas(iteracao.getDataInicio(), iteracao.getPrevisaoConclusao())) {
            projeto.addIteracao(iteracao);
        }
    }

    public int buscarIndexIteracao(Projeto projeto, String nomeIteracao) {
        for (int i = 0; i < projeto.getIteracoes().size(); i++) {
            if (projeto.getIteracoes().get(i).getDescricao().equals(nomeIteracao)) {
                return i;
            } else {
                System.out.println("Iteração não encontrada no projeto.");
            }
        }
        return -1;
    }

    public Projeto finalizarIteracao(Projeto projeto, String nomeIteracao, Date dataConclusao) {
        //Busca a iteração dentro do projeto
        int i = buscarIndexIteracao(projeto, nomeIteracao);
        if (i >= 0) {
                // Converte a data de previsão em tempo (milissegundos) para calcular
                long tempoDataPrevisaoConclusao = projeto.getIteracoes().get(i).getPrevisaoConclusao().getTime() - (long) (projeto.getIteracoes().get(i).getPrevisaoConclusao().getTime() * 0.25);
                Date DataPrevisaoConclusao = new Date(tempoDataPrevisaoConclusao);
            if (DataPrevisaoConclusao.compareTo(dataConclusao) <= 0) {
                projeto.getIteracoes().get(i).setStatus("FINALIZADA");
                projeto.getIteracoes().get(i).setDataConclusao(dataConclusao);
                System.out.println("Iteração " + nomeIteracao + " finalizada.");
            } 
            else {
                System.out.println("Segundo Caper Jones, a Iteração só poderá ser finalizada após cumprir 75% da data prevista de conclusão.");
            }
        }
        return projeto;
    }

    public List<Iteracao> listarIteracoes(Projeto projeto, Iteracao iteracao) {
        return projeto.getIteracoes();
    }
}
