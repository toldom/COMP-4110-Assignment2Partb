/*
Marcus Toldo - 104623006
COMP 4110 Software Verification & Testing
Assignment 2b - junit

File 12 / 15 - Tan with Negative Degrees Tests
 */


import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

//This class holds all tests for the Tan function, using negative degree values
public class TanDegNegative {

    private static TrigFunctions.trigFunctions trigFunctions;
    private static double delta;

    @BeforeClass
    public static void ClassSetup() {
        trigFunctions = new TrigFunctions.trigFunctions();
        delta = 0.01;
    }

    //Quadrant Four Test
    @Test
    public void TanDegNegativeQuadFour() {
        assertEquals(-0.1763269807, trigFunctions.tan(-10, "deg"), delta);
    }

    //Quadrant Three Test
    @Test
    public void TanDegNegativeQuadThree() {
        assertEquals(5.67128181962, trigFunctions.tan(-100, "deg"), delta);
    }

    //Quadrant Two Test
    @Test
    public void TanDegNegativeQuadTwo() {
        assertEquals(-0.1763269807, trigFunctions.tan(-190, "deg"), delta);
    }

    //Quadrant One Test
    @Test
    public void TanDegNegativeQuadOne() {
        assertEquals(5.67128181962, trigFunctions.tan(-280, "deg"), delta);
    }
}
