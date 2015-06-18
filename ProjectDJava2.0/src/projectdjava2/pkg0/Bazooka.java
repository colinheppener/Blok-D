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

    public void schiet(String richting) {   //wordt door speler aangeroepen om een raket af te vuren
        Raket raket = new Raket(speler.getVeld(), richting);
    }

    @Override
    public void voerActieUit() {            //geeft speler de bazooka mee zodat deze de mogelijkheid krijgt ermee te schieten
        speler.pikUpBazooka(this);
        veld.setItem(null);
    }

    @Override
    public void teken(Graphics g) {
        g.drawImage(getImageFile(), (int) veld.getY() * 40, (int) veld.getX() * 40, 40, 40, null);
    }
}
