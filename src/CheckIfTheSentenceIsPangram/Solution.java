package CheckIfTheSentenceIsPangram;

// Created by Abhinav Bhardwaj on 14/03/2026 01:29 using IntelliJ IDEA

public class Solution {
  public boolean checkIfPangram(String sentence) {
    int[] frequency = new int[26];
    int count = 0;

    for (int index = 0; index < sentence.length(); index++) {
      if (frequency[sentence.charAt(index) - 'a'] == 0) {
        count++;
      }
      frequency[sentence.charAt(index) - 'a']++;
    }

    return count == 26;
  }
}
