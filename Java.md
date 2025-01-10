## Java  
OOPs is a concept and different langauges implement it with there own syntax.  
Class- blue Print             Object- Real Entity  
Logical                        real  
Properties(Data)               Properties(Data)  
Behaviour(Methods)             Behaviour(Methods) 
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

