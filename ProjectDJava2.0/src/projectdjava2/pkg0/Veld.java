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
    private Item ItemOpVeld;
    private HashMap buren;

    public Veld(Point loc, Item item)//constructor waarin de waarden van de klassevariabelen bepaald worden, 
    //vanuit deze constructor wordt ook de methode om de items aan te maken aangeroepen
    {

        locatie = loc;
        ItemOpVeld = item;

    }

    public Veld getBuur(String richting) {
        return (Veld) buren.get(richting);
    }

    public Point getLocatie()//hiermee kan de locatie van het veld worden opgehaald en gebruikt worden in andere methodes.
    {
        return locatie;
    }

    public Item getItem()//hiermee wordt het item wat op het veld staat opgehaald, dit wordt gebruikt om het juiste item te tekenen e.d.
    {
        return ItemOpVeld;
    }

    public void verplaatsItem(Item itm, Veld vld) {
        setItem(null);
        vld.setItem(itm);
    }

    public void setItem(Item item) {
        System.out.println(ItemOpVeld);
        ItemOpVeld = item;
        System.out.println(ItemOpVeld);
        System.out.println(getX() + " " + getY());
        System.out.println("");
        if (getItem() != null) {
            getItem().setVeld(this);
        }
    }

    public void setBuren(HashMap bur) {

        
        buren = (HashMap) bur.clone();
//        System.out.println(buren.get("noord") +"     noord!");
//        System.out.println(buren.get("zuid") +"      zuid!");
//        System.out.println(buren.get("west") +"      west!");
//        System.out.println(buren.get("oost") +"      oost!");
    }

    public int getY() {
//        System.out.println("getY: "+(int)locatie.getY());
        return (int) locatie.getY();
    }

    public int getX() {
//        System.out.println("getX: "+(int)locatie.getX());
        return (int) locatie.getX();
    }
}
