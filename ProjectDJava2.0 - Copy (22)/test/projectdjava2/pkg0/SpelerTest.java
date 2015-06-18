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
    Frame frame;
    
    public SpelerTest() {
        frame = new Frame();
    }

    /**
     * Test of Loop method, of class Speler.
     */
    @Test
    public void testLoopOost() {
        System.out.println("Loop");
        HashMap bur = new HashMap<>();
        
        Speelbord sb = new Speelbord(frame);
        Vriend vriend = new Vriend(sb, frame);
        Veld veldnoord = new Veld(locBuurNoord, null);
        Veld veldZuid = new Veld(locBuurZuid, null);
        Veld veldOost = new Veld(locBuurOost, null);
        Veld veldWest = new Veld(locBuurWest, null);
        bur.put("noord", veldnoord);
        bur.put("zuid", veldZuid);
        bur.put("oost", veldOost);
        bur.put("west", veldWest);
        String looprichting = "oost";
        Speler speler = new Speler(vriend, sb);
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
        HashMap bur = new HashMap<>();
        Speelbord sb = new Speelbord(frame);
        Vriend vriend = new Vriend(sb, frame);
        Veld veldnoord = new Veld(locBuurNoord, null);
        Veld veldZuid = new Veld(locBuurZuid, null);
        Veld veldOost = new Veld(locBuurOost, null);
        Veld veldWest = new Veld(locBuurWest, null);
        bur.put("noord", veldnoord);
        bur.put("zuid", veldZuid);
        bur.put("oost", veldOost);
        bur.put("west", veldWest);
        String looprichting = "west";
        Speler speler = new Speler(vriend, sb);
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
        Speelbord sb = new Speelbord(frame);
        Vriend vriend = new Vriend(sb, frame);
        HashMap bur = new HashMap<>();
        Veld veldnoord = new Veld(locBuurNoord, null);
        Veld veldZuid = new Veld(locBuurZuid, null);
        Veld veldOost = new Veld(locBuurOost, null);
        Veld veldWest = new Veld(locBuurWest, null);
        bur.put("noord", veldnoord);
        bur.put("zuid", veldZuid);
        bur.put("oost", veldOost);
        bur.put("west", veldWest);
        String looprichting = "noord";
        Speler speler = new Speler(vriend, sb);
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
        HashMap bur = new HashMap<>();
        Speelbord sb = new Speelbord(frame);
        Vriend vriend = new Vriend(sb, frame);
        Veld veldnoord = new Veld(locBuurNoord, null);
        Veld veldZuid = new Veld(locBuurZuid, null);
        Veld veldOost = new Veld(locBuurOost, null);
        Veld veldWest = new Veld(locBuurWest, null);
        bur.put("noord", veldnoord);
        bur.put("zuid", veldZuid);
        bur.put("oost", veldOost);
        bur.put("west", veldWest);
        String looprichting = "zuid";
        Speler speler = new Speler(vriend, sb);
        Veld veld = new Veld(locSpeler, speler);
        veld.setItem(speler);
        veld.setBuren(bur);
        
        String expResult = "java.awt.Point[x=1,y=2]";
        speler.Loop(looprichting);
        String result = String.valueOf(speler.getVeld().getLocatie());
        assertEquals(expResult, result);
    }
    
    @Test
    public void testLoopMuur() {
        System.out.println("Loop");
        HashMap bur = new HashMap<>();
        Speelbord sb = new Speelbord(frame);
        Vriend vriend = new Vriend(sb, frame);
        Muur muur = new Muur();
        Veld veldnoord = new Veld(locBuurNoord, null);
        Veld veldZuid = new Veld(locBuurZuid, null);
        Veld veldOost = new Veld(locBuurOost, muur);
        Veld veldWest = new Veld(locBuurWest, null);
        bur.put("noord", veldnoord);
        bur.put("zuid", veldZuid);
        bur.put("oost", veldOost);
        bur.put("west", veldWest);
        String looprichting = "oost";
        Speler speler = new Speler(vriend, sb);
        Veld veld = new Veld(locSpeler, speler);
        veld.setItem(speler);
        veld.setBuren(bur);
        
        String expResult = "java.awt.Point[x=1,y=1]";
        speler.Loop(looprichting);
        String result = String.valueOf(speler.getVeld().getLocatie());
        assertEquals(expResult, result);
    }
    
    @Test
    public void testLoopVriend() {
        System.out.println("Loop");
        HashMap bur = new HashMap<>();
        Speelbord sb = new Speelbord(frame);
        Vriend vriend = new Vriend(sb, frame);
        Veld veldnoord = new Veld(locBuurNoord, null);
        Veld veldZuid = new Veld(locBuurZuid, null);
        Veld veldOost = new Veld(locBuurOost, vriend);
        Veld veldWest = new Veld(locBuurWest, null);
        bur.put("noord", veldnoord);
        bur.put("zuid", veldZuid);
        bur.put("oost", veldOost);
        bur.put("west", veldWest);
        String looprichting = "oost";
        Speler speler = new Speler(vriend, sb);
        Veld veld = new Veld(locSpeler, speler);
        veld.setItem(speler);
        veld.setBuren(bur);
        
        String expResult = "java.awt.Point[x=2,y=1]";
        speler.Loop(looprichting);
        String result = String.valueOf(speler.getVeld().getLocatie());
        assertEquals(expResult, result);
    }
    
    @Test
    public void testLoopValsspeler() {
        System.out.println("Loop");
        HashMap bur = new HashMap<>();
        Speelbord sb = new Speelbord(frame);
        Vriend vriend = new Vriend(sb, frame);
        
        Valsspeler vs = new Valsspeler(frame, 10);
        Veld veldnoord = new Veld(locBuurNoord, null);
        Veld veldZuid = new Veld(locBuurZuid, null);
        Veld veldOost = new Veld(locBuurOost, vs);
        Veld veldWest = new Veld(locBuurWest, null);
        bur.put("noord", veldnoord);
        bur.put("zuid", veldZuid);
        bur.put("oost", veldOost);
        bur.put("west", veldWest);
        String looprichting = "oost";
        Speler speler = new Speler(vriend, sb);
        Veld veld = new Veld(locSpeler, speler);
        veld.setItem(speler);
        veld.setBuren(bur);
        
        String expResult = "java.awt.Point[x=2,y=1]";
        speler.Loop(looprichting);
        String result = String.valueOf(speler.getVeld().getLocatie());
        assertEquals(expResult, result);
    }
    
    @Test
    public void testLoopBazooka() {
        System.out.println("Loop");
        HashMap bur = new HashMap<>();
        Speelbord sb = new Speelbord(frame);
        Vriend vriend = new Vriend(sb, frame);
        Speler speler = new Speler(vriend, sb);
        Bazooka bazooka = new Bazooka(speler);
        
        Veld veldnoord = new Veld(locBuurNoord, null);
        Veld veldZuid = new Veld(locBuurZuid, null);
        Veld veldOost = new Veld(locBuurOost, bazooka);
        Veld veldWest = new Veld(locBuurWest, null);
        bazooka.setVeld(veldOost);
        bur.put("noord", veldnoord);
        bur.put("zuid", veldZuid);
        bur.put("oost", veldOost);
        bur.put("west", veldWest);
        String looprichting = "oost";
        
        Veld veld = new Veld(locSpeler, speler);
        veld.setItem(speler);
        veld.setBuren(bur);
        
        String expResult = "java.awt.Point[x=2,y=1]";
        speler.Loop(looprichting);
        String result = String.valueOf(speler.getVeld().getLocatie());
        assertEquals(expResult, result);
    }
    
    @Test
    public void testLoopGeenVeld() {
        System.out.println("Loop");
        HashMap bur = new HashMap<>();
        Speelbord sb = new Speelbord(frame);
        Vriend vriend = new Vriend(sb, frame);
        Speler speler = new Speler(vriend, sb);
        
        Veld veldnoord = new Veld(locBuurNoord, null);
        Veld veldZuid = new Veld(locBuurZuid, null);
        Veld veldWest = new Veld(locBuurWest, null);
        bur.put("noord", veldnoord);
        bur.put("zuid", veldZuid);
        bur.put("oost", null);
        bur.put("west", veldWest);
        String looprichting = "oost";
        
        Veld veld = new Veld(locSpeler, speler);
        veld.setItem(speler);
        veld.setBuren(bur);
        
        String expResult = "java.awt.Point[x=1,y=1]";
        speler.Loop(looprichting);
        String result = String.valueOf(speler.getVeld().getLocatie());
        assertEquals(expResult, result);
    }

    @Test
    public void testLoopVijand() {
        System.out.println("Loop");
        HashMap bur = new HashMap<>();
        Speelbord sb = new Speelbord(frame);
        Vriend vriend = new Vriend(sb, frame);
        Speler speler = new Speler(vriend, sb);
        Vijand vijand = new Vijand(speler, sb);
        Veld veldnoord = new Veld(locBuurNoord, null);
        Veld veldZuid = new Veld(locBuurZuid, null);
        Veld veldOost = new Veld(locBuurOost, vijand);
        Veld veldWest = new Veld(locBuurWest, null);
        bur.put("noord", veldnoord);
        bur.put("zuid", veldZuid);
        bur.put("oost", veldOost);
        bur.put("west", veldWest);
        String looprichting = "oost";
        
        Veld veld = new Veld(locSpeler, speler);
        veld.setItem(speler);
        veld.setBuren(bur);
        
        String expResult = "java.awt.Point[x=2,y=1]";
        speler.Loop(looprichting);
        String result = String.valueOf(speler.getVeld().getLocatie());
        assertEquals(expResult, result);
    }
}
