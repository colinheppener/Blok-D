package projectdjava2.pkg0;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 *
 * @author Colin & Jeroen
 */
public class Speler extends Item {

    private String richting = "zuid";
    private Bazooka bazooka;
    private BufferedImage plaatjeL2;
    private BufferedImage plaatjeR2;
    private BufferedImage plaatjeU2;
    private BufferedImage plaatjeD2;

    public Speler(Vriend vr, Speelbord sp) {
        try {
            plaatjeL = ImageIO.read(new File("src/images/guyLeft.png"));
            plaatjeR = ImageIO.read(new File("src/images/guyRight.png"));
            plaatjeU = ImageIO.read(new File("src/images/guyUp.png"));
            plaatjeD = ImageIO.read(new File("src/images/guyDown.png"));
            plaatjeL2 = ImageIO.read(new File("src/images/guyLeftBazooka.png"));
            plaatjeR2 = ImageIO.read(new File("src/images/guyRightBazooka.png"));
            plaatjeU2 = ImageIO.read(new File("src/images/guyUpBazooka.png"));
            plaatjeD2 = ImageIO.read(new File("src/images/guyDownBazooka.png"));
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }

    public void loop(String looprichting) {     //laat speler lopen in meegegeven richting als dit mogelijk is
        richting = looprichting;
        if ((veld.getBuur(looprichting) != null)) {
            if (!(veld.getBuur(looprichting).getItem() instanceof Muur)) {
                if (veld.getBuur(looprichting).getItem() != null) {
                    veld.getBuur(looprichting).getItem().voerActieUit();
                }
                verplaatsItem(this, veld, veld.getBuur(looprichting));
            }
        }
    }

    public void schiet() {      //laat de bazooka een raket vuren
        if (bazooka != null) {
            bazooka.schiet(richting);
            bazooka = null;
            veld.setItem(this);
        }
    }

    public void pikUpBazooka(Bazooka baz) {     //maakt het mogelijk een bazooka op te pakken
        bazooka = baz;
    }

    @Override
    public void teken(Graphics g) {
        if ("noord".equals(richting) && bazooka == null) {
            g.drawImage(getImageFileU(), (int) veld.getY() * 40, (int) veld.getX() * 40, 40, 40, null);
        } else if ("oost".equals(richting) && bazooka == null) {
            g.drawImage(getImageFileR(), (int) veld.getY() * 40, (int) veld.getX() * 40, 40, 40, null);
        } else if ("zuid".equals(richting) && bazooka == null) {
            g.drawImage(getImageFileD(), (int) veld.getY() * 40, (int) veld.getX() * 40, 40, 40, null);
        } else if ("west".equals(richting) && bazooka == null) {
            g.drawImage(getImageFileL(), (int) veld.getY() * 40, (int) veld.getX() * 40, 40, 40, null);
        } else if ("noord".equals(richting)) {
            g.drawImage(plaatjeU2, (int) veld.getY() * 40, (int) veld.getX() * 40, 40, 40, null);
        } else if ("oost".equals(richting)) {
            g.drawImage(plaatjeR2, (int) veld.getY() * 40, (int) veld.getX() * 40, 40, 40, null);
        } else if ("zuid".equals(richting)) {
            g.drawImage(plaatjeD2, (int) veld.getY() * 40, (int) veld.getX() * 40, 40, 40, null);
        } else if ("west".equals(richting)) {
            g.drawImage(plaatjeL2, (int) veld.getY() * 40, (int) veld.getX() * 40, 40, 40, null);
        }
    }
}
