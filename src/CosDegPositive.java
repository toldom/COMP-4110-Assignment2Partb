/*
Marcus Toldo - 104623006
COMP 4110 Software Verification & Testing
Assignment 2b - junit

File 7 / 15 - Cos with Positive Degrees Tests
 */

import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

//This class holds all tests for the Cos function, using positive degree values
public class CosDegPositive {

    private static TrigFunctions.trigFunctions trigFunctions;
    private static double delta;

    @BeforeClass
    public static void ClassSetup() {
        trigFunctions = new TrigFunctions.trigFunctions();
        delta = 0.01;
    }

    //Quadrant One Test
    @Test
    public void CosDegPositiveQuadOne() {
        assertEquals(0.98480775301, trigFunctions.cos(10, "deg"), delta);
    }

    //Quadrant Two Test
    @Test
    public void CosDegPositiveQuadTwo() {
        assertEquals(-0.17364817766, trigFunctions.cos(100, "deg"), delta);
    }

    //Quadrant Three Test
    @Test
    public void CosDegPositiveQuadThree() {
        assertEquals(-0.98480775301, trigFunctions.cos(190, "deg"), delta);
    }

    //Quadrant Four Test
    @Test
    public void CosDegPositiveQuadFour() {
        assertEquals(0.17364817766, trigFunctions.cos(280, "deg"), delta);
    }

}
