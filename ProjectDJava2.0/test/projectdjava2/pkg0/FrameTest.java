/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package projectdjava2.pkg0;

import org.junit.*;
import static org.junit.Assert.*;

/**
 *
 * @author Colin
 */
public class FrameTest {
    
    public FrameTest() {
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
     * Test of createComponents method, of class Frame.
     */
    @Test
    public void testCreateComponents() {
        System.out.println("createComponents");
        Frame instance = new Frame();
        instance.createComponents();
    }

    /**
     * Test of meerTijd method, of class Frame.
     */
    @Test
    public void testMeerTijd() {
        System.out.println("meerTijd");
        int waarde = 0;
        Frame instance = new Frame();
        instance.meerTijd(waarde);
    }
}
