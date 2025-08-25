public class L_SwitchStatements {
    public static void main(String[] args) {

        /*
         * 1. Switch Case
         * -------------------------------------------------
         * - Uses "case" with "break"
         * - If you forget break, it will "fall through"
         */
        int day = 4;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day");
        }

        /*
         * 2. Enhanced Switch with Arrow Syntax (Java 14+)
         * -------------------------------------------------
         * - Uses "->" instead of colon
         * - No need for break
         * - Prevents fall-through automatically
         */
        switch (day) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
            default -> System.out.println("Invalid day");
        }

        /*
         * 3. Switch Expression (Java 14+)
         * -------------------------------------------------
         * - Switch can return a value directly
         * - Useful for assigning results to variables
         */
        String dayName = switch (day) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            case 7 -> "Sunday";
            default -> "Invalid day";
        };
        System.out.println(dayName);

        /*
         * 4. Multi-Label Case (Java 14+)
         * -------------------------------------------------
         * - Multiple values can share one case
         * - Example: grouping weekdays and weekends
         */
        String typeOfDay = switch (day) {
            case 1, 2, 3, 4, 5 -> "Weekday";
            case 6, 7 -> "Weekend";
            default -> "Unknown";
        };
        System.out.println(typeOfDay);

    }
}
