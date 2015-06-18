package projectdjava2.pkg0;

import java.awt.Graphics;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 *
 * @author Colin & Jeroen
 */
public class Valsspeler extends Item {

    private Frame frame;
    private int valsspelerWaarde;

    public Valsspeler(Frame fr, int wrd) {
        valsspelerWaarde = wrd;
        frame = fr;
        try {
            plaatje = ImageIO.read(new File("src/images/valsspeler.jpg"));
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }

    @Override
    public void Teken(Graphics g) {
        g.drawImage(getImageFile(), (int) veld.getY() * 40, (int) veld.getX() * 40, 40, 40, null);
    }

    @Override
    public void voerActieUit() {
        frame.meerTijd(valsspelerWaarde);
    }
}
