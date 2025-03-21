package JavaGenerics;



public class E4GenericMethod {
    public static <T> void printArray(T[ ] array) {
        for(T elements :  array) {
            System.out.println(elements);
        }
    }
    public static void main(String[] args) {
        String [ ] string = {"A", "B", "C"};
        Integer[ ] integer = {1,2,3,4};
        System.out.println(string);
        System.out.println(integer);
    }


}
