/package J2OOPS;

public class E2CarObjects {
    String brand;
    int speed;

    void drive() {
        System.out.println(brand + " is driving at " + speed + " km/h");
    }

    public static void main(String[] args) {
        E2CarObjects car1 = new E2CarObjects();  // Creating an object
        car1.brand = "Toyota";
        car1.speed = 120;
        car1.drive();
    }
}
