package MaximumSubarray;

/**
 * Created by IntelliJ IDEA
 * User: Abhinav Bhardwaj
 * Date: 24/01/23
 * Time: 19:38
 */


public class Solution {
    public int maxSubArray(int[] nums) {
        int maximumSum = Integer.MIN_VALUE, currentSum = 0;

        for(int index = 0; index < nums.length; index++) {
            currentSum = currentSum < 0 ? 0 : currentSum;
            currentSum += nums[index];

            maximumSum = maximumSum < currentSum ? currentSum : maximumSum;
        }

        return maximumSum;
    }
}
