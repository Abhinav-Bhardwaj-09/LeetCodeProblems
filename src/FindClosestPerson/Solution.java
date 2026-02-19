package FindClosestPerson;

// Created by Abhinav Bhardwaj on 19/02/2026 14:44 using IntelliJ IDEA

public class Solution {
  public int findClosest(int x, int y, int z) {
    return (Math.abs(z - x) == Math.abs(z - y)) ? 0 : ((Math.abs(z - x) < Math.abs(z - y)) ? 1 : 2);
  }
}
