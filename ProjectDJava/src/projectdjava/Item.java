/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package projectdjava;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
/**
 *
 * @author Colin
 */
public class Item {
    protected BufferedImage image;  
    public BufferedImage returnImage()
    {
        return image;
    }
    
        protected void getImageFile() {
        try {
            image = ImageIO.read(new File("src/images/background.bmp"));
        } catch (IOException ex) {
//            System.out.println(ex);
        }
    }
        
        public String toString()
        {
            return "Item";
        }
}
