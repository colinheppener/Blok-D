/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package projectdjava2.pkg0;

import java.awt.Graphics;
import java.awt.Point;
import java.awt.image.BufferedImage;
import java.util.HashMap;
import org.junit.*;
import static org.junit.Assert.*;

/**
 *
 * @author Colin
 */
public class SpelerTest {

    Point locSpeler = new Point(1, 1);
    Point locBuurNoord = new Point(1, 0);
    Point locBuurZuid = new Point(1, 2);
    Point locBuurOost = new Point(2, 1);
    Point locBuurWest = new Point(0, 1);
    HashMap bur = new HashMap<String, Veld>();
    Muur muur = new Muur();
    Veld veldnoord = new Veld(locBuurNoord, muur);
    Veld veldZuid = new Veld(locBuurZuid, null);
    Veld veldOost = new Veld(locBuurOost, null);
    Veld veldWest = new Veld(locBuurWest, null);

    public SpelerTest() {
        bur.put("noord", veldnoord);
        bur.put("zuid", veldZuid);
        bur.put("oost", veldOost);
        bur.put("west", veldWest);
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
     * Test of Loop method, of class Speler.
     */
    @Test
    public void testLoopOost() {
        System.out.println("Loop");


        String looprichting = "oost";
        Speler speler = new Speler();
        Veld veld = new Veld(locSpeler, speler);
        veld.setItem(speler);
        veld.setBuren(bur);
        String expResult = "java.awt.Point[x=2,y=1]";

        speler.Loop(looprichting);
        String result = String.valueOf(speler.getVeld().getLocatie());
        assertEquals(expResult, result);
    }

    @Test
    public void testLoopWest() {
        System.out.println("Loop");


        String looprichting = "west";
        Speler speler = new Speler();
        Veld veld = new Veld(locSpeler, speler);
        veld.setItem(speler);
        veld.setBuren(bur);
        String expResult = "java.awt.Point[x=0,y=1]";

        speler.Loop(looprichting);
        String result = String.valueOf(speler.getVeld().getLocatie());
        assertEquals(expResult, result);
    }

    @Test
    public void testLoopNoord() {
        System.out.println("Loop");


        String looprichting = "noord";
        Speler speler = new Speler();
        Veld veld = new Veld(locSpeler, speler);
        veld.setItem(speler);
        veld.setBuren(bur);
        String expResult = "java.awt.Point[x=1,y=0]";

        speler.Loop(looprichting);
        String result = String.valueOf(speler.getVeld().getLocatie());
        assertEquals(expResult, result);
    }

    @Test
    public void testLoopZuid() {
        System.out.println("Loop");


        String looprichting = "zuid";
        Speler speler = new Speler();
        Veld veld = new Veld(locSpeler, speler);
        veld.setItem(speler);
        veld.setBuren(bur);

        String expResult = "java.awt.Point[x=1,y=2]";
        System.out.println(expResult);
        speler.Loop(looprichting);
        String result = String.valueOf(speler.getVeld().getLocatie());
        System.out.println(result);
        assertEquals(expResult, result);
    }
}
