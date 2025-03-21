package JavaGenerics;

class Box<T> {
    private T item;

    public void setItem(T item) {
        this.item = item;
    }
    public T getItem() {
        return item;
    }
}

public class E3Box {    

    public static void main(String[] args) {
        Box<String> stringBox = new Box<>();            //Box for String
        stringBox.setItem("Book");              
        System.out.println(stringBox.getItem());

        Box<Integer> boxNum = new Box<>();
        boxNum.setItem(42);
        System.out.println(boxNum.getItem());
    }
}
