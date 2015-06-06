/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package projectdjava2.pkg0;

import java.awt.Graphics;
import java.awt.image.BufferedImage;


/**
 *
 * @author Colin
 */
public class Item {

    BufferedImage plaatje;
    Veld veld;

    public void Teken(Graphics g) {
    }

    public void voerActieUit() {
    }

    public String toString() {
        return "item toegevoegd";
    }

    public void setVeld(Veld vel) {
        veld = vel;
    }
    public Veld getVeld()
    {
        return veld;
    }
}
