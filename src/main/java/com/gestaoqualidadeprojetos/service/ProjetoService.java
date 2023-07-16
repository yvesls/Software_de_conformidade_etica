package com.gestaoqualidadeprojetos.service;

import com.gestaoqualidadeprojetos.model.EtapaIteracao;
import com.gestaoqualidadeprojetos.model.Iteracao;
import com.gestaoqualidadeprojetos.model.MembroEquipe;
import com.gestaoqualidadeprojetos.model.Projeto;
import com.gestaoqualidadeprojetos.model.QuestionarioEtapa;
import com.gestaoqualidadeprojetos.repository.ProjetoRepository;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

public class ProjetoService extends ValidarDatasService {

    private ProjetoRepository projetosRepository;

    public ProjetoService() {
        this.projetosRepository = new ProjetoRepository();
    }

    /*PROJETO*/
    public Projeto criarProjeto(String nome, LocalDate dataInicio, LocalDate previsaoConclusao, String status, String tipo, int quantidadeIteracao) {
        if (validarDatas(dataInicio, previsaoConclusao)) {
            return new Projeto(nome, dataInicio, previsaoConclusao, status, tipo, quantidadeIteracao);
        }
        return null;
    }

    public Projeto finalizarProjeto(Projeto projeto, LocalDate dataConclusao) {
        LocalDate dataPrevisaoConclusao = projeto.getPrevisaoConclusao();

        long diasConclusaoDiferenca = ChronoUnit.DAYS.between(projeto.getDataInicio(), dataConclusao);
        long diasPrevistosConclusao = ChronoUnit.DAYS.between(projeto.getDataInicio(), dataPrevisaoConclusao);

        double percentualConcluido = (double) diasConclusaoDiferenca / diasPrevistosConclusao;

        if (percentualConcluido >= 0.75 && percentualConcluido <= 1.0) {
            projeto.setStatus("Concluído");
            projeto.setDataConclusao(dataConclusao);
            //System.out.println("Projeto " + projeto.getNome() + " finalizado.");
        } else {
            System.out.println("Segundo Caper Jones, o Projeto só poderá ser finalizado quando estiver entre 75% e 100% da data de previsão de finalização.");
        }
        return projeto;
    }
    
    public void salvar(Projeto projeto) {
        this.projetosRepository.salvarProjeto(projeto);
    }

    public Projeto buscarProjeto(String nome) {
        return this.projetosRepository.buscarProjeto(nome);
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

    public void listarProjetos() {
        this.projetosRepository.listarTodosProjetos();
    }

    /*ITERAÇÃO*/
    public Iteracao criarIteracao(String descricao, LocalDate dataInicio, LocalDate previsaoConclusao, String status) {
        if (validarDatas(dataInicio, previsaoConclusao)) {
            return new Iteracao(descricao, dataInicio, previsaoConclusao, status);
        }
        return null;
    }
    
    public void addIteracao(Projeto projeto, Iteracao iteracao) {
        if (validarDatas(iteracao.getDataInicio(), iteracao.getPrevisaoConclusao())) {
            projeto.addIteracao(iteracao);
        }
    }

    public Projeto finalizarIteracao(Projeto projeto, String nomeIteracao, LocalDate dataConclusao) {
        // Busca a iteração dentro do projeto
        int i = buscarIndexIteracao(projeto, nomeIteracao);
        if (i >= 0) {
            Iteracao iteracao = projeto.getIteracoes().get(i);
            LocalDate dataPrevisaoConclusao = iteracao.getPrevisaoConclusao();

            // Calcula a diferença de dias entre a data de início e a data de conclusão
            long diasConclusaoDiferenca = ChronoUnit.DAYS.between(iteracao.getDataInicio(), dataConclusao);
            long diasPrevistosConclusao = ChronoUnit.DAYS.between(iteracao.getDataInicio(), dataPrevisaoConclusao);

            double percentualConcluido = (double) diasConclusaoDiferenca / diasPrevistosConclusao;

            if (percentualConcluido >= 0.75 && percentualConcluido <= 1.0) {
                iteracao.setStatus("FINALIZADA");
                iteracao.setDataConclusao(dataConclusao);
                //System.out.println("Iteração " + nomeIteracao + " finalizada.");
            } else {
                System.out.println("Segundo Caper Jones, a Iteração só poderá ser finalizada após cumprir 75% da data prevista de conclusão.");
            }
        }
        return projeto;
    }
    
    private int buscarIndexIteracao(Projeto projeto, String nomeIteracao) {
        for (int i = 0; i < projeto.getIteracoes().size(); i++) {
            if (projeto.getIteracoes().get(i).getDescricao().equals(nomeIteracao)) {
                return i;
            } else {
                System.out.println("Iteração não encontrada no projeto.");
            }
        }
        return -1;
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
    
    public ArrayList<Iteracao> listarIteracoes(Projeto projeto, Iteracao iteracao) {
        return projeto.getIteracoes();
    }

    /*ETAPA*/
    public EtapaIteracao criarEtapa(String descricao, int pesoEsforco, QuestionarioEtapa questionarioEtapa) {
        return new EtapaIteracao(descricao, pesoEsforco, questionarioEtapa);
    }
    
    public Projeto addEtapa(Projeto projeto, String nomeIteracao, EtapaIteracao etapa) {
        int i = buscarIndexIteracao(projeto, nomeIteracao);
        if (i >= 0) {
            projeto.getIteracoes().get(i).addEtapa(etapa);
        } else {
            System.out.println("A iteração " + nomeIteracao + " não foi encontrada no projeto " + projeto.getNome());
        }
        return projeto;
    }
    
    public void buscarEtapa(Projeto projeto, String nomeIteracao, String nomeEtapa) {
        int i = buscarIndexIteracao(projeto, nomeIteracao);
        if (i > 0) {
            for (int j = 0; j < projeto.getIteracoes().get(i).getEtapas().size(); i++) {
                if (projeto.getIteracoes().get(i).getEtapas().get(j).getDescricao().equals(nomeEtapa)) {
                    //System.out.println("Etapa " + projeto.getIteracoes().get(i).getEtapas().get(j).getDescricao() + " encontrada");
                } else {
                    System.out.println("Etapa não encontrada.");
                }
            }
        }
    }

    public ArrayList<EtapaIteracao> listarEtapas(Projeto projeto, String nomeIteracao) {
        int i = buscarIndexIteracao(projeto, nomeIteracao);
        if (i >= 0) {
            return projeto.getIteracoes().get(i).getEtapas();
        }
        return null;
    }

    /*MEMBRO DE EQUIPE*/
    public MembroEquipe criarMembroEquipe(String nome, String sobrenome, String email, String senha, String representante, boolean primeiroAcesso){
        return new MembroEquipe(nome, sobrenome, email, senha, representante, primeiroAcesso);
    }
    
    public void addMembroEquipe(Projeto projeto, MembroEquipe membro) {
        projeto.addMembroEquipe(membro);
    }
    
    public List<MembroEquipe> listarMembrosEquipe(Projeto projeto) {
        return projeto.getEquipe();
    }
    
    /*VALIDAR DATAS*/
    public boolean validarDatas(LocalDate dataInicial, LocalDate dataFinal) {
        if (dataInicial.compareTo(dataFinal) < 0) {
            return true;
        }
        System.out.println("A previsão de conclusão deve ser maior que a data inicial.");
        return false;
    }
}