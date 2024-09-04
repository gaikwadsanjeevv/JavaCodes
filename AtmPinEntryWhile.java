import java.util.Scanner;

public class ATMPinSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int CORRECT_PIN = 1234; // Correct PIN for the ATM
        int attempts = 0; // Number of attempts made
        final int MAX_ATTEMPTS = 3; // Maximum number of attempts allowed

        while (attempts < MAX_ATTEMPTS) { // Loop until max attempts are reached
            System.out.println("Enter your PIN:");
            int enteredPin = scanner.nextInt(); // User input for PIN

            if (enteredPin == CORRECT_PIN) {
                System.out.println("PIN correct. Access granted!");
                break; // Exit the loop if the PIN is correct
            } else {
                attempts++; // Increment the attempt count
                System.out.println("Incorrect PIN. Attempts left: " + (MAX_ATTEMPTS - attempts));
            }
        }

        if (attempts == MAX_ATTEMPTS) { // If maximum attempts are reached
            System.out.println("Maximum attempts reached. Your account is temporarily blocked.");
        }

        scanner.close();
    }
}
