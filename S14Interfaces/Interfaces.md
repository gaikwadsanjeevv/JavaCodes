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
#### Exercise:  Call Back Method  
```java
package scinterface1;

interface Member
{
    public void callback();
}

class Store
{
    Member members[]=new Member[10];
    int count=0;
       
    void register(Member m)
    {
        members[count++]=m;
    }
    void inviteSale()
    {
        for(int i=0;i<count;i++)
            members[i].callback();
    }
    
}

class Customer implements Member
{
    String name;
    
    Customer(String n)
    {
        name=n;
    }
    public void callback()
    {
        System.out.println("Ok, I will visit,"+name);
        
        
    }
    
}

public class SCInterface1 {

    
    public static void main(String[] args) 
    {
        Store s=new Store();
        Customer c1=new Customer("John");
        Customer c2=new Customer("Smith");
        
        s.register(c1);
        s.register(c2);
        
        s.inviteSale();
    }
    
}
```
- The methods of Interfaces are by default public and abstract, even if we write both is not an error.
- We cannot private access modifier to methods inside interface.
- The variables declared inside interface they are by default final and static.
- Interface can have static methods also with body.
- When here for method and variable i have static keyword access so we can access then by class name.
- #### An Interface can extend from another interface.
![image](https://github.com/user-attachments/assets/24193d91-51f5-4572-b795-3915e39c821a)  
- From java 8 onwards default modifier can also be used to methods inside interfaces.
![image](https://github.com/user-attachments/assets/f1773a42-f9bd-4cea-813f-2e9297cc2cae)
- Look the code carefully assume initially there was meth1 and 2 only in interface Test and then i created classes to implement it, Now i future i want to add another new method in Test
  then can be done by putting default to method so as not to disturb the existing classes, but future classes can implement it,
  now i can go ahead an override the meth3 which was default in above prog but it wont see any output because the overrided method is called which has empty implementation.
  - #### we can write private methods in interface but which are not abstract:  private void meth3() {}
  - We can call the private methods inside the default methods if that situation arises because we cannot override the private method inside the interface only.  
  ![image](https://github.com/user-attachments/assets/c8458f71-1fe7-4750-a7dd-af970c0823ab)
 ![image](https://github.com/user-attachments/assets/3fee8ee0-e15a-40d9-99e2-99c9f7432e05)
- Dotted lines show the relationship of interface implementation.  
🔹 Java doesn't support multiple class inheritance to avoid conflicts.  
🔹 But it supports multiple interface inheritance to allow flexibility, reusability, and polymorphism without ambiguity.  

 


  




