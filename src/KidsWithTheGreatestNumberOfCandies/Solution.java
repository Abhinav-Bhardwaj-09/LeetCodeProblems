package KidsWithTheGreatestNumberOfCandies;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Created by Abhinav Bhardwaj on 06/03/2026 00:08 using IntelliJ IDEA

public class Solution {
  public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
    List<Boolean> result = new ArrayList<>();
    int maxCandies = Arrays.stream(candies).max().getAsInt();

    for (int candy : candies) {
      result.add(candy + extraCandies >= maxCandies);
    }

    return result;
  }
}
