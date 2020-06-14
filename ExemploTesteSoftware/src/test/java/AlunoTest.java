import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
/**
 * @Author Pedro Guilherme
 * @version 1.0
 * @since 27/05/20 - 12:21
 */
class AlunoTest {
    Aluno aluno = new Aluno();

    public void Aluno() {
        aluno.setNota1(10);
        aluno.setNota2(5);
        aluno.setNumeroDePresencas(9);
        aluno.setTotalDeAulas(10);
    }

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        aluno.setNota1(10);
        aluno.setNota2(5);
        aluno.setNumeroDePresencas(9);
        aluno.setTotalDeAulas(10);
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {

    }
    @org.junit.jupiter.api.Test
    public void calcularMediaAritmetica() {
        assertEquals(7.5,aluno.calcularMediaAritmetica());

        //aluno.setNota1(1);
        //aluno.setNota2(1);
        //assertEquals(1.0,aluno.calcularMediaAritmetica());
    }

    @org.junit.jupiter.api.Test
    public void calcularFrequencia() {
        assertEquals(90,aluno.calcularFrequencia());

        //aluno.setTotalDeAulas(10);
        //aluno.setNumeroDePresencas(0);
        //assertEquals(0,aluno.calcularFrequencia());
    }

    @Test
    public void verificarAprovacao() {
        this.calcularMediaAritmetica();
        assertEquals("Aprovado fiote",aluno.verificarAprovacaoNota());
    }

    @Test
    public void verificarAprovacaoFrequencia() {
        this.calcularFrequencia();
        assertEquals("Aprovado!",aluno.calcularFrequencia());
    }
}