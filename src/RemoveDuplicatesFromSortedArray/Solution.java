package RemoveDuplicatesFromSortedArray;

import java.util.Objects;

/** Created by IntelliJ IDEA User: Abhinav Bhardwaj Date: 19/01/2026 Time: 19:00 */
public class Solution {
  public int removeDuplicates(int[] nums) {
    if (Objects.isNull(nums) || nums.length == 0) {
      return 0;
    }

    int uniqueCount = 1;

    for (int index = 1; index < nums.length; index++) {
      if (nums[index] != nums[index - 1]) {
        nums[uniqueCount++] = nums[index];
      }
    }

    return uniqueCount;
  }
}
