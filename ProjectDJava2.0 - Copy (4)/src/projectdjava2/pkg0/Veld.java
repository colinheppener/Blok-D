package projectdjava2.pkg0;

import java.awt.Point;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/**
 *
 * @author Colin & Jeroen
 */
public class Veld {

    private Point locatie;
    private Item ItemOpVeld;
    private ArrayList<MazeSolver> mazeSolvers;
    private HashMap buren;
    private Speelbord speelbord;

    public Veld(Point loc, Item item) {
        mazeSolvers = new ArrayList<>();
        locatie = loc;
        ItemOpVeld = item;
    }

    public Veld(Point loc, Item item, Speelbord splbord) {
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

    public Point getLocatie() {
        return locatie;
    }

    public Item getItem() {
        return ItemOpVeld;
    }

    public MazeSolver getMazeSolver(Item itm) {
        for (Iterator<MazeSolver> it = mazeSolvers.iterator(); it.hasNext();) {
            MazeSolver mazeSolver = (MazeSolver) it.next();
            if (mazeSolver.getItem() == null) {
                System.out.println("Item = null");
            }
            if (itm == mazeSolver.getItem()) {
                return mazeSolver;
            }
        }
        return null;
    }

    public void dellMazeSolver(MazeSolver mazeSolver) {
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
                mazeSolvers.add(mzSolver);
                mazeSolvers.remove(mazeSolver);
                return;
            }
        }
        mazeSolvers.add(mzSolver);
    }

    public void setBuren(HashMap bur) {
        buren = (HashMap) bur.clone();
    }

    public int getY() {
        return (int) locatie.getY();
    }

    public int getX() {
        return (int) locatie.getX();
    }
}
