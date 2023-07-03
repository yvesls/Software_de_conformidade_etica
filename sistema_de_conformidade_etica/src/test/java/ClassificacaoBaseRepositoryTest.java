import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.gestaoqualidadeprojetos.model.ClassificacaoBase;
import com.gestaoqualidadeprojetos.model.enums.ClassificacaoEnum;
import com.gestaoqualidadeprojetos.repository.ClassificacaoBaseRepository;
import java.util.List;

public class ClassificacaoBaseRepositoryTest {

    private final ClassificacaoBaseRepository classificacaoBaseRepository = new ClassificacaoBaseRepository();

    @BeforeEach
    public void setup() {
    }

    @Test
    public void testGetByFaixaExistingFaixa() {
        // Given
        ClassificacaoEnum faixa = ClassificacaoEnum.A;
        ClassificacaoBase expectedClassificacaoBase = classificacaoBaseRepository.getByFaixa(faixa);

        // When
        ClassificacaoBase classificacaoBase = classificacaoBaseRepository.getByFaixa(faixa);

        // Then
        assertThat(classificacaoBase, is(notNullValue()));
        assertThat(classificacaoBase, is(expectedClassificacaoBase));
    }
    
    @Test
    public void testGetAllReturnsAll() {
        // Given

        // When
        List<ClassificacaoBase> classificacoes = classificacaoBaseRepository.getAll();

        // Then
        assertThat(classificacoes, is(notNullValue()));
        assertThat(classificacoes, hasSize(5));
    }
    
    @Test
    public void testGetByFaixaValidFaixaReturnsCorrect() {
        // Given
        ClassificacaoEnum faixa = ClassificacaoEnum.C;

        // When
        ClassificacaoBase classificacaoBase = classificacaoBaseRepository.getByFaixa(faixa);

        // Then
        assertThat(classificacaoBase, is(notNullValue()));
        assertThat(classificacaoBase.getFaixaClassificacao(), is(faixa));
    }
    
    @Test
    public void testGetByFaixaInvalidFaixaReturnsNull() {
        // Given
        ClassificacaoEnum faixa = null;

        // When
        ClassificacaoBase classificacaoBase = classificacaoBaseRepository.getByFaixa(faixa);

        // Then
        assertThat(classificacaoBase, is(nullValue()));
    }
}
