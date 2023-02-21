package SingleElementInSortedArray;

/**
 * Created by IntelliJ IDEA
 * User: Abhinav Bhardwaj
 * Date: 21/02/23
 * Time: 21:16
 */


public class Solution {
    public int singleNonDuplicate(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }

        int left = 0, right = nums.length - 1;

        while (left < right){
            int mid = left + (right - left) / 2;

            if (nums[mid] == nums[mid + 1]) {
                mid = mid - 1;
            }

            if ((mid - left + 1) % 2 != 0) {
                right = mid;
            }
            else {
                left = mid + 1;
            }
        }

        return nums[left];
    }
}