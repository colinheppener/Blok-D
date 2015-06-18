/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package projectdjava2.pkg0;

import org.junit.*;
import static org.junit.Assert.*;

/**
 *
 * @author Colin
 */
public class FrameTest {
    
    public FrameTest() {
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

    @Test
        public void testVoerActieUit() {
        System.out.println("setInterval");
        Frame frame = new Frame();
        
        int startTime = frame.getCurrentTime();
        System.out.println("start:" + startTime);
        Valsspeler instance = new Valsspeler(frame, 10);

        instance.voerActieUit();
        int timeAfter = frame.getCurrentTime();
        System.out.println("end:" + timeAfter);
        assertNotSame(startTime, timeAfter);
    }

}
