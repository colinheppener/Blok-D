/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package projectdjava2.pkg0;

import java.awt.Color;
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

    private String richting = "noord";
//    private boolean hasBazooka = false;
    private Bazooka bazooka;
    private BufferedImage plaatjeL2;
    private BufferedImage plaatjeR2;
    private BufferedImage plaatjeU2;
    private BufferedImage plaatjeD2;

    public Speler(Vriend vr, Speelbord sp) {
//        speelbord = sp;
//        vriend = vr;
        try {
            plaatjeL = ImageIO.read(new File("src/images/personL.jpg"));
            plaatjeR = ImageIO.read(new File("src/images/personR.jpg"));
            plaatjeU = ImageIO.read(new File("src/images/personU.jpg"));
            plaatjeD = ImageIO.read(new File("src/images/personD.jpg"));
            plaatjeL2 = ImageIO.read(new File("src/images/personL2.jpg"));
            plaatjeR2 = ImageIO.read(new File("src/images/personR2.jpg"));
            plaatjeU2 = ImageIO.read(new File("src/images/personU2.jpg"));
            plaatjeD2 = ImageIO.read(new File("src/images/personD2.jpg"));
            plaatje = ImageIO.read(new File("src/images/person.jpg"));
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }

    public void setVijand(Vijand vijnd) {
//        vijand = vijnd;
    }

    public void Loop(String looprichting) {
        richting = looprichting;
        //  System.out.println(veld.getBuur(looprichting));
        //  System.out.println(veld.getBuur(looprichting).getItem().toString());
        if ((veld.getBuur(looprichting) != null)) {
            if (!(veld.getBuur(looprichting).getItem() instanceof Muur)) {

                if (veld.getBuur(looprichting).getItem() != null) {
                    veld.getBuur(looprichting).getItem().voerActieUit();
                }

                //veld.setItem(null);
                //veld.getBuur(looprichting).setItem(this);

                verplaatsItem(this, veld, veld.getBuur(looprichting));
//            veld.getBuur(looprichting).getItem().setVeld(veld.getBuur(looprichting));
//            System.out.println(veld.getBuur(looprichting).getItem().toString());
//            System.out.println(veld.getBuur("west").getItem().toString());
            }
        }

    }

    public void schiet() {
        //Raket raket = new Raket(veld.getBuur(richting), richting);
        //this.hasBazooka = true;
        if (bazooka != null) {
            bazooka.schiet(richting);
            bazooka = null;
            veld.setItem(this);
        }
    }

//    public boolean hasBazooka()
//    {
//        return hasBazooka;
//    }
    public void pikUpBazooka(Bazooka baz) {
        bazooka = baz;
    }

//    public void setBazooka(boolean waarde)
//    {
//        hasBazooka = true;
//    }
    @Override
    public void Teken(Graphics g) {
        g.setColor(Color.GREEN);
//        g.fillRect((int) veld.getY() * 40, (int) veld.getX() * 40, 40, 40);
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

    @Override
    public String toString()//tostring methode override om te checken of speler wordt toegevogd aan de grid.
    {
        return "speler";
    }
}
