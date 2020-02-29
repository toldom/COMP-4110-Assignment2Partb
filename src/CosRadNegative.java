/*
Marcus Toldo - 104623006
COMP 4110 Software Verification & Testing
Assignment 2b - junit

File 10 / 15 - Cos with Negative Radians Tests
 */

import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

//This class holds all tests for the Cos function, using negative radian values
public class CosRadNegative {

    private static TrigFunctions.trigFunctions trigFunctions;
    private static double delta;

    @BeforeClass
    public static void ClassSetup() {
        trigFunctions = new TrigFunctions.trigFunctions();
        delta = 0.01;
    }

    //Quadrant Four Test
    @Test
    public void CosRadNegativeQuadFour() {
        assertEquals(0.98480774002, trigFunctions.cos(-0.174533, "rad"), delta);
    }

    //Quadrant Three Test
    @Test
    public void CosRadNegativeQuadThree() {
        assertEquals(-0.1736489143, trigFunctions.cos(-1.74533, "rad"), delta);
    }

    //Quadrant Two Test
    @Test
    public void CosRadNegativeQuadTwo() {
        assertEquals(-0.98480698526, trigFunctions.cos(-3.31613, "rad"), delta);
    }

    //Quadrant One Test
    @Test
    public void CosRadNegativeQuadOne() {
        assertEquals(0.17364630103, trigFunctions.cos(-4.88692, "rad"), delta);
    }

}
