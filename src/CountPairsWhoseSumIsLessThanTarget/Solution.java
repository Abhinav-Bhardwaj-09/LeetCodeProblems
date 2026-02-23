package CountPairsWhoseSumIsLessThanTarget;

import java.util.List;

// Created by Abhinav Bhardwaj on 23/02/2026 23:03 using IntelliJ IDEA

public class Solution {
  public int countPairs(List<Integer> nums, int target) {
    int count = 0;

    for (int index1 = 0; index1 < nums.size() - 1; index1++) {
      for (int i = index1 + 1; i < nums.size(); i++) {
        if (nums.get(index1) + nums.get(i) < target) {
          count++;
        }
      }
    }

    return count;
  }
}
