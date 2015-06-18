package projectdjava2.pkg0;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

/**
 *
 * @author Colin & Jeroen
 */
public abstract class Item {

    BufferedImage plaatje;
    BufferedImage plaatjeL;
    BufferedImage plaatjeR;
    BufferedImage plaatjeU;
    BufferedImage plaatjeD;
    Veld veld;

    public void teken(Graphics g) {
    }

    public void loopRichting(String richting) {
    }

    public void voerActieUit() {
    }

    public void verplaatsItem(Item itm, Veld huidigVeld, Veld buurVeld) {       //verplaatst items over het speelbord
        huidigVeld.setItem(null);
        buurVeld.setItem(itm);
    }

    public void setVeld(Veld vel) {
        veld = vel;
    }

    public Veld getVeld() {
        return veld;
    }

    public BufferedImage getImageFile() {
        return plaatje;
    }

    public BufferedImage getImageFileU() {
        return plaatjeU;
    }

    public BufferedImage getImageFileD() {
        return plaatjeD;
    }

    public BufferedImage getImageFileR() {
        return plaatjeR;
    }

    public BufferedImage getImageFileL() {
        return plaatjeL;
    }
}
