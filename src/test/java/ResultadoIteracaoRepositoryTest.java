import com.gestaoqualidadeprojetos.model.Iteracao;
import com.gestaoqualidadeprojetos.model.ResultadoIteracao;
import com.gestaoqualidadeprojetos.repository.ResultadoIteracaoRepository;
import java.time.LocalDate;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class ResultadoIteracaoRepositoryTest {

    private final ResultadoIteracaoRepository resultadoIteracaoRepository = new ResultadoIteracaoRepository();

    @Test
    public void testGetByIteracaoExistingIteracaoReturns() {
        // Given
        LocalDate dataInicio = LocalDate.parse("2023-07-01T12:30:54");
        LocalDate dataFim = LocalDate.parse("2023-08-01T12:30:54");
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
        LocalDate dataInicio = LocalDate.parse("2023-07-01T12:30:54");
        LocalDate dataFim = LocalDate.parse("2023-08-01T12:30:54");
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
        LocalDate dataInicio = LocalDate.parse("2023-07-01T12:30:54");
        LocalDate dataFim = LocalDate.parse("2023-08-01T12:30:54");
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
        LocalDate dataInicio = LocalDate.parse("2023-07-01T12:30:54");
        LocalDate dataFim = LocalDate.parse("2023-08-01T12:30:54");
        Iteracao iteracao = new Iteracao("Iteração Única", dataInicio, dataFim, "ABERTA");

        // When
        ResultadoIteracao resultadoIteracao = resultadoIteracaoRepository.getByIteracao(iteracao);

        // Then
        assertNotNull(resultadoIteracao);
        assertNotNull(resultadoIteracao.getClassificacao());
        assertTrue(resultadoIteracao.getDataResultado()instanceof LocalDateTime);
    }
}