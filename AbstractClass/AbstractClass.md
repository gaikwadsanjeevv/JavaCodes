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
- 

  
