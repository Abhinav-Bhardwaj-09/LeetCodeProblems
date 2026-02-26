package ShuffleString;

// Created by Abhinav Bhardwaj on 25/02/2026 22:47 using IntelliJ IDEA

public class Solution {
  public String restoreString(String s, int[] indices) {
    char[] arr = new char[s.length()];
    int count = 0;

    for (int element : indices) {
      arr[element] = s.charAt(count++);
    }

    return new String(arr);
  }
}
