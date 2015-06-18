package projectdjava2.pkg0;

import java.awt.Graphics;
import java.awt.Point;
import java.util.HashMap;
import javax.swing.JComponent;

/**
 *
 * @author Colin & Jeroen
 */
public class Speelbord extends JComponent {

    private Frame frame;
    private Speler speler;
    private Veld[][] grid = new Veld[20][20];
    private Vriend vriend;
    private Helper helper;
    private int huidiglevel = 1;
    private int[][] opzetGrid;
    private int[][] lvl1 = {
        {0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1,},
        {1, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 1, 0, 0, 0, 1, 1,},
        {1, 0, 0, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 1,},
        {1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 0, 0, 0, 0, 0, 1, 0, 1, 1,},
        {1, 0, 1, 0, 5, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1,},
        {1, 0, 1, 1, 1, 1, 1, 7, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1,},
        {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 1, 1, 1, 0, 1, 1,},
        {0, 1, 1, 1, 0, 1, 1, 0, 1, 1, 1, 6, 0, 0, 1, 1, 1, 0, 1, 1,},
        {0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 0, 1, 1,},
        {1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 0, 1, 1, 0, 0, 0, 0, 1, 1,},
        {1, 0, 0, 0, 1, 0, 1, 0, 0, 0, 1, 0, 1, 1, 0, 1, 1, 1, 1, 1,},
        {1, 1, 1, 0, 1, 1, 1, 0, 1, 0, 1, 0, 1, 1, 0, 0, 0, 0, 0, 1,},
        {1, 0, 1, 0, 0, 0, 0, 0, 1, 1, 1, 0, 1, 1, 0, 1, 1, 1, 0, 1,},
        {1, 0, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 0, 1, 1, 1, 0, 1,},
        {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 0, 1, 0, 1, 0, 1,},
        {1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 1, 0, 1, 0, 1,},
        {1, 1, 1, 0, 1, 1, 1, 1, 0, 0, 1, 0, 1, 1, 0, 1, 0, 1, 0, 1,},
        {1, 0, 1, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 0, 1, 0, 1, 0, 1,},
        {1, 0, 1, 1, 1, 1, 1, 1, 0, 1, 1, 0, 0, 1, 9, 1, 0, 1, 0, 1,},
        {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 0, 0, 0, 1, 4, 1,}
    };
    private int[][] lvl2 = {
        {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
        {1, 3, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
        {1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 0, 1},
        {1, 0, 0, 9, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 1, 0, 1},
        {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 1},
        {1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 1, 0, 1, 0, 0, 0, 1},
        {1, 0, 1, 1, 1, 0, 1, 0, 1, 0, 1, 1, 1, 1, 0, 0, 0, 1, 0, 1},
        {1, 0, 1, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 1, 0, 1, 0, 1, 0, 1},
        {1, 0, 1, 0, 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 0, 1, 0, 1, 0, 1},
        {1, 0, 1, 0, 0, 0, 0, 0, 1, 0, 1, 0, 0, 1, 0, 1, 0, 0, 0, 1},
        {1, 0, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 1, 1, 0, 1},
        {1, 0, 0, 0, 0, 0, 1, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1},
        {1, 0, 1, 1, 1, 1, 1, 0, 1, 6, 1, 0, 1, 1, 1, 1, 1, 1, 0, 1},
        {1, 0, 1, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 1, 0, 1},
        {1, 0, 1, 0, 1, 7, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1},
        {1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 0, 1, 1, 1, 1, 1, 0, 1},
        {1, 0, 0, 0, 0, 0, 0, 5, 0, 1, 0, 1, 0, 1, 0, 1, 0, 0, 0, 1},
        {1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 1},
        {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4, 1},
        {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},};
    private int[][] lvl3 = {
        {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
        {1, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1},
        {1, 0, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 0, 1, 0, 0, 1},
        {1, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 1, 1, 0, 1},
        {1, 0, 1, 0, 1, 0, 1, 1, 1, 1, 0, 1, 1, 0, 1, 0, 1, 0, 0, 1},
        {1, 0, 0, 0, 1, 0, 1, 1, 6, 1, 0, 1, 1, 0, 1, 0, 1, 1, 0, 1},
        {1, 1, 1, 0, 1, 0, 1, 1, 0, 1, 0, 1, 0, 0, 1, 0, 1, 0, 0, 1},
        {1, 0, 0, 0, 1, 0, 0, 1, 0, 1, 0, 1, 0, 1, 1, 0, 1, 0, 1, 1},
        {1, 0, 1, 1, 1, 1, 0, 1, 0, 1, 0, 1, 0, 0, 0, 0, 1, 0, 1, 1},
        {1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 1, 1, 1, 1, 1, 1, 0, 1, 1},
        {1, 0, 1, 0, 1, 0, 1, 0, 1, 1, 0, 1, 7, 1, 0, 1, 0, 0, 0, 1},
        {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 0, 0, 0, 0, 0, 1, 0, 1},
        {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 0, 1},
        {1, 0, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 9, 0, 0, 0, 1, 0, 1},
        {1, 0, 1, 0, 0, 0, 0, 0, 1, 0, 1, 0, 1, 1, 1, 1, 0, 0, 0, 1},
        {1, 0, 1, 1, 1, 1, 1, 0, 1, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1},
        {1, 0, 1, 0, 0, 0, 0, 0, 1, 1, 0, 1, 0, 1, 0, 1, 0, 0, 0, 1},
        {1, 0, 1, 0, 1, 1, 1, 1, 1, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1},
        {1, 5, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 1, 0, 0, 0, 1, 4, 1},
        {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}
    };

    public Speelbord(Frame fr) {
        frame = fr;
        createVelden("lvl1");
    }

    public Veld getGrid(int i, int j) {
        return grid[i][j];
    }

    public Frame getFrame() {
        return frame;
    }

    private void createVelden(String level) {       //creert alle velden en items die op het speelbord komen te staan
        if (level.equals("lvl1")) {
            opzetGrid = lvl1;
        }
        if (level.equals("lvl2")) {
            opzetGrid = lvl2;
        }
        if (level.equals("lvl3")) {
            opzetGrid = lvl3;
        }
        vriend = new Vriend(this, frame);
        helper = new Helper(vriend, this);
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                if (opzetGrid[i][j] == 1) {
                    Point locatie = new Point(i, j);
                    Muur muur = new Muur();
                    grid[i][j] = new Veld(locatie, muur);
                    grid[i][j].getItem().setVeld(grid[i][j]);
                }
                if (opzetGrid[i][j] == 3) {
                    Point locatie = new Point(i, j);
                    speler = new Speler(vriend, this);
                    grid[i][j] = new Veld(locatie, speler);
                    grid[i][j].getItem().setVeld(grid[i][j]);
                    CustomKeyListener keylisten = new CustomKeyListener(speler, this);
                    this.addKeyListener(keylisten);
                }
                if (opzetGrid[i][j] == 4) {
                    Point locatie = new Point(i, j);
                    grid[i][j] = new Veld(locatie, vriend);
                    grid[i][j].getItem().setVeld(grid[i][j]);
                }
                if (opzetGrid[i][j] == 0) {
                    Point locatie = new Point(i, j);
                    grid[i][j] = new Veld(locatie, null);
                }
                if (opzetGrid[i][j] == 5) {
                    Point locatie = new Point(i, j);
                    Valsspeler valsspeler = new Valsspeler(frame, 10);
                    grid[i][j] = new Veld(locatie, valsspeler);
                    grid[i][j].getItem().setVeld(grid[i][j]);
                }
                if (opzetGrid[i][j] == 6) {
                    Point locatie = new Point(i, j);
                    Bazooka bazooka = new Bazooka(speler);
                    grid[i][j] = new Veld(locatie, bazooka);
                    grid[i][j].getItem().setVeld(grid[i][j]);
                }
                if (opzetGrid[i][j] == 7) {
                    Point locatie = new Point(i, j);
                    grid[i][j] = new Veld(locatie, helper);
                    grid[i][j].getItem().setVeld(grid[i][j]);
                }
                if (opzetGrid[i][j] == 9) {
                    Point locatie = new Point(i, j);
                    Vijand vijand = new Vijand(speler, this);
                    grid[i][j] = new Veld(locatie, vijand);
                    grid[i][j].getItem().setVeld(grid[i][j]);
                }
            }
        }
        getBuren();
    }

    public void getBuren() {
        HashMap buren = new HashMap<>();
        Veld buur;
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                if (j < 19) {
                    buur = grid[i][j + 1];
                    buren.put("oost", buur);
                } else {
                    buren.put("oost", null);
                }
                if (i != 0) {
                    buur = grid[i - 1][j];
                    buren.put("noord", buur);
                } else {
                    buren.put("noord", null);
                }
                if (i < 19) {
                    buur = grid[i + 1][j];
                    buren.put("zuid", buur);
                } else {
                    buren.put("zuid", null);
                }
                if (j != 0) {
                    buur = grid[i][j - 1];
                    buren.put("west", buur);
                } else {
                    buren.put("west", null);
                }
                grid[i][j].setBuren(buren);
            }
        }
    }

    public void herstartLevel() {   //herstart huidige level
        if (huidiglevel == 1) {
            createVelden("lvl1");
            return;
        }
        if (huidiglevel == 2) {
            createVelden("lvl2");
            return;
        }
        if (huidiglevel == 3) {
            createVelden("lvl3");
        }
    }

    public void startNieuwLevel() { //start het volgende level
        if (huidiglevel == 1) {
            frame.stopTimer();
            createVelden("lvl2");
            huidiglevel++;
            frame.meerTijd(21);
            frame.startTimer();
            return;
        }
        if (huidiglevel == 2) {
            frame.stopTimer();
            createVelden("lvl3");
            huidiglevel++;
            frame.meerTijd(21);
            frame.startTimer();
            return;
        }
        if (huidiglevel == 3) {
            frame.stopTimer();
            System.exit(0);
        }
    }

    @Override
    public void paintComponent(Graphics g) {        //tekent alle objecten in het spel
        super.paintComponent(g);
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                Item veldItem = grid[i][j].getItem();
                MazeSolver veldMazeSolver = grid[i][j].getMazeSolver(helper);
                if (veldItem != null) {
                    veldItem.teken(g);
                } else if (veldMazeSolver != null) {
                    veldMazeSolver.teken(g);
                }
            }
        }
    }
}
