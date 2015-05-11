
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JComponent;
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Colin
 */
public class MazeViewer extends JComponent{
        private int[][] mazeGrid;

    public MazeViewer(int[][] grid) {
        mazeGrid = grid;
        
    }

    public void paintComponent(Graphics g) {
        for (int i = 0; i < mazeGrid.length; i++) {
            for (int j = 0; j < mazeGrid[0].length; j++) {
                if (mazeGrid[i][j] == 1) {
//                    g.drawRect(i*100, j*100, 100, 100);
                    g.setColor(Color.GREEN);
                    g.fillRect(j*50, i*50, 50, 50);
                }
                else if(mazeGrid[i][j]== 0){
                    g.setColor(Color.BLACK);
                    g.fillRect(j*50, i*50, 50, 50);
                }
            }
        }
        


    }
}

