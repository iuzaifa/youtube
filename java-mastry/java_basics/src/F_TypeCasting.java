public class F_TypeCasting {

    public static void main(String[] args) {

        // Widening Casting -> smaller type to larger type (Implicit Casting)
        // byte -> short -> char -> int -> long -> float -> double

        byte b = 34;
        short s = b; // byte to short
        System.out.println("Byte : " + b + ", Short : " + s);

        int i = 345;
        float f = i; // int to float
        System.out.println(i);  // 345
        System.out.println(f);  // 345.0 , Float has decimal part .0

        float f2 = 3456.4f;
        double d1 = f2; // float to double
        System.out.println(f2); // 3456.4
        System.out.println(d1); // 3456.39990234375 (approx value due to precision)

        int dtoInt = (int) d1; // double to int (decimal part truncated)
        System.out.println(dtoInt); // 3456

        int intToString = 3456;
        String str = String.valueOf(intToString); // int to String
        System.out.println(intToString); // 3456
        System.out.println(str); // "3456"


        // Narrowing Casting -> larger type to smaller type (Explicit Casting)
        // double -> float -> long -> int -> char -> short -> byte

        double d2 = 12345.6789;
        float f3 = (float) d2; // double to float
        System.out.println("Double: " + d2 + ", Float: " + f3);

        long l = (long) d2; // double to long
        System.out.println("Double: " + d2 + ", Long: " + l);

        int i2 = (int) d2; // long/double to int
        System.out.println("Double: " + d2 + ", Int: " + i2);

        char ch = (char) i2; // int to char (ASCII conversion)
        System.out.println("Int: " + i2 + ", Char: " + ch);

        short s2 = (short) i2; // int to short
        System.out.println("Int: " + i2 + ", Short: " + s2);

        byte b2 = (byte) i2; // int to byte (may lose data)
        System.out.println("Int: " + i2 + ", Byte: " + b2);
    }
}

class JavaTypeCastingNotes {
            /**
             *
                1. Widening Casting (safe, automatic)

                - Converts smaller type → larger type.
                - No data loss because the larger type can store everything the smaller type has.
                - Example:

                    int i = 50;
                    double d = i; // widening
                    System.out.println(d); // 50.0

                  The integer 50 becomes 50.0 in double → no problem.

                -------------------------------------------------------------
                2. Narrowing Casting (manual, may lose data)

                - Converts larger type → smaller type.
                - Not always safe because smaller type cannot hold all the details.
                - You must explicitly tell Java using (type).

                -------------------------------------------------------------
                Example: float → int

                    float f = 3.6f;
                    int i = (int) f; // narrowing
                    System.out.println(i); // 3

                Why result is 3 instead of 3.6?
                - int cannot store decimals.
                - So, Java truncates (cuts off) the decimal part, not round.
                - 3.6 → 3, 9.9 → 9, -7.8 → -7.

                -------------------------------------------------------------
                Example: double → int

                    double d = 12345.6789;
                    int i2 = (int) d;
                    System.out.println(i2); // 12345

                Decimal part is discarded.

                -------------------------------------------------------------
                Example: int → byte (overflow possible)

                    int big = 130;
                    byte b = (byte) big;
                    System.out.println(b); // -126

                - byte range is -128 to 127.
                - 130 doesn’t fit → value wraps around (overflow).

                -------------------------------------------------------------
                Note:

                - Widening: safe, no data loss.
                - Narrowing: possible data loss → decimals truncated, overflows, or precision loss.
        */

}
