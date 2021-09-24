package pets;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author SESI_SENAI
 */
public class CaesTest {
    Caes dog;
    
    public CaesTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
           dog = new Caes("Jeremy", 6);
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of falar method, of class Caes.
     */
    @Test
    public void testFalar() {
        System.out.println("falar");
        String mensagem = "Auau";
        String expResult = "Meu nome é Jeremy, " + mensagem;
        String result = dog.falar(mensagem);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of andar method, of class Caes.
     */
    @Test
    public void testAndarAnimado() {
        System.out.println("andar_animado");
        assertEquals(dog.andar(1500), true);
        System.out.println("Cálculo: Aprovado");
        assertEquals(dog.humor, "Animado");
        System.out.println("Humor: Aprovado");
    }

    /**
     * Test of comer method, of class Caes.
     */
    @Test
    public void testComer() {
        System.out.println("comer");
        Caes instance = null;
        instance.comer();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of dormir method, of class Caes.
     */
    @Test
    public void testDormir() {
        System.out.println("dormir");
        Caes instance = null;
        boolean expResult = false;
        boolean result = instance.dormir();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}