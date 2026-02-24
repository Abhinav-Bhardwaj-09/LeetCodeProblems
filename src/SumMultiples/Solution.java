package SumMultiples;

// Created by Abhinav Bhardwaj on 24/02/2026 22:26 using IntelliJ IDEA

public class Solution {
  public int sumOfMultiples(int n) {
    int count = 0;

    for (int number = 1; number <= n; number++) {
      if (number % 3 == 0 || number % 5 == 0 || number % 7 == 0) {
        count += number;
      }
    }

    return count;
  }
}
