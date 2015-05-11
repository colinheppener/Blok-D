/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.swing.*;
import java.awt.*;
import java.util.Arrays;

/**
 *
 * @author Colin
 */
public class MazePicture extends JComponent {

    private int[][] mazeGrid;

    public MazePicture(int[][] grid) {
        mazeGrid = grid;

    }

    public void paintComponent(Graphics g) {
        for (int i = 0; i < mazeGrid.length; i++) {
            for (int j = 0; j < mazeGrid[0].length; j++) {
                if (mazeGrid[i][j] == 3) {
//                    g.drawRect(i*100, j*100, 100, 100);
                    g.setColor(Color.BLUE);
                    g.fillRect(j*50, i*50, 50, 50);
                }
                else if(mazeGrid[i][j]== 2){
                    g.setColor(Color.RED);
                    g.fillRect(j*50, i*50, 50, 50);
                }
                else{
                    g.setColor(Color.BLACK);
                    g.fillRect(j*50, i*50, 50, 50);
                }
            }
        }


    }
}
