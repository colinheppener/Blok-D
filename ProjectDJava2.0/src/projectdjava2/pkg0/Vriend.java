/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package projectdjava2.pkg0;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author Colin
 */
public class Vriend extends Item{
    public Vriend(int[] loc)
    {
        locatie = loc;
    }
    public void Teken(Graphics g)
    {
        g.setColor(Color.MAGENTA);
        g.fillRect(locatie[1] * 40, locatie[0] * 40, 40, 40);
    }
}
