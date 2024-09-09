import java.util.*;

// Time complexity O(w * n log n) - looping through the list of words and sorting each word
// Space complexity O(w * n) -creating hashmap and creating array for sorting each word
class Program {
    public static List<List<String>> groupAnagrams(List<String> words) {
        // Create a HashMap to store the grouped anagrams
        Map<String, List<String>> groupAnagrams = new HashMap<>();

        // Loop through each string, sort each string, and append into HashMap
        for (String s : words) {
            // Create char array
            char[] charArray = s.toCharArray(); 
            // Sort char array
            Arrays.sort(charArray);
            // Join to string
            String key = new String(charArray);

            // If not present, add new entry
            groupAnagrams.putIfAbsent(key, new ArrayList<>());
            groupAnagrams.get(key).add(s);
        }

        // Return list of anagrams
        return new ArrayList<>(groupAnagrams.values()); 
    }
