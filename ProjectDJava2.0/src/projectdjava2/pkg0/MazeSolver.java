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
public class MazeSolver {

    private int waarde;
    private boolean draw = false;
    private Veld veld;
    private Speelbord speelbord;

    public MazeSolver(int wrde, Veld vld, Speelbord splbord) {
        veld = vld;
        waarde = wrde;
        buurVriend();
        speelbord = splbord;
    }

    private void buurVriend() {
    }

    public void createNewMazeSolver() {
        System.out.println("veld" + veld);
        System.out.println("waarde:   " + waarde);
        String richting = "";
        for (int i = 0; i < 4; i++) {
            if (i == 0) {
                richting = "noord";
            }
            if (i == 1) {
                richting = "oost";
            }
            if (i == 2) {
                richting = "zuid";
            }
            if (i == 3) {
                richting = "west";
            }
            if (veld.getBuur(richting) != null) {
                if (!(veld.getBuur(richting).getItem() instanceof Muur)) {
                    if (veld.getBuur(richting).getMazeSolver() == null || veld.getBuur(richting).getMazeSolver().getWaarde() >= waarde) {
                        if (!(veld.getBuur(richting).getItem() instanceof Vriend)) {
                            MazeSolver mazeSolver1 = new MazeSolver(waarde + 1, veld.getBuur(richting), speelbord);
                            veld.getBuur(richting).setMazeSolver(mazeSolver1);
                            System.out.println("richting");
                            mazeSolver1.createNewMazeSolver();
                        } else {
                            for (int j = 0; j < 20; j++) {
                                for (int k = 0; k < 20; k++) {
                                    if(speelbord.getGrid(j, k).getMazeSolver() != null)
                                    {
                                        if(speelbord.getGrid(j, k).getMazeSolver().getDraw() == true)
                                        {
                                            speelbord.getGrid(j, k).getMazeSolver().setDraw(false);
                                        }
                                    }
                                }
                            }
                            this.solveMaze(waarde + 1);
                        }
                    }
                }
            }
        }
    }

    public int getWaarde() {
        return waarde;
    }

    public void setVeld(Veld vel) {
        veld = vel;
    }
    
    public void setDraw(boolean dr)
    {
        draw = dr;
    }
    
    public boolean getDraw()
    {
        return draw;
    }
    
    public void solveMaze(int wrd) {
        if (wrd == waarde + 1) {
            draw = true;
            String richting = "";
            for (int i = 0; i < 4; i++) {
                if (i == 0) {
                    richting = "noord";
                }
                if (i == 1) {
                    richting = "oost";
                }
                if (i == 2) {
                    richting = "zuid";
                }
                if (i == 3) {
                    richting = "west";
                }
                if (veld.getBuur(richting) != null) {
                    if (veld.getBuur(richting).getMazeSolver() instanceof MazeSolver) {
                        MazeSolver mazeSolver0 = (MazeSolver) veld.getBuur(richting).getMazeSolver();
                        mazeSolver0.solveMaze(waarde);
                    }
                }
            }
        }
    }

    public void Teken(Graphics g) {
        if (draw == false) {
            g.setColor(Color.GREEN);
        } else {
            g.setColor(Color.RED);
        }
        g.drawRect((int) veld.getY() * 40, (int) veld.getX() * 40, 40, 40);
        g.drawString(waarde + "", (int) veld.getY() * 40, (int) veld.getX() * 40);
    }
}
