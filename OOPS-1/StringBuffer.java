public class StringBufferExample {
    public static void main(String[] args) {
        // Creating a StringBuffer object
        StringBuffer sb = new StringBuffer("Hello");

        // Appending to the StringBuffer
        sb.append(" World!");
        System.out.println("After append: " + sb); // Output: Hello World!

        // Inserting a string
        sb.insert(6, "Java ");
        System.out.println("After insert: " + sb); // Output: Hello Java World!

        // Reversing the string
        sb.reverse();
        System.out.println("After reverse: " + sb); // Output: !dlroW avaJ olleH

        // Deleting part of the string
        sb.delete(0, 7);
        System.out.println("After delete: " + sb); // Output: avaJ olleH
    }
}
