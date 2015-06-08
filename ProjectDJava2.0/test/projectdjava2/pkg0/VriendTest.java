/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package projectdjava2.pkg0;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import org.junit.*;
import static org.junit.Assert.*;


/**
 *
 * @author Colin
 */
public class VriendTest {

    
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
     * Test of Teken method, of class Vriend.
     */
    @Test(expected=NullPointerException.class)
    public void testTeken() {
        System.out.println("Teken");
        Graphics g = null;
        Vriend instance = null;
        instance.Teken(g);
    }
}
