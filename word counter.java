import java.util.HashMap;
import java.util.Map;

public class WordCounter {
    public static void main(String[] args) {
        String text = "Hello world! This is a sample text. Hello world again.";

        Map<String, Integer> wordCount = countWords(text); 
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    public static Map<String, Integer> countWords(String text) {
        Map<String, Integer> wordCount = new HashMap<>();
        String[] words = text.split("\\s+");

        for (String word : words) {
            word = word.toLowerCase();
            word = word.replaceAll("[^a-zA-Z]", ""); // Remove non-alphabetic characters
            if (!word.isEmpty()) {
                wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
            }
        }

        return wordCount;
    }
}

