import com.gestaoqualidadeprojetos.model.Iteracao;
import com.gestaoqualidadeprojetos.model.ResultadoIteracao;
import com.gestaoqualidadeprojetos.repository.ResultadoIteracaoRepository;
import com.gestaoqualidadeprojetos.repository.ResultadoProjetoRepository;
import java.time.LocalDate;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

import static org.junit.jupiter.api.Assertions.*;

public class ResultadoIteracaoRepositoryTest {

    private static final ResultadoIteracaoRepository resultadoIteracaoRepository = new ResultadoIteracaoRepository();

    public ResultadoIteracaoRepositoryTest() {
    }
     
    @Test
    public void testGetByIteracaoExistingIteracaoReturns() {
        // Given
        LocalDate dataInicio = LocalDate.of(2023, 7, 1);
        LocalDate dataFim = LocalDate.of(2023, 8, 1);
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
        LocalDate dataInicio = LocalDate.of(2023, 7, 1);
        LocalDate dataFim = LocalDate.of(2023, 8, 1);
        Iteracao iteracao = new Iteracao("Iteração 2", dataInicio, dataFim, "ABERTA");

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
        LocalDate dataInicio = LocalDate.of(2023, 7, 1);
        LocalDate dataFim = LocalDate.of(2023, 8, 1);
        Iteracao iteracao = new Iteracao("Iteração Única", dataInicio, dataFim, "ABERTA");
        // When
        ResultadoIteracao resultadoIteracao = resultadoIteracaoRepository.getByIteracao(iteracao);

        // Then
        assertNotNull(resultadoIteracao);
        assertEquals(iteracao.getStatus(), resultadoIteracao.getIteracao().getStatus());
    }

    @Test
    public void testGetByIteracaoInvalidIteracaoReturnsNull() {
        // Given
        Iteracao iteracao = new Iteracao();

        // When
        ResultadoIteracao resultadoIteracao = resultadoIteracaoRepository.getByIteracao(iteracao);

        // Then
        assertNull(resultadoIteracao);
    }

    @Test
    public void testGetByIteracaoExistingIteracaoCheckProperties() {
        // Given
        LocalDate dataInicio = LocalDate.of(2023, 7, 1);
        LocalDate dataFim = LocalDate.of(2023, 8, 1);
        Iteracao iteracao = new Iteracao("Iteração Única", dataInicio, dataFim, "ABERTA");

        // When
        ResultadoIteracao resultadoIteracao = resultadoIteracaoRepository.getByIteracao(iteracao);

        // Then
        assertNotNull(resultadoIteracao);
        assertNotNull(resultadoIteracao.getClassificacao());
        assertTrue(resultadoIteracao.getDataResultado()instanceof LocalDate);
    }
}