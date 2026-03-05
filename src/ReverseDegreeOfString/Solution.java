package ReverseDegreeOfString;

// Created by Abhinav Bhardwaj on 05/03/2026 23:42 using IntelliJ IDEA

public class Solution {
  public static int reverseDegree(String s) {
    int result = 0;

    for (int index = 0; index < s.length(); index++) {
      result += (('z' - s.charAt(index) + 1) * (index + 1));
    }

    return result;
  }
}
