import com.gestaoqualidadeprojetos.model.Iteracao;
import com.gestaoqualidadeprojetos.model.ResultadoMembroEquipe;
import com.gestaoqualidadeprojetos.repository.ResultadoMembroEquipeRepository;
import java.time.LocalDate;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class ResultadoMembroEquipeRepositoryTest {
    
    private static final ResultadoMembroEquipeRepository resultadoMembroEquipeRepository = new ResultadoMembroEquipeRepository();

    @Test
    public void testGetByIteracaoExistingIteracaoReturns() {
        // Given
        LocalDate dataInicio = LocalDate.of(2023, 7, 1);
        LocalDate dataFim = LocalDate.of(2023, 8, 1);
        Iteracao iteracao = new Iteracao("Iteração Única", dataInicio, dataFim, "ABERTA");
        
        List<ResultadoMembroEquipe> expectedListResultadoMembroEquipe = resultadoMembroEquipeRepository.getByIteracao(iteracao);

        // When
        List<ResultadoMembroEquipe> listResultadoMembroEquipe = resultadoMembroEquipeRepository.getByIteracao(iteracao);

        // Then
        assertNotNull(listResultadoMembroEquipe);
        assertEquals(expectedListResultadoMembroEquipe, listResultadoMembroEquipe);
    }

    @Test
    public void testGetByIteracaoNonExistingIteracaoReturnsNull() {
        // Given
        LocalDate dataInicio = LocalDate.of(2023, 7, 1);
        LocalDate dataFim = LocalDate.of(2023, 8, 1);
        Iteracao iteracao = new Iteracao("Iteração 1", dataInicio, dataFim, "ABERTA");

        // When
        List<ResultadoMembroEquipe> listResultadoMembroEquipe = resultadoMembroEquipeRepository.getByIteracao(iteracao);

        // Then
        assertNull(listResultadoMembroEquipe);
    }

    @Test
    public void testGetAllReturnsAll() {
        // Given
        // When
        ArrayList<ResultadoMembroEquipe> listResultadoMembroEquipe = resultadoMembroEquipeRepository.getAll();

        // Then
        assertNotNull(listResultadoMembroEquipe);
        assertEquals(6, listResultadoMembroEquipe.size());
    }

    @Test
    public void testGetByIteracaoValidIteracaoReturnsCorrect() {
        // Given
        LocalDate dataInicio = LocalDate.of(2023, 7, 1);
        LocalDate dataFim = LocalDate.of(2023, 8, 1);
        Iteracao iteracao = new Iteracao("Iteração Única", dataInicio, dataFim, "ABERTA");

        // When
        List<ResultadoMembroEquipe> listResultadoMembroEquipe = resultadoMembroEquipeRepository.getByIteracao(iteracao);

        // Then
        assertNotNull(listResultadoMembroEquipe);
        assertEquals(iteracao.getStatus(), listResultadoMembroEquipe.get(0).getIteracao().getStatus());
    }

    @Test
    public void testGetByIteracaoInvalidIteracaoReturnsNull() {
        // Given
        Iteracao iteracao = new Iteracao();

        // When
        List<ResultadoMembroEquipe> listResultadoMembroEquipe = resultadoMembroEquipeRepository.getByIteracao(iteracao);

        // Then
        assertNull(listResultadoMembroEquipe);
    }

    @Test
    public void testGetByIteracaoExistingIteracaoCheckProperties() {
        // Given
        LocalDate dataInicio = LocalDate.of(2023, 7, 1);
        LocalDate dataFim = LocalDate.of(2023, 8, 1);
        Iteracao iteracao = new Iteracao("Iteração Única", dataInicio, dataFim, "ABERTA");

        // When
        List<ResultadoMembroEquipe> listResultadoMembroEquipe = resultadoMembroEquipeRepository.getByIteracao(iteracao);
 
        // Then
        assertNotNull(listResultadoMembroEquipe);
        assertFalse(listResultadoMembroEquipe.isEmpty());
        assertEquals(iteracao.getStatus(), listResultadoMembroEquipe.get(0).getIteracao().getStatus());
        assertNotNull(listResultadoMembroEquipe.get(0).getClassificacao());
        assertNotNull(listResultadoMembroEquipe.get(0).getMembro());
    }
}