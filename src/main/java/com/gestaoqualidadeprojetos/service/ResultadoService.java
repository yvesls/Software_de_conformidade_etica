package com.gestaoqualidadeprojetos.service;

import com.gestaoqualidadeprojetos.model.Iteracao;
import com.gestaoqualidadeprojetos.model.Projeto;
import com.gestaoqualidadeprojetos.model.ResultadoIteracao;
import com.gestaoqualidadeprojetos.model.ResultadoMembroEquipe;
import com.gestaoqualidadeprojetos.model.ResultadoProjeto;
import com.gestaoqualidadeprojetos.repository.ResultadoIteracaoRepository;
import com.gestaoqualidadeprojetos.repository.ResultadoMembroEquipeRepository;
import com.gestaoqualidadeprojetos.repository.ResultadoProjetoRepository;
import java.text.ParseException;
import java.util.ArrayList;

/**
 *
 * @author Note102
 */
public class ResultadoService {

    private ResultadoProjetoRepository resultadoProjetoRepositoriy;
    private ResultadoMembroEquipeRepository resultadoMembroEquipeRepository;
    private ResultadoIteracaoRepository resultadoIteracaoRepositoriy;

    public ResultadoService() {
        this.resultadoProjetoRepositoriy = new ResultadoProjetoRepository();
        this.resultadoMembroEquipeRepository = new ResultadoMembroEquipeRepository();
        this.resultadoIteracaoRepositoriy = new ResultadoIteracaoRepository();
    }

    public void gerarResultadoIteracao(Iteracao iteracao) throws ParseException {
        var context = new DashboardProcessContextService();
        context.put("iteracao", iteracao);
        Object response = GenericService.run(DashboardCatalogService.createIterationResultProcess, context);
        System.out.println(response);
    }

    public void gerarResultadoProjeto(GenericService genericService, Projeto projeto) throws ParseException {

    }

    public void gerarResultadoIteracaoMembroEquipe(GenericService genericService, Iteracao iteracao) throws ParseException {

    }

    public ResultadoIteracao getResultadoIteracao(Iteracao iteracao) throws Exception {
        var resultado = resultadoIteracaoRepositoriy.getByIteracao(iteracao);
        if (resultado == null) { // validação será feita em alguma camada inferior
            throw new Exception("Não existe resultado para a iteração atual. Os questionários não foram todos respondidos ainda.");
        }
        return resultado;
    }

    public ArrayList<ResultadoMembroEquipe> getResultadoIteracaoMembroEquipe(Iteracao iteracao) throws Exception {
        var resultado = resultadoMembroEquipeRepository.getByIteracao(iteracao);
        if (resultado == null) { // validação será feita em alguma camada inferior
            throw new Exception("Não existe resultado para a iteração atual. Os questionários não foram todos respondidos ainda.");
        }
        return resultado;
    }

    public ResultadoProjeto getResultadoProjeto(Projeto projeto) throws Exception {
        var resultado = resultadoProjetoRepositoriy.getByProjeto(projeto);
        if (resultado == null) { // validação será feita em alguma camada inferior
            throw new Exception("Não existe resultado para o projeto atual. As iterações não foram todas completadas ainda.");
        }
        return resultado;
    }
}
