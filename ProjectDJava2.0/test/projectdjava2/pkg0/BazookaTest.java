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
public class BazookaTest {
    
    public BazookaTest() {
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
     * Test of Teken method, of class Bazooka.
     */
    @Test(expected=NullPointerException.class)
    public void testTeken() {
        System.out.println("Teken");
        Graphics g = null;
        Bazooka instance = new Bazooka();
        instance.Teken(g);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Bazooka.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Bazooka instance = new Bazooka();
        String expResult = "bazooka";
        String result = instance.toString();
        assertEquals(expResult, result);
    }

    /**
     * Test of getImageFile method, of class Bazooka.
     */

    /**
     * Test of voerActieUit method, of class Bazooka.
     */
    @Test
    public void testVoerActieUit() {
        System.out.println("voerActieUit");
        Bazooka instance = new Bazooka();
        instance.voerActieUit();
    }
}
