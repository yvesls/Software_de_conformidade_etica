import com.gestaoqualidadeprojetos.model.ResultadoIteracao;
import com.gestaoqualidadeprojetos.repository.ResultadoIteracaoRepository;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class ResultadoIteracaoRepositoryTest {

    private final ResultadoIteracaoRepository resultadoIteracaoRepository = new ResultadoIteracaoRepository();

    @Test
    public void testGetByIteracaoExistingIteracaoReturns() {
        // Given
        String iteracao = "Iteração 1";
        ResultadoIteracao expectedResultadoIteracao = resultadoIteracaoRepository.getByIteracao(iteracao);

        // When
        ResultadoIteracao resultadoIteracao = resultadoIteracaoRepository.getByIteracao(iteracao);

        // Then
        assertNotNull(resultadoIteracao);
        assertEquals(expectedResultadoIteracao, resultadoIteracao);
    }

    @Test
    public void testGetByIteracaoNonExistingIteracaoReturnsNull() {
        // Given
        String iteracao = "Iteração 2";

        // When
        ResultadoIteracao resultadoIteracao = resultadoIteracaoRepository.getByIteracao(iteracao);

        // Then
        assertNull(resultadoIteracao);
    }

    @Test
    public void testGetAllReturnsAll() {
        // Given

        // When
        ArrayList<ResultadoIteracao> resultadosIteracao = resultadoIteracaoRepository.getAll();

        // Then
        assertNotNull(resultadosIteracao);
        assertEquals(1, resultadosIteracao.size());
    }

    @Test
    public void testGetByIteracaoValidIteracaoReturnsCorrect() {
        // Given
        String iteracao = "Iteração 1";

        // When
        ResultadoIteracao resultadoIteracao = resultadoIteracaoRepository.getByIteracao(iteracao);

        // Then
        assertNotNull(resultadoIteracao);
        assertEquals(iteracao, resultadoIteracao.getIteracao());
    }

    @Test
    public void testGetByIteracaoInvalidIteracaoReturnsNull() {
        // Given
        String iteracao = null;

        // When
        ResultadoIteracao resultadoIteracao = resultadoIteracaoRepository.getByIteracao(iteracao);

        // Then
        assertNull(resultadoIteracao);
    }

    @Test
    public void testGetByIteracaoExistingIteracaoCheckProperties() {
        // Given
        String iteracao = "Iteração 1";

        // When
        ResultadoIteracao resultadoIteracao = resultadoIteracaoRepository.getByIteracao(iteracao);

        // Then
        assertNotNull(resultadoIteracao);
        assertNotNull(resultadoIteracao.getClassificacao());
        assertTrue(resultadoIteracao.getDataResultado()instanceof LocalDateTime);
    }
}