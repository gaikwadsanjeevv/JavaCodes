
/*
 * Generics allow you to write classes, interfaces, and methods that can work with any data type while maintaining type safety.
 * Before generics, Java relied heavily on Object and casting, which caused two big problems: Type Safety Issues, ClassCastException at runtime
 * 
 */
package JavaGenerics;

import java.util.ArrayList;

public class E1BeforeGenerics {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("Hello");
        list.add(42);

        String item = (String) list.get(1);
        System.out.println(item);
    }
}
//Generics enforce type safety at compile time and eliminate casting.

