package RepeatedSubstringPattern;

// Created by Abhinav Bhardwaj on 12/03/2026 09:49 using IntelliJ IDEA

public class Solution {
  public boolean repeatedSubstringPattern(String s) {
    int sLen = s.length();
    String repeatedString = null;

    for (int substringLen = 1; substringLen <= sLen / 2; substringLen++) {
      if (sLen % substringLen == 0) {
        int times = sLen / substringLen;

        repeatedString = s.substring(0, substringLen).repeat(times);
        if (repeatedString.equals(s)) {
          return true;
        }
      }
    }

    return false;
  }
}
