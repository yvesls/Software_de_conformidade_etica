import com.gestaoqualidadeprojetos.model.Iteracao;
import com.gestaoqualidadeprojetos.model.ResultadoMembroEquipe;
import com.gestaoqualidadeprojetos.repository.ResultadoMembroEquipeRepository;
import java.text.ParseException;
import java.time.LocalDateTime;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import static org.junit.jupiter.api.Assertions.*;

public class ResultadoMembroEquipeRepositoryTest {

    private ResultadoMembroEquipeRepository resultadoMembroEquipeRepository;
    
    public ResultadoMembroEquipeRepositoryTest() {
        try {
            this.resultadoMembroEquipeRepository = new ResultadoMembroEquipeRepository();
        } catch (ParseException ex) {
            Logger.getLogger(ResultadoMembroEquipeRepositoryTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Test
    public void testGetByIteracaoExistingIteracaoReturns() {
        // Given
        LocalDateTime dataInicio = LocalDateTime.parse("01/07/2023");
        LocalDateTime dataFim = LocalDateTime.parse("01/08/2023");
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
        LocalDateTime dataInicio = LocalDateTime.parse("01/07/2023");
        LocalDateTime dataFim = LocalDateTime.parse("01/08/2023");
        Iteracao iteracao = new Iteracao("Iteração Única", dataInicio, dataFim, "ABERTA");

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
        LocalDateTime dataInicio = LocalDateTime.parse("01/07/2023");
        LocalDateTime dataFim = LocalDateTime.parse("01/08/2023");
        Iteracao iteracao = new Iteracao("Iteração Única", dataInicio, dataFim, "ABERTA");

        // When
        List<ResultadoMembroEquipe> listResultadoMembroEquipe = resultadoMembroEquipeRepository.getByIteracao(iteracao);

        // Then
        assertNotNull(listResultadoMembroEquipe);
        assertEquals(iteracao, listResultadoMembroEquipe.get(0).getIteracao());
    }

    @Test
    public void testGetByIteracaoInvalidIteracaoReturnsNull() {
        // Given
        Iteracao iteracao = null;

        // When
        List<ResultadoMembroEquipe> listResultadoMembroEquipe = resultadoMembroEquipeRepository.getByIteracao(iteracao);

        // Then
        assertNull(listResultadoMembroEquipe);
    }

    @Test
    public void testGetByIteracaoExistingIteracaoCheckProperties() {
        // Given
        LocalDateTime dataInicio = LocalDateTime.parse("01/07/2023");
        LocalDateTime dataFim = LocalDateTime.parse("01/08/2023");
        Iteracao iteracao = new Iteracao("Iteração Única", dataInicio, dataFim, "ABERTA");

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