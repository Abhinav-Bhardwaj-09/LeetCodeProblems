package TwoSum;

/**
 * Created by IntelliJ IDEA
 * User: Abhinav Bhardwaj
 * Date: 25/01/23
 * Time: 16:06
 */


public class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] sumArr = new int[2];
        int numsLen = nums.length;

        for(int index1 = 0; index1 < numsLen; index1++) {
            for(int index2 = index1; index2 < numsLen - 1; index2++) {
                if(nums[index1] + nums[index2 +1] == target) {
                    sumArr[0] = index1;
                    sumArr[1] = index2 +1;
                }
            }
        }

        return sumArr;
    }
}

