/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package projectdjava2.pkg0;

import java.awt.Point;
import java.util.HashMap;
import org.junit.*;
import static org.junit.Assert.*;

/**
 *
 * @author Colin
 */
public class RaketTest {

    Point locRaketStart = new Point(1, 1);
    Point locBuurOost = new Point(2, 1);
    Point locBuurOost2 = new Point(3, 1);
    Point locBuurOost3 = new Point(4, 1);
    Raket raket;

    public RaketTest() {
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

    @Test
    public void testSchietMethode() {
        Muur muur = new Muur();
        HashMap bur = new HashMap<>();
        HashMap bur2 = new HashMap<>();
        HashMap bur3 = new HashMap<>();
        Veld veldOost = new Veld(locBuurOost, null);
        Veld veldOost2 = new Veld(locBuurOost2, muur);
        bur.put("oost", veldOost);
        bur2.put("oost", veldOost2);
        String expResult = "java.awt.Point[x=2,y=1]";
        Veld veld = new Veld(locRaketStart, null);
        raket = new Raket(veld, "oost");
        veld.setBuren(bur);
        veldOost.setBuren(bur2);
        veldOost2.setBuren(bur3);
        veld.setItem(raket);
        raket.setVeld(veld);
        raket.schiet();
        String result = "";
        assertEquals(expResult, result);
    }
}
