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
public class ValsspelerTest {
    
    public ValsspelerTest() {
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
     * Test of Teken method, of class Valsspeler.
     */
    @Test(expected=NullPointerException.class)
    public void testTeken() {
        System.out.println("Teken");
        Graphics g = null;
        Valsspeler instance = null;
        instance.Teken(g);

    }
    /**
     * Test of voerActieUit method, of class Valsspeler.
     */
    @Test(expected=NullPointerException.class)
    public void testVoerActieUit() {
        System.out.println("voerActieUit");
        Valsspeler instance = null;
        instance.voerActieUit();
    }
}
