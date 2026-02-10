package PowerOfThree;

// Created by Abhinav Bhardwaj on 09/02/2026 20:46 using IntelliJ IDEA

public class Solution {

  // 3^19 = 1162261467 is the largest power of three <= Integer.MAX_VALUE.
  private static final int MAX_POWER_OF_3_INT = 1162261467;

  public boolean isPowerOfThree(int n) {
    // only positive integers can be powers of three
    return ((n > 0) && (MAX_POWER_OF_3_INT % n == 0));
  }

  public boolean isPowerOfThree1(int n) {

    double product = Math.pow(3, 0);

    while (product <= n) {
      if (product == n) {
        return true;
      } else {
        product *= 3;
      }
    }

    return false;
  }
}
