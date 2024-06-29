import java.util.ArrayList;

// O(n) time and O(n) space
class LargestNumber {
    public String bestDigits(String number, int numDigits) {
        ArrayList<Integer> stack = new ArrayList<>();
        for (int i = 0; i < number.length(); i++) {
            while (numDigits > 0 && stack.size() > 0 && stack.get(stack.size() - 1) < number.charAt(i)) {
                stack.remove(stack.size() - 1);
                numDigits--;
            }
            stack.add((int) number.charAt(i));
        }
        while (numDigits > 0) {
            stack.remove(stack.size() - 1);
            numDigits--;
        }

        StringBuilder result = new StringBuilder();
        for (int ascii : stack) {
            result.append((char) ascii);
        }
        return result.toString();
    }

    public static void main(String[] args) {
        //number = "462839"
        // numDigits = 2
        String number = "462839";
        Integer numDigits = 2;
        String test = new LargestNumber().bestDigits(number, numDigits);
        System.out.println(test);  // Output: 6839
    }
}
