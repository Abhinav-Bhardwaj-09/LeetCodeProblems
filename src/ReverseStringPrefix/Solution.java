package ReverseStringPrefix;

// Created by Abhinav Bhardwaj on 18/02/2026 23:17 using IntelliJ IDEA

public class Solution {
  public String reversePrefix(String s, int k) {
    StringBuilder updatedString = new StringBuilder(s.substring(0, k));

    updatedString.reverse();
    updatedString.append(s, k, s.length());

    return updatedString.toString();
  }
}
