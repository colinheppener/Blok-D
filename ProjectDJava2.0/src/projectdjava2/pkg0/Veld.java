/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package projectdjava2.pkg0;
import java.awt.Point;
import java.util.HashMap;
/**
 *
 * @author Colin
 */
public class Veld { 
    private Point locatie;
    private int itemOpVeldID;//dit is het idee wat meegegeven wordt vanuit de CreateVelden methode in Speelbord
    private Item ItemOpVeld;
    private HashMap buren;
    
    public Veld(Point loc, int itemID)//constructor waarin de waarden van de klassevariabelen bepaald worden, 
                                         //vanuit deze constructor wordt ook de methode om de items aan te maken aangeroepen
    {
        locatie = loc;
        itemOpVeldID = itemID;
        createItem();
        buren = getBuren(locatie);
    }

   public HashMap getBuren(Point locatie)
    {
        Speelbord speelbord = new Speelbord();
        Veld[][] grid = speelbord.getGrid();
        HashMap buren = new HashMap();
        Item buur = grid[(int)locatie.getY()-1][(int)locatie.getX()].getItem();
        buren.put(0, buur);
        buur = grid[(int)locatie.getY()][(int)locatie.getX()+1].getItem();
        buren.put(1, buur);
        buur = grid[(int)locatie.getY()+1][(int)locatie.getX()].getItem();
        buren.put(2, buur);
        buur = grid[(int)locatie.getY()][(int)locatie.getX()-1].getItem();
        buren.put(3, buur);
        return buren;
    }
    
    public Point getLocatie()//hiermee kan de locatie van het veld worden opgehaald en gebruikt worden in andere methodes.
    {       
        return locatie; 
    }
    
    private void createItem()//hier wordt het daadwerkelijke item op het veld gecreeerd. Het wordt dus door veld zelf gedaan en niet meer door speelbord.
    {
//        if(itemOpVeldID==0)//als itemID 0 is wordt er nu geen item op het veld gezet, DIT IS WAT DE NULLPOINTER VEROORZAAKT
//        {
// 
//        }
        if(itemOpVeldID==1)//als itemID 1 is wordt muur op veld gecreeerd.
        {
            Muur muur = new Muur(getLocatie());
            ItemOpVeld = muur;
        }
        if(itemOpVeldID==3)//als itemID 3 is wort speler gecreeerd
        {
            Speler speler = new Speler(getLocatie());
            ItemOpVeld = speler;
        }
        if(itemOpVeldID==4)//als itemID 4 is wordt vriend gecreeeerd
        {
            Vriend vriend = new Vriend(getLocatie());
            ItemOpVeld = vriend;
        }
        if(itemOpVeldID ==0)
        {
            DefaultItem defaultItem = new DefaultItem(getLocatie());
            ItemOpVeld = defaultItem;
        }
        System.out.println("itemopveld:" +ItemOpVeld.toString());//hier wordt weergegeven(met de toString methodes uit de Speler en Muur klasse(tot nu toe) 
                                                                //welke items aan de grid toegevoegd worden(wordt weergegeven in de console.
    }
    
    public Item getItem()//hiermee wordt het item wat op het veld staat opgehaald, dit wordt gebruikt om het juiste item te tekenen e.d.
    {
        return ItemOpVeld;
    }
}
