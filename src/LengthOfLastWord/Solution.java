package LengthOfLastWord;

// Created by Abhinav Bhardwaj on 27/03/2023 20:47 using IntelliJ IDEA

public class Solution {
  public int lengthOfLastWord(String s) {
    int indexOfLastWord = s.trim().lastIndexOf(' ');

    return ((s.trim().length()) - 1) - indexOfLastWord;
  }

  public int lengthOfLastWord1(String s) {
    int sLength = s.length(), wordLength = 0;

    for (int index = sLength - 1; index >= 0; index--) {
      char c = s.charAt(index);

      if (c == ' ' && wordLength != 0) {
        return wordLength;
      }

      if (c != ' ') {
        wordLength++;
      }
    }

    return wordLength;
  }

  public int lengthOfLastWord2(String s) {
    String[] words = s.trim().split("\\s+");

    return words[words.length - 1].trim().length();
  }
}
