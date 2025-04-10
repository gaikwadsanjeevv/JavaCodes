### Inner Class  
🔹 Nested Inner Class  
```Java
class Outer {
    int x = 10;

    class Inner {
        int y = 20;

        void innerDisplay() {
            System.out.println(x);  // Accessing outer class variable - Inner class can access the variable of outer class**
            System.out.println(y);  // Accessing inner class variable
        }
    }

    void outerDisplay() {
        Inner i = new Inner();  // Creating instance of inner class
        i.innerDisplay();       // Calling method of inner class
        System.out.println(i.y);  // Accessing inner class variable from outer method.  **Directly outer class cannot access members of inner class but by creating the objects.**
    }

    public static void main(String[] args) {
        Outer outer = new Outer();  // Creating instance of outer class
        outer.outerDisplay();       // Calling outer class method
    }
}


class Test {
    public static void main(String[] args) {
        Outer o = new Outer();          // Creating Outer class object
        o.outerDisplay();               // Calling outerDisplay method

        Outer.Inner i = new Outer().new Inner();  // Creating Inner class object
        i.innerDisplay();                         // Calling innerDisplay method
    }
}
/*
* We get to generate 2 class files
* Outer.class
* Outer$Inner.class
*/
```
