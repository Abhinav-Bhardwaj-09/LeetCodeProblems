package ContainsDuplicateII;

// Created by Abhinav Bhardwaj on 04/02/2026 23:05 using IntelliJ IDEA

import java.util.HashMap;
import java.util.Map;

public class Solution {

  public boolean containsNearbyDuplicate(int[] nums, int k) {
    if (nums == null || k <= 0) return false;

    Map<Integer, Integer> lastIndex = new HashMap<>();

    for (int index = 0; index < nums.length; index++) {
      Integer prev = lastIndex.get(nums[index]);

      if (prev != null && index - prev <= k) return true;

      lastIndex.put(nums[index], index);
    }

    return false;
  }

  public boolean containsNearbyDuplicate1(int[] nums, int k) {
    for (int index1 = 0; index1 < (nums.length - 1); index1++) {
      for (int index2 = index1 + 1; index2 < nums.length; index2++) {
        if ((nums[index1] == nums[index2]) && (Math.abs(index2 - index1) <= k)) {
          return true;
        }
      }
    }

    return false;
  }
}
