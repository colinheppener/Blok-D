/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package projectdjava;

import java.awt.Color;
import javax.swing.*;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;

/**
 *
 * @author Colin
 */
public class Speelbord extends JComponent {

    BufferedImage spelerImage;
    BufferedImage muurImage;
    BufferedImage achtergrondImage;
    BufferedImage vriendImage;
    private static int[][] opzetGrid = {
        {3, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1,},
        {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 1, 0, 0, 0, 1, 1,},
        {1, 0, 0, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 1,},
        {1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 0, 0, 0, 0, 0, 1, 0, 1, 1,},
        {1, 0, 1, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1,},
        {1, 0, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1,},
        {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 1, 1, 1, 0, 1, 1,},
        {0, 1, 1, 1, 0, 1, 1, 0, 1, 1, 1, 0, 0, 0, 1, 1, 1, 0, 1, 1,},
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
        {1, 0, 1, 1, 1, 1, 1, 1, 0, 1, 1, 0, 0, 1, 0, 1, 0, 1, 0, 1,},
        {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 0, 0, 0, 1, 4, 1,}
    };

    public Speelbord() {
        createVelden();
        Muur muur = new Muur();
        muurImage = muur.returnImage();
        Item item = new Item();
        achtergrondImage = item.returnImage();
        Speler speler = new Speler();
        spelerImage = speler.returnImage();
        Vriend vriend = new Vriend();
        vriendImage = vriend.returnImage();


    }
    int huidigLevel = 1;
    Item[][] grid = new Item[20][20];

    private void createVelden() {
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                if (opzetGrid[i][j] == 1) {
                    grid[i][j] = new Muur();
                }
                if (opzetGrid[i][j] == 3) {
                    grid[i][j] = new Speler();
                }
                if (opzetGrid[i][j] == 4) {
                    grid[i][j] = new Vriend();
                }
            }
        }
    }

    public Item[][] getGrid() {
        return grid;
    }

    public void HerstartLevel() {
    }

    public void StartNieuwLevel() {
    }

    @Override
    public void paintComponent(Graphics g) {
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {

                if (grid[i][j] instanceof Speler) {
                    g.drawImage(achtergrondImage, j * 40, i * 40, 40, 40, null);
                    g.drawImage(spelerImage, j * 40, i * 40, 40, 40, null);
                }
                if (!(grid[i][j] instanceof Speler) && (!(grid[i][j] instanceof Muur))) {
                    g.drawImage(achtergrondImage, j * 40, i * 40, 40, 40, null);
                }
                if (grid[i][j] instanceof Vriend) {
                    g.drawImage(vriendImage, j * 40, i * 40, 40, 40, null);
                }
                if (grid[i][j] instanceof Muur) {
//                    g.drawRect(i*100, j*100, 100, 100);
//                    g.setColor(Color.GREEN);
                    g.drawImage(muurImage, j * 40, i * 40, 40, 40, null);
                }
            }
        }
    }
}