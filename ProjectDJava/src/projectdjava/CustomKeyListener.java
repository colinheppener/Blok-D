/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package projectdjava;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 *
 * @author Colin
 */
class CustomKeyListener implements KeyListener {

    public void keyTyped(KeyEvent e) {
    }

    public void keyPressed(KeyEvent e) {
        Speler speler = new Speler();
        if (e.getKeyCode() == KeyEvent.VK_ENTER) {
            System.out.println("enter ingevoerd");
        }
        if (e.getKeyCode() == KeyEvent.VK_UP) {
            System.out.println("noord ingevoerd");
//            speler.Loop("noord");
        }
        if (e.getKeyCode() == KeyEvent.VK_DOWN) {
            System.out.println("south ingevoerd");
//            speler.Loop("zuid");
        }
        if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            System.out.println("west ingevoerd");
//            speler.Loop("west");
        }
        if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            System.out.println("east ingevoerd");
//            speler.Loop("oost");
        }

    }

    public void keyReleased(KeyEvent e) {
    }
}
