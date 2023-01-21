package RunningSumOf1dArray;

/**
 * Created by IntelliJ IDEA
 * User: Abhinav Bhardwaj
 * Date: 21/01/23
 * Time: 13:57
 */


public class Solution {
    public int[] runningSum(int[] nums) {
        int sum = 0;

        for (int index = 0; index < nums.length; index++) {
            sum += nums[index];
            nums[index] = sum;
        }

        return nums;
    }
}
