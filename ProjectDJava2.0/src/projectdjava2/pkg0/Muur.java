/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package projectdjava2.pkg0;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.awt.Color;

/**
 *
 * @author Colin
 */

public class Muur extends Item{

public Muur(int[] loc){
//    getImageFile();
        locatie = loc;
        toString();
}
    @Override
public void Teken(Graphics g)
{
    g.setColor(Color.RED);
    g.drawRect(locatie[1]*20, locatie[0] *20, 40, 40);

}
    
}
