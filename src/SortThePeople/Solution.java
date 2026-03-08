package SortThePeople;

// Created by Abhinav Bhardwaj on 09/03/2026 00:50 using IntelliJ IDEA

public class Solution {
  public String[] sortPeople(String[] names, int[] heights) {
    for (int index1 = 0; index1 < names.length; index1++) {
      for (int index2 = 0; index2 < names.length - 1; index2++) {
        if (heights[index2] < heights[index2 + 1]) {
          String name = names[index2];
          names[index2] = names[index2 + 1];
          names[index2 + 1] = name;

          int height = heights[index2];
          heights[index2] = heights[index2 + 1];
          heights[index2 + 1] = height;
        }
      }
    }

    return names;
  }
}
