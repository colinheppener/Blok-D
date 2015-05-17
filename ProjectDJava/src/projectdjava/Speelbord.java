/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package projectdjava;

import java.awt.Color;
import javax.swing.*;
import java.awt.Graphics;
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


        int j = 0;
        grid[0][0] = new Speler();
        grid[1][3] = new Muur();
        grid[1][6] = new Muur();
    }

    public Item[][] getGrid() {
        return grid;
    }

    public void HerstartLevel() {
    }

    public void StartNieuwLevel() {
    }

    public void paintComponent(Graphics g) {
        g.drawImage(muurImage, 1, 1, null);
        Speler speler = new Speler();
        Muur muur = new Muur();
        Item item = new Item();
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {

                if (grid[i][j] instanceof Speler) {
                    System.out.println(speler.toString());
//                    g.setColor(Color.BLACK);
                    g.drawImage(achtergrondImage, j * 40, i * 40, 40, 40, null);
                    g.drawImage(spelerImage, j*40, i*40, 40, 40, null);
                }
                if (!(grid[i][j] instanceof Speler) && (!(grid[i][j] instanceof Muur))) {
                    System.out.println(item.toString());
                    g.drawImage(achtergrondImage, j*40, i*40,40, 40, null);
                }
                if (grid[i][j] instanceof Muur) {
                    System.out.println(muur.toString());
//                    g.drawRect(i*100, j*100, 100, 100);
//                    g.setColor(Color.GREEN);
                    	g.drawImage(muurImage, j*40, i*40, 40, 40, null);
                }
            }
        }
    }
    
//    private BufferedImage resizeImage(BufferedImage originalImage, int type){
//	g.drawImage(originalImage, 0, 0, 20, 20, null);
//	g.dispose();
// 
//	return resizedImage;
//    }
}