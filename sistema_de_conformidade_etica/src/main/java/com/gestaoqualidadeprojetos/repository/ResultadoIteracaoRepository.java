
import com.gestaoqualidadeprojetos.model.Classificacao;
import com.gestaoqualidadeprojetos.model.MembroEquipeTeste;
import com.gestaoqualidadeprojetos.model.Peso;
import com.gestaoqualidadeprojetos.model.ResultadoIteracao;
import com.gestaoqualidadeprojetos.model.ResultadoMembroEquipe;
import com.gestaoqualidadeprojetos.repository.ClassificacaoRepository;
import com.gestaoqualidadeprojetos.repository.PesoRepository;
import com.gestaoqualidadeprojetos.repository.ResultadoMembroEquipeRepository;
import java.time.LocalDateTime;
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Note102
 */
public class ResultadoIteracaoRepository {
    private ArrayList<ResultadoIteracao> listaResultadosIteracao;
    
    public ResultadoIteracao getByMembroRepresentante(LocalDateTime dataResultado) {
        return getMockByDataResultado(dataResultado);
    }
    
    public ArrayList<ResultadoIteracao> getAll() {
          return generateAllMock();
    }
    
    private ArrayList<ResultadoIteracao> generateAllMock() {
        listaResultadosIteracao = new ArrayList<ResultadoIteracao>();
        ArrayList<Classificacao> classificacoes = new ClassificacaoRepository().getListaClassificacao();
        ArrayList<ResultadoMembroEquipe> resultadoMembros = new ResultadoMembroEquipeRepository().getListaResultadosMembroEquipe();
        var resultadoIteracao1 = new ResultadoIteracao("A iteração não alcançou o esperado", LocalDateTime.now(),resultadoMembros.get(0), classificacoes.get(0), "Iteração 1");
        listaResultadosIteracao.add(resultadoIteracao1);
        return listaResultadosIteracao;
    }
    
    private ResultadoIteracao getMockByDataResultado(LocalDateTime dataResultado) {
        for(ResultadoIteracao ri : listaResultadosIteracao) {
            if(ri.getDataResultado().equals(dataResultado)) {
                return ri;
            }
        }
        return null;
    }

    public ArrayList<ResultadoIteracao> getListaResultadosIteracao() {
        return listaResultadosIteracao;
    }
}
