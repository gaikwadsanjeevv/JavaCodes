public class NestedTernaryExample {
    public static void main(String[] args) {
        int score = 85;

        // Using nested ternary operators in one line to determine grade
        String grade = (score >= 90) ? "A" : (score >= 80) ? "B" : (score >= 70) ? "C" : (score >= 60) ? "D" : "F";

        System.out.println("The grade for a score of " + score + " is " + grade + ".");
    }
}
