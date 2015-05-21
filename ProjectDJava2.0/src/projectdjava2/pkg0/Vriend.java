/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package projectdjava2.pkg0;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import java.awt.Point;

/**
 *
 * @author Colin
 */
public class Vriend extends Item {

    public Vriend(Point loc) {
        locatie = loc;
        getImageFile();

    }

    public void Teken(Graphics g) {
        g.setColor(Color.MAGENTA);

        g.fillRect((int) locatie.getY() * 40, (int) locatie.getX() * 40, 40, 40);
        g.drawImage(getImageFile(), (int) locatie.getY() * 40, (int) locatie.getX() * 40, 40, 40, null);

    }

    public String toString() {
        return "vriend";
    }

    public BufferedImage getImageFile() {
        try {
            plaatje = ImageIO.read(new File("src/images/vriend.png"));
        } catch (IOException ex) {
            System.out.println(ex);
        }
        return plaatje;
    }
}
