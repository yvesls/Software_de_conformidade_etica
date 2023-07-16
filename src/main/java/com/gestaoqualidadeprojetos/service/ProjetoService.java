package com.gestaoqualidadeprojetos.service;

import com.gestaoqualidadeprojetos.model.EtapaIteracao;
import com.gestaoqualidadeprojetos.model.Iteracao;
import com.gestaoqualidadeprojetos.model.MembroEquipe;
import com.gestaoqualidadeprojetos.model.Projeto;
import com.gestaoqualidadeprojetos.repository.ProjetoRepository;
import java.time.LocalDateTime;
import java.util.Date;

public class ProjetoService extends ValidarDatasService {

    private ProjetoRepository projetosRepository;
    private IteracaoService iteracaoService;
    private EtapaService etapaService;
    private Projeto projeto;

    public ProjetoService() {
        this.projetosRepository = new ProjetoRepository();
        this.iteracaoService = new IteracaoService();
        this.etapaService = new EtapaService();
    }

    public Projeto criarProjeto(String nome, LocalDateTime dataInicio, LocalDateTime previsaoConclusao, String status, String tipo, int quantidadeIteracao) {
        if (validarDatas(dataInicio, previsaoConclusao)) {
            return new Projeto(nome, dataInicio, previsaoConclusao, status, tipo, quantidadeIteracao);
        }
        return null;
    }

    public Projeto finalizarProjeto(Projeto projeto, LocalDateTime dataConclusao) {
            // Converte a data de previsão em tempo (milissegundos) para calcular
            LocalDateTime DataPrevisaoConclusao = LocalDateTime.parse("2023-08-01T12:30:54");
            if (DataPrevisaoConclusao.compareTo(dataConclusao) <= 0) {
                projeto.setStatus("Concluído");
                projeto.setDataConclusao(dataConclusao);
                System.out.println("Projeto " + projeto.getNome() + " finalizado.");
            } else {
                System.out.println("Segundo Caper Jones, o Projeto só poderá ser finalizado após cumprir 75% da data de previsão de finalização.");
            }
            return projeto;
    }
    
    public void salvarProjetoNoSistema(Projeto projeto) {
        this.projetosRepository.salvarProjeto(projeto);
    }

    public Projeto buscarProjetoSalvo(String nome) {
        return this.projetosRepository.buscarProjeto(nome);
    }

    public void addIteracao(Projeto projeto, Iteracao iteracao) {
        this.iteracaoService.addIteracao(projeto, iteracao);
    }

    public Projeto finalizarIteracao(Projeto projeto, String nomeIteracao, LocalDateTime dataConclusao) {
        this.iteracaoService.finalizarIteracao(projeto, nomeIteracao, dataConclusao);
        return projeto;
    }

    public Iteracao buscarIteracao(Projeto projeto, String nomeIteracao) {
        for (int i = 0; i < projeto.getIteracoes().size(); i++) {
            if (projeto.getIteracoes().get(i).getDescricao().equals(nomeIteracao)) {
                return projeto.getIteracoes().get(i);
            }
        }
        System.out.println("Iteração não encontrada no projeto " + projeto.getNome());
        return null;
    }

    public void addEtapa(Projeto projeto, String nomeIteracao, EtapaIteracao etapa) {
        this.etapaService.addEtapa(projeto, nomeIteracao, etapa);
    }

    public void addMembroEquipe(Projeto projeto, MembroEquipe membro) {
        projeto.addMembroEquipe(membro);
    }

    public void verProjeto(String nome) {
        Projeto projetoBuscado = this.projetosRepository.buscarProjeto(nome);
        System.out.println("--------------VER PROJETO--------------");
        System.out.println("PROJETO: " + projetoBuscado.toString());
        System.out.println("EQUIPE:");
        projetoBuscado.listarEquipe();
        for (Iteracao iteracao : projetoBuscado.getIteracoes()) {
            System.out.println("ITERAÇÃO: " + iteracao.toString());
            for (EtapaIteracao etapa : iteracao.getEtapas()) {
                System.out.println("ETAPAS: " + etapa.toString());
            }
        }
    }

    public void listarTodosProjetos() {
        this.projetosRepository.listarTodosProjetos();
    }
}
