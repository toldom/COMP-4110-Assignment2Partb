/*
Marcus Toldo - 104623006
COMP 4110 Software Verification & Testing
Assignment 2b - junit

File 13 / 15 - Tan with Positive Radians Tests
 */

import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

//This class holds all tests for the Tan function, using positive radian values
public class TanRadPositive {

    private static TrigFunctions.trigFunctions trigFunctions;
    private static double delta;

    @BeforeClass
    public static void ClassSetup() {
        trigFunctions = new TrigFunctions.trigFunctions();
        delta = 0.01;
    }

    //Quadrant One Test
    @Test
    public void TanRadPositiveQuadOne() {
        assertEquals(0.17632705783, trigFunctions.tan(0.174533, "rad"), delta);
    }

    //Quadrant Two Test
    @Test
    public void TanRadPositiveQuadTwo() {
        assertEquals(-5.67125701328, trigFunctions.tan(1.74533, "rad"), delta);
    }

    //Quadrant Three Test
    @Test
    public void TanRadPositiveQuadThree() {
        assertEquals(0.17633153938, trigFunctions.tan(3.31613, "rad"), delta);
    }

    //Quadrant Four Test
    @Test
    public void TanRadPositiveQuadFour() {
        assertEquals(-5.67134501602, trigFunctions.tan(4.88692, "rad"), delta);
    }
}
