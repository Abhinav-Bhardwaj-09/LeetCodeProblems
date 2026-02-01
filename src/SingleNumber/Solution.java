package SingleNumber;

import java.util.HashMap;

// Created by Abhinav Bhardwaj on 01/02/2026 23:38 using IntelliJ IDEA

public class Solution {
  public int singleNumber(int[] nums) {
    HashMap<Integer, Integer> map = new HashMap<>();

    for (int num : nums) {
      map.put(num, map.getOrDefault(num, 0) + 1);
    }

    for (Integer key : map.keySet()) {
      if (map.get(key) == 1) {
        return key;
      }
    }

    return -1;
  }

  public int singleNumber1(int[] nums) {
    int singleNumber = 0;

    for (int element : nums) {
      singleNumber ^= element; // XOR accumulates, pairs cancel out
    }

    return singleNumber;
  }
}
