package NumberOfGoodPairs;

/**
 * Created by IntelliJ IDEA
 * User: Abhinav Bhardwaj
 * Date: 23/01/23
 * Time: 15:48
 */


public class Solution {
    public int numIdenticalPairs(int[] nums) {
        int len = nums.length, count = 0;
        if (len == 0) {
            return 0;
        }

        for(int xIndex = 0; xIndex < len - 1; xIndex++) {
            for (int yIndex = xIndex + 1; yIndex < len; yIndex++) {
                if(nums[xIndex] == nums[yIndex]) {
                    count++;
                }
            }
        }
        return count;
    }
}
