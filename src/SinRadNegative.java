/*
Marcus Toldo - 104623006
COMP 4110 Software Verification & Testing
Assignment 2b - junit

File 6 / 15 - Sin with Negative Radians Tests
 */

import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

//This class holds all tests for the Sin function, using negative radian values
public class SinRadNegative {

    private static TrigFunctions.trigFunctions trigFunctions;
    private static double delta;

    @BeforeClass
    public static void ClassSetup() {
        trigFunctions = new TrigFunctions.trigFunctions();
        delta = 0.01;
    }

    //Quadrant Four Test
    @Test
    public void SinRadNegativeQuadFour() {
        assertEquals(-0.17364825133, trigFunctions.sin(-0.174533, "rad"), delta);
    }

    //Quadrant Three Test
    @Test
    public void SinRadNegativeQuadThree() {
        assertEquals(-0.98480762312, trigFunctions.sin(-1.74533, "rad"), delta);
    }

    //Quadrant Two Test
    @Test
    public void SinRadNegativeQuadTwo() {
        assertEquals(0.1736525317, trigFunctions.sin(-3.31613, "rad"), delta);
    }

    //Quadrant One Test
    @Test
    public void SinRadNegativeQuadOne() {
        assertEquals(0.98480808391, trigFunctions.sin(-4.88692, "rad"), delta);
    }
}
