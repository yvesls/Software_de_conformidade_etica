package com.gestaoqualidadeprojetos.service;
import com.gestaoqualidadeprojetos.model.EtapaIteracao;
import com.gestaoqualidadeprojetos.model.Projeto;
import java.util.List;

public class EtapaService extends ValidarDatasService {

    private IteracaoService iteracaoService;

    public EtapaService() {
        this.iteracaoService = new IteracaoService();
    }

    public EtapaIteracao criarEtapa(String descricao, int pesoEsforco, String questionarioEtapa) {
        return new EtapaIteracao(descricao, pesoEsforco, questionarioEtapa);
    }
    
    public Projeto addEtapa(Projeto projeto, String nomeIteracao, EtapaIteracao etapa) {
        int i = this.iteracaoService.buscarIndexIteracao(projeto, nomeIteracao);
        if (i >= 0) {
            projeto.getIteracoes().get(i).addEtapa(etapa);
        } else {
            System.out.println("A iteração " + nomeIteracao + " não foi encontrada no projeto " + projeto.getNome());
        }
        return projeto;
    }

    public void buscarEtapa(Projeto projeto, String nomeIteracao, String nomeEtapa) {
        int i = this.iteracaoService.buscarIndexIteracao(projeto, nomeIteracao);
        if (i > 0) {
            for (int j = 0; j < projeto.getIteracoes().get(i).getEtapas().size(); i++) {
                if (projeto.getIteracoes().get(i).getEtapas().get(j).getDescricao().equals(nomeEtapa)) {
                    System.out.println("Etapa " + projeto.getIteracoes().get(i).getEtapas().get(j).getDescricao() + " encontrada");
                } else {
                    System.out.println("Etapa não encontrada.");
                }
            }
        }
    }

    public List<EtapaIteracao> listarEtapas(Projeto projeto, String nomeIteracao) {
        int i = this.iteracaoService.buscarIndexIteracao(projeto, nomeIteracao);
        if (i >= 0) {
            return projeto.getIteracoes().get(i).getEtapas();
        }
        return null;
    }

}