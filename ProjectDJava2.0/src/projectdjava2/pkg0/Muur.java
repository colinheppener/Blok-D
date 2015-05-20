/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package projectdjava2.pkg0;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.awt.Color;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 *
 * @author Colin
 */
public class Muur extends Item {

    public Muur(int[] loc) {
        locatie = loc;
    }

    @Override                    //deze tekenmethode is geoverride omdat ik muren alvast een ander kleurtje wilde geven, ook als test van de polymorphisme 
    public void Teken(Graphics g)//als je deze override methode weghaalt worden de vierkanten in het grijs getekend.
    {
        g.setColor(Color.RED);
        g.fillRect(locatie[1] * 40, locatie[0] * 40, 40, 40);
        g.drawImage(getImageFile(), locatie[1]*40, locatie[0] *40, 40, 40, null);    
    }
    
    public String toString()//tostring methode override om te checken of speler wordt toegevogd aan de grid.
    {
        return "muur";
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
