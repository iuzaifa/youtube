public class H_Strings {
    public static void main(String[] args) {

        /*
        ----------------------------------------------------
        Java String
        - A String in Java is a sequence of characters.
        - It is an object of the String class.
        Example:
            String s = "Hello Java";
        ----------------------------------------------------
        */
        String s = "Hello Java";


        /*
        ----------------------------------------------------
        String Length
        - Use length() to find the number of characters.
        Example:
            "ABC".length() → 3
        ----------------------------------------------------
        */
        String a_z = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        System.out.println(a_z.length()); // 26


        /*
        ----------------------------------------------------
        charAt()
        - Returns the character at a given index (0-based).
        Example:
            "ABC".charAt(1) → 'B'
        ----------------------------------------------------
        */
        System.out.println(a_z.charAt(1)); // B


        /*
        ----------------------------------------------------
        String Concatenation
        - Joining two strings using + or concat().
        Example:
            "Abu" + " " + "Huzaifa" → "Abu Huzaifa"
        ----------------------------------------------------
        */
        String firstName = "Abu";
        String lastName = "Huzaifa";
        System.out.println(firstName + " " + lastName);


        /*
        ----------------------------------------------------
        Adding Numbers vs Adding Strings
        - Numbers with + → performs addition.
        - Strings with + → performs concatenation.
        Example:
            10 + 20 → 30
            "10" + "20" → "1020"
        ----------------------------------------------------
        */
        int x = 10;
        int y = 20;
        int z = x + y;  // 30
        System.out.println(z);

        String a = "10";
        String b = "20";
        String c = a + b;  // "1020"
        System.out.println(c);


        /*
        ----------------------------------------------------
        Escape Characters in Strings
        - Used to insert special characters inside strings.
        Common ones:
            \' → Single quote
            \" → Double quote
            \\ → Backslash
        Example:
            "My name is \"Abu\"" → My name is "Abu"
        ----------------------------------------------------
        */
        String fullName = "My full Name is \"Abu Huziffa\"";
        System.out.println(fullName);


        /*
        ----------------------------------------------------
        Special Escape Sequences
            \n → New Line
            \r → Carriage Return
            \t → Tab
            \b → Backspace
            \f → Form Feed
        Example:
            "1. Electronics\n2. Furniture"
        ----------------------------------------------------
        */
        System.out.println("1. Electronics\n2. Furniture");
    }
}
