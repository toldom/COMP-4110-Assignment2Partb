/*
Marcus Toldo - 104623006
COMP 4110 Software Verification & Testing
Assignment 2b - junit

File 5 / 15 - Sin with Positive Radians Tests
 */

import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

//This class holds all tests for the Sin function, using positive radian values
public class SinRadPositive {

    private static TrigFunctions.trigFunctions trigFunctions;
    private static double delta;

    @BeforeClass
    public static void ClassSetup() {
        trigFunctions = new TrigFunctions.trigFunctions();
        delta = 0.01;
    }

    //Quadrant One Test
    @Test
    public void SinRadPositiveQuadOne() {
        assertEquals(0.17364825133, trigFunctions.sin(0.174533, "rad"), delta);
    }

    //Quadrant Two Test
    @Test
    public void SinRadPositiveQuadTwo() {
        assertEquals(0.98480762312, trigFunctions.sin(1.74533, "rad"), delta);
    }

    //Quadrant Three Test
    @Test
    public void SinRadPositiveQuadThree() {
        assertEquals(-0.1736525317, trigFunctions.sin(3.31613, "rad"), delta);
    }

    //Quadrant Four Test
    @Test
    public void SinRadPositiveQuadFour() {
        assertEquals(-0.98480808391, trigFunctions.sin(4.88692, "rad"), delta);
    }
}
