// Superclass
class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }
}

// Intermediate subclass
class Dog extends Animal {
    void bark() {
        System.out.println("The dog barks.");
    }
}

// Derived subclass
class Puppy extends Dog {
    void weep() {
        System.out.println("The puppy weeps.");
    }
}

public class MultilevelInheritanceDemo {
    public static void main(String[] args) {
        Puppy puppy = new Puppy();
        puppy.eat();  // Inherited from Animal
        puppy.bark(); // Inherited from Dog
        puppy.weep(); // Specific to Puppy
    }
}
