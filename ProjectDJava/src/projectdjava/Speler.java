/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package projectdjava;

import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 *
 * @author Colin
 */
public class Speler extends Item {


    public Speler() {
        getImageFile();
    }

    public void Loop(String richting) {
        
    }

    private void getImageFile() {
        try {
            image = ImageIO.read(new File("src/images/person.jpg"));
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }

    public String toString() {
        return "speler";
    }
}
