import java.util.Scanner;

public class AdditionScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

      int  c = a + b;
      System.out.println("Sum: "+ c);

    }
}