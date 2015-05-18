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
public class Frame extends JFrame {

    final int HEIGHT = 900;
    final int WIDTH = 900;

    public void createComponents() {
        final JFrame frame = new JFrame();
        JPanel controlPanel = new JPanel();
        JButton herstartKnop = new JButton("Herstart Level");
        frame.setSize(HEIGHT, WIDTH);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        JComponent component = new Speelbord();
        frame.add(component);
        frame.add(controlPanel, BorderLayout.EAST);
        controlPanel.add(herstartKnop);
        controlPanel.setVisible(true);
        frame.setVisible(true);
        herstartKnop.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                //Execute when button is pressed
                frame.repaint();
            }
        });
    }
}
