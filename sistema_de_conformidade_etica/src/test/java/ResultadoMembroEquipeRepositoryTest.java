import com.gestaoqualidadeprojetos.model.ResultadoMembroEquipe;
import com.gestaoqualidadeprojetos.repository.ResultadoMembroEquipeRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class ResultadoMembroEquipeRepositoryTest {

    private final ResultadoMembroEquipeRepository resultadoMembroEquipeRepository = new ResultadoMembroEquipeRepository();

    @Test
    public void testGetByIteracaoExistingIteracaoReturns() {
        // Given
        String iteracao = "Iteração 1";
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
        String iteracao = "Iteração 2";

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
        String iteracao = "Iteração 1";

        // When
        List<ResultadoMembroEquipe> listResultadoMembroEquipe = resultadoMembroEquipeRepository.getByIteracao(iteracao);

        // Then
        assertNotNull(listResultadoMembroEquipe);
        assertEquals(iteracao, listResultadoMembroEquipe.get(0).getIteracao());
    }

    @Test
    public void testGetByIteracaoInvalidIteracaoReturnsNull() {
        // Given
        String iteracao = null;

        // When
        List<ResultadoMembroEquipe> listResultadoMembroEquipe = resultadoMembroEquipeRepository.getByIteracao(iteracao);

        // Then
        assertNull(listResultadoMembroEquipe);
    }

    @Test
    public void testGetByIteracaoExistingIteracaoCheckProperties() {
        // Given
        String iteracao = "Iteração 1";

        // When
        List<ResultadoMembroEquipe> listResultadoMembroEquipe = resultadoMembroEquipeRepository.getByIteracao(iteracao);

        // Then
        assertNotNull(listResultadoMembroEquipe);
        assertFalse(listResultadoMembroEquipe.isEmpty());
        assertEquals(iteracao, listResultadoMembroEquipe.get(0).getIteracao());
        assertNotNull(listResultadoMembroEquipe.get(0).getClassificacao());
        assertNotNull(listResultadoMembroEquipe.get(0).getMembro());
    }
}
