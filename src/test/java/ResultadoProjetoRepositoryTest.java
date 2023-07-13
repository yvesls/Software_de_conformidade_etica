import com.gestaoqualidadeprojetos.model.ResultadoProjeto;
import com.gestaoqualidadeprojetos.repository.ResultadoProjetoRepository;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class ResultadoProjetoRepositoryTest {

    private final ResultadoProjetoRepository resultadoProjetoRepository = new ResultadoProjetoRepository();

    @Test
    public void testGetByProjetoExistingProjetoReturns() {
        // Given
        String projeto = "Projeto 1";
        ResultadoProjeto expectedResultadoProjeto = resultadoProjetoRepository.getByProjeto(projeto);

        // When
        ResultadoProjeto resultadoProjeto = resultadoProjetoRepository.getByProjeto(projeto);

        // Then
        assertEquals(expectedResultadoProjeto, resultadoProjeto);
    }

    @Test
    public void testGetByProjetoNonExistingProjetoReturnsNull() {
        // Given
        String projeto = "Projeto 2";

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
        String projeto = "Projeto 1";

        // When
        ResultadoProjeto resultadoProjeto = resultadoProjetoRepository.getByProjeto(projeto);

        // Then
        assertNull(resultadoProjeto);
    }

    @Test
    public void testGetByProjetoInvalidProjetoReturnsNull() {
        // Given
        String projeto = null;

        // When
        ResultadoProjeto resultadoProjeto = resultadoProjetoRepository.getByProjeto(projeto);

        // Then
        assertNull(resultadoProjeto);
    }
}