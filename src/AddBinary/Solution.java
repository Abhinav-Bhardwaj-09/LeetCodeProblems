package AddBinary;

// Created by Abhinav Bhardwaj on 22/01/2026 19:44 using IntelliJ IDEA

public class Solution {
  public String addBinary(String a, String b) {
    int numA = Integer.parseInt(a, 2);
    int numB = Integer.parseInt(b, 2);

    return Integer.toBinaryString(numA + numB);
  }

  public String addBinary1(String a, String b) {
    int aLen = a.length();
    int bLen = b.length();
    boolean carryForward = false;

    StringBuilder result = new StringBuilder();

    if (aLen < bLen) {
      a = "0".repeat(b.length() - a.length()) + a;
      aLen = a.length();
    } else if (bLen < aLen) {
      b = "0".repeat(a.length() - b.length()) + b;
    }

    for (int index = aLen - 1; index >= 0; index--) {
      int temp = (a.charAt(index) - '0') + (b.charAt(index) - '0') + (carryForward ? 1 : 0);

      carryForward = temp > 1;

      temp %= 2;

      result.insert(0, temp);
    }

    if (carryForward) {
      result.insert(0, 1);
    }

    return result.toString();
  }
}
