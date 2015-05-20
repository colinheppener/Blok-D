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
        g.fillRect(locatie[1] * 40, locatie[0] * 40, 40, 40);
        g.drawImage(getImageFile(), locatie[1]*40, locatie[0] *40, 40, 40, null);

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
