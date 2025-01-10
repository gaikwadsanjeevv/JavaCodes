class Human
{
   private  int age;
   private  String name;

   public int getAge()    //when we make variable private we can acces it by methods in same class
   {
    return age;
   }
   public void setAge(int a ){
age = a;
   }
   public String getName() {
    return name;
   }

   public void setName(String n) {
    name = n;
   }
}

public class EncapsulationDemo {
    public static void main(String[] args) {
        
        Human obj = new Human();
      obj.setAge(30);
      obj.setName("Sanjeev");
      System.out.println(obj.getName() + " : " + obj.getAge());
    }
}
