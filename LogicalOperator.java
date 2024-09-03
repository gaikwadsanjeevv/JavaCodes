public class LogicalOperatorsExample {
    public static void main(String[] args) {
        // Declare four boolean variables
        boolean a = true;
        boolean b = false;
        boolean c = true;
        boolean d = false;

        // Logical AND (&&) operator
        boolean andResult1 = a && b;  // false (true AND false)
        boolean andResult2 = a && c;  // true (true AND true)
        boolean andResult3 = b && d;  // false (false AND false)

        // Logical OR (||) operator
        boolean orResult1 = a || b;   // true (true OR false)
        boolean orResult2 = b || d;   // false (false OR false)
        boolean orResult3 = c || d;   // true (true OR false)

        // Logical NOT (!) operator
        boolean notResult1 = !a;  // false (NOT true)
        boolean notResult2 = !b;  // true (NOT false)

        // Logical XOR (^) operator
        boolean xorResult1 = a ^ b;  // true (true XOR false)
        boolean xorResult2 = a ^ c;  // false (true XOR true)
        boolean xorResult3 = b ^ d;  // false (false XOR false)

        // Display results
        System.out.println("Logical AND (&&) Results:");
        System.out.println("a && b: " + andResult1);
        System.out.println("a && c: " + andResult2);
        System.out.println("b && d: " + andResult3);

        System.out.println("\nLogical OR (||) Results:");
        System.out.println("a || b: " + orResult1);
        System.out.println("b || d: " + orResult2);
        System.out.println("c || d: " + orResult3);

        System.out.println("\nLogical NOT (!) Results:");
        System.out.println("!a: " + notResult1);
        System.out.println("!b: " + notResult2);

        System.out.println("\nLogical XOR (^) Results:");
        System.out.println("a ^ b: " + xorResult1);
        System.out.println("a ^ c: " + xorResult2);
        System.out.println("b ^ d: " + xorResult3);

        // Combining Logical Operators
        boolean combinedResult1 = (a && b) || (c && d); // false OR false -> false
        boolean combinedResult2 = (a || b) && (!c || d); // true AND false -> false
        System.out.println("\nCombining Logical Operators:");
        System.out.println("(a && b) || (c && d): " + combinedResult1);
        System.out.println("(a || b) && (!c || d): " + combinedResult2);
    }
}
