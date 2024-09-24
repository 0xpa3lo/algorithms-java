import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Time complexity O(n), Space complexity O(n)
public class program {

    public static String reverseWordsInString(String string) {
        List<String> words = new ArrayList<>();
        int startWordIdx = 0;

        for (int idx = 0; idx < string.length(); idx++) {
            char ch = string.charAt(idx);

            if (ch == ' ') {
                words.add(string.substring(startWordIdx, idx));
                startWordIdx = idx;
            } else if (string.charAt(startWordIdx) == ' ') {
                words.add(" ");
                startWordIdx = idx;
            }
        }

        // Add the last word or space
        words.add(string.substring(startWordIdx));

        // Reverse the list of words
        reverseList(words);

        // Join the words back into a single string
        StringBuilder result = new StringBuilder();
        for (String word : words) {
            result.append(word);
        }

        return result.toString();
    }

    public static void reverseList(List<String> list) {
        int start = 0;
        int end = list.size() - 1;

        while (start < end) {
            // Swap elements
            String temp = list.get(start);
            list.set(start, list.get(end));
            list.set(end, temp);

            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        String input = "Hello  world!";
        System.out.println(reverseWordsInString(input));
    }
}
