
import com.gestaoqualidadeprojetos.model.EtapaIteracao;
import com.gestaoqualidadeprojetos.model.Iteracao;
import com.gestaoqualidadeprojetos.model.MembroEquipe;
import com.gestaoqualidadeprojetos.model.Projeto;
import com.gestaoqualidadeprojetos.repository.ProjetoRepository;
import com.gestaoqualidadeprojetos.service.MembroEquipeService;
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

    public ProjetoServiceTest() {
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

    @Test
    public void testAddMembroEquipe() throws ParseException {
        //Buscar o projeto
        Projeto projetoSalvo = projetoService.buscarProjeto("Sistema Cascata");

        // Equipe
        MembroEquipe cliente = new MembroEquipe("João", "Silva", "joao@projeto.com", "123", "CLIENTE", false);
        MembroEquipe gerenteProjeto = new MembroEquipe("Maria", "Souza", "maria@projeto.com", "456", "GERENTE DE PROJETO", false);
        MembroEquipe liderEquipe = new MembroEquipe("Carlos", "Ferreira", "carlos@projeto.com", "789", "LÍDER DE EQUIPE", false);
        MembroEquipe arquitetoSoftware = new MembroEquipe("Ana", "Santos", "ana@projeto.com", "101112", "ARQUITETO DE SOFTWARE", false);
        MembroEquipe desenvolvedor = new MembroEquipe("Pedro", "Gomes", "pedro@projeto.com", "131415", "DESENVOLVEDOR", false);
        MembroEquipe analistaQualidade = new MembroEquipe("Mariana", "Lima", "mariana@projeto.com", "161718", "ANALISTA DE QUALIDADE", false);

        // Service de Membros de Equipe
        MembroEquipeService membroService = new MembroEquipeService();

        membroService.addMembro(cliente);
        membroService.addMembro(gerenteProjeto);
        membroService.addMembro(liderEquipe);
        membroService.addMembro(arquitetoSoftware);
        membroService.addMembro(desenvolvedor);
        membroService.addMembro(analistaQualidade);
        
        // Service de Projeto
        projetoService.addMembroEquipe(projetoSalvo, cliente);
        projetoService.addMembroEquipe(projetoSalvo, gerenteProjeto);
        projetoService.addMembroEquipe(projetoSalvo, liderEquipe);
        projetoService.addMembroEquipe(projetoSalvo, arquitetoSoftware);
        projetoService.addMembroEquipe(projetoSalvo, desenvolvedor);
        projetoService.addMembroEquipe(projetoSalvo, analistaQualidade);
        
        // Salva o projeto
        projetoService.salvarProjeto(projetoSalvo);

        // Verificar se os membro foram adicionados a equipe do projeto
        Projeto projetoAtualizado = projetoService.buscarProjeto("Sistema Cascata");
        assertTrue(projetoAtualizado.getEquipe().contains(cliente));
        assertTrue(projetoAtualizado.getEquipe().contains(gerenteProjeto));
        assertTrue(projetoAtualizado.getEquipe().contains(liderEquipe));
        assertTrue(projetoAtualizado.getEquipe().contains(arquitetoSoftware));
        assertTrue(projetoAtualizado.getEquipe().contains(desenvolvedor));
        assertTrue(projetoAtualizado.getEquipe().contains(analistaQualidade));
    }
}