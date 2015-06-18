package projectdjava2.pkg0;

import java.awt.Graphics;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 *
 * @author Colin & Jeroen
 */
public class Bazooka extends Item {

    private Speler speler;

    public Bazooka(Speler speler) {
        this.speler = speler;
        try {
            plaatje = ImageIO.read(new File("src/images/bazooka.png"));
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }

    @Override
    public void Teken(Graphics g) {
        g.drawImage(getImageFile(), (int) veld.getY() * 40, (int) veld.getX() * 40, 40, 40, null);
    }

    public void schiet(String richting) {
        Raket raket = new Raket(speler.getVeld(), richting);
        raket.schiet();
    }

    @Override
    public void voerActieUit() {
        speler.pikUpBazooka(this);
        veld.setItem(null);
    }
}
