public class J_Booleans {
    public static void main(String[] args) {

        /*
        ----------------------------------------------------
        Booleans in Java
        - A boolean data type has only two possible values:
            true or false
        - Used in conditions, comparisons, and control flow.
        ----------------------------------------------------
        */

        boolean isJavaFun = true;
        boolean isFishTasty = false;
        System.out.println("Is Java Fun? " + isJavaFun);      // true
        System.out.println("Is Fish Tasty? " + isFishTasty);  // false


        /*
        ----------------------------------------------------
        Boolean Expressions
        - A boolean expression returns true or false.
        - Often used with comparison operators.
        Example:
            int x = 10, y = 9;
            (x > y) → true
        ----------------------------------------------------
        */
        int x = 10;
        int y = 9;
        System.out.println(x > y);  // true
        System.out.println(x == y); // false
        System.out.println(x < y);  // false


        /*
        ----------------------------------------------------
        Using Booleans in if-else
        - Booleans are commonly used in decision making.
        Example:
            if (age >= 18) { ... }
        ----------------------------------------------------
        */


        /*
        ----------------------------------------------------
        Logical Operators with Booleans
        - Combine or modify boolean values.
            && (AND), || (OR), ! (NOT)
        Example:
            (x > y && age > 18) → true
        ----------------------------------------------------
        */
                // NOT true → false


        /*
        ----------------------------------------------------
        Boolean Wrapper Class
        - Besides primitive boolean, Java has Boolean class.
        - Provides methods for parsing and converting.
        Example:
            Boolean.parseBoolean("true") → true
            Boolean.toString(true) → "true"
        ----------------------------------------------------
        */
        Boolean boolObj = Boolean.valueOf(true);
        System.out.println("Boolean object: " + boolObj);

        boolean parsed = Boolean.parseBoolean("true");
        System.out.println("Parsed boolean: " + parsed);

        String boolStr = Boolean.toString(false);
        System.out.println("Boolean as String: " + boolStr);
    }
}
