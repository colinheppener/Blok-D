/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package projectdjava2.pkg0;

import java.awt.Graphics;
import org.junit.*;
import static org.junit.Assert.*;

/**
 *
 * @author Colin
 */
public class SpeelbordTest {
    
    public SpeelbordTest() {
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
     * Test of paintComponent method, of class Speelbord.
     */
    @Test(expected=NullPointerException.class)
    public void testPaintComponent() {
        System.out.println("paintComponent");
        Graphics g = null;
        Speelbord instance = null;
        instance.paintComponent(g);
    }
}
