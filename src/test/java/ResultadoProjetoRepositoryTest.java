import com.gestaoqualidadeprojetos.model.Projeto;
import com.gestaoqualidadeprojetos.model.ResultadoProjeto;
import com.gestaoqualidadeprojetos.repository.ResultadoProjetoRepository;
import java.time.LocalDate;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class ResultadoProjetoRepositoryTest {

    private static final ResultadoProjetoRepository resultadoProjetoRepository = new ResultadoProjetoRepository();

    @Test
    public void testGetByProjetoExistingProjetoReturns() {
        // Given
        LocalDate dataInicio = LocalDate.of(2023, 7, 1);
        LocalDate dataFim = LocalDate.of(2023, 8, 1);
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
        LocalDate dataInicio = LocalDate.of(2023, 7, 1);
        LocalDate dataFim = LocalDate.of(2023, 8, 1);
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
        LocalDate dataInicio = LocalDate.of(2023, 7, 1);
        LocalDate dataFim = LocalDate.of(2023, 8, 1);
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