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
public class Muur extends Item{
    public Muur()
    {
        getImageFile();
    }
    
        private void getImageFile() {
        try {
            image = ImageIO.read(new File("src/images/wall.jpg"));
        } catch (IOException ex) {
            System.out.println("IOException: " +ex);
        }
    }
        
    public String toString()
    {
        return "muur";
    }
}
