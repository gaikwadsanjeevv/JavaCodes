package JavaGenerics;

import java.util.ArrayList;

public class E2GenericsBasic {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Hello");
      //  list.add(42);  //Compile time error dont allow any other type then declared
      String item = list.get(0);
      System.out.println(item);
    }
}

/*
 * Why Java Needed Generics: The Motivation
Type Safety: Prevents runtime errors by catching type mismatches at compile time.
Code Reusability: Write one class/method to handle multiple types instead of duplicating code.
Readability: No more ugly casts—String s = list.get(0) beats String s = (String) list.get(0).
Backward Compatibility: Java ensured generics worked with pre-existing code (e.g., raw types like ArrayList without <>).
 */