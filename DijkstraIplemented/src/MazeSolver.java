/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Arrays;

/**
 *
 * @author Colin
 */
public class MazeSolver {

    final static int TRIED = 2;
    final static int PATH = 3;
    // @formatter:off
    private int[][] grid;
    private int height;
    private int width;
    private int length = 0;
    private int[][] map;
    private int[] pathLengths= new int[10];

    public MazeSolver(int[][] grid) {
        this.grid = grid;
        this.height = grid.length;
        this.width = grid[0].length;

        this.map = new int[height][width];
    }

    public boolean solve() {
        return traverse(0, 0);
    }

    private boolean traverse(int i, int j) {
        if (!isValid(i, j)) {
            return false;
        }

        if (isEnd(i, j)) {
            map[i][j] = PATH;
            
            return true;
        } else {
            map[i][j] = TRIED;
        }
        // South
        if (traverse(i + 1, j)) {
            map[i + 1][j] = PATH;
            length += 1;
            return true;
        }

        // East
        if (traverse(i, j + 1)) {
            map[i][j + 1] = PATH;
            length += 1;
            return true;
        }

        // West
        if (traverse(i, j - 1)) {
            map[i][j - 1] = PATH;
            length += 1;
            return true;
        }        
        // North
        if (traverse(i - 1, j)) {
            map[i - 1][j] = PATH;
            length += 1;
            return true;
        }

        return false;
    }

    private boolean isEnd(int i, int j) {
        return i == height - 1 && j == width - 1;
    }

    private boolean isValid(int i, int j) {
        if (inRange(i, j) && isOpen(i, j) && !isTried(i, j)) {
            return true;
        }

        return false;
    }

    private boolean isOpen(int i, int j) {
        return grid[i][j] == 1;
    }

    private boolean isTried(int i, int j) {
        pathLengths[0] = length;
        if(isShorter(pathLengths[0]))
        {
        return map[i][j] == PATH;
        }
        else{return map[i][j] == TRIED;}
    }

    private boolean inRange(int i, int j) {
        return inHeight(i) && inWidth(j);
    }

    private boolean inHeight(int i) {
        return i >= 0 && i < height;
    }

    private boolean inWidth(int j) {
        return j >= 0 && j < width;
    }

    private boolean isShorter(int j) {
        return j >= 0 && j<length;
    }

    @Override
    public String toString() {
        String s = "";
        for (int[] row : map) {
            s += Arrays.toString(row) + "\n";
        }

        return s;
    }

    public int[][] getMap() {
        return map;
    }

    public int getLength() {
        return length;
    }
    
}
