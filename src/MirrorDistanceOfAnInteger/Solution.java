package MirrorDistanceOfAnInteger;

// Created by Abhinav Bhardwaj on 11/03/2026 15:22 using IntelliJ IDEA

public class Solution {
  public int mirrorDistance(int n) {
    int reverseNumber = 0;
    int temp = n;

    while (temp != 0) {
      reverseNumber = (reverseNumber * 10) + (temp % 10);
      temp /= 10;
    }

    return Math.abs(reverseNumber - n);
  }

  public int mirrorDistance1(int n) {
    StringBuilder sb = new StringBuilder(String.valueOf(n));

    return Math.abs(Integer.parseInt(sb.reverse().toString()) - n);
  }
}
