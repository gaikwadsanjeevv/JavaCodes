### Abstract Class and Concrete class  

- we write abstract before any class it is abstract class while rest other are concrete class.  
- You cannot create the object of abstract class like normal general concrete class.
- We can create reference of object in abstract.
- When we write abstract before method and has no body- undefined method is abstract method.
- So when we have atleast one abstract method then class is definately abstract.
- Take a case below:
```java
abstract class Super
{
super()
{
s.o.p("Super");

void method1()
{
s.o.p("Super Method");

abstract void method2();  //abstract method- comes with no definition
}
-------------------------------------------------
class Sub extends Super
{
void method2()
{
s.o.p("sub method2");
```
- In the above case when sub class extend the Super class it becomes abstract class but when we override all the abstract methods of abstract class and define it with implementation as done above
-  we then make the sub class as concrete class because it now dont have any abstract class.
-  So when we make a class as abstract it dont necessarily need to have a abstract method. But if the method is abstract then class need to be abstract.
-  Such abstract classes is used only for Inheritance
-  In above programee we can do super class reference and sub class object  like: Super s = new Sub();

#### Why we need abstract classes  
- abstract classes is used for defining and imposing standards.
- ![image](https://github.com/user-attachments/assets/eb2abfaf-0348-48e4-b713-3f1e48803827)
- So for the above example we say abstract class cant create an object, now here abstract class Hospital is like a governing body giving guidelines
  for making an new hospitals. So definately we cant ask them to show there own hospital which we call as object creation. So abstract class and abstract
  method shows guidelines for making new hospitals.
- But we can refer the abstract class to one hospital which im creating. people may refer to myHospital as Hospital because i implemented the
  standards of abstract Hospital.
  Hospital h = new MyHospital();
  h.emergency()
- Methods are called based on the object, here is MyHospital
Example 2:
![image](https://github.com/user-attachments/assets/74c77118-5afd-4d70-ba24-33a5d2059d09)
- SO here KFC have a specific menu implementation they give constructor and making Items, which all outlets have to follow so that method wont be abstract.
- Also KFC want the outlets to have billing and offer they have the standard but leave at the choice of the outlet to have there own implementation.
- SO like for a Franchaise company gives something and leaves something for the company to override them for outlet.
- I can i reference of KFC
  KFC k = new MyKFC();
  k.billing();
  Example 3: Circle and Rectangle extends from shape.   
  - Do's and Dont in the Abstract Class.
  ![image](https://github.com/user-attachments/assets/f5033e72-4237-47bb-b377-0df22c22f4bd)

```java


abstract class Shape {

    abstract public double peremeter();

    abstract public double area(); 
}

class Circle extends Shape{
    double radius;

    public double peremeter()
    {
        return 2*Math.PI*radius;
    }
    public double area()
    {
        return Math.PI*radius*radius;
    }
}

class Rectangle extends Shape{
    double length;
    double breadth;

    public double peremeter()
    {
        return 2*(length*breadth);
    }
    public double area()
    {
        return length*breadth;
    }

}
public class Abstract{
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.length = 10;
        r.breadth = 5;
        System.out.println(r.area());
        //i can also call the reference of super class
        Shape s = r;
        System.out.println(s.area());
    }
}
```
##### Rules to follow for abstract class  
- If i have a abstract class i can have a reference of the abstract class but i cant create the object.
- If class is abstract i dont need to have abstract method.  
- If the method is abstract then the class need to be abstract.  
##### If the class is abstract i cannnot make it final because final classes cannot be extended but abstract classes are ment to extend.  
- I cannot use final in abstract method because then i cant override it, because abstract classes are ment to be overridden.
#### Mostly nested classes are declared as static; Cannot use static keyword in abstract class and asbtract method because static method must have its body.  
![image](https://github.com/user-attachments/assets/bd475991-758e-4884-8dd4-2ca420bdde58)  


-  
    

  

  
