package SqrtX;

// Created by Abhinav Bhardwaj on 24/01/2026 14:16 using IntelliJ IDEA

public class Solution {
  public int mySqrt(int x) {
    if (x == 0 || x == 1) {
      return x;
    }

    int low = 0, high = x, mid = 0;

    while (high - low > 1) {
      mid = (low + high) / 2;

      if (mid * mid == x) {
        return mid;
      } else if (mid * mid < x) {
        low = mid;
      } else {
        high = mid;
      }
    }

    if (mid * mid != x && high - low == 1) {
      return ((high * high) - x) >= (x - (low * low)) ? high : low;
    }

    return -1;
  }
}
