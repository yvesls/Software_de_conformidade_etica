import com.gestaoqualidadeprojetos.model.Iteracao;
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
        LocalDateTime dataInicio = LocalDateTime.parse("01/07/2023");
        LocalDateTime dataFim = LocalDateTime.parse("01/08/2023");
        Iteracao iteracao = new Iteracao("Iteração Única", dataInicio, dataFim, "ABERTA");
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
        LocalDateTime dataInicio = LocalDateTime.parse("01/07/2023");
        LocalDateTime dataFim = LocalDateTime.parse("01/08/2023");
        Iteracao iteracao = new Iteracao("Iteração Única", dataInicio, dataFim, "ABERTA");

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
        LocalDateTime dataInicio = LocalDateTime.parse("01/07/2023");
        LocalDateTime dataFim = LocalDateTime.parse("01/08/2023");
        Iteracao iteracao = new Iteracao("Iteração Única", dataInicio, dataFim, "ABERTA");

        // When
        ResultadoIteracao resultadoIteracao = resultadoIteracaoRepository.getByIteracao(iteracao);

        // Then
        assertNotNull(resultadoIteracao);
        assertEquals(iteracao, resultadoIteracao.getIteracao());
    }

    @Test
    public void testGetByIteracaoInvalidIteracaoReturnsNull() {
        // Given
        Iteracao iteracao = null;

        // When
        ResultadoIteracao resultadoIteracao = resultadoIteracaoRepository.getByIteracao(iteracao);

        // Then
        assertNull(resultadoIteracao);
    }

    @Test
    public void testGetByIteracaoExistingIteracaoCheckProperties() {
        // Given
        LocalDateTime dataInicio = LocalDateTime.parse("01/07/2023");
        LocalDateTime dataFim = LocalDateTime.parse("01/08/2023");
        Iteracao iteracao = new Iteracao("Iteração Única", dataInicio, dataFim, "ABERTA");

        // When
        ResultadoIteracao resultadoIteracao = resultadoIteracaoRepository.getByIteracao(iteracao);

        // Then
        assertNotNull(resultadoIteracao);
        assertNotNull(resultadoIteracao.getClassificacao());
        assertTrue(resultadoIteracao.getDataResultado()instanceof LocalDateTime);
    }
}