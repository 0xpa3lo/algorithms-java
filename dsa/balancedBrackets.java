
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;

class balancedBrackets {
  public static boolean bracketStack(String input) {
    String openBrackets = "{[(";
    String closeBrackets = "}])";
    HashMap<Character, Character> bracketPairs = new HashMap<>();
    bracketPairs.put('}', '{');
    bracketPairs.put(']', '[');
    bracketPairs.put(')', '(');

    List<Character> stack = new ArrayList<>();

    for (int i = 0; i < input.length(); i++) {
      char currentChar = input.charAt(i);
      if (openBrackets.indexOf(currentChar) != -1) {
        stack.add(currentChar);
      }

      if (closeBrackets.indexOf(currentChar) != -1) {
        if (stack.size() == 0) {
          return false;
        }
          
        Character expectedBracket = bracketPairs.get(currentChar);
        if (expectedBracket.equals(stack.get(stack.size() - 1))) {
          stack.remove(stack.size() - 1);
        } else {
          return false;
        }
      }
    }
    return stack.size() == 0;
  }
  public static void main(String[] args) {
    System.out.println(bracketStack("{[()]}"));
    System.out.println(bracketStack("{[(])}"));
    System.out.println(bracketStack("{{[[(())]]}}"));

  }

}