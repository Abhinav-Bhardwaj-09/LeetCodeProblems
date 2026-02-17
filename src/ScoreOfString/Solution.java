package ScoreOfString;

// Created by Abhinav Bhardwaj on 17/02/2026 20:36 using IntelliJ IDEA

public class Solution {
  public static int scoreOfString(String s) {
    int previousAsciiValue = s.charAt(0);
    int currentAsciiValue = s.charAt(1);
    int sLen = s.length();

    if (sLen == 2) {
      return Math.abs(previousAsciiValue - currentAsciiValue);
    } else {
      int result = 0;

      for (int index = 1; index < sLen; index++) {
        currentAsciiValue = s.charAt(index);
        result += Math.abs(previousAsciiValue - currentAsciiValue);
        previousAsciiValue = currentAsciiValue;
      }

      return result;
    }
  }
}
