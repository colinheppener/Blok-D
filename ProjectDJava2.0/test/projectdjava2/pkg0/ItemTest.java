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
public class ItemTest {
    
    public ItemTest() {
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
     * Test of Teken method, of class Item.
     */
    @Test
    public void testTeken() {
        System.out.println("Teken");
        Graphics g = null;
        Item instance = new Item();
        instance.Teken(g);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getImageFile method, of class Item.
     */
    @Test
    public void testGetImageFile() {
        System.out.println("getImageFile");
        Item instance = new Item();
        BufferedImage expResult = null;
        BufferedImage result = instance.getImageFile();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
