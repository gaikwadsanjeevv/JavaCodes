abstract class Super {

    public void method1() {
        System.out.println("I'm Method one");
    }

    abstract void method2();
}

class Sub extends Super {
    @Override
    public void method2() {
        System.out.println("I'm Method 2");
    }
}

public class AbstractClass {
    public static void main(String[] args) {
        Super s = new Sub(); 
        s.method1();
        s.method2();
    }
}
