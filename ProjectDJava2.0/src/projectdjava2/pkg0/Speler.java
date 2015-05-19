/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package projectdjava2.pkg0;

import java.awt.Graphics;
import java.awt.event.KeyListener;
import java.awt.Color;

/**
 *
 * @author Colin
 */
public class Speler extends Item {

    private int[] locatie;

    public Speler(int[] loc) {
        locatie = loc;
        for (int i = 0; i < 2; i++) {
            System.out.println(locatie[i]);

        }

    }

    private void Loop() {
    }

    public void Teken(Graphics g) {
        g.setColor(Color.GREEN);
        g.drawRect(locatie[1] * 20, locatie[0] * 20, 40, 40);

    }
    
    public String toString()//tostring methode override om te checken of speler wordt toegevogd aan de grid.
    {
        return "speler toegevoegd";
    }
}
