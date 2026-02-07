package PowerOfTwo;

// Created by Abhinav Bhardwaj on 07/02/2026 22:54 using IntelliJ IDEA

public class Solution {
  public boolean isPowerOfTwo(int n) {
    double product = Math.pow(2, 0);

    while (product <= n) {
      if (product == n) {
        return true;
      } else {
        product *= 2;
      }
    }

    return false;
  }
}
