package com.gestaoqualidadeprojetos.repository.gabriel;
import com.gestaoqualidadeprojetos.model.gabriel.EtapaIteracao;
import java.util.ArrayList;
import java.util.List;

public class EtapaIteracaoRepository {
    private List<EtapaIteracao> etapas;

    public EtapaIteracaoRepository() {
        etapas = new ArrayList<>();
        /*etapas.add(new EtapaIteracao("Iniciação", 5));
        etapas.add(new EtapaIteracao("Requisitos", 20));
        etapas.add(new EtapaIteracao("Projeto", 10));
        etapas.add(new EtapaIteracao("Desenvolvimento", 40));
        etapas.add(new EtapaIteracao("Teste e Verificação", 25));*/
    }

    public List<EtapaIteracao> listarEtapas() {
        return etapas;
    }

    public void adicionarEtapa(EtapaIteracao etapa) {
        etapas.add(etapa);
    }
    
}