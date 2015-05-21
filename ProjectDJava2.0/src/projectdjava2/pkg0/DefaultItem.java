/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package projectdjava2.pkg0;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 *
 * @author Jeroen
 */
public class DefaultItem extends Item {
    public DefaultItem(Point loc) {
        locatie = loc;
        System.out.println( "X coord:" +(int)locatie.getX() + "Y coord" + (int)locatie.getY());
    }
    public void Teken(Graphics g)//als je deze override methode weghaalt worden de vierkanten in het grijs getekend.
    {
        g.setColor(Color.RED);
        g.fillRect( (int)locatie.getY() * 40,(int)locatie.getX() * 40, 40, 40);
        g.drawImage(getImageFile(), (int)locatie.getY() * 40,(int)locatie.getX() * 40, 40, 40, null);    
    }
    public BufferedImage getImageFile() {
        try {
            plaatje = ImageIO.read(new File("src/images/background.bmp"));
        } catch (IOException ex) {
            System.out.println(ex);
        }
        return plaatje;
    }
}
