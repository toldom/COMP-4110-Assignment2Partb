/*
Marcus Toldo - 104623006
COMP 4110 Software Verification & Testing
Assignment 2b - junit

File 8 / 15 - Cos with Negative Degrees Tests
 */

import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

//This class holds all tests for the Cos function, using Negative degree values
public class CosDegNegative {

    private static TrigFunctions.trigFunctions trigFunctions;
    private static double delta;

    @BeforeClass
    public static void ClassSetup() {
        trigFunctions = new TrigFunctions.trigFunctions();
        delta = 0.01;
    }

    //Quadrant Four Test
    @Test
    public void CosDegNegativeQuadFour() {
        assertEquals(0.98480775301, trigFunctions.cos(-10, "deg"), delta);
    }

    //Quadrant Three Test
    @Test
    public void CosDegNegativeQuadThree() {
        assertEquals(-0.17364817766, trigFunctions.cos(-100, "deg"), delta);
    }

    //Quadrant Two Test
    @Test
    public void CosDegNegativeQuadTwo() {
        assertEquals(-0.98480775301, trigFunctions.cos(-190, "deg"), delta);
    }

    //Quadrant One Test
    @Test
    public void CosDegNegativeQuadOne() {
        assertEquals(0.17364817766, trigFunctions.cos(-280, "deg"), delta);
    }

}
