/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package projectdjava2.pkg0;

import java.awt.Graphics;
import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 *
 * @author Colin & Jeroen
 */
public class Speler extends Item {

    public Speler() {
        try {
            plaatje = ImageIO.read(new File("src/images/person.jpg"));
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }

    public void Loop(String looprichting) {
        //  System.out.println(veld.getBuur(looprichting));
        //  System.out.println(veld.getBuur(looprichting).getItem().toString());
        if ((veld.getBuur(looprichting) != null)) {
            if (!(veld.getBuur(looprichting).getItem() instanceof Muur)) {

                if (veld.getBuur(looprichting).getItem() != null) {
                    veld.getBuur(looprichting).getItem().voerActieUit();
                }

                //veld.setItem(null);
                //veld.getBuur(looprichting).setItem(this);

                veld.verplaatsItem(this, veld.getBuur(looprichting));
//            veld.getBuur(looprichting).getItem().setVeld(veld.getBuur(looprichting));
//            System.out.println(veld.getBuur(looprichting).getItem().toString());
//            System.out.println(veld.getBuur("west").getItem().toString());
            }
        }
    }

    @Override
    public void Teken(Graphics g) {
        g.setColor(Color.GREEN);
//        g.fillRect((int) veld.getY() * 40, (int) veld.getX() * 40, 40, 40);
        g.drawImage(getImageFile(), (int) veld.getY() * 40, (int) veld.getX() * 40, 40, 40, null);
    }

    @Override
    public String toString()//tostring methode override om te checken of speler wordt toegevogd aan de grid.
    {
        return "speler";
    }

    public BufferedImage getImageFile() {
        return plaatje;
    }
}
