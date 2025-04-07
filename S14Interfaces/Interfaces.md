## Interfaces  
- Used for achieving complete polymorphism. While abstract classes can also be used for same.
- ![image](https://github.com/user-attachments/assets/638a0c98-ed39-4783-b422-6a430f62be29)
```java
 interface Test {
    void meth1();
    void meth2();
 }
 class My implements Test{
    public void meth1() 
    {
System.out.println("Meth1 of class My");
    }
    public void meth2()
    {
        System.out.println("Meth2 of class My");
    }
    public void meth3()
    {
        System.out.println("Meth3 of class My");
    }
 }



public class InterfacePractice {
    public static void main(String[] args) {
        Test T = new My();
        T.meth1();
        T.meth2();

    }
}
```
- Like in the above image here asbtract class Test1 has nothing to share except the abstract methods, so its forcing the Test2 to give implementation for all the abstract methods
  at such a scenario we can say that the abstract class is trying to achieve polymorphism.  
- #### **Instead of above way we can write interface - which is abstract class with all abstract methods.
-  In interface as you see above by default the methods we write would be asbtract and public so we can write only void meth1();
- #### Classes are extended and Interfaces are Implemented.  
- #### Both in abstract classes and interfaces we can have the reference of the superclass and object of the child class extending or implementing it.  
- #### When a class extends it can extend only one class and when an interface implements it can implement multiple classes.
- Interfaces are made only for overriding and definately they are used for run time polymorphism and for Dynamic method dispatch.
- Dynamic Method Dispatch is a mechanism in Java where the call to an overridden method is resolved at runtime, not compile-time. This enables runtime polymorphism – the ability of the Java Virtual Machine (JVM) to decide which version of a method to call based on the actual object type, not the reference type.
- ![image](https://github.com/user-attachments/assets/8b9cb18f-65b1-4362-83f8-d9ad5ea6da9b)  
- Here Camera can be a class because we have DLSR camera as seperate entity, but here camera is like part of phone so it can be Interface and u can specify it as 'ICamera' also.  
```java
package interfaceexample;

class Phone 
{
    public void call() { System.out.println("Phone call"); }
    public void sms() { System.out.println("Phone sending SMS"); }
}

interface ICamera
{
    void click();
    void record();
}

interface IMusicPlayer
{
    void play();
    void stop();
}

class SmartPhone extends Phone implements ICamera,IMusicPlayer
{
    public void videoCall() { System.out.println("Smart Phone video calling"); }
   
    public void click() { System.out.println("Smart Phone Clicking Photo"); }
    public void record() { System.out.println("Smart Phone recording video"); }
    public void play() { System.out.println("Smart Phone playing music"); }
    public void stop() { System.out.println("Smart Phone stopped playing music"); }

}
public class InterfaceExample 
{

    public static void main(String[] args) 
    {
        IMusicPlayer sp=new SmartPhone();
        sp.play();
        sp.stop();
        
    }
    
}
```


