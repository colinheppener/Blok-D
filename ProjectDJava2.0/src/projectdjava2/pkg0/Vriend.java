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

/**
 *
 * @author Colin
 */
public class Vriend extends Item{
    public Vriend(int[] loc)
    {
        locatie = loc;
        setPlaatjePad("src/images/vriend.png");
        getImageFile();
                
    }
    public void Teken(Graphics g)
    {
        g.setColor(Color.MAGENTA);
        
        g.fillRect(locatie[1] * 40, locatie[0] * 40, 40, 40);
        g.drawImage(getImageFile(), locatie[1]*40, locatie[0] *40, 40, 40, null);
    }
    
    public String toString()
    {
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
