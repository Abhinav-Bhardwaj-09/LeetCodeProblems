package TheTwoSneakyNumbersOfDigitville;

// Created by Abhinav Bhardwaj on 02/03/2026 21:48 using IntelliJ IDEA

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
  public int[] getSneakyNumbers(int[] nums) {
    Arrays.sort(nums);

    int current = nums[0];
    int previous;

    List<Integer> mischievousElements = new ArrayList<>();

    for (int index = 0; index < nums.length; index++) {
      previous = current;
      current = nums[index];

      if (index != 0 && current == previous) {
        mischievousElements.add(nums[index]);
      }
    }

    return mischievousElements.stream().mapToInt(Integer::intValue).toArray();
  }
}
