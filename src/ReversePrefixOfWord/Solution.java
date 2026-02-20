package ReversePrefixOfWord;

// Created by Abhinav Bhardwaj on 20/02/2026 22:47 using IntelliJ IDEA

public class Solution {
  public String reversePrefix(String word, char ch) {
    for (int index = 0; index < word.length(); index++) {
      if (word.charAt(index) == ch) {
        return reverse(word, index + 1);
      }
    }

    return word;
  }

  private static String reverse(String s, int k) {
    StringBuilder updatedString = new StringBuilder(s.substring(0, k));

    updatedString.reverse();
    updatedString.append(s, k, s.length());

    return updatedString.toString();
  }
}
