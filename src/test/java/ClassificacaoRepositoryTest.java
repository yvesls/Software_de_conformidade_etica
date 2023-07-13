import com.gestaoqualidadeprojetos.model.Classificacao;
import com.gestaoqualidadeprojetos.model.enums.ClassificacaoEnum;
import com.gestaoqualidadeprojetos.repository.ClassificacaoRepository;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class ClassificacaoRepositoryTest {

    private final ClassificacaoRepository classificacaoRepository = new ClassificacaoRepository();

    @Test
    public void testGetByFaixaExistingFaixaReturns() {
        // Given
        ClassificacaoEnum faixa = ClassificacaoEnum.B;
        Classificacao expectedClassificacao = classificacaoRepository.getByFaixa(faixa);

        // When
        Classificacao classificacao = classificacaoRepository.getByFaixa(faixa);

        // Then
        assertNotNull(classificacao);
        assertEquals(expectedClassificacao, classificacao);
    }

    @Test
    public void testGetAllReturnsAll() {
        // Given

        // When
        ArrayList<Classificacao> classificacoes = classificacaoRepository.getAll();

        // Then
        assertNotNull(classificacoes);
        assertEquals(7, classificacoes.size());
    }

    @Test
    public void testGetByFaixaValidFaixaReturnsCorrect() {
        // Given
        ClassificacaoEnum faixa = ClassificacaoEnum.C;

        // When
        Classificacao classificacao = classificacaoRepository.getByFaixa(faixa);

        // Then
        assertNotNull(classificacao);
        assertEquals(faixa, classificacao.getClassificacaoAtingida());
    }

    @Test
    public void testGetByFaixaInvalidFaixaReturnsNull() {
        // Given
        ClassificacaoEnum faixa = null;

        // When
        Classificacao classificacao = classificacaoRepository.getByFaixa(faixa);

        // Then
        assertNull(classificacao);
    }

    @Test
    public void testGetByFaixaExistingFaixaCheckProperties() {
        // Given
        ClassificacaoEnum faixa = ClassificacaoEnum.D;

        // When
        Classificacao classificacao = classificacaoRepository.getByFaixa(faixa);

        // Then
        assertNotNull(classificacao);
        assertTrue(classificacao.getValorPercentualAtingido() < 44.4);
    }
}