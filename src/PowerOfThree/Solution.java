package PowerOfThree;

// Created by Abhinav Bhardwaj on 09/02/2026 20:46 using IntelliJ IDEA

public class Solution {
  public boolean isPowerOfThree(int n) {

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
