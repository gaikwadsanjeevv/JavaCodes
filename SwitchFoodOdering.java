import java.util.Scanner;

public class FoodOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Food Ordering System!");
        System.out.println("Select an item to know its price:");
        System.out.println("1. Pizza");
        System.out.println("2. Burger");
        System.out.println("3. Pasta");
        System.out.println("4. Salad");

        int choice = scanner.nextInt(); // User input for choice

        // Using switch case to display price based on user choice
        switch (choice) {
            case 1:
                System.out.println("Pizza: $10.99");
                break;
            case 2:
                System.out.println("Burger: $6.99");
                break;
            case 3:
                System.out.println("Pasta: $8.49");
                break;
            case 4:
                System.out.println("Salad: $5.99");
                break;
            default:
                System.out.println("Invalid choice! Please select a valid item.");
                break;
        }

        scanner.close();
    }
}
