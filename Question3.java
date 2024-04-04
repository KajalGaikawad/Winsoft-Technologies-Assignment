package test_questions;

import java.util.HashMap;

import java.util.HashMap;
import java.util.Map;

public class Question3 {
    public static void main(String[] args) {
        String text = "Hello world! This is a sample string. Sample string contains multiple words.";

        // Remove any leading or trailing spaces and split the string by whitespace and punctuation marks
        String[] words = text.trim().split("\\s+|\\p{Punct}");

        // Create a HashMap to store word counts
        Map<String, Integer> wordCountMap = new HashMap<>();

        // Count the occurrences of each word
        for (String word : words) {
            // Convert the word to lowercase to ignore case sensitivity
            String lowercaseWord = word.toLowerCase();
            if (!lowercaseWord.isEmpty()) {
                // Increment the count for the word in the HashMap
                wordCountMap.put(lowercaseWord, wordCountMap.getOrDefault(lowercaseWord, 0) + 1);
            }
        }

        // Print the word counts
        System.out.println("Word Counts:");
        int totalCount = 0;
        for (String word : wordCountMap.keySet()) {
            int count = wordCountMap.get(word);
            System.out.println(word + ": " + count);
            totalCount += count;
        }
        System.out.println("Total count of words: " + totalCount);
    }
}
