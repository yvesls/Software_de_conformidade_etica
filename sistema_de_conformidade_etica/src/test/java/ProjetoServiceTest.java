
import com.gestaoqualidadeprojetos.model.EtapaIteracao;
import com.gestaoqualidadeprojetos.model.Iteracao;
import com.gestaoqualidadeprojetos.model.Projeto;
import com.gestaoqualidadeprojetos.repository.ProjetoRepository;
import com.gestaoqualidadeprojetos.service.ProjetoService;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.Date;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ProjetoServiceTest {

    private ProjetoService projetoService;
   
    public ProjetoServiceTest(){
        this.projetoService = new ProjetoService();
    }

    @Test
    public void testSalvarProjeto() throws ParseException {
        //Criando as datas
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date dataInicio = dateFormat.parse("01/07/2023");
        Date dataFim = dateFormat.parse("01/08/2023");
              
        //Criação do projeto
        Projeto projetoCascata = new Projeto("Sistema Cascata", dataInicio, dataFim, "Em andamento", "CASCATA", 1);
        
        // Salvar projeto
        projetoService.salvarProjeto(projetoCascata);

        // Verificação
        Projeto projetoSalvo = projetoService.buscarProjeto("Sistema Cascata");
        assertNotNull(projetoSalvo);
        assertNotNull(projetoSalvo.getDataInicio());
        assertNotNull(projetoSalvo.getDataConclusao());
        assertTrue(projetoSalvo.getDataConclusao().after(projetoSalvo.getDataInicio()));
        assertEquals("Sistema Cascata", projetoSalvo.getNome());
        assertEquals("Em andamento", projetoSalvo.getStatus());
        assertEquals("CASCATA", projetoSalvo.getTipo());
    }

    @Test
    public void testCriarIteracao() {
        // Buscar o projeto
        Projeto projetoSalvo = projetoService.buscarProjeto("Sistema Cascata");

        // Criação da iteração
        Iteracao cascata = new Iteracao("Iteração Única", new Date(), new Date(), new Date(), "ABERTA");

        // Criar iteração
        projetoService.criarIteracao(projetoSalvo, cascata);

        // Atualizar o projeto no repositório
        projetoService.salvarProjeto(projetoSalvo);

        // Verificação
        Projeto projetoAtualizado = projetoService.buscarProjeto("Sistema Cascata");
        assertNotNull(projetoAtualizado);
        assertEquals(1, projetoAtualizado.getIteracoes().size());
        assertEquals("Iteração Única", projetoAtualizado.getIteracoes().get(0).getDescricao());
    }

    @Test
    public void testCriarEtapa() {
        //Buscar o projeto
        Projeto projetoSalvo = projetoService.buscarProjeto("Sistema Cascata");

        // Criação da iteração
        Iteracao cascata = new Iteracao("Iteração Única", new Date(), new Date(), new Date(), "ABERTA");
        projetoService.criarIteracao(projetoSalvo, cascata);

        // Criação das etapas
        EtapaIteracao iniciacao = new EtapaIteracao("Iniciação", 5);
        EtapaIteracao requisitos = new EtapaIteracao("Requisitos", 20);
        EtapaIteracao projeto = new EtapaIteracao("Projeto", 10);
        EtapaIteracao desenvolvimento = new EtapaIteracao("Desenvolvimento", 40);
        EtapaIteracao testeVerificacao = new EtapaIteracao("Teste e Verificação", 25);

        // Criar etapas
        projetoService.criarEtapa(projetoSalvo, cascata, iniciacao);
        projetoService.criarEtapa(projetoSalvo, cascata, requisitos);
        projetoService.criarEtapa(projetoSalvo, cascata, projeto);
        projetoService.criarEtapa(projetoSalvo, cascata, desenvolvimento);
        projetoService.criarEtapa(projetoSalvo, cascata, testeVerificacao);

        // Salva o projeto
        projetoService.salvarProjeto(projetoSalvo);

        // Verificação
        Projeto projetoAtualizado = projetoService.buscarProjeto("Sistema Cascata");
        assertNotNull(projetoAtualizado);
        //assertEquals(1, projetoAtualizado.getIteracoes().size());
        assertEquals(5, projetoAtualizado.getIteracoes().get(0).getEtapas().size());
        assertEquals("Iniciação", projetoAtualizado.getIteracoes().get(0).getEtapas().get(0).getDescricao());
        assertEquals("Requisitos", projetoAtualizado.getIteracoes().get(0).getEtapas().get(1).getDescricao());
        assertEquals("Projeto", projetoAtualizado.getIteracoes().get(0).getEtapas().get(2).getDescricao());
        assertEquals("Desenvolvimento", projetoAtualizado.getIteracoes().get(0).getEtapas().get(3).getDescricao());
        assertEquals("Teste e Verificação", projetoAtualizado.getIteracoes().get(0).getEtapas().get(4).getDescricao());
    }
}
