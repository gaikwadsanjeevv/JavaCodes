import java.util.Scanner;

public class BankingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double balance = 1000.00; // Initial balance
        boolean exit = false; // Flag to exit the system

        System.out.println("Welcome to the Simple Banking System!");

        while (!exit) {
            System.out.println("\nPlease choose an option:");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");

            int choice = scanner.nextInt(); // User input for choice

            switch (choice) {
                case 1: // Check Balance
                    System.out.println("Your current balance is: $" + balance);
                    break;
                case 2: // Deposit Money
                    System.out.println("Enter the amount to deposit:");
                    double depositAmount = scanner.nextDouble();
                    if (depositAmount > 0) {
                        balance += depositAmount;
                        System.out.println("Successfully deposited $" + depositAmount);
                        System.out.println("Your new balance is: $" + balance);
                    } else {
                        System.out.println("Invalid deposit amount! Please enter a positive number.");
                    }
                    break;
                case 3: // Withdraw Money
                    System.out.println("Enter the amount to withdraw:");
                    double withdrawAmount = scanner.nextDouble();
                    if (withdrawAmount > 0 && withdrawAmount <= balance) {
                        balance -= withdrawAmount;
                        System.out.println("Successfully withdrew $" + withdrawAmount);
                        System.out.println("Your new balance is: $" + balance);
                    } else if (withdrawAmount > balance) {
                        System.out.println("Insufficient balance! Your current balance is: $" + balance);
                    } else {
                        System.out.println("Invalid withdrawal amount! Please enter a positive number.");
                    }
                    break;
                case 4: // Exit
                    System.out.println("Thank you for using the Simple Banking System. Goodbye!");
                    exit = true;
                    break;
                default: // Invalid option
                    System.out.println("Invalid choice! Please select a valid option.");
                    break;
            }
        }

        scanner.close();
    }
}
