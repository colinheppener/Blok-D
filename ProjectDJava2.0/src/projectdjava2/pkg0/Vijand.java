package projectdjava2.pkg0;

import java.awt.Graphics;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 *
 * @author Colin & Jeroen
 */
public class Vijand extends Item {

    private Speler speler;
    private Speelbord speelbord;
    private Frame frame;
    private String richting;
    private String richtingT = "noord";

    public Vijand(Speler speler, Speelbord speelbord) {
        frame = speelbord.getFrame();
        frame = speelbord.getFrame();
        frame.setVijand(this);
        this.speelbord = speelbord;
        this.speler = speler;
        try {
            plaatjeU = ImageIO.read(new File("src/images/vijand.jpg"));
            plaatjeD = ImageIO.read(new File("src/images/vijand.jpg"));
            plaatjeL = ImageIO.read(new File("src/images/vijand.jpg"));
            plaatjeR = ImageIO.read(new File("src/images/vijand.jpg"));
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }

    public void loop() {
        if (richting != null) {
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
        switch (richting) {
            case "noord":
                richting = "zuid";
                break;
            case "oost":
                richting = "west";
                break;
            case "zuid":
                richting = "noord";
                break;
            case "west":
                richting = "oost";
                break;
        }
        this.richting = richting;
        richtingT = richting;
    }

    @Override
    public String toString() {
        return "vijand";
    }

    @Override
    public void voerActieUit() {
        frame.minderTijd(10);
    }

    @Override
    public void Teken(Graphics g) {
        switch (richtingT) {
            case "noord":
                g.drawImage(getImageFileU(), (int) veld.getY() * 40, (int) veld.getX() * 40, 40, 40, null);
                break;
            case "oost":
                g.drawImage(getImageFileR(), (int) veld.getY() * 40, (int) veld.getX() * 40, 40, 40, null);
                break;
            case "zuid":
                g.drawImage(getImageFileD(), (int) veld.getY() * 40, (int) veld.getX() * 40, 40, 40, null);
                break;
            case "west":
                g.drawImage(getImageFileL(), (int) veld.getY() * 40, (int) veld.getX() * 40, 40, 40, null);
                break;
        }
    }
}
