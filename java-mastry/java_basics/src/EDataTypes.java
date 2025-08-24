public class EDataTypes {

    public static void main(String[] args) {

        /**
            byte	Stores whole numbers from -128 to 127
            short	Stores whole numbers from -32,768 to 32,767
            int	    Stores whole numbers from -2,147,483,648 to 2,147,483,647
            long	Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
            float	Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits
            double	Stores fractional numbers. Sufficient for storing 15 to 16 decimal digits
            boolean	Stores true or false values
            char	Stores a single character/letter or ASCII values
         */


        // Integer types
        byte b = 127; // Max value for byte
        short s = 32767; // Max value for short
        int i = 2147483647; // Max value for int
        long l = 9223372036854775807L; // Max value for long (note the 'L' suffix)

        // Floating-point types
        float f = 3.1415927f; // Approx 7 decimal digits, 'f' suffix required
        double d = 3.141592653589793; // Approx 16 decimal digits

        // Boolean type
        boolean bool = true; // true / false

        // Character type
        char c = 'A'; // Can also use Unicode like '\u0041'

        // Output
        System.out.println("byte: " + b);
        System.out.println("short: " + s);
        System.out.println("int: " + i);
        System.out.println("long: " + l);
        System.out.println("float: " + f);
        System.out.println("double: " + d);
        System.out.println("boolean: " + bool);
        System.out.println("char: " + c);



    }
}
