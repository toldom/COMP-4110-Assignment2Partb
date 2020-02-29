/*
Marcus Toldo - 104623006
COMP 4110 Software Verification & Testing
Assignment 2b - junit

File 1 / 15 - TestSuite
 */

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)

@Suite.SuiteClasses({
        SinDegPositive.class,
        SinDegNegative.class,
        SinRadPositive.class,
        SinRadNegative.class,
        CosDegPositive.class,
        CosDegNegative.class,
        CosRadPositive.class,
        CosRadNegative.class,
        TanDegPositive.class,
        TanDegNegative.class,
        TanRadPositive.class,
        TanRadNegative.class,
        MiscTestCases.class
})

public class TrigTestSuite { }
