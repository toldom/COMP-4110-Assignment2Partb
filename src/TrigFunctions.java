/*
Marcus Toldo - 104623006
COMP 4110 Software Verification & Testing
Assignment 2b - junit

File 2 / 15 - Trig Functions
 */

public class TrigFunctions {

    public static double PI = 3.14159265359;

    public TrigFunctions() {

    }

    public static class trigFunctions {
        public double sin(double input, String mode) {

            if (this.DegOrRad(mode)) {
                input = this.DegreeToRadian(input);
            }

            if (input < 0) {
                return - this.sin(-input, "rad");
            }

            if (input == Double.NEGATIVE_INFINITY || !(input < Double.POSITIVE_INFINITY)) {
                return Double.NaN;
            }

            input %= 2 * PI;

            if (input < 0) {
                input = 2 * PI - input;
            }

            int sign = 1;
            if (input > PI) {
                input -= PI;
                sign = -1;
            }

            int precision = 7;
            double hold = 0;
            for (int i = 0; i < precision; i++) {
                hold += this.Power(-1, i) * (this.Power(input, 2 * i + 1) / this.Factorial(2 * i + 1));
            }

            return sign * hold;

        }

        public double cos(double input, String mode) {

            if (this.DegOrRad(mode)) {
                input = this.DegreeToRadian(input);
            }

            if (input == Double.NEGATIVE_INFINITY || !(input < Double.POSITIVE_INFINITY)) {
                return Double.NaN;
            }

            input %= 2 * PI;

            int sign = 1;
            if (input > PI) {
                input -= PI;
                sign = -1;
            }
            int precision = 9;
            double hold = 0;
            for (int i = 0; i <= precision; i++) {

                hold += this.Power(-1, i) * (this.Power(input, 2 * i ) / this.Factorial(2 * i ));
            }

            return  sign*hold;
        }

        public double tan(double input, String mode) {

            double result = this.sin(input, mode) / this.cos(input, mode);

            return result;
        }

        public double DegreeToRadian(double degValue) {
            return degValue * (PI / 180);
        }

        public double RadianToDegree(double radValue) {
            return radValue * (180 / PI);
        }

        public double Power(double base, double exponent) {

            double result = 1;

            for (int i = 0; i < exponent; i++) {
                result *= base;
            }

            return result;
        }

        public double Factorial(double input) {

            double result = 1;

            for (int i = 1; i <= input; i++) {
                result *= i;
            }

            return result;
        }

        public boolean DegOrRad(String mode) {

            if (mode.toLowerCase().equals("deg") || mode.toLowerCase().equals("degrees") || mode.toLowerCase().equals("degree")) {

                return true;

            } else if (mode.toLowerCase().equals("rad") || mode.toLowerCase().equals("radians") || mode.toLowerCase().equals("radian")) {

                return false;

            } else {
                throw new IllegalArgumentException("Invalid mode argument, please use \"deg\" for degrees mode, or \"rad\" for radians mode");
            }

        }
    }
}