/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package projectdjava2.pkg0;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JComponent;

/**
 *
 * @author Colin
 */
public class Item extends JComponent {

    BufferedImage plaatje;
    int[] locatie = new int[2];

    public void Teken(Graphics g) {
        g.drawRect(locatie[1]*20, locatie[0] *20, 40, 40);
    }

    public BufferedImage getImageFile() {
        try {
            plaatje = ImageIO.read(new File("src/images/wall.jpg"));
        } catch (IOException ex) {
            System.out.println(ex);
        }
        return plaatje;
    }
}
