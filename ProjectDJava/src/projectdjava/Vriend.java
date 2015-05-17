/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package projectdjava;

import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 *
 * @author Colin
 */
public class Vriend extends Item {

    public Vriend() {
        getImageFile();
    }

    public void getImageFile() {

        try {
            image = ImageIO.read(new File("src/images/vriend.png"));
        } catch (IOException ex) {
            System.out.println("IOException: " + ex);
        }
    }
}
