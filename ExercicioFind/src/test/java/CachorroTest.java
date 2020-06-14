import static org.junit.jupiter.api.Assertions.*;
/**
 * @author Pedro Guilherme
 * @version 1.0
 * @since 07/06/2020 - 14:08
 * @category Test
 */
class CachorroTest {

    Cachorro cachorro = new Cachorro();
    public CachorroTest() {
        cachorro.setPeso(4.5);
        cachorro.setAltura(1);
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        cachorro.setPeso(4.5);
        cachorro.setAltura(1);
    }
    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }

    @org.junit.jupiter.api.Test
    void TestCalculoImcCao() {
        assertEquals(0.444,cachorro.calculoImcCachorro(),0.3);
    }
}