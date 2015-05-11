/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.util.Arrays;
import java.util.Scanner;
import javax.swing.*;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Colin
 */
public class Program {

    private static int[][] GRID = {
        {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
        {1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 0, 0, 1},
        {1, 0, 0, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1},
        {1, 1, 1, 0, 1, 1, 1, 0, 1, 0, 1, 1, 1},
        {1, 0, 1, 0, 0, 0, 0, 1, 1, 1, 0, 0, 1},
        {1, 0, 1, 1, 1, 1, 1, 1, 0, 1, 1, 0, 1},
        {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
        {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 1}
//        { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1,},
//        { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1,},
//        { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1,},
//        { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1,},
//        { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1,},
//        { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1,},
//        { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1,},
//        { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1,},
    };

    public static void main(String[] args) {
        MazeSolver maze = new MazeSolver(GRID);
        MazeViewer mazeview = new MazeViewer(GRID);

        boolean solved = maze.solve();
        System.out.println("Solved: " + solved);
        System.out.println(maze.toString());
        final JComponent component = new MazePicture(maze.getMap());
        JComponent viewMazeComp = new MazeViewer(GRID);
        final int WIDTH = 800;
        final int HEIGHT = 450;
        final JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        final JPanel panel2 = new JPanel();
        final JFrame frame2 = new JFrame();
        frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        BorderLayout layout = new BorderLayout();
        panel.setLayout(layout);
        panel2.setLayout(layout);
        JButton button = new JButton("Solve");
        GridLayout layoutLabel = new GridLayout(3,1);
        final JPanel panelLabels = new JPanel();
        panelLabels.setLayout(layoutLabel);
        button.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                //Execute when button is pressed
                System.out.println("button clicked");
//                frame2.dispose();
                frame.setVisible(true);
                panel2.add(component);
                frame.add(panel2);
                panelLabels.add(new JLabel("blauw = goede route"), BorderLayout.EAST);
                panelLabels.add(new JLabel("rood = gefaalde poging"), BorderLayout.EAST);
                panelLabels.add(new JLabel("zwart = niet bezocht gebied"), BorderLayout.EAST);
                frame.add(panelLabels, BorderLayout.EAST);
                panel2.setVisible(true);
            }
        });

        panel.add(button, BorderLayout.SOUTH);

        frame.setSize(WIDTH, HEIGHT);

        frame2.setSize(WIDTH, HEIGHT);

        panel.add(viewMazeComp);

//        frame.add(panel);
        frame2.add(panel);
        frame2.setVisible(true);

        System.out.println(maze.getLength());
        

    }
}
