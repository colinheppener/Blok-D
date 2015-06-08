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
public class MazeSolver extends Item {

    private int waarde;
    private boolean draw = false;

    public MazeSolver(int wrde, Veld vld) {
        veld = vld;
        waarde = wrde;
        buurVriend();
    }

    private void buurVriend() {
    }

    public void createNewMazeSolver() {
        System.out.println("veld" + getVeld());
        System.out.println("waarde:   " + waarde);
        if (veld.getBuur("noord") != null) {
            if (!(veld.getBuur("noord").getItem() instanceof Muur) && (!(veld.getBuur("noord").getItem() instanceof MazeSolver))) {
                if (!(veld.getBuur("noord").getItem() instanceof Vriend)) {
                    MazeSolver mazeSolver1 = new MazeSolver(waarde + 1, veld.getBuur("noord"));
                    veld.getBuur("noord").setItem(mazeSolver1);
                    System.out.println("nord");
                    mazeSolver1.createNewMazeSolver();
                } else {
                    this.solveMaze(waarde + 1);
                }
            }
        }
        if (veld.getBuur("oost") != null) {
            if (!(veld.getBuur("oost").getItem() instanceof Muur) && (!(veld.getBuur("oost").getItem() instanceof MazeSolver))) {
                if (!(veld.getBuur("oost").getItem() instanceof Vriend)) {
                    MazeSolver mazeSolver2 = new MazeSolver(waarde + 1, veld.getBuur("oost"));
                    veld.getBuur("oost").setItem(mazeSolver2);
                    System.out.println("oost");
                    mazeSolver2.createNewMazeSolver();
                } else {
                    this.solveMaze(waarde + 1);
                }
            }
        }
        if (veld.getBuur("zuid") != null) {
            if (!(veld.getBuur("zuid").getItem() instanceof Muur) && (!(veld.getBuur("zuid").getItem() instanceof MazeSolver))) {
                if (!(veld.getBuur("zuid").getItem() instanceof Vriend)) {
                    MazeSolver mazeSolver3 = new MazeSolver(waarde + 1, veld.getBuur("zuid"));
                    veld.getBuur("zuid").setItem(mazeSolver3);
                    System.out.println("zyud");
                    mazeSolver3.createNewMazeSolver();
                } else {
                    this.solveMaze(waarde + 1);
                }
            }
        }
        if (veld.getBuur(
                "west") != null) {
            if (!(veld.getBuur("west").getItem() instanceof Muur) && (!(veld.getBuur("west").getItem() instanceof MazeSolver))) {
                if (!(veld.getBuur("west").getItem() instanceof Vriend)) {
                    MazeSolver mazeSolver4 = new MazeSolver(waarde + 1, veld.getBuur("west"));
                    veld.getBuur("west").setItem(mazeSolver4);
                    System.out.println("west");
                    mazeSolver4.createNewMazeSolver();
                } else {
                    this.solveMaze(waarde + 1);
                }
            }
        }
    }

    public void solveMaze(int wrd) {
        if (wrd == waarde + 1) {
            draw = true;
            if (veld.getBuur("noord") != null) {
                if (veld.getBuur("noord").getItem() instanceof MazeSolver) {
                    MazeSolver mazeSolver0 = (MazeSolver) veld.getBuur("noord").getItem();
                    mazeSolver0.solveMaze(waarde);
                }
            }
            if (veld.getBuur("oost") != null) {
                if (veld.getBuur("oost").getItem() instanceof MazeSolver) {
                    MazeSolver mazeSolver1 = (MazeSolver) veld.getBuur("oost").getItem();
                    mazeSolver1.solveMaze(waarde);
                }
            }
            if (veld.getBuur("zuid") != null) {
                if (veld.getBuur("zuid").getItem() instanceof MazeSolver) {
                    MazeSolver mazeSolver2 = (MazeSolver) veld.getBuur("zuid").getItem();
                    mazeSolver2.solveMaze(waarde);
                }
            }
            if (veld.getBuur("west") != null) {
                if (veld.getBuur("west").getItem() instanceof MazeSolver) {
                    MazeSolver mazeSolver3 = (MazeSolver) veld.getBuur("west").getItem();
                    mazeSolver3.solveMaze(waarde);
                }
            }
        }
    }

    @Override
    public void Teken(Graphics g) {
        if (draw == false) {
            g.setColor(Color.GREEN);
        } else {
            g.setColor(Color.RED);
        }
        g.fillRect((int) veld.getY() * 40, (int) veld.getX() * 40, 40, 40);
        g.drawString(waarde + "", (int) veld.getY() * 40, (int) veld.getX() * 40);
    }
}
