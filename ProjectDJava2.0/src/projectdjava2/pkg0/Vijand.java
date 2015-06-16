/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package projectdjava2.pkg0;

import java.awt.Color;
import java.awt.Graphics;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 *
 * @author Jeroen
 */
public class Vijand extends Item {

    private Speler speler;
    private Speelbord speelbord;
    private Frame frame;
    private String richting;

    public Vijand(Speler speler, Speelbord speelbord) {
        frame = speelbord.getFrame();
        frame = speelbord.getFrame();
        frame.setVijand(this);
        this.speelbord = speelbord;
        this.speler = speler;
        try {
            plaatje = ImageIO.read(new File("src/images/vijand.jpg"));
        } catch (IOException ex) {
            System.out.println(ex);
        }
        speler.setVijand(this);
    }

    public void loop() {
        if(richting != null)
        {
        verplaatsItem(this, veld, veld.getBuur(richting));
        richting = null;
        for (int j = 0; j < 20; j++) {
            for (int k = 0; k < 20; k++) {
                if (speelbord.getGrid(j, k).getMazeSolver(this) != null) {
                    speelbord.getGrid(j, k).dellMazeSolver(speelbord.getGrid(j, k).getMazeSolver(this));
                }
            }
        }
        speelbord.repaint();
        }
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
        this.richting = richting;
    }
    
    @Override
    public String toString()
    {
        return "vijand";
    }

    @Override
    public void voerActieUit() {
        frame.minderTijd(10);
    }

    @Override
    public void Teken(Graphics g) {
        g.setColor(Color.GREEN);
//        g.fillRect((int) veld.getY() * 40, (int) veld.getX() * 40, 40, 40);
        g.drawImage(getImageFile(), (int) veld.getY() * 40, (int) veld.getX() * 40, 40, 40, null);
    }
}
