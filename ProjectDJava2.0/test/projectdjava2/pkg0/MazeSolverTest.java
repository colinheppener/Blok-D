/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package projectdjava2.pkg0;

import java.awt.Graphics;
import org.junit.*;
import static org.junit.Assert.*;

/**
 *
 * @author Colin
 */
public class MazeSolverTest {
    
    public MazeSolverTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of createNewMazeSolver method, of class MazeSolver.
     */
//    @Test
//    public void testCreateNewMazeSolver() {
//        System.out.println("createNewMazeSolver");
//        MazeSolver instance = null;
//        instance.createNewMazeSolver();
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of solveMaze method, of class MazeSolver.
//     */
//    @Test
//    public void testSolveMaze() {
//        System.out.println("solveMaze");
//        int wrd = 0;
//        MazeSolver instance = null;
//        instance.solveMaze(wrd);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of Teken method, of class MazeSolver.
//     */
    @Test(expected=NullPointerException.class)
    public void testTeken() {
        System.out.println("Teken");
        Graphics g = null;
        MazeSolver instance = null;
        instance.Teken(g);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
