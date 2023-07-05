package com.gestaoqualidadeprojetos.service;

import com.gestaoqualidadeprojetos.model.EtapaIteracao;
import com.gestaoqualidadeprojetos.model.Iteracao;
import com.gestaoqualidadeprojetos.model.MembroEquipe;
import com.gestaoqualidadeprojetos.model.Projeto;
import com.gestaoqualidadeprojetos.repository.ProjetoRepository;
import java.text.ParseException;
import java.util.Date;

public class ProjetoService {

    private ProjetoRepository projetosRepository;
    private Projeto projeto;

    public ProjetoService() {
        this.projetosRepository = new ProjetoRepository();
    }

    public Projeto criarProjeto(String nome, Date dataInicio, Date previsaoConclusao, String status, String tipo, int quantidadeIteracao) {
        if (validarDatas(dataInicio, previsaoConclusao)) {
            this.projeto = new Projeto(nome, dataInicio, previsaoConclusao, status, tipo, quantidadeIteracao);
            return this.projeto;
        }
        return null;
    }

    private boolean validarDatas(Date dataInicial, Date dataFinal) {
        if (dataInicial.compareTo(dataFinal) < 0) {
            return true;
        }
        System.out.println("A previsão de conclusão deve ser maior que a data inicial.");
        return false;
    }

    public void finalizarProjeto(Date dataConclusao) {
        // Converte a data de previsão em tempo (milissegundos) para calcular
        long tempoDataPrevisaoConclusao = this.projeto.getPrevisaoConclusao().getTime() - (long) (this.projeto.getPrevisaoConclusao().getTime() * 0.25);
        Date DataPrevisaoConclusao = new Date(tempoDataPrevisaoConclusao);
        if (this.projeto.getDataConclusao().compareTo(DataPrevisaoConclusao) >= 0) {
            this.projeto.finalizarProjeto(DataPrevisaoConclusao);
            System.out.println("Projeto finalizado.");
        } else {
            System.out.println("O Projeto só poderá ser finalizado após cumprir 75% da data de previsão de finalização.");
        }
    }

    public void salvarProjeto(Projeto projeto) {
        this.projetosRepository.adicionarProjeto(projeto);
    }

    public Projeto buscarProjeto(String nome) {
        return this.projetosRepository.buscarProjeto(nome);
    }

    public void addMembroEquipe(Projeto projeto, MembroEquipe membro) {
        projeto.addMembroEquipe(membro);
    }

    public void criarIteracao(Projeto projeto, Iteracao iteracao) {
        if (validarDatas(iteracao.getDataInicio(), iteracao.getPrevisaoConclusao())) {
            projeto.addIteracao(iteracao);
        }
    }

    private Iteracao buscarIteracao(Projeto projeto, String nomeIteracao) {
        for (int i = 0; i < projeto.getIteracoes().size(); i++) {
            if (projeto.getIteracoes().get(i).getDescricao().equals(nomeIteracao)) {
                return projeto.getIteracoes().get(i);
            }
        }
        System.out.println("Iteração não encontrada no projeto " + projeto.getNome());
        return null;
    }

    public void criarEtapa(Projeto projeto, String nomeIteracao, EtapaIteracao etapa) {
        Iteracao iteracaoBuscada = buscarIteracao(projeto, nomeIteracao);
        if (iteracaoBuscada != null) {
            iteracaoBuscada.addEtapa(etapa);
        } else {
            System.out.println("Etapa não encontrada na iteração" + nomeIteracao + " do projeto " + projeto.getNome());
        }
    }

    public void listarTodosProjetos() {
        this.projetosRepository.listarTodosProjetos();
    }

    public void verProjeto(String nome) {
        Projeto projetoBuscado = this.projetosRepository.buscarProjeto(nome);
        System.out.println("--------------VER PROJETO--------------");
        System.out.println("PROJETO: " + projetoBuscado.toString());
        System.out.println("EQUIPE:");
        this.projeto.listarEquipe();
        for (Iteracao iteracao : projetoBuscado.getIteracoes()) {
            System.out.println("ITERAÇÃO: " + iteracao.toString());
            for (EtapaIteracao etapa : iteracao.getEtapas()) {
                System.out.println("ETAPAS: " + etapa.toString());
            }
        }
    }

}
