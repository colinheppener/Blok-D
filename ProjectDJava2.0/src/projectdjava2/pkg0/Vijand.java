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
public class Vijand extends Item {

    private Speler speler;
    private Speelbord speelbord;
    private Frame frame;

    public Vijand(Speler speler, Speelbord speelbord) {
        frame = speelbord.getFrame();
        frame = speelbord.getFrame();
        frame.setVijand(this);
        this.speelbord = speelbord;
        this.speler = speler;

        speler.setVijand(this);
    }

    public void loop() {
        MazeSolver mazeSolver = new MazeSolver(this, speler, speelbord);
        veld.setMazeSolver(mazeSolver);
        mazeSolver.createNewMazeSolver();
    }

    @Override
    public void loopRichting(String richting) {
        if (richting == "noord") {
            richting = "zuid";
        } else if (richting == "oost") {
            richting = "west";
        } else if (richting == "zuid") {
            richting = "noord";
        } else if (richting == "west") {
            richting = "oost";
        }
        verplaatsItem(this, veld, veld.getBuur(richting));
        for (int j = 0; j < 20; j++) {
            for (int k = 0; k < 20; k++) {
                if (speelbord.getGrid(j, k).getMazeSolver(this) != null) {
                    speelbord.getGrid(j, k).dellMazeSolver(speelbord.getGrid(j, k).getMazeSolver(this));
                }
            }
        }
        speelbord.repaint();
    }

    @Override
    public void voerActieUit() {
        frame.minderTijd(10);
    }

    @Override
    public void Teken(Graphics g) {
        g.setColor(Color.GREEN);
        g.fillRect((int) veld.getY() * 40, (int) veld.getX() * 40, 40, 40);
//        g.drawImage(getImageFile(), (int) veld.getY() * 40, (int) veld.getX() * 40, 40, 40, null);
    }
}
