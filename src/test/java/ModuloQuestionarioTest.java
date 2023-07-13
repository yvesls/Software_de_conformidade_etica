import com.gestaoqualidadeprojetos.model.MembroEquipe;
import com.gestaoqualidadeprojetos.model.Pergunta;
import com.gestaoqualidadeprojetos.model.PerguntaBase;
import com.gestaoqualidadeprojetos.model.QuestionarioEtapa;
import com.gestaoqualidadeprojetos.model.QuestionarioEtapaBase;
import com.gestaoqualidadeprojetos.model.Resposta;
import com.gestaoqualidadeprojetos.repository.MembroEquipeRepository;
import com.gestaoqualidadeprojetos.repository.PerguntaBaseRepository;
import com.gestaoqualidadeprojetos.repository.PerguntaRepository;
import com.gestaoqualidadeprojetos.repository.QuestionarioEtapaBaseRepository;
import com.gestaoqualidadeprojetos.repository.QuestionarioEtapaRepository;
import com.gestaoqualidadeprojetos.repository.RespostaRepository;
import com.gestaoqualidadeprojetos.service.PerguntaBaseService;
import com.gestaoqualidadeprojetos.service.RespostaService;
import org.junit.jupiter.api.Test;
import org.hamcrest.MatcherAssert;
import static org.hamcrest.Matchers.*;
import java.time.LocalDateTime;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;


public class ModuloQuestionarioTest {
    
    @Test
    public void testSalvarResposta() {
        RespostaRepository respostaRepository = new RespostaRepository();
        MembroEquipe membro = new MembroEquipe("João", "Silva", "joao@projeto.com", "123", "CLIENTE", false);
        Resposta resposta = new Resposta(membro, true);

        respostaRepository.salvarResposta(resposta);
        Resposta respostaObtida = respostaRepository.obterRespostaPorMembro(membro);

        MatcherAssert.assertThat(respostaObtida, equalTo(resposta));
    }

    @Test
    public void testAdicionarMembro() {
        MembroEquipeRepository membroRepository = new MembroEquipeRepository();
        MembroEquipe membro = new MembroEquipe("Pedro", "Gomes", "pedro@projeto.com", "131415", "DESENVOLVEDOR", false);

        membroRepository.adicionarMembro(membro);
        List<MembroEquipe> membros = membroRepository.listarMembros();

        MatcherAssert.assertThat(membros, hasItem(membro));
    }

    @Test
    public void testSalvarQuestionarioBase() {
        QuestionarioEtapaBaseRepository questionarioBaseRepository = new QuestionarioEtapaBaseRepository();
        QuestionarioEtapaBase questionarioBase = new QuestionarioEtapaBase("Questionário Base 1", LocalDateTime.now());

        questionarioBaseRepository.salvarQuestionarioBase(questionarioBase);
        List<QuestionarioEtapaBase> questionariosBase = questionarioBaseRepository.obterQuestionariosBase();

        MatcherAssert.assertThat(questionariosBase, hasItem(questionarioBase));
        
    }
    
    @Test
    public void testQuestionarioBaseNotNull() {
        QuestionarioEtapaBaseRepository questionarioBaseRepository = new QuestionarioEtapaBaseRepository();
        QuestionarioEtapaBase questionarioBase = new QuestionarioEtapaBase("Questionário Base 1", LocalDateTime.now());

        questionarioBaseRepository.salvarQuestionarioBase(questionarioBase);
        List<QuestionarioEtapaBase> questionariosBase = questionarioBaseRepository.obterQuestionariosBase();

      
        assertNotNull(questionariosBase);
       
    }
     
    @Test
    public void testQuestionarioBasePossui1() {
        QuestionarioEtapaBaseRepository questionarioBaseRepository = new QuestionarioEtapaBaseRepository();
        QuestionarioEtapaBase questionarioBase = new QuestionarioEtapaBase("Questionário Base 1", LocalDateTime.now());

        questionarioBaseRepository.salvarQuestionarioBase(questionarioBase);
        List<QuestionarioEtapaBase> questionariosBase = questionarioBaseRepository.obterQuestionariosBase();

      
        assertEquals(1, questionariosBase.size());
        
    }
    
    
    

    @Test
    public void testSalvarPerguntaBase() {
        PerguntaBaseRepository perguntaBaseRepository = new PerguntaBaseRepository();
        PerguntaBase perguntaBase = new PerguntaBase("Pergunta Base 1", LocalDateTime.now());

        perguntaBaseRepository.salvarPerguntaBase(perguntaBase);
        List<PerguntaBase> perguntasBase = perguntaBaseRepository.obterPerguntasBase();

        MatcherAssert.assertThat(perguntasBase, hasItem(perguntaBase));
    }

    @Test
    public void testSalvarPergunta() {
        PerguntaRepository perguntaRepository = new PerguntaRepository();
        PerguntaBase perguntaBase = new PerguntaBase("Pergunta Base 1", LocalDateTime.now());
        Pergunta pergunta = new Pergunta(perguntaBase.getDescricao(), perguntaBase.getDataCriacao());

        perguntaRepository.salvarPergunta(pergunta);
        List<Pergunta> perguntas = perguntaRepository.obterPerguntas();

        MatcherAssert.assertThat(perguntas, hasItem(pergunta));
    }

    @Test
    public void testSalvarQuestionarioEtapa() {
        QuestionarioEtapaRepository questionarioRepository = new QuestionarioEtapaRepository();
        QuestionarioEtapa questionario = new QuestionarioEtapa("Questionário 1", LocalDateTime.now());
        questionario.setDataConclusao(LocalDateTime.now().plusDays(1));
        questionario.setDataPrevisaoConclusao(LocalDateTime.now().plusDays(2));
        questionario.setStatus("Em andamento");

        questionarioRepository.salvarQuestionario(questionario);
        List<QuestionarioEtapa> questionarios = questionarioRepository.obterQuestionarios();

        MatcherAssert.assertThat(questionarios, hasItem(questionario));
    }

     
    
    


}