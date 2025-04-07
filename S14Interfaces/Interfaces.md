## Interfaces  
- Used for achieving complete polymorphism. While abstract classes can also be used for same.
- ![image](https://github.com/user-attachments/assets/638a0c98-ed39-4783-b422-6a430f62be29)
- Like in the above image here asbtract class Test1 has nothing to share except the abstract methods, so its forcing the Test2 to give implementation for all the abstract methods
  at such a scenario we can say that the abstract class is trying to achieve polymorphism.  
- #### **Instead of above way we can write interface - which is abstract class with all abstract methods.
-  In interface as you see above by default the methods we write would be asbtract and public so we can write only void meth1();
- #### Classes are extended and Interfaces are Implemented.  
- #### Both in abstract classes and interfaces we can have the reference of the superclass and object of the child class extending or implementing it.  
- #### When a class extends it can extend only one class and when an interface implements it can implement multiple classes.
- Interfaces are made only for overriding and definately they are used for run time polymorphism and for Dynamic method dispatch.
- Dynamic Method Dispatch is a mechanism in Java where the call to an overridden method is resolved at runtime, not compile-time. This enables runtime polymorphism – the ability of the Java Virtual Machine (JVM) to decide which version of a method to call based on the actual object type, not the reference type.
- ![image](https://github.com/user-attachments/assets/d706cc0a-69b8-4f1a-a477-f15d98bf8212)
- Here Camera can be a class because we have DLSR camera as seperate entity, but here camera is like part of phone so it can be Interface and u can specify it as 'ICamera' also.
- 


