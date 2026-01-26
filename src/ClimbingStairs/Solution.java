package ClimbingStairs;

// Created by Abhinav Bhardwaj on 26/01/2026 22:32 using IntelliJ IDEA

public class Solution {
  public int climbStairs(int n) {
    if (n <= 2) {
      return n;
    }

    int prev2 = 1; // ways to reach step 1
    int prev1 = 2; // ways to reach step 2

    for (int i = 3; i <= n; i++) {
      int current = prev1 + prev2;
      prev2 = prev1;
      prev1 = current;
    }

    return prev1;
  }

  public int climbStairs1(int n) {
    if (n <= 2) {
      return n;
    }

    return climbStairs1(n - 1) + climbStairs1(n - 2);
  }
}
