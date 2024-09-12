import java.util.*;

class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        // Convert paragraph to lowercase, remove punctuation marks
        paragraph = paragraph.replaceAll("[^a-zA-Z ]", " ").toLowerCase();

        // Split paragraph into words
        String[] words = paragraph.split("\\s+");

        // Use a HashSet to store banned words for quick lookup
        Set<String> bannedSet = new HashSet<>(Arrays.asList(banned));

        // Use a HashMap to count word frequencies
        Map<String, Integer> wordCount = new HashMap<>();
        for (String word : words) {
            if (!bannedSet.contains(word)) {
                wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
            }
        }

        // Find the word with the highest frequency that is not banned
        String mostCommon = "";
        int maxCount = 0;
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            if (entry.getValue() > maxCount) {
                mostCommon = entry.getKey();
                maxCount = entry.getValue();
            }
        }

        return mostCommon;
    }
}
