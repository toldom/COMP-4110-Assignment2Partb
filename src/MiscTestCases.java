/*
Marcus Toldo - 104623006
COMP 4110 Software Verification & Testing
Assignment 2b - junit

File 15 / 15 - Other Misc. Function Tests
 */

import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MiscTestCases {

    private static TrigFunctions.trigFunctions trigFunctions;
    private static double delta;

    @BeforeClass
    public static void ClassSetup() {
        trigFunctions = new TrigFunctions.trigFunctions();
        delta = 0.01;
    }

    @Test
    public void DegToRadTest() {
        assertEquals(0.785398, trigFunctions.DegreeToRadian(45), delta);
    }

    @Test
    public void RadToDegTest() { assertEquals(45, trigFunctions.RadianToDegree(0.785398), delta);}

    @Test
    public void PowerTest() {assertEquals(32, trigFunctions.Power(2, 5), delta);}

    @Test
    public void FactorialTest() {assertEquals(120, trigFunctions.Factorial(5), delta);}

    @Test
    public void DegreeOrRadianTest() {assertEquals(true, trigFunctions.DegOrRad("DEGREE"));}
}
