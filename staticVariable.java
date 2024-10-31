class Counter {
    // Static variable shared across all instances
    static int count = 0;

    // Constructor increments the counter each time a new object is created
    Counter() {
        count++; // Increment the static variable
    }

    // Method to display the count
    void displayCount() {
        System.out.println("Number of instances: " + count);
    }
}

public class StaticVariableExample {
    public static void main(String[] args) {
        // Creating objects of the Counter class
        Counter obj1 = new Counter();
        obj1.displayCount(); // Output: Number of instances: 1

        Counter obj2 = new Counter();
        obj2.displayCount(); // Output: Number of instances: 2

        Counter obj3 = new Counter();
        obj3.displayCount(); // Output: Number of instances: 3
    }
}
