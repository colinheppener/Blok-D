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
public class HelperTest {
    
    public HelperTest() {
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
     * Test of Teken method, of class Helper.
     */
    @Test(expected=NullPointerException.class)
    public void testTeken() {
        System.out.println("Teken");
        Graphics g = null;
        Helper instance = new Helper();
        instance.Teken(g);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Helper.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Helper instance = new Helper();
        String expResult = "helper";
        String result = instance.toString();
        assertEquals(expResult, result);
    }

    /**
     * Test of getImageFile method, of class Helper.
     */
    @Test
    public void testGetImageFile() {
        System.out.println("getImageFile");
        Helper instance = new Helper();
        
        BufferedImage result = instance.getImageFile();
        BufferedImage expResult = instance.getImageFile();
        assertEquals(expResult, result);
    }

    /**
     * Test of voerActieUit method, of class Helper.
     */
    @Test(expected=NullPointerException.class)
    public void testVoerActieUit() {
        System.out.println("voerActieUit");
        Helper instance = new Helper();
        instance.voerActieUit();
        
    }
}
