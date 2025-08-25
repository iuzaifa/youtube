public class G_Operators {
    public static void main(String[] args) {

        int a = 10, b = 5;

        // Arithmetic
        System.out.println("Arithmetic:");
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));

        // Assignment
        System.out.println("\nAssignment:");
        int x = 10;
        x += 5;
        System.out.println("x += 5 → " + x);
        x -= 3;
        System.out.println("x -= 3 → " + x);

        // Comparison
        System.out.println("\nComparison:");
        System.out.println("a == b → " + (a == b));
        System.out.println("a != b → " + (a != b));
        System.out.println("a > b  → " + (a > b));
        System.out.println("a < b  → " + (a < b));


        System.out.println("\nBitwise:");
        int p = 5, q = 3; // 0101 and 0011
        System.out.println("p & q = " + (p & q));
        System.out.println("p | q = " + (p | q));
        System.out.println("p ^ q = " + (p ^ q));
        System.out.println("~p = " + (~p));
        System.out.println("p << 1 = " + (p << 1));
        System.out.println("p >> 1 = " + (p >> 1));

    }
}

class JavaOperatorsNotes {

    /**
        There are some Operators in Java
            Arithmetic operators
            Assignment operators
            Comparison operators
            Logical operators
            Bitwise operators


        ----------------------------------------------------
        Arithmetic Operators
        - Used to perform basic mathematical operations.

        Example:
            int a = 10, b = 5;
            int sum = a + b;   // 15
        ----------------------------------------------------
        */

        /**
        ----------------------------------------------------
        Assignment Operators
        - Used to assign values to variables, and also combine with arithmetic operations.

        Example:
            int x = 10;
            x += 5;   // same as x = x + 5 → 15
        ----------------------------------------------------
        */

        /**
        ----------------------------------------------------
        Comparison (Relational) Operators
        - Used to compare two values. The result is always true or false.

        Example:
            int a = 10, b = 5;
            boolean result = (a > b);   // true
        ----------------------------------------------------
        */

        /**
        ----------------------------------------------------
        Logical Operators
        - Used to combine two or more conditions. Works with boolean values.

        Example:
            int a = 10, b = 5;
            boolean result = (a > b && a > 0);   // true
        ----------------------------------------------------
        */

        /**
        ----------------------------------------------------
        Bitwise Operators
        - Work at the binary (bit) level of integers.

        Example:
            int p = 5, q = 3;
            int result = p & q;   // 0101 & 0011 = 0001 → 1
        ----------------------------------------------------
        */



}