package SortingTheSentence;

// Created by Abhinav Bhardwaj on 27/02/2026 18:29 using IntelliJ IDEA

public class Solution {
  public static String sortSentence(String s) {
    String[] stringArr = s.split(" ");

    String updatedStringArr[] = new String[stringArr.length];

    for (String word : stringArr) {
      int index = word.charAt(word.length() - 1) - '0';
      updatedStringArr[index - 1] = word.substring(0, word.length() - 1);
    }

    return String.join(" ", updatedStringArr);
  }
}
