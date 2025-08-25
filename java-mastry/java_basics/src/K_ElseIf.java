public class K_ElseIf {

    public static void main(String[] args) {

        /*
        ----------------------------------------------------
        The if Statement
        - Used to execute a block of code only if a condition is true.
        Syntax:
            if (condition) {
                // code to run if condition is true
            }
        Example:
            if (20 > 13) {
                System.out.println("20 is greater than 13");
            }
        ----------------------------------------------------
        */
        boolean isJavaFun = true;
        if (isJavaFun) {
            System.out.println("Yes! Java is Fun");
        }

        if (20 > 13) {
            System.out.println("20 is greater than 13");
        }

        if (20 < 13) {
            System.out.println("13 is lower than 20");
        }


        /*
        ----------------------------------------------------
        The else Statement
        - Used with if. Executes one block if true, another if false.
        Syntax:
            if (condition) {
                // code if true
            } else {
                // code if false
            }
        Example:
            if (time < 18) {
                System.out.println("Good day.");
            } else {
                System.out.println("Good evening.");
            }
        ----------------------------------------------------
        */
        int time = 20;
        if (time < 18) {
            System.out.println("Good day.");
        } else {
            System.out.println("Good evening.");
        }


        /*
        ----------------------------------------------------
        The else if Statement
        - Used to test multiple conditions in sequence.
        - Only the first true block will execute.
        Syntax:
            if (condition1) {
                // code if condition1 true
            } else if (condition2) {
                // code if condition2 true
            } else {
                // code if none are true
            }
        Example:
            if (time < 10) {
                System.out.println("Good morning.");
            } else if (time < 18) {
                System.out.println("Good day.");
            } else {
                System.out.println("Good evening.");
            }
        ----------------------------------------------------
        */
        if (time < 10) {
            System.out.println("Good morning.");
        } else if (time < 18) {
            System.out.println("Good day.");
        } else {
            System.out.println("Good evening.");
        }


        /*
        ----------------------------------------------------
        Shorthand if...else (Ternary Operator)
        - One-line version of if...else.
        Syntax:
            variable = (condition) ? valueIfTrue : valueIfFalse;
        Example:
            String result = (time < 18) ? "Good day." : "Good evening.";
        ----------------------------------------------------
        */
        String result = (time < 18) ? "Good day." : "Good evening.";
        System.out.println(result);
    }
}
