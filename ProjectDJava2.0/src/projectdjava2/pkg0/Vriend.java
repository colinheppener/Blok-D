package projectdjava2.pkg0;

import java.awt.Graphics;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 *
 * @author Colin & Jeroen
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
        g.drawImage(getImageFile(), (int) veld.getY() * 40, (int) veld.getX() * 40, 40, 40, null);

    }

    @Override
    public void voerActieUit() {
        speelb.StartNieuwLevel();
    }
}
