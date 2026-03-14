package CreateTargetArrayInTheGivenOrder;

import java.util.ArrayList;

// Created by Abhinav Bhardwaj on 14/03/2026 00:11 using IntelliJ IDEA

public class Solution {
  public int[] createTargetArray(int[] nums, int[] index) {
    ArrayList<Integer> targetArr = new ArrayList<>();

    for (int i = 0; i < index.length; i++) {
      targetArr.add(index[i], nums[i]);
    }

    return targetArr.stream().mapToInt(Integer::intValue).toArray();
  }
}
