import java.util.*;

class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        // 1. Convert banned array to a HashSet for O(1) lookups
        Set<String> bannedSet = new HashSet<>(Arrays.asList(banned));
        
        // 2. Replace all non-word characters with spaces and convert to lowercase
        // \\W+ matches any non-word character (equivalent to [^a-zA-Z0-9_])
        String[] words = paragraph.replaceAll("[!?',;.]", " ").toLowerCase().split("\\s+");
        
        // 3. Count frequencies
        Map<String, Integer> wordCount = new HashMap<>();
        for (String word : words) {
            if (!bannedSet.contains(word) && !word.isEmpty()) {
                wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
            }
        }
        
        // 4. Find the most frequent valid word
        String result = "";
        int maxCount = 0;
        
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                result = entry.getKey();
            }
        }
        
        return result;
    }
}