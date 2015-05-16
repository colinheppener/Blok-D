/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package projectdjava;

/**
 *
 * @author Colin
 */
public class Speelbord {
    int huidigLevel = 1;
    Item[][] grid = new Item[20][20];
    
    
    private void createVelden()
    {
        Muur muur = new Muur();
        Speler speler = new Speler();
        Valsspeler vspeler = new Valsspeler();
        Vriend vriend = new Vriend();
        Bazooka bazooka = new Bazooka();
        Helper helper = new Helper();
        
        
        if(huidigLevel == 1)
        {
            for (int i = 0; i < 20; i++) {
                for (int j = 0; j < 20; j++) {
                    grid[i][j] = speler;
                }
            }
        }
    }
    
    public Item[][] getGrid()
    {
        return grid;
    }
    
    public void HerstartLevel()
    {
        
    }
    public void StartNieuwLevel()
    {
        
    }
}
