import java.util.*;

public class SortByLength {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("Java", "Python", "C#", "HTML", "Kotlin", "C++", "COBOL", "C");

        words.sort(Comparator.comparingInt(String::length));

        for (String word : words) {
            System.out.println(word);
        }
    }
}
