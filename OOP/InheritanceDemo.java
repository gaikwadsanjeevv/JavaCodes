// Superclass
class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }
}

// Subclass
class Dog extends Animal {
    void bark() {
        System.out.println("The dog barks.");
    }
}

public class InheritanceDemo {
    public static void main(String[] args) {
        // Create an object of the subclass
        Dog dog = new Dog();
        
        // Call methods from the subclass
        dog.bark(); // Output: The dog barks.
        
        // Call inherited method from the superclass
        dog.eat();  // Output: This animal eats food.
    }
}
