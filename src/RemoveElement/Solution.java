package RemoveElement;

import java.util.Objects;

// Created by Abhinav Bhardwaj on 20/01/2026 17:21 using IntelliJ IDEA

public class Solution {
  public int removeElement(int[] nums, int val) {
    if (Objects.isNull(nums) || nums.length == 0) {
      return 0;
    }

    int nonValCount = 0;

    for (int index = 0; index < nums.length; index++) {
      if (nums[index] != val) {
        nums[nonValCount++] = nums[index];
      }
    }

    return nonValCount;
  }
}
