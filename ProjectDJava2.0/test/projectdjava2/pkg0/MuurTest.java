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
public class MuurTest {
    
    public MuurTest() {
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
     * Test of Teken method, of class Muur.
     */
    @Test(expected=NullPointerException.class)
    public void testTeken() {
        System.out.println("Teken");
        Graphics g = null;
        Muur instance = new Muur();
        instance.Teken(g);
    }

    /**
     * Test of toString method, of class Muur.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Muur instance = new Muur();
        String expResult = "muur";
        String result = instance.toString();
        assertEquals(expResult, result);
    }

    /**
     * Test of getImageFile method, of class Muur.
     */
    @Test
    public void testGetImageFile() {
        System.out.println("getImageFile");
        Muur instance = new Muur();
        BufferedImage expResult = instance.getImageFile();
        BufferedImage result = instance.getImageFile();
        assertEquals(expResult, result);
    }
}
