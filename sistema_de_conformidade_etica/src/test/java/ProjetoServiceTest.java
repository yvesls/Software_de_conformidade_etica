
import com.gestaoqualidadeprojetos.model.EtapaIteracao;
import com.gestaoqualidadeprojetos.model.Iteracao;
import com.gestaoqualidadeprojetos.model.MembroEquipe;
import com.gestaoqualidadeprojetos.model.Projeto;
import com.gestaoqualidadeprojetos.service.MembroEquipeService;
import com.gestaoqualidadeprojetos.service.ProjetoService;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import org.junit.jupiter.api.Test;
import java.util.Date;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Order;

public class ProjetoServiceTest {

    private ProjetoService projetoService;
    private Projeto projetoIterativo;

    public ProjetoServiceTest() throws ParseException {
        this.projetoService = new ProjetoService();
    }

    @Test
    //@Order(1)
    public void testCriarProjetoVazio() throws ParseException {
        /*GIVEN*/
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date dataInicio = dateFormat.parse("01/07/2023");
        Date dataFim = dateFormat.parse("01/08/2023");
        
        /*WHEN*/
        projetoIterativo = new Projeto("Sistema Iterativo", dataInicio, dataFim, "Em andamento", "ITERATIVO", 2);

        /*THEN*/
        assertNotNull(projetoIterativo);
        assertNotNull(projetoIterativo.getDataInicio());
        assertNotNull(projetoIterativo.getDataConclusao());
        assertTrue(projetoIterativo.getDataConclusao().after(projetoIterativo.getDataInicio()));
        assertEquals("Sistema Iterativo", projetoIterativo.getNome());
        assertEquals("Em andamento", projetoIterativo.getStatus());
        assertEquals("ITERATIVO", projetoIterativo.getTipo());
    }

    @Test
    //@Order(2)
    public void testCriarIteracao() throws ParseException {
        testCriarProjetoVazio();
        
        /*GIVEN*/
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date dataInicio = dateFormat.parse("13/07/2023");
        Date dataFim = dateFormat.parse("20/07/2023");
        
        /*WHEN*/
        Iteracao sprint1 = new Iteracao("Sprint 1", dataInicio, dataFim, "ABERTA");
        projetoService.criarIteracao(projetoIterativo, sprint1);

        /*THEN*/
        assertEquals(1, projetoIterativo.getIteracoes().size());
        assertEquals("Sprint 1", projetoIterativo.getIteracoes().get(0).getDescricao());
    }
    
    @Test
    //@Order(3)
    public void testCriarEtapa() throws ParseException {
        testCriarIteracao();

        /*GIVEN*/
        EtapaIteracao iniciacao = new EtapaIteracao("Iniciação", 5, "Sprint 2");
        EtapaIteracao requisitos = new EtapaIteracao("Requisitos", 20, "Sprint 2");
        EtapaIteracao projeto = new EtapaIteracao("Projeto", 10, "Sprint 2");
        EtapaIteracao desenvolvimento = new EtapaIteracao("Desenvolvimento", 40, "Sprint 2");
        EtapaIteracao testeVerificacao = new EtapaIteracao("Teste e Verificação", 25, "Sprint 2");

        /*WHEN*/
        projetoService.criarEtapa(projetoIterativo, "Sprint 1", iniciacao);
        projetoService.criarEtapa(projetoIterativo, "Sprint 1", requisitos);
        projetoService.criarEtapa(projetoIterativo, "Sprint 1", projeto);
        projetoService.criarEtapa(projetoIterativo, "Sprint 1", desenvolvimento);
        projetoService.criarEtapa(projetoIterativo, "Sprint 1", testeVerificacao);

        /*THEN*/
        assertEquals(5, projetoIterativo.getIteracoes().get(0).getEtapas().size());
        assertEquals("Iniciação", projetoIterativo.getIteracoes().get(0).getEtapas().get(0).getDescricao());
        assertEquals("Requisitos", projetoIterativo.getIteracoes().get(0).getEtapas().get(1).getDescricao());
        assertEquals("Projeto", projetoIterativo.getIteracoes().get(0).getEtapas().get(2).getDescricao());
        assertEquals("Desenvolvimento", projetoIterativo.getIteracoes().get(0).getEtapas().get(3).getDescricao());
        assertEquals("Teste e Verificação", projetoIterativo.getIteracoes().get(0).getEtapas().get(4).getDescricao());
    }

    @Test
    //@Order(4)
    public void testAddMembroEquipe() throws ParseException {
        testCriarEtapa();
        
        /*GIVEN*/
        MembroEquipe cliente = new MembroEquipe("João", "Silva", "joao@projeto.com", "123", "CLIENTE", false);
        MembroEquipe gerenteProjeto = new MembroEquipe("Maria", "Souza", "maria@projeto.com", "456", "GERENTE DE PROJETO", false);
        MembroEquipe liderEquipe = new MembroEquipe("Carlos", "Ferreira", "carlos@projeto.com", "789", "LÍDER DE EQUIPE", false);
        MembroEquipe arquitetoSoftware = new MembroEquipe("Ana", "Santos", "ana@projeto.com", "101112", "ARQUITETO DE SOFTWARE", false);
        MembroEquipe desenvolvedor = new MembroEquipe("Pedro", "Gomes", "pedro@projeto.com", "131415", "DESENVOLVEDOR", false);
        MembroEquipe analistaQualidade = new MembroEquipe("Mariana", "Lima", "mariana@projeto.com", "161718", "ANALISTA DE QUALIDADE", false);

        /*WHEN*/
        MembroEquipeService membroService = new MembroEquipeService();
        membroService.addMembro(cliente);
        membroService.addMembro(gerenteProjeto);
        membroService.addMembro(liderEquipe);
        membroService.addMembro(arquitetoSoftware);
        membroService.addMembro(desenvolvedor);
        membroService.addMembro(analistaQualidade);
        
        projetoService.addMembroEquipe(projetoIterativo, cliente);
        projetoService.addMembroEquipe(projetoIterativo, gerenteProjeto);
        projetoService.addMembroEquipe(projetoIterativo, liderEquipe);
        projetoService.addMembroEquipe(projetoIterativo, arquitetoSoftware);
        projetoService.addMembroEquipe(projetoIterativo, desenvolvedor);
        projetoService.addMembroEquipe(projetoIterativo, analistaQualidade);

        /*THEN*/
        assertTrue(projetoIterativo.getEquipe().contains(cliente));
        assertTrue(projetoIterativo.getEquipe().contains(gerenteProjeto));
        assertTrue(projetoIterativo.getEquipe().contains(liderEquipe));
        assertTrue(projetoIterativo.getEquipe().contains(arquitetoSoftware));
        assertTrue(projetoIterativo.getEquipe().contains(desenvolvedor));
        assertTrue(projetoIterativo.getEquipe().contains(analistaQualidade));
    }
    
    @Test
    //@Order(5)
    public void testSalvarProjeto() throws ParseException {
        testAddMembroEquipe();
        
        /*GIVEN/WHEN*/
        projetoService.salvarProjeto(projetoIterativo);
        
        /*THEN*/
        assertEquals(projetoIterativo, projetoService.buscarProjeto("Sistema Iterativo"));
    }
}
