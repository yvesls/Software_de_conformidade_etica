import com.gestaoqualidadeprojetos.model.EtapaIteracao;
import com.gestaoqualidadeprojetos.model.Iteracao;
import com.gestaoqualidadeprojetos.model.Projeto;
import com.gestaoqualidadeprojetos.service.ProjetoService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.Date;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class ProjetoServiceTest {

    private ProjetoService projetoService;

    @BeforeEach
    public void setUp() {
        projetoService = new ProjetoService();
    }

    @Test
    public void testSalvarProjeto() {
        // Criação do projeto
        Projeto projetoCascata = new Projeto("Sistema Cascata", new Date(), new Date(), "Em andamento", "CASCATA", 1, new Date());

        // Salvar projeto
        projetoService.salvarProjeto(projetoCascata);

        // Verificação
        Projeto projetoSalvo = projetoService.buscarProjeto("Sistema Cascata");
        assertNotNull(projetoSalvo);
        assertEquals("Em andamento", projetoSalvo.getStatus());
    }

    @Test
    public void testCriarIteracao() {
        // Criação do projeto
        Projeto projetoCascata = new Projeto("Sistema Cascata", new Date(), new Date(), "Em andamento", "CASCATA", 1, new Date());
        projetoService.salvarProjeto(projetoCascata);

        // Criação da iteração
        Iteracao cascata = new Iteracao("Iteração Única", new Date(), new Date(), new Date(), "ABERTA");

        // Criar iteração
        projetoService.criarIteracao(projetoCascata, cascata);

        // Verificação
        Projeto projetoAtualizado = projetoService.buscarProjeto("Sistema Cascata");
        assertNotNull(projetoAtualizado);
        assertEquals(1, projetoAtualizado.getIteracoes().size());
        assertEquals("Iteração Única", projetoAtualizado.getIteracoes().get(0).getDescricao());
    }

    @Test
    public void testCriarEtapa() {
        // Criação do projeto
        Projeto projetoCascata = new Projeto("Sistema Cascata", new Date(), new Date(), "Em andamento", "CASCATA", 1, new Date());
        projetoService.salvarProjeto(projetoCascata);

        // Criação da iteração
        Iteracao cascata = new Iteracao("Iteração Única", new Date(), new Date(), new Date(), "ABERTA");
        projetoService.criarIteracao(projetoCascata, cascata);

        // Criação das etapas
        EtapaIteracao iniciacao = new EtapaIteracao("Iniciação", 5);
        EtapaIteracao requisitos = new EtapaIteracao("Requisitos", 20);
        EtapaIteracao projeto = new EtapaIteracao("Projeto", 10);
        EtapaIteracao desenvolvimento = new EtapaIteracao("Desenvolvimento", 40);
        EtapaIteracao testeVerificacao = new EtapaIteracao("Teste e Verificação", 25);

        // Criar etapas
        projetoService.criarEtapa(projetoCascata, cascata, iniciacao);
        projetoService.criarEtapa(projetoCascata, cascata, requisitos);
        projetoService.criarEtapa(projetoCascata, cascata, projeto);
        projetoService.criarEtapa(projetoCascata, cascata, desenvolvimento);
        projetoService.criarEtapa(projetoCascata, cascata, testeVerificacao);

        // Verificação
        Projeto projetoAtualizado = projetoService.buscarProjeto("Sistema Cascata");
        assertNotNull(projetoAtualizado);
        assertEquals(1, projetoAtualizado.getIteracoes().size());
        assertEquals(5, projetoAtualizado.getIteracoes().get(0).getEtapas().size());
        assertEquals("Iniciação", projetoAtualizado.getIteracoes().get(0).getEtapas().get(0).getDescricao());
    }
}
