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
import java.awt.Point;

/**
 *
 * @author Colin
 */
public class Item {

    BufferedImage plaatje;
    String plaatjePad;
    Point locatie;

    public void Teken(Graphics g) {

    }

    public void setPlaatjePad(String pad) {
        plaatjePad = pad;
    }

    public BufferedImage getImageFile() {
        try {
            plaatje = ImageIO.read(new File("src/images/background.bmp"));
        } catch (IOException ex) {
            System.out.println(ex);
        }
        return plaatje;
    }

    public String toString() {
        return "item toegevoegd";
    }
}
