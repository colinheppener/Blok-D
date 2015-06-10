/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package projectdjava2.pkg0;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author Jeroen
 */
public class Raket extends Item {

    private String richting;
    private Veld veld;

    public Raket(Veld vld, String rchting) {
        richting = rchting;
        veld = vld;
        System.out.println("schiet");
        schiet();
    }

    public void schiet() {

        while ((veld.getBuur(richting) != null)) {
            if (!(veld.getBuur(richting).getItem() instanceof Muur)) {
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    System.out.println("error in beweging");
                }
                verplaatsItem(this, veld, veld.getBuur(richting));
                veld = veld.getBuur(richting);
            } else {
                veld.getBuur(richting).setItem(null);
                veld.setItem(null);
                break;
            }
        }
    }

    public void Teken(Graphics g) {
        g.setColor(Color.RED);
        g.fillRect((int) veld.getY() * 40, (int) veld.getX() * 40, 40, 40);
    }

    @Override
    public String toString() {
        return "raket";
    }
}
