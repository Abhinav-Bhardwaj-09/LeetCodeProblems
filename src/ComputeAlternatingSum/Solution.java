package ComputeAlternatingSum;

// Created by Abhinav Bhardwaj on 21/02/2026 22:46 using IntelliJ IDEA

public class Solution {
  public int alternatingSum(int[] nums) {
    int result = 0;
    int counter = 0;

    for (int element : nums) {
      result += (counter++ % 2 == 0) ? element : (element * -1);
    }

    return result;
  }
}
