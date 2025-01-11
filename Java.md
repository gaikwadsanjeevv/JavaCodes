## Java  
OOPs is a concept and different langauges implement it with there own syntax.  
Class- blue Print--> Logical --> Properties(Data), Behaviour(Methods)  
Object- Real Entity --> real --> Properties(Data), Behaviour(Methods)  
new keyword: It allocates a dynamic memory allocation to create objects. 
### Constructor  
1. Default Constructor  
A default constructor is a constructor that does not take any parameters.  
If you do not define any constructor in a class, Java provides a default constructor automatically.  
The default constructor initializes the object with default values (e.g., null for objects, 0 for integers, and false for booleans).  
``` Java
class MyClass {
    // No constructor explicitly defined
}

public class Main {
    public static void main(String[] args) {
        MyClass obj = new MyClass(); // Java provides a default constructor
    }
}
```
2. Non-Parameterized Constructor  
A non-parameterized constructor is explicitly defined by the programmer and does not take any arguments.  
It serves the same purpose as a default constructor but is explicitly coded
```Java
class MyClass {
    MyClass() {
        System.out.println("Non-Parameterized Constructor");
    }
}

public class Main {
    public static void main(String[] args) {
        MyClass obj = new MyClass(); // Calls the non-parameterized constructor
    }
}

```
3. Parameterized Constructor  
A parameterized constructor is defined with parameters, allowing you to pass arguments when creating an object.  
Useful for initializing objects with specific values  
```java
class MyClass {
    int value;

    // Parameterized Constructor
    MyClass(int val) {
        value = val;
        System.out.println("Parameterized Constructor: Value = " + value);
    }
}

public class Main {
    public static void main(String[] args) {
        MyClass obj = new MyClass(10); // Passes value 10 to the constructor
    }
}
```
#### Constructor Overloading  
 ![image](https://github.com/user-attachments/assets/ba1ce62f-9b6a-4537-ae7a-2d7c256ca607)  
 - At least one condition must be there for construction overloading
       - number of Argument different
       - Type of Argument different
       - Order of arguments may differ

- Method overloading- Having multiple methods in same class with same name.
      - Number of argu. Different
      - Type of argument different
      - Order of arguments may differ

- This Keyword:
      - Refer current invoking object
      - For calling current class constructor from inside different constructor of same class.
  ![image](https://github.com/user-attachments/assets/58817fba-e4ee-483f-a8d5-cdd944302a2d)
  ![image](https://github.com/user-attachments/assets/31a81dfa-73f9-46b7-8ba4-99b7efbe1597)
  ![image](https://github.com/user-attachments/assets/b760ff4c-ba1a-4623-bd9b-ee068585e160)
  ![image](https://github.com/user-attachments/assets/100ed5e1-a5a7-4fe7-b1b8-597c509d453d)
  ![image](https://github.com/user-attachments/assets/bdb0f67b-5935-44e1-b8d0-6f6f04d39e70)
  ![image](https://github.com/user-attachments/assets/a5e5bc16-8965-4725-bdee-bdde836732b5)
  ![image](https://github.com/user-attachments/assets/2e4b4f08-f21b-4106-b9ed-4d8e9bb6fe74)
  ![image](https://github.com/user-attachments/assets/46b3f702-b952-4337-bafb-bb87025fa75b)
  ![image](https://github.com/user-attachments/assets/1cefae4d-f351-43f9-b306-4bedb8286dc0)
  #### Inheritance
  It is a mechanism in java by which one class is allowed to inherit the feature of another class.
  - Done by extend keyword.
   class Dog extends Animal
  {  

  }
  ![image](https://github.com/user-attachments/assets/d0a37181-58cb-452a-ab57-97c93f9dc4f3)
  ![image](https://github.com/user-attachments/assets/28badbd3-327b-4406-bf27-092a1d9c3127)
  ![image](https://github.com/user-attachments/assets/9a37bd1a-4104-45f8-b40f-3c4c60115b3e)
  ![image](https://github.com/user-attachments/assets/eed72c07-6cf2-4613-8b64-485b09fcf858)
  ```Java
  What is an Interface in Java?
An interface in Java is a blueprint of a class. It contains abstract methods (methods without a body) and constants. Interfaces are used to define a contract that a class must adhere to, ensuring a common behavior across unrelated classes.

Why was the Interface Concept Introduced in Java?
Achieve Multiple Inheritance Safely:

Java doesn't support multiple inheritance with classes to avoid the "Diamond Problem", where ambiguities arise if a class inherits the same method from two parent classes.
Interfaces solve this by only declaring methods, leaving the implementing class responsible for providing their definitions, avoiding ambiguity.
Encapsulation of Behavior:

An interface allows developers to define common behavior without enforcing how it's implemented. Different classes can implement the same interface but define the behavior differently.
Flexibility and Loose Coupling:

Interfaces provide a way to achieve loose coupling by separating the definition (what should be done) from the implementation (how it should be done).
Polymorphism:

Using interfaces, a class can behave like multiple types, enabling runtime polymorphism.
```
![image](https://github.com/user-attachments/assets/c10ecc7e-14c0-4744-98a5-ca430752671a)

```java
Multiple Inheritance
Java strictly does not support multiple inheritance with classes.

This is to avoid issues like the Diamond Problem, where ambiguities arise if a class inherits from two classes that have the same method or variable.
Java supports multiple inheritance with interfaces.

A class can implement multiple interfaces because interfaces only declare method signatures, and there is no method implementation in interfaces (until Java 8, which introduced default methods, still handled safely).
If two interfaces have methods with the same name, the implementing class provides the resolution, avoiding ambiguity.
Hybrid Inheritance
Java does not directly support hybrid inheritance with classes.

Since hybrid inheritance often involves multiple inheritance (at some point), Java restricts it if classes are involved.
Java supports hybrid inheritance through interfaces.

Hybrid inheritance works when you use interfaces because Java allows multiple interfaces to be extended or implemented by a single class.
Simplified Conclusion
No multiple inheritance for classes: Java strictly disallows it to prevent ambiguity.
Supports multiple inheritance with interfaces: Fully supported and safe.
Hybrid inheritance: Partially supported using interfaces, not with classes.
```
 ### Hybrid Inheritance  
 ![image](https://github.com/user-attachments/assets/12fe0213-22f3-43e9-a8eb-de0db55590e0)  
 ```java
Hybrid Inheritance in Java
Hybrid inheritance is a combination of two or more types of inheritance (single, multilevel, multiple, hierarchical). It allows the features of different inheritance types to be used together. However, Java does not directly support hybrid inheritance with classes due to the ambiguity caused by multiple inheritance (like the Diamond Problem). But hybrid inheritance can be achieved using interfaces.

Explanation of the Diagram
The diagram represents a case where:

A is the parent of B and C (Hierarchical Inheritance).
B and C both act as parents of D (Multiple Inheritance).
This is an example of hybrid inheritance where:

Hierarchical Inheritance occurs between A -> B and A -> C.
Multiple Inheritance occurs between B, C -> D.
Why Java Doesn’t Support Hybrid Inheritance with Classes
If Java allowed multiple inheritance with classes, the following ambiguity (Diamond Problem) would occur:

Class B inherits a method from A.
Class C also inherits the same method from A.
Class D inherits from both B and C.
Ambiguity: If D calls the method, the compiler cannot determine whether to use the method from B or C.

Solution in Java: Using Interfaces
Java supports hybrid inheritance safely using interfaces instead of classes. Since interfaces only declare method signatures, the implementing class resolves ambiguities by providing a concrete implementation.
```
```java
Example of Hybrid Inheritance with Interfaces
// Parent interface
interface A {
    void displayA();
}

// Child interfaces extending A
interface B extends A {
    void displayB();
}

interface C extends A {
    void displayC();
}

// Class implementing both B and C
class D implements B, C {
    public void displayA() {
        System.out.println("Display from A");
    }

    public void displayB() {
        System.out.println("Display from B");
    }

    public void displayC() {
        System.out.println("Display from C");
    }
}

public class Main {
    public static void main(String[] args) {
        D obj = new D();
        obj.displayA(); // Output: Display from A
        obj.displayB(); // Output: Display from B
        obj.displayC(); // Output: Display from C
    }
}
Explanation
A is a parent interface.
B and C are child interfaces extending A (hierarchical inheritance).
D implements both B and C (multiple inheritance).
Class D resolves all method implementations.
```
##### Advantages of Hybrid Inheritance  
Code Reusability: Allows the reuse of functionality from parent classes/interfaces.  
Flexibility: Combines benefits of multiple inheritance with safety provided by Java interfaces.  
Avoids Ambiguity: The implementing class resolves method conflicts, avoiding the Diamond Problem.  

##### Super Keyword  
![image](https://github.com/user-attachments/assets/7c605235-98bb-4e1b-8833-858ea62ea813)  
```Java
class Parent {
    String name = "Parent";
}

class Child extends Parent {
    String name = "Child";

    void display() {
        System.out.println(name);       // Refers to Child's variable
        System.out.println(super.name); // Refers to Parent's variable
    }
}

public class Main {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.display();
        // Output:
        // Child
        // Parent
    }
}
```
#### Call Parent Class's Methods  

When the child class overrides a method from the parent class, super can be used to call the overridden method of the parent class.  
```Java
class Parent {
    void display() {
        System.out.println("Parent's display method");
    }
}

class Child extends Parent {
    void display() {
        System.out.println("Child's display method");
        super.display(); // Calls Parent's display method
    }
}

public class Main {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.display();
        // Output:
        // Child's display method
        // Parent's display method
    }
}
```
Invoke Parent Class's Constructor  

The super() keyword is used to explicitly call the constructor of the immediate parent class.  
It must be the first statement in the child class constructor.  
```java
class Parent {
    Parent(String message) {
        System.out.println("Parent Constructor: " + message);
    }
}

class Child extends Parent {
    Child() {
        super("Hello from Parent"); // Calls Parent's constructor
        System.out.println("Child Constructor");
    }
}

public class Main {
    public static void main(String[] args) {
        new Child();
        // Output:
        // Parent Constructor: Hello from Parent
        // Child Constructor
    }
}
```
Access Parent Class's Hidden Static or Instance Methods  

If a child class defines a static or instance method that has the same name as a parent class's method, super can be used to explicitly call the parent class's version (for instance methods only, as super cannot be used for static methods).  
![image](https://github.com/user-attachments/assets/3661f3be-447c-4a7c-ad59-376b67f0df9a)  
So while using this and super keyword it must be first line to get execution as follow:  
![image](https://github.com/user-attachments/assets/45be4af2-b782-49c6-b1df-725dedec3f2c)  









  

  
  

  

  

  




   
 

