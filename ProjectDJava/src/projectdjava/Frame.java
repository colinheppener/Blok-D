/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package projectdjava;
import javax.swing.*;
/**
 *
 * @author Colin
 */
public class Frame extends JFrame{
    final int HEIGHT = 800;
    final int WIDTH = 800;
    
    public void createComponents()
    {
    JFrame frame = new JFrame();
    frame.setSize(HEIGHT, WIDTH);
    frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    JComponent component = new Speelbord();
    frame.add(component);
    frame.setVisible(true);
    }
}
