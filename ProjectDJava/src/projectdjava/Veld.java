/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package projectdjava;

/**
 *
 * @author Jeroen
 */
public class Veld {
    private Item veldbezetting;
    private int xCoordinaat;
    private int yCoordinaat;
    
    public Veld(Item item, int x, int y)
    {
        veldbezetting = item;
        xCoordinaat = x;
        yCoordinaat = y;
    }
    
    public Item returnItem()
    {
        return veldbezetting;
    }
}
