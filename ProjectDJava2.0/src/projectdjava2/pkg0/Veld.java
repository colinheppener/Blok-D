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
    private int itemOpVeldID;//dit is het idee wat meegegeven wordt vanuit de CreateVelden methode in Speelbord
    private Item ItemOpVeld;
    
    public Veld(int x, int y, int itemID)//constructor waarin de waarden van de klassevariabelen bepaald worden, 
                                         //vanuit deze constructor wordt ook de methode om de items aan te maken aangeroepen
    {
        locatieX = x;
        locatieY = y;
        itemOpVeldID = itemID;
        createItem();
    }

   
    
    public int[] getLocatie()//hiermee kan de locatie van het veld worden opgehaald en gebruikt worden in andere methodes.
    {
        int[] locatie = new int[2];
        locatie[0]  = locatieX;
        locatie[1] = locatieY;
        
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
            Vriend vriend = new Vriend();
            ItemOpVeld = vriend;
        }
        if(itemOpVeldID ==0)
        {
            Item item = new Item();
            ItemOpVeld = item;
        }
        System.out.println("itemopveld:" +ItemOpVeld.toString());//hier wordt weergegeven(met de toString methodes uit de Speler en Muur klasse(tot nu toe) 
                                                                //welke items aan de grid toegevoegd worden(wordt weergegeven in de console.
    }
    
    public Item getItem()//hiermee wordt het item wat op het veld staat opgehaald, dit wordt gebruikt om het juiste item te tekenen e.d.
    {
        return ItemOpVeld;
    }
}
