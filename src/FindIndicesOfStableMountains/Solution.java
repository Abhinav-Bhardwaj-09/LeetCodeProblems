package FindIndicesOfStableMountains;

import java.util.ArrayList;
import java.util.List;

// Created by Abhinav Bhardwaj on 15/03/2026 20:14 using IntelliJ IDEA

public class Solution {
  public List<Integer> stableMountains(int[] height, int threshold) {
    ArrayList<Integer> stableMounatinIndices = new ArrayList<>();
    int heightLength = height.length;

    for (int index = 0; index < heightLength - 1; index++) {
      if (height[index] > threshold) {
        stableMounatinIndices.add(index + 1);
      }
    }

    return stableMounatinIndices;
  }
}
