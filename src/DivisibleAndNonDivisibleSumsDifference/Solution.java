package DivisibleAndNonDivisibleSumsDifference;

// Created by Abhinav Bhardwaj on 01/03/2026 20:21 using IntelliJ IDEA

public class Solution {
  public int differenceOfSums(int n, int m) {
    int num1 = 0;
    int num2 = 0;

    for (int i = 1; i <= n; i++) {
      if (i % m != 0) {
        num1 += i;
      }
    }

    if (n < m) {
      num2 = 0;
    } else {
      for (int i = m; i <= n; i++) {
        if (i % m == 0) {
          num2 += i;
        }
      }
    }

    return num1 - num2;
  }
}
