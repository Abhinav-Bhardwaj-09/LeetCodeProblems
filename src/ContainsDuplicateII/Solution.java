package ContainsDuplicateII;

// Created by Abhinav Bhardwaj on 04/02/2026 23:05 using IntelliJ IDEA

public class Solution {
  public boolean containsNearbyDuplicate(int[] nums, int k) {
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
