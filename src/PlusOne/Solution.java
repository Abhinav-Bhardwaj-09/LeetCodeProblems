package PlusOne;

// Created by Abhinav Bhardwaj on 21/03/2023 22:51 using IntelliJ IDEA

public class Solution {

  public int[] plusOne(int[] digits) {
    int digitsLen = digits.length;
    boolean carryForwardFlag = false;

    for (int index = digitsLen - 1; index >= 0; index--) {
      if (digits[index] == 9) {
        digits[index] = 0;
        carryForwardFlag = true;
      } else {
        carryForwardFlag = false;
        digits[index]++;
        break;
      }
    }

    if (carryForwardFlag) {
      digits = new int[digitsLen + 1];
      digits[0] = 1;
    }

    return digits;
  }

  public int[] plusOne1(int[] digits) {
    int digitsLen = digits.length;
    boolean flag = false;

    for (int index = digitsLen - 1; index >= 0; index--) {
      if (digits[index] < 9) {
        digits[index]++;
        flag = true;
        break;
      }

      digits[index] = 0;
    }

    if (!(flag)) {
      digits = new int[digitsLen + 1];
      digits[0] = 1;
    }

    return digits;
  }
}
