class Animal {
    private String name;
    private int age;

    // Default constructor
    public Animal() {
        // Default values for the animal
        this.name = "Unnamed Animal";
        this.age = 0;
        System.out.println("Default constructor called: Name and age set to default values.");
    }

    // Parameterized constructor
    public Animal(String name, int age) {
        // Set the animal's name and age with the provided arguments
        this.name = name;
        this.age = age;
        System.out.println("Parameterized constructor called: Name and age set to specified values.");
    }

    // Non-parameterized constructor (also a default constructor)
    public Animal(String name) {
        // Setting a name with a default age
        this.name = name;
        this.age = 0; // Default age
        System.out.println("Non-parameterized constructor called: Name set to specified value, age set to default.");
    }

    // Method to display the animal's information
    public void displayInfo() {
        System.out.println("Animal Name: " + name + ", Age: " + age);
    }
}

public class ConstructorDemo2 {
    public static void main(String[] args) {
        // Creating an object using the default constructor
        Animal animal1 = new Animal(); // Calls the default constructor
        animal1.displayInfo(); // Output: Name: Unnamed Animal, Age: 0

        // Creating an object using the parameterized constructor
        Animal animal2 = new Animal("Lion", 5); // Calls the parameterized constructor
        animal2.displayInfo(); // Output: Name: Lion, Age: 5

        // Creating an object using the non-parameterized constructor
        Animal animal3 = new Animal("Elephant"); // Calls the non-parameterized constructor
        animal3.displayInfo(); // Output: Name: Elephant, Age: 0
    }
}
