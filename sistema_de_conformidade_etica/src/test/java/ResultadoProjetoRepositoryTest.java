import com.gestaoqualidadeprojetos.model.Iteracao;
import com.gestaoqualidadeprojetos.model.Projeto;
import com.gestaoqualidadeprojetos.model.ResultadoProjeto;
import com.gestaoqualidadeprojetos.repository.ResultadoMembroEquipeRepository;
import com.gestaoqualidadeprojetos.repository.ResultadoProjetoRepository;
import java.text.ParseException;
import java.time.LocalDateTime;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

import static org.junit.jupiter.api.Assertions.*;

public class ResultadoProjetoRepositoryTest {

    private ResultadoProjetoRepository resultadoProjetoRepository;
    
    public ResultadoProjetoRepositoryTest() {
        try {
            this.resultadoProjetoRepository = new ResultadoProjetoRepository();
        } catch (Exception ex) {
            Logger.getLogger(ResultadoProjetoRepository.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Test
    public void testGetByProjetoExistingProjetoReturns() {
        // Given
        LocalDateTime dataInicio = LocalDateTime.parse("01/07/2023");
        LocalDateTime dataFim = LocalDateTime.parse("01/08/2023");
        Projeto projeto = new Projeto("Sistema Cascata", dataInicio, dataFim, "Em andamento", "CASCATA", 1);
        
        ResultadoProjeto expectedResultadoProjeto = resultadoProjetoRepository.getByProjeto(projeto);

        // When
        ResultadoProjeto resultadoProjeto = resultadoProjetoRepository.getByProjeto(projeto);

        // Then
        assertEquals(expectedResultadoProjeto, resultadoProjeto);
    }

    @Test
    public void testGetByProjetoNonExistingProjetoReturnsNull() {
        // Given
        LocalDateTime dataInicio = LocalDateTime.parse("01/07/2023");
        LocalDateTime dataFim = LocalDateTime.parse("01/08/2023");
        Projeto projeto = new Projeto("Sistema Cascata", dataInicio, dataFim, "Em andamento", "CASCATA", 1);

        // When
        ResultadoProjeto resultadoProjeto = resultadoProjetoRepository.getByProjeto(projeto);

        // Then
        assertNull(resultadoProjeto);
    }

    @Test
    public void testGetAllReturnsAll() {
        // Given

        // When
        ArrayList<ResultadoProjeto> listResultadoProjeto = resultadoProjetoRepository.getAll();

        // Then
        assertNotNull(listResultadoProjeto);
        assertEquals(0, listResultadoProjeto.size());
    }

    @Test
    public void testGetByProjetoValidProjetoReturnsCorrect() {
        // Given
        LocalDateTime dataInicio = LocalDateTime.parse("01/07/2023");
        LocalDateTime dataFim = LocalDateTime.parse("01/08/2023");
        Projeto projeto = new Projeto("Sistema Cascata", dataInicio, dataFim, "Em andamento", "CASCATA", 1);

        // When
        ResultadoProjeto resultadoProjeto = resultadoProjetoRepository.getByProjeto(projeto);

        // Then
        assertNull(resultadoProjeto);
    }

    @Test
    public void testGetByProjetoInvalidProjetoReturnsNull() {
        // Given
        Projeto projeto = null;

        // When
        ResultadoProjeto resultadoProjeto = resultadoProjetoRepository.getByProjeto(projeto);

        // Then
        assertNull(resultadoProjeto);
    }
}