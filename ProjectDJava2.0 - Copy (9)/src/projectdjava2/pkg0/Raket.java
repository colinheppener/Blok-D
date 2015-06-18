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
                System.out.println((int) veld.getY() +"     "+ (int) veld.getX());
            } else {
                System.out.println((int) veld.getY() +"      "+ (int) veld.getX() + "OUT");
                veld.getBuur(richting).setItem(null);
                veld.setItem(null);
                break;
            }
        }
    }
}
