// File: D_Variables.java
public class D_Variables {

    public static void main(String[] args) {
        // Syntax: type variableName = value;

        // String Variable
        String name = "Huzaifa";
        System.out.println("Name: " + name);

        // Integer Variable
        int n = 15;
        System.out.println("n = " + n);

        int n2 = 34;
        System.out.println("n2 = " + n2); // 34
        n2 = 345; // reassign new number
        System.out.println("n2 (after update) = " + n2); // 345

        // Final Variable (constant → cannot be changed)
        final int number = 334;
        // number = 345; lowed

        // Common variable types in Java:
        // int, String, char, float, double, boolean, ...

        // ---------------------------------
        // How to print multiple variables
        // ---------------------------------
        int number2 = 234;
        String firstname = "Abu";
        String lastname = "Huzaifa";
        String fullName = firstname + " " + lastname;

        System.out.println("Full Name: " + fullName);

        // Multiple variables
        int x = 34;
        int y = 86;
        float z = 456.5f;
        char ch = 'g';
        int ch2 = 'a'; // char value converted to int (ASCII code)

        System.out.println("x + y + z = " + (x + y + z));
        System.out.println("ch + ch2 = " + (ch + ch2));

        // ---------------------------------
        // Real-Life Example: Student Data
        // ---------------------------------
        String studentName = "Huzaifa";
        int studentID = 101;
        int studentAge = 23;
        float studentFee = 75.25f;
        char studentGrade = 'A';

        System.out.println("\n--- Student Information ---");
        System.out.println("Student name: " + studentName);
        System.out.println("Student id: " + studentID);
        System.out.println("Student age: " + studentAge);
        System.out.println("Student fee: " + studentFee);
        System.out.println("Student grade: " + studentGrade);
    }
}
