import java.util.*;

public class MostRepeatedWord {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("Pen", "Eraser", "Note Book", "Pen", "Pencil", "Pen", "Note Book", "Pencil");

        Map<String, Integer> wordCount = new HashMap<>();
        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        String mostFrequentWord = Collections.max(wordCount.entrySet(), Map.Entry.comparingByValue()).getKey();
        int count = wordCount.get(mostFrequentWord);

        System.out.println("Most Frequent Element: " + mostFrequentWord);
        System.out.println("Count: " + count);
    }
}
