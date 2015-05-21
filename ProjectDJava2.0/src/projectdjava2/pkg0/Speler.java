/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package projectdjava2.pkg0;

import java.awt.Graphics;
import java.awt.event.KeyListener;
import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import java.awt.Point;

/**
 *
 * @author Colin
 */
public class Speler extends Item {

    private Point locatie;

    ;

    public Speler(Point loc) {
        locatie = loc;

        System.out.println("X coord:" + locatie.getX() + "Y coord" + locatie.getY());



    }

    public static void Loop(int looprichting) {
        if(looprichting == 0)
        {
            System.out.println("noord");
        }
        else if(looprichting == 1)
        {
            System.out.println("oost");
        }
        else if(looprichting == 2)
        {
            System.out.println("zuid");
        }
        else if(looprichting == 3)
        {
            System.out.println("west");
        }
    }

    public void Teken(Graphics g) {
        g.setColor(Color.GREEN);
        g.fillRect( (int)locatie.getY() * 40,(int)locatie.getX() * 40, 40, 40);
        g.drawImage(getImageFile(), (int) locatie.getY() * 40, (int) locatie.getX() * 40, 40, 40, null);

    }

    public String toString()//tostring methode override om te checken of speler wordt toegevogd aan de grid.
    {
        return "speler";
    }

    public BufferedImage getImageFile() {
        try {
            plaatje = ImageIO.read(new File("src/images/person.jpg"));
        } catch (IOException ex) {
            System.out.println(ex);
        }
        return plaatje;
    }
}
