import java.util.Scanner;
public class a7_IfElse {

    public static void main(String[] args) {
        // Initial balance
        double balance = 5000.00;  // Assume an initial balance
        double depositAmount;
        double withdrawAmount;
        
        // Create a scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Display ATM Menu
        System.out.println("Welcome to the ATM");
        System.out.println("1. Check Balance");
        System.out.println("2. Deposit Money");
        System.out.println("3. Withdraw Money");
        System.out.println("4. Exit");
        System.out.print("Choose an option (1-4): ");

        // Read user's choice
        int choice = scanner.nextInt();

        // If-else statements to handle different cases
        if (choice == 1) {
            // Check balance
            System.out.println("Your current balance is: $" + balance);
        } else if (choice == 2) {
            // Deposit money
            System.out.print("Enter the amount to deposit: ");
            depositAmount = scanner.nextDouble();
            if (depositAmount > 0) {
                balance += depositAmount;
                System.out.println("You have deposited $" + depositAmount + ". Your new balance is: $" + balance);
            } else {
                System.out.println("Invalid deposit amount. Please enter a positive number.");
            }
        } else if (choice == 3) {
            // Withdraw money
            System.out.print("Enter the amount to withdraw: ");
            withdrawAmount = scanner.nextDouble();
            if (withdrawAmount > 0 && withdrawAmount <= balance) {
                balance -= withdrawAmount;
                System.out.println("You have withdrawn $" + withdrawAmount + ". Your remaining balance is: $" + balance);
            } else if (withdrawAmount > balance) {
                System.out.println("Insufficient funds. Your current balance is: $" + balance);
            } else {
                System.out.println("Invalid withdrawal amount. Please enter a positive number.");
            }
        } else if (choice == 4) {
            // Exit
            System.out.println("Thank you for using our ATM. Goodbye!");
        } else {
            // Invalid choice
            System.out.println("Invalid choice. Please select a valid option (1-4).");
        }

        // Close the scanner object
        scanner.close();
    }
}
