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
    private Speelbord speelb;
    private Frame frame;

    public Vriend(Speelbord sb, Frame fr) {
        speelb = sb;
        frame = fr;
        try {
            plaatje = ImageIO.read(new File("src/images/vriend.png"));
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }

    @Override
    public void Teken(Graphics g) {
        g.setColor(Color.MAGENTA);

//        g.fillRect((int) veld.getY() * 40, (int) veld.getX() * 40, 40, 40);
        g.drawImage(getImageFile(), (int) veld.getY() * 40, (int) veld.getX() * 40, 40, 40, null);

    }

    @Override
    public String toString() {
        return "vriend";
    }

    public BufferedImage getImageFile() {

        return plaatje;
    }
    
    @Override
    public void voerActieUit()
    {
        System.out.println("vriend ogepakt");
        System.out.println("FINISHED!");    
        speelb.StartNieuwLevel();
        frame.meerTijd(21);
    }
}
