abstract class Shapes {
    abstract double perimeter();
    abstract double area();
}

class Circle extends Shapes {
    double radius;

    // Constructor to initialize the radius
    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shapes {
    double length, width;

    // Constructor to initialize length and width
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double perimeter() {
        return 2 * (length + width);
    }

    @Override
    public double area() {
        return length * width;
    }
}

public class CalculateShapes {
    public static void main(String[] args) {
        Shapes circle = new Circle(5.0); // Create a Circle with radius 5
        System.out.println("Circle Perimeter: " + circle.perimeter());
        System.out.println("Circle Area: " + circle.area());

        Shapes rectangle = new Rectangle(4.0, 6.0); // Create a Rectangle with length 4 and width 6
        System.out.println("Rectangle Perimeter: " + rectangle.perimeter());
        System.out.println("Rectangle Area: " + rectangle.area());
    }
}
