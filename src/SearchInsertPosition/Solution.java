package SearchInsertPosition;

// Created by Abhinav Bhardwaj on 20/01/2026 17:21 using IntelliJ IDEA

public class Solution {
  public int searchInsert(int[] nums, int target) {
    int left = 0, right = nums.length - 1;

    while (left <= right) {
      int mid = (left + right) / 2;

      if (nums[mid] == target) {
        return mid;
      } else if (nums[mid] > target) {
        right = mid - 1;
      } else {
        left = mid + 1;
      }
    }

    return left;
  }
}
