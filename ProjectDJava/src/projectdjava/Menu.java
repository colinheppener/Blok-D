/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package projectdjava;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author Colin
 */
public class Menu extends JFrame {

    final private int HEIGHT = 900;
    final private int WIDTH = 900;

    public void createComponents() {
        final JFrame frame = new JFrame();
        JPanel panelStartKnop = new JPanel();
        JButton startKnop = new JButton("Klik hier om het doolhof te starten!");
        panelStartKnop.add(startKnop);
        frame.setSize(HEIGHT, WIDTH);
        frame.add(panelStartKnop, BorderLayout.EAST);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setVisible(true);
        startKnop.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                //Execute when button is pressed
                CustomKeyListener keyListen = new CustomKeyListener();
                frame.dispose();
                Frame frame = new Frame(keyListen);
                frame.createComponents();
            }
        });
    }
}
