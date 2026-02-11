package PowerOfFour;

// Created by Abhinav Bhardwaj on 11/02/2026 19:55 using IntelliJ IDEA

public class Solution {
  public boolean isPowerOfFour(int n) {
    double product = Math.pow(4, 0);

    while (product <= n) {
      if (product == n) return true;
      product *= 4;
    }

    return false;
  }
}
