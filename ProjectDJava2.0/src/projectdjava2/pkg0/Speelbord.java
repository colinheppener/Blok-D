/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package projectdjava2.pkg0;

import java.awt.Graphics;
import javax.swing.JComponent;

/**
 *
 * @author Colin
 */
public class Speelbord extends JComponent {//deze JComponent wordt weergegeven op de Frame in ProjectDJava20.java, in de main klasse dus.

    private Veld[][] grid = new Veld[20][20];
    private int huidiglevel = 1;
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
        CreateVelden();
    }

    private void CreateVelden() {//er worden nu tijdelijk alleen muren gecreeerd omdat ik bij de andere items een nare nullpointer krijg, komt door de ifjes in deze methode
        //als die erin staat is er namelijk mogelijk dat er helemaal geen item op het veld staaat, en krijg je dus een nullpointer als je NULL probeert te tekenen

        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                if (opzetGrid[i][j] == 1) {
                    grid[i][j] = new Veld(i, j, 1);
                }
                if (opzetGrid[i][j] == 3) {
                    grid[i][j] = new Veld(i, j, 3);
                }
                if (opzetGrid[i][j] == 4) {
                    grid[i][j] = new Veld(i, j, 4);
                }
                if (opzetGrid[i][j] == 0) {
                    grid[i][j] = new Veld(i, j, 0);
                }
            }
        }
    }

    private void HerstartLevel() {
    }

    private void StartNieuwLevel() {
    }

    public void paintComponent(Graphics g) {//hier worden de vierkanten daadwerkelijk samengevoegd 
        //en op het speelbord weergegeven, de velden tekenen zichzelf wel met de Teken methode
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                Item veldItem = grid[i][j].getItem();

                veldItem.Teken(g);
                
            }

        }

    }
}
