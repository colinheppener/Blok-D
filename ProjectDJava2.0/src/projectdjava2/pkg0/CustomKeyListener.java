package projectdjava2.pkg0;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 *
 * @author Colin & Jeroen
 */
class CustomKeyListener implements KeyListener {

    private Speler speler;
    private Speelbord speelb;

    public CustomKeyListener(Speler spel, Speelbord sp) {
        speler = spel;
        speelb = sp;
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_ENTER) {
        }
        if (e.getKeyCode() == KeyEvent.VK_UP) {
            speler.Loop("noord");
        }
        if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            speler.Loop("oost");
        }
        if (e.getKeyCode() == KeyEvent.VK_DOWN) {
            speler.Loop("zuid");
        }
        if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            speler.Loop("west");
        }
        if (e.getKeyCode() == KeyEvent.VK_SPACE) {
            speler.schiet();
        }
        speelb.repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }
}