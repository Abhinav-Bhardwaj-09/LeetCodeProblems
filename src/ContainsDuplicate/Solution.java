package ContainsDuplicate;

import java.util.HashSet;

// Created by Abhinav Bhardwaj on 24/01/2023 15:44 using IntelliJ IDEA

public class Solution {
  public boolean containsDuplicate(int[] nums) {
    if (nums == null || nums.length == 0) {
      return false;
    }

    HashSet<Integer> numsHashSet = new HashSet<Integer>();
    for (int element : nums) {
      if (!numsHashSet.add(element)) {
        return true;
      }
    }

    return false;
  }
}
