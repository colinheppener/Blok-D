/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package projectdjava2.pkg0;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 *
 * @author Colin
 */
class CustomKeyListener implements KeyListener {

    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_ENTER) {
            System.out.println("enter ingevoerd");
        }
        if (e.getKeyCode() == KeyEvent.VK_UP) {
            System.out.println("noord ingevoerd");
            
            Speler.Loop(0);
        }
        if (e.getKeyCode() == KeyEvent.VK_DOWN) {
            System.out.println("south ingevoerd");
            Speler.Loop(2);
        }
        if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            System.out.println("west ingevoerd");
            Speler.Loop(3);
        }
        if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            System.out.println("east ingevoerd");
            Speler.Loop(1);
        }
    }

    public void keyReleased(KeyEvent e) {
    }
}
