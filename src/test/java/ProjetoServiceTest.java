import com.gestaoqualidadeprojetos.model.EtapaIteracao;
import com.gestaoqualidadeprojetos.model.Iteracao;
import com.gestaoqualidadeprojetos.model.MembroEquipe;
import com.gestaoqualidadeprojetos.model.Projeto;
import com.gestaoqualidadeprojetos.model.QuestionarioEtapa;
import com.gestaoqualidadeprojetos.service.ProjetoService;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ProjetoServiceTest {

    private ProjetoService projetoService;
    private Projeto projetoIterativo;

    public ProjetoServiceTest(){
        this.projetoService = new ProjetoService();
    }

    @Test
    //@Order(1)
    public void testCriarProjetoVazio(){
        /*GIVEN*/
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate dataInicio = LocalDate.parse("01/07/2023", formatter);
        LocalDate dataFim = LocalDate.parse("01/10/2023", formatter);

        /*WHEN*/
        projetoIterativo = new Projeto("Sistema Iterativo", dataInicio, dataFim, "Em andamento", "ITERATIVO", 2);

        /*THEN*/
        assertNotNull(projetoIterativo);
        assertNotNull(projetoIterativo.getDataInicio());
        assertNotNull(projetoIterativo.getPrevisaoConclusao());
        assertTrue(projetoIterativo.getPrevisaoConclusao().isAfter(projetoIterativo.getDataInicio()));
        assertEquals("Sistema Iterativo", projetoIterativo.getNome());
        assertEquals("Em andamento", projetoIterativo.getStatus());
        assertEquals("ITERATIVO", projetoIterativo.getTipo());
    }

    @Test
    //@Order(2)
    public void testCriarIteracao(){
        testCriarProjetoVazio();

        /*GIVEN*/
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate dataInicio = LocalDate.parse("13/07/2023", formatter);
        LocalDate previsaoFim = LocalDate.parse("20/08/2023", formatter);

        /*WHEN*/
        Iteracao sprint1 = new Iteracao("Sprint 1", dataInicio, previsaoFim, "ABERTA");
        projetoService.addIteracao(projetoIterativo, sprint1);

        /*THEN*/
        assertEquals(1, projetoIterativo.getIteracoes().size());
        assertEquals("Sprint 1", projetoIterativo.getIteracoes().get(0).getDescricao());
        assertEquals("ABERTA", projetoIterativo.getIteracoes().get(0).getStatus());
    }

    @Test
    //@Order(3)
    public void testCriarEtapa(){
        testCriarIteracao();

        /*GIVEN*/
        QuestionarioEtapa questionarioBaseEtapa = new QuestionarioEtapa("Questionário Base", LocalDateTime.now());
        EtapaIteracao iniciacao = new EtapaIteracao("Iniciação", 5, questionarioBaseEtapa);

        /*WHEN*/
        projetoService.addEtapa(projetoIterativo, "Sprint 1", iniciacao);

        /*THEN*/
        assertEquals(1, projetoIterativo.getIteracoes().get(0).getEtapas().size());
        assertEquals("Iniciação", projetoIterativo.getIteracoes().get(0).getEtapas().get(0).getDescricao());
    }

    @Test
    //@Order(4)
    public void testAddMembroEquipe(){
        testCriarEtapa();

        /*GIVEN*/
        MembroEquipe cliente = new MembroEquipe("João", "Silva", "joao@projeto.com", "123", "CLIENTE", false);
       
        /*WHEN*/
        projetoService.addMembroEquipe(projetoIterativo, cliente);

        /*THEN*/
        assertTrue(projetoIterativo.getEquipe().contains(cliente));
    }

    @Test
    //@Order(5)
    public void testSalvarProjeto(){
        /*GIVEN*/
        testAddMembroEquipe();
        
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate dataFimIteracao = LocalDate.parse("18/08/2023", formatter);
        LocalDate dataFimProjeto = LocalDate.parse("01/10/2023", formatter);

        /*WHEN*/
        projetoIterativo = projetoService.finalizarIteracao(projetoIterativo, "Sprint 1", dataFimIteracao);
        projetoIterativo = projetoService.finalizarProjeto(projetoIterativo, dataFimProjeto);
        projetoService.salvar(projetoIterativo);

        /*THEN*/
        assertEquals(projetoIterativo, projetoService.buscarProjeto("Sistema Iterativo"));
        assertEquals("FINALIZADA", projetoIterativo.getIteracoes().get(0).getStatus());
        assertEquals("Concluído", projetoIterativo.getStatus());
    }
}