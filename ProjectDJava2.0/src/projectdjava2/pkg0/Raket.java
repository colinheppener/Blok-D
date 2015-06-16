package projectdjava2.pkg0;

import java.awt.Graphics;

/**
 *
 * @author Colin & Jeroen
 */
public class Raket extends Item {

    private String richting;

    public Raket(Veld vld, String rchting) {
        richting = rchting;
        veld = vld;
        veld.setItem(this);
        schiet();
    }

    private void schiet() {
        while ((veld.getBuur(richting) != null)) {
            if (!(veld.getBuur(richting).getItem() instanceof Muur)) {
                verplaatsItem(this, veld, veld.getBuur(richting));
                veld = veld.getBuur(richting);
            } else {
                veld.getBuur(richting).setItem(null);
                veld.setItem(null);
                break;
            }
        }
    }

    @Override
    public void Teken(Graphics g) {
        g.fillRect((int) veld.getY() * 40, (int) veld.getX() * 40, 40, 40);
    }
}
