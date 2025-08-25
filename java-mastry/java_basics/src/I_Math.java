public class I_Math {
    public static void main(String[] args) {

        // max, min, sqrt, abs, pow, round, floor, ceil, random,
        // cbrt, log, log10, sin, cos, tan, toRadians, toDegrees.

        /*
        ----------------------------------------------------
        Math.max(x, y)
        - Returns the larger of two numbers.
        Example:
            Math.max(3, 5) → 5
        ----------------------------------------------------
        */
        System.out.println(Math.max(3, 5)); // 5


        /*
        ----------------------------------------------------
        Math.min(x, y)
        - Returns the smaller of two numbers.
        Example:
            Math.min(3, 5) → 3
        ----------------------------------------------------
        */
        System.out.println(Math.min(3, 5)); // 3


        /*
        ----------------------------------------------------
        Math.sqrt(x)
        - Returns the square root of x.
        Example:
            Math.sqrt(81) → 9.0
        ----------------------------------------------------
        */
        System.out.println(Math.sqrt(81)); // 9.0


        /*
        ----------------------------------------------------
        Math.abs(x)
        - Returns the absolute (positive) value of a number.
        Example:
            Math.abs(-25) → 25
        ----------------------------------------------------
        */
        System.out.println(Math.abs(-25)); // 25


        /*
        ----------------------------------------------------
        Math.pow(x, y)
        - Returns x raised to the power y.
        Example:
            Math.pow(2, 3) → 8.0
        ----------------------------------------------------
        */
        System.out.println(Math.pow(2, 3)); // 8.0


        /*
        ----------------------------------------------------
        Math.round(x)
        - Rounds a decimal to the nearest whole number.
        Example:
            Math.round(4.6f) → 5
            Math.round(4.4)  → 4
        ----------------------------------------------------
        */
        System.out.println(Math.round(4.6)); // 5
        System.out.println(Math.round(4.4)); // 4


        /*
        ----------------------------------------------------
        Math.floor(x)
        - Rounds down to the nearest whole number.
        Example:
            Math.floor(4.9) → 4.0
        ----------------------------------------------------
        */
        System.out.println(Math.floor(4.9)); // 4.0


        /*
        ----------------------------------------------------
        Math.ceil(x)
        - Rounds up to the nearest whole number.
        Example:
            Math.ceil(4.1) → 5.0
        ----------------------------------------------------
        */
        System.out.println(Math.ceil(4.1)); // 5.0


        /*
        ----------------------------------------------------
        Math.random()
        - Returns a random double value between 0.0 and 1.0.
        Example:
            Math.random() → 0.234567 (varies)
        - To get a random integer in a range (1 to 100):
            (int)(Math.random() * 100) + 1
        ----------------------------------------------------
        */
        System.out.println(Math.random()); // random value
        int randomNum = (int)(Math.random() * 100) + 1;
        System.out.println(randomNum); // 1 to 100


        /*
        ----------------------------------------------------
        Math.cbrt(x)
        - Returns the cube root of x.
        Example:
            Math.cbrt(27) → 3.0
        ----------------------------------------------------
        */
        System.out.println(Math.cbrt(27)); // 3.0


        /*
        ----------------------------------------------------
        Math.log(x)
        - Returns the natural logarithm (base e) of x.
        Example:
            Math.log(2.71828) → approx 1.0
        ----------------------------------------------------
        */
        System.out.println(Math.log(2.71828)); // ~1.0


        /*
        ----------------------------------------------------
        Math.log10(x)
        - Returns the base-10 logarithm of x.
        Example:
            Math.log10(100) → 2.0
        ----------------------------------------------------
        */
        System.out.println(Math.log10(100)); // 2.0


        /*
        ----------------------------------------------------
        Math.sin(x), Math.cos(x), Math.tan(x)
        - Trigonometric functions (x in radians).
        Example:
            Math.sin(Math.PI / 2) → 1.0
            Math.cos(0)           → 1.0
            Math.tan(Math.PI / 4) → 1.0
        ----------------------------------------------------
        */
        System.out.println(Math.sin(Math.PI / 2)); // 1.0
        System.out.println(Math.cos(0));           // 1.0
        System.out.println(Math.tan(Math.PI / 4)); // 1.0


        /*
        ----------------------------------------------------
        Math.toRadians(x) and Math.toDegrees(x)
        - Convert between degrees and radians.
        Example:
            Math.toRadians(180) → 3.14159 (π)
            Math.toDegrees(Math.PI) → 180.0
        ----------------------------------------------------
        */
        System.out.println(Math.toRadians(180)); // 3.14159
        System.out.println(Math.toDegrees(Math.PI)); // 180.0
    }
}
