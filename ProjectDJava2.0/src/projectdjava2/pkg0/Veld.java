/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package projectdjava2.pkg0;

/**
 *
 * @author Colin
 */
public class Veld { 
    private int locatieX;
    private int locatieY;
    private int itemOpVeldID;
    private Item ItemOpVeld;
    
    public Veld(int x, int y, int itemID)
    {
        locatieX = x;
        locatieY = y;
        itemOpVeldID = itemID;
        createItem();
    }

   
    
    public int[] getLocatie()
    {
        int[] locatie = new int[2];
        locatie[0]  = locatieX;
        locatie[1] = locatieY;
        
        return locatie; 
    }
    
    private void createItem()
    {
        if(itemOpVeldID==0)
        {
            Item item = new Item();
            ItemOpVeld = item;
        }
        if(itemOpVeldID==1)
        {
            Muur muur = new Muur(getLocatie());
            ItemOpVeld = muur;
        }
        if(itemOpVeldID==3)
        {
            CustomKeyListener keylisten = new CustomKeyListener();
            Speler speler = new Speler(getLocatie(), keylisten);
            ItemOpVeld = speler;
          
        }
        if(itemOpVeldID==4)
        {
            Vriend vriend = new Vriend();
            ItemOpVeld = vriend;
        }

    }
    
    public Item getItem()
    {
        return ItemOpVeld;
    }
}
