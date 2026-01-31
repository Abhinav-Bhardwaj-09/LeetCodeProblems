package ValidPalindrome;

// Created by Abhinav Bhardwaj on 31/01/2026 23:24 using IntelliJ IDEA

public class Solution {
  public boolean isPalindrome(String s) {
    int sLen = s.length();
    int left = 0, right = sLen - 1;

    while (left < right) {
      // Move left forward to next alphanumeric
      while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
        left++;
      }

      // Move right backward to previous alphanumeric
      while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
        right--;
      }

      char start = Character.toLowerCase(s.charAt(left));
      char end = Character.toLowerCase(s.charAt(right));

      if (start != end) {
        return false;
      } else {
        left++;
        right--;
      }
    }

    return true;
  }
}
