/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package projectdjava2.pkg0;

import java.awt.Point;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/**
 *
 * @author Colin
 */
public class Veld {

    private Point locatie;
    private Item ItemOpVeld;
    private ArrayList<MazeSolver> mazeSolvers;
    private HashMap buren;
    private Speelbord speelbord;

    public Veld(Point loc, Item item)//constructor waarin de waarden van de klassevariabelen bepaald worden, 
    //vanuit deze constructor wordt ook de methode om de items aan te maken aangeroepen
    {
        mazeSolvers = new ArrayList<>();
        locatie = loc;
        ItemOpVeld = item;

    }

    public Veld(Point loc, Item item, Speelbord splbord)//constructor waarin de waarden van de klassevariabelen bepaald worden, 
    //vanuit deze constructor wordt ook de methode om de items aan te maken aangeroepen
    {
        mazeSolvers = new ArrayList<>();
        speelbord = splbord;
        locatie = loc;
        ItemOpVeld = item;

    }

    public Speelbord getSpeelbord() {
        return speelbord;
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

    public MazeSolver getMazeSolver(Item itm) {
        for (Iterator<MazeSolver> it = mazeSolvers.iterator(); it.hasNext();) {
            MazeSolver mazeSolver = (MazeSolver) it.next();
            if (itm == mazeSolver.getItem()) {
                return mazeSolver;
            }
        }
        return null;
    }
    
    public void dellMazeSolver(MazeSolver mazeSolver)
    {
        mazeSolvers.remove(mazeSolver);
    }

    public void setItem(Item item) {
        ItemOpVeld = item;
        if (getItem() != null) {
            getItem().setVeld(this);
        }
    }

    public void setMazeSolver(MazeSolver mzSolver) {
        for (Iterator<MazeSolver> it = mazeSolvers.iterator(); it.hasNext();) {
            MazeSolver mazeSolver = (MazeSolver) it.next();
            if (mzSolver.getVeld() == mazeSolver.getVeld() && mzSolver.getItem() == mazeSolver.getItem()) {
                System.out.println("gelijk");
                return;
            }
        }
        mazeSolvers.add(mzSolver);
//        System.out.println(mazeSolvers);
    }
    
    public void giveArray()
    {
         for (Iterator<MazeSolver> it = mazeSolvers.iterator(); it.hasNext();) {
            MazeSolver mazeSolver = (MazeSolver) it.next();
             System.out.print(mazeSolver.getItem().toString() + "             ");
        }
        System.out.println(mazeSolvers);
    }
//            System.out.println(getX() + " " + getY());
//            System.out.println("");
//            if (getItem() != null) {
//                getItem().setVeld(this);
//            }

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
