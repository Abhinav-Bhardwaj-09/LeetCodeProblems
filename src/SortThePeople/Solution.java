package SortThePeople;

import java.util.Arrays;

// Created by Abhinav Bhardwaj on 09/03/2026 00:50 using IntelliJ IDEA

public class Solution {
  public static String[] sortPeople(String[] names, int[] heights) {
    int n = names.length;
    Integer[] sortIdx = new Integer[n];

    for (int index = 0; index < n; index++) {
      sortIdx[index] = index;
    }

    Arrays.sort(sortIdx, (a, b) -> Integer.compare(heights[b], heights[a]));
    String[] result = new String[n];

    for (int index = 0; index < n; index++) {
      result[index] = names[sortIdx[index]];
    }

    return result;
  }

  public String[] sortPeople1(String[] names, int[] heights) {
    boolean swapped = true;

    for (int index1 = 0; index1 < names.length && swapped; index1++) {
      swapped = false;

      for (int index2 = 0; index2 < names.length - 1; index2++) {
        if (heights[index2] < heights[index2 + 1]) {
          swapped = true;
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

  public static void main(String[] args) {
    Arrays.stream(sortPeople(new String[] {"Mary", "John", "Emma"}, new int[] {180, 165, 170}))
        .forEach(System.out::println);
  }
}
