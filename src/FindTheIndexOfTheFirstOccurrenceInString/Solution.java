package FindTheIndexOfTheFirstOccurrenceInString;

// Created by Abhinav Bhardwaj on 20/01/2026 17:21 using IntelliJ IDEA

public class Solution {
  public int strStr(String haystack, String needle) {
    int needleLen = needle.length();
    int haystackLen = haystack.length();

    if (needleLen == haystackLen && needle.equalsIgnoreCase(haystack)) {
      return 0;
    }

    for (int index = 0; index <= haystackLen - needleLen; index++) {
      if (haystack.charAt(index) == needle.charAt(0)
          && haystack.substring(index, index + needleLen).equals(needle)) {
        return index;
      }
    }

    return -1;
  }
}
