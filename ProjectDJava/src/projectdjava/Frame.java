/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package projectdjava;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyListener;
import javax.swing.*;

/**
 *
 * @author Colin
 */
public class Frame extends JFrame {

    public Frame(KeyListener e) {
        KeyListener keyListen = new CustomKeyListener();
        keyListen.keyReleased(null);
    }
    final int HEIGHT = 900;
    final int WIDTH = 900;

    public void createComponents() {
        final JFrame frame = new JFrame();
        JPanel controlPanel = new JPanel();
        JButton herstartKnop = new JButton("Herstart Level");
        JButton menuKnop = new JButton("Terug naar menu");
        frame.setSize(HEIGHT, WIDTH);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        JComponent component = new Speelbord();


        frame.add(component);
        component.setFocusable(true);
        CustomKeyListener keyListen = new CustomKeyListener();
        component.addKeyListener(keyListen);
        frame.add(controlPanel, BorderLayout.EAST);
        GridLayout gridLayout = new GridLayout(2, 2);
        controlPanel.setLayout(gridLayout);
        controlPanel.add(herstartKnop);
        controlPanel.add(menuKnop);
        controlPanel.setVisible(true);
        frame.setVisible(true);
        herstartKnop.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                //Execute when button is pressed
                frame.repaint();
                System.out.println("repaint");
            }
        });
        menuKnop.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {

                frame.dispose();
                Menu menu = new Menu();
                menu.createComponents();
            }
        });
        
    }
}

