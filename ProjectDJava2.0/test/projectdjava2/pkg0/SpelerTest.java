/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package projectdjava2.pkg0;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import org.junit.*;
import static org.junit.Assert.*;

/**
 *
 * @author Colin
 */
public class SpelerTest {
    
    public SpelerTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of Loop method, of class Speler.
     */
    @Test(expected=NullPointerException.class)
    public void testLoop() {
        System.out.println("Loop");
        String looprichting = "oost";
        Speler instance = new Speler();
        instance.Loop(looprichting);
    }

    /**
     * Test of Teken method, of class Speler.
     */
    @Test(expected=NullPointerException.class)
    public void testTeken() {
        System.out.println("Teken");
        Graphics g = null;
        Speler instance = new Speler();
        instance.Teken(g);
    }

    /**
     * Test of toString method, of class Speler.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Speler instance = new Speler();
        String expResult = "speler";
        String result = instance.toString();
        assertEquals(expResult, result);

    }
}
