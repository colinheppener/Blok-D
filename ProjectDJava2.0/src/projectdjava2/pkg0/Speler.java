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

    public Speler(int[] loc, KeyListener e) {
        locatie = loc;
        CustomKeyListener keylisten = new CustomKeyListener();
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
}
