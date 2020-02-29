/*
Marcus Toldo - 104623006
COMP 4110 Software Verification & Testing
Assignment 2b - junit

File 3 / 15 - Sin with Positive Degrees Tests
 */

import org.junit.BeforeClass;
        import org.junit.Test;
        import static org.junit.Assert.assertEquals;

//This class holds all tests for the Sin function, using positive degree values
public class SinDegPositive {

    private static TrigFunctions.trigFunctions trigFunctions;
    private static double delta;

    @BeforeClass
    public static void ClassSetup() {
        trigFunctions = new TrigFunctions.trigFunctions();
        delta = 0.01;
    }

    //Quadrant One Test
    @Test
    public void SinDegPositiveQuadOne() {
        assertEquals(0.17364817766, trigFunctions.sin(10, "deg"), delta);
    }

    //Quadrant Two Test
    @Test
    public void SinDegPositiveQuadTwo() {
        assertEquals(0.98480775301, trigFunctions.sin(100, "deg"), delta);
    }

    //Quadrant Three Test
    @Test
    public void SinDegPositiveQuadThree() {
        assertEquals(-0.17364817766, trigFunctions.sin(190, "deg"), delta);
    }

    //Quadrant Four Test
    @Test
    public void SinDegPositiveQuadFour() {
        assertEquals(-0.98480775301, trigFunctions.sin(280, "deg"), delta);
    }
}
