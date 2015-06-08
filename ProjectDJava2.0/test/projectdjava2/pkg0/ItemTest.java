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
    @Test()
    public void testTeken() {
        System.out.println("Teken");
        Graphics g = null;
        Item instance = new Item();
        instance.Teken(g);
    }

    /**
     * Test of voerActieUit method, of class Item.
     */
    @Test
    public void testVoerActieUit() {
        System.out.println("voerActieUit");
        Item instance = new Item();
        instance.voerActieUit();
    }

    /**
     * Test of toString method, of class Item.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Item instance = new Item();
        String expResult = "item toegevoegd";
        String result = instance.toString();
        assertEquals(expResult, result);
    }

    /**
     * Test of setVeld method, of class Item.
     */
    @Test
    public void testSetVeld() {
        System.out.println("setVeld");
        Veld vel = null;
        Item instance = new Item();
        instance.setVeld(vel);
    }

    /**
     * Test of getVeld method, of class Item.
     */
    @Test
    public void testGetVeld() {
        System.out.println("getVeld");
        Item instance = new Item();
        Veld expResult = null;
        Veld result = instance.getVeld();
        assertEquals(expResult, result);
    }
}
