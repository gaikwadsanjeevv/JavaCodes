package J2OOPS;

public class E1Car {
    String brand = "Toyota";
    int speed = 75;

    void drive() {
        System.out.println(brand + " is driving at " + speed + " km/hr");
    }

    public static void main(String[] args) {
        E1Car myCar = new E1Car();
        myCar.drive();
    }
}