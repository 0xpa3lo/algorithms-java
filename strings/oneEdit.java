import java.util.*;
// Time complexity O(n), Space complexity O(1)
class Program {
  public boolean oneEdit(String stringOne, String stringTwo) {
    // If the strings are identical, no edits are needed
    if (stringOne.equals(stringTwo)) {
      return true;
    }

    // If the length difference is greater than 1, more than one edit is required
    if (Math.abs(stringOne.length() - stringTwo.length()) > 1) {
      return false;
    }

    int len1 = stringOne.length();
    int len2 = stringTwo.length();

    // If the strings have the same length, check for replacements
    if (len1 == len2) {
      int differences = 0;
      for (int i = 0; i < len1; i++) {
        if (stringOne.charAt(i) != stringTwo.charAt(i)) {
          differences++;
        }
        if (differences > 1) {
          return false;
        }
      }
      return true;
    }

    // If the strings have different lengths, check for insertions or deletions
    // Ensure stringOne is the shorter string
    if (len1 > len2) {
      String temp = stringOne;
      stringOne = stringTwo;
      stringTwo = temp;
      len1 = stringOne.length();
      len2 = stringTwo.length();
    }

    // Two-pointer approach to check for one insertion/deletion
    int i = 0, j = 0, differences = 0;
    while (i < len1 && j < len2) {
      if (stringOne.charAt(i) != stringTwo.charAt(j)) {
        differences++;
        if (differences > 1) {
          return false;
        }
        j++;  // Move pointer of the longer string
      } else {
        i++;
        j++;
      }
    }

    return true;
  }

  public static void main(String[] args) {
    Program program = new Program();
    String s1 = "a";
    String s2 = "ab";
    System.out.println(program.oneEdit(s1, s2));  // Output: true
  }
}
