import java.util.*;

class Program {
  // Time complexity O(n^2), Space complexity O(1)
  public static String longestPalindromicSubstring(String str) {
    if (str == null || str.length() < 2) {
      return str;
    }
    
    int start = 0, maxLength = 1;
    
    for (int i = 0; i < str.length(); i++) {
      int len1 = expandAroundCenter(str, i, i);
      int len2 = expandAroundCenter(str, i, i + 1);
      int len = Math.max(len1, len2);
      
      if (len > maxLength) {
        start = i - (len - 1) / 2;
        maxLength = len;
      }
    }
    
    return str.substring(start, start + maxLength);
  }
  
  private static int expandAroundCenter(String str, int left, int right) {
    while (left >= 0 && right < str.length() && str.charAt(left) == str.charAt(right)) {
      left--;
      right++;
    }
    return right - left - 1;
  }
}
