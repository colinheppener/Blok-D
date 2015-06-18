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
public class FrameTest {

    Point locVijand = new Point(1, 1);
    Point locBuurNoord = new Point(1, 0);
    Point locBuurZuid = new Point(1, 2);
    Point locBuurOost = new Point(2, 1);
    Point locBuurWest = new Point(0, 1);

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

    @Test
    public void testVijandLoop() {
        System.out.println("setInterval");
        HashMap bur = new HashMap<>();
        HashMap bur2 = new HashMap<>();
        HashMap bur3 = new HashMap<>();
        HashMap bur4 = new HashMap<>();
        Frame frame = new Frame();
        Speelbord speelb = new Speelbord(frame);
        Vriend vriend = new Vriend(speelb, frame);
        Speler speler = new Speler(vriend, speelb);
        Vijand vijand = new Vijand(speler, speelb);
        Veld veld = new Veld(locVijand, vijand);
        Veld veldOost = new Veld(locBuurOost, null);
        Veld veldOostOost = new Veld(locBuurWest, null);
        Veld veldOostOostOost = new Veld(locBuurNoord, speler);
        vijand.setVeld(veld);
        bur.put("oost", veldOost);
        bur.put("zuid", null);
        bur.put("west", veld);
        bur.put("noord", null);
        bur2.put("oost", veldOostOost);
        bur2.put("zuid", null);
        bur2.put("west", veldOost);
        bur2.put("noord", null);
        bur3.put("oost", veldOostOostOost);
        bur3.put("zuid", null);
        bur3.put("west", veldOostOost);
        bur3.put("noord", null);
        bur4.put("oost", null);
        bur4.put("zuid", null);
        bur4.put("west", veldOostOostOost);
        bur4.put("noord", null);
        veld.setBuren(bur);
        veldOost.setBuren(bur2);
        veldOostOost.setBuren(bur3);
        veldOostOostOost.setBuren(bur4);
        String expected = String.valueOf(vijand.getVeld().getLocatie());
        frame.startTimer();
        frame.setTime(1);


        String result = String.valueOf(vijand.getVeld().getLocatie());
        assertNotSame(expected, result);
    }
    
}
