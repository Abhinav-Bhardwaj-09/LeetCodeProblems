package AddDigits;

// Created by Abhinav Bhardwaj on 21/01/2023 14:30 using IntelliJ IDEA

public class Solution {
  public int addDigits(int num) {
    int digitSum = num;

    while (num >= 10) {
      digitSum = 0;
      while (num > 0) {
        digitSum += num % 10;
        num /= 10;
      }
      num = digitSum;
    }

    return digitSum;
  }
}
