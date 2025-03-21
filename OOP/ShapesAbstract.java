abstract class Shapes {
    
    abstract void peremeter();

    abstract void area();
}

class Circle extends Shapes{

@Override
    void peremeter() {
        System.out.println("Im peremeter of Circle");
    }
    void area() {
        System.out.println("Iam area of Circle");
    }
}
class Rectangle extends Shapes{
    @Override
    void peremeter() {
        System.out.println("Im peremeter of Rectangle");
    }
    void area() {
        System.out.println("Iam area of Rectangle");
    }
}


public class ShapesAbstract {

    public static void main(String[] args) {
        Shapes s = new Circle();
        s.peremeter();
        s.area();
        Shapes t = new Rectangle();
        t.peremeter();
        t.area();
        
    }
    
}
//
PS D:\coding\java> java ShapesAbstract
Im peremeter of Circle
Iam area of Circle
Im peremeter of Rectangle
Iam area of Rectangle
PS D:\coding\java> 
